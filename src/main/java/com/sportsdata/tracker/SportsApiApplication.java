package com.sportsdata.tracker;

import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sportsdata.tracker.team.*;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class SportsApiApplication implements CommandLineRunner{

    @Autowired
    TeamRepository teamRepository;

    public static void main(String[] args) {
        SpringApplication.run(SportsApiApplication.class, args);
    }

    public String readJsonFromFile(String fileName){
        ClassLoader classLoader = this.getClass().getClassLoader();
        String result = null;
        try {
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public void run(String... args) throws Exception {

        //Get file from resources folder
        String teamStatsFileName = "teams-fts.json";
        String teamStatsJson = readJsonFromFile(teamStatsFileName);

        // Create the gson object (String json to Java object converter)
        GsonBuilder b = new GsonBuilder();
        b.registerTypeAdapter(Roster.class, new RosterDeserializer());
        Gson gson = b.create();

        // Start handling the firebase json object
        JSONObject teamStatsMainObject = new JSONObject(teamStatsJson);

        // foreach team in teams
        Iterator<?> keys = teamStatsMainObject.keys();
        while( keys.hasNext() ) {
            String key = (String)keys.next();
            if ( teamStatsMainObject.get(key) instanceof JSONObject ) {
                // get the team json
                JSONObject teamJson = teamStatsMainObject.getJSONObject(key);
                // create the team java object from the team json
                Team team = gson.fromJson(teamJson.toString(),Team.class);
                // save the team object to the database
                teamRepository.save(team);
            }
        }

        //  The entire document is in the database - hizzah!
        System.out.println("Completed loading data team stats");


        String playerStatsFileName = "player-stats.json";
        String playerStatsJson = readJsonFromFile(playerStatsFileName);

        // Create the gson object (String json to Java object converter)
        Gson playerStatsGson = new Gson();
        // Start handling the firebase json object
        JSONObject playerStatsMainObject = new JSONObject(playerStatsJson);
        // foreach team in teams
        Iterator<?> playerStatsTeamKeys = playerStatsMainObject.keys();
        ArrayList<Team> teams = Lists.newArrayList(teamRepository.findAll());


        while( playerStatsTeamKeys.hasNext() ) {
            String key = (String)playerStatsTeamKeys.next();
            if ( playerStatsMainObject.get(key) instanceof JSONObject ) {

                // get the team json
                JSONObject playerStatsFromTeamJson = playerStatsMainObject.getJSONObject(key);

                JSONObject playerStatsJsonObj = playerStatsFromTeamJson.getJSONObject("player-stats");

                // create the team java object from the team json
                Iterator<?> playerIdKeys = playerStatsJsonObj.keys();

                while(playerIdKeys.hasNext()){
                    String playerIdKey = (String)playerIdKeys.next();
                    JSONArray playerStatArray = playerStatsJsonObj.getJSONObject(playerIdKey).getJSONArray("reg");

                    for(Object playerStatJson: playerStatArray.toList()){

                        System.out.println("Test");
                        if(playerStatJson != null){
                            try {
                                PlayerStat playerStat = playerStatsGson.fromJson(playerStatJson.toString(), PlayerStat.class);
                                updatePlayerStat(teams,playerStat.getRosterId(),playerStat);
                            }catch(Exception ex) {
                                System.out.println("Something wrong with this json - fix it");
                                System.out.println(playerStatJson.toString());
                                ex.printStackTrace();
                            }

                            System.out.println("Test");
                        }

                    }

                    System.out.println("Test");
                }


//                Team team = gson.fromJson(teamJson.toString(),Team.class);
                // save the team object to the database
//                teamRepository.save(team);
            }
        }


        teamRepository.save(teams);


    }

    private void updatePlayerStat(ArrayList<Team> teams, int rosterId, PlayerStat playerStat) {

        for(int i = 0; i<teams.size(); i++){
            for(int j=0; j < teams.get(i).getRoster().getPlayers().size(); j++){
                Player player = teams.get(i).getRoster().getPlayers().get(j);
                if(player.getRosterId() == rosterId){
                    if(player.getPlayerStats() == null){
                        player.setPlayerStats(new ArrayList<PlayerStat>());
                    }
                    player.getPlayerStats().add(playerStat);
                }
            }
        }

    }


}
