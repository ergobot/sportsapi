package com.sportsdata.tracker.team;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team, String> {


    // finder methods or query methods
    // https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
    public List<Team> findByTeamNameIgnoreCaseContaining(String name);

//    public Team findByRoster_Players_RosterIdEquals(String rosterId);


//    public List<Team> findByCityIgnoreCaseContaining(String city);
//    public List<Team> findByStateIgnoreCaseContaining(String state);

}
