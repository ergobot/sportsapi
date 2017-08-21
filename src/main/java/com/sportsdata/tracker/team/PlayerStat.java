package com.sportsdata.tracker.team;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerStat {

    @SerializedName("defForcedFum")
    @Expose
    private Integer defForcedFum;
    @SerializedName("rosterId")
    @Expose
    private Integer rosterId;
    @SerializedName("defTotalTackles")
    @Expose
    private Integer defTotalTackles;
    @SerializedName("defInts")
    @Expose
    private Integer defInts;
    @SerializedName("defPts")
    @Expose
    private Integer defPts;
    @SerializedName("defIntReturnYds")
    @Expose
    private Integer defIntReturnYds;
    @SerializedName("statsId")
    @Expose
    private Integer statsId;
    @SerializedName("seasonIndex")
    @Expose
    private Integer seasonIndex;
    @SerializedName("scheduleId")
    @Expose
    private Integer scheduleId;
    @SerializedName("defCatchAllowed")
    @Expose
    private Integer defCatchAllowed;
    @SerializedName("stageIndex")
    @Expose
    private Integer stageIndex;
    @SerializedName("defDeflections")
    @Expose
    private Integer defDeflections;
    @SerializedName("defSafties")
    @Expose
    private Integer defSafties;
    @SerializedName("defFumRec")
    @Expose
    private Integer defFumRec;
    @SerializedName("teamId")
    @Expose
    private Integer teamId;
    @SerializedName("defSacks")
    @Expose
    private Double defSacks;
    @SerializedName("fullName")
    @Expose
    private String fullName;
    @SerializedName("weekIndex")
    @Expose
    private Integer weekIndex;
    @SerializedName("defTDs")
    @Expose
    private Integer defTDs;
    @SerializedName("passComp")
    @Expose
    private Integer passComp;
    @SerializedName("passCompPct")
    @Expose
    private Double passCompPct;
    @SerializedName("rushFum")
    @Expose
    private Integer rushFum;
    @SerializedName("rushAtt")
    @Expose
    private Integer rushAtt;
    @SerializedName("rushTDs")
    @Expose
    private Integer rushTDs;
    @SerializedName("passSacks")
    @Expose
    private Integer passSacks;
    @SerializedName("rushToPct")
    @Expose
    private Double rushToPct;
    @SerializedName("passAtt")
    @Expose
    private Integer passAtt;
    @SerializedName("rushYds")
    @Expose
    private Integer rushYds;
    @SerializedName("passTDs")
    @Expose
    private Integer passTDs;
    @SerializedName("rushLongest")
    @Expose
    private Integer rushLongest;
    @SerializedName("rushYdsPerAtt")
    @Expose
    private Double rushYdsPerAtt;
    @SerializedName("rushYdsAfterContact")
    @Expose
    private Integer rushYdsAfterContact;
    @SerializedName("passInts")
    @Expose
    private Integer passInts;
    @SerializedName("passYds")
    @Expose
    private Integer passYds;
    @SerializedName("rushPts")
    @Expose
    private Integer rushPts;
    @SerializedName("passYdsPerGame")
    @Expose
    private Double passYdsPerGame;
    @SerializedName("rush20PlusYds")
    @Expose
    private Integer rush20PlusYds;
    @SerializedName("rushBrokenTackles")
    @Expose
    private Integer rushBrokenTackles;
    @SerializedName("passLongest")
    @Expose
    private Integer passLongest;
    @SerializedName("passYdsPerAtt")
    @Expose
    private Double passYdsPerAtt;
    @SerializedName("passerRating")
    @Expose
    private Double passerRating;
    @SerializedName("passPts")
    @Expose
    private Integer passPts;
    @SerializedName("rushYdsPerGame")
    @Expose
    private Double rushYdsPerGame;
    @SerializedName("recYacPerCatch")
    @Expose
    private Double recYacPerCatch;
    @SerializedName("recTDs")
    @Expose
    private Integer recTDs;
    @SerializedName("recDrops")
    @Expose
    private Integer recDrops;
    @SerializedName("recCatchPct")
    @Expose
    private Double recCatchPct;
    @SerializedName("recToPct")
    @Expose
    private Double recToPct;
    @SerializedName("recYdsPerCatch")
    @Expose
    private Double recYdsPerCatch;
    @SerializedName("recYdsAfterCatch")
    @Expose
    private Double recYdsAfterCatch;
    @SerializedName("recYdsPerGame")
    @Expose
    private Double recYdsPerGame;
    @SerializedName("recYds")
    @Expose
    private Integer recYds;
    @SerializedName("recCatches")
    @Expose
    private Integer recCatches;
    @SerializedName("recLongest")
    @Expose
    private Integer recLongest;
    @SerializedName("recPts")
    @Expose
    private Integer recPts;

    public Integer getDefForcedFum() {
        return defForcedFum;
    }
    public void setDefForcedFum(Integer defForcedFum) {
        this.defForcedFum = defForcedFum;
    }
    public Integer getRosterId() {
        return rosterId;
    }
    public void setRosterId(Integer rosterId) {
        this.rosterId = rosterId;
    }
    public Integer getDefTotalTackles() {
        return defTotalTackles;
    }
    public void setDefTotalTackles(Integer defTotalTackles) {
        this.defTotalTackles = defTotalTackles;
    }
    public Integer getDefInts() {
        return defInts;
    }
    public void setDefInts(Integer defInts) {
        this.defInts = defInts;
    }
    public Integer getDefPts() {
        return defPts;
    }
    public void setDefPts(Integer defPts) {
        this.defPts = defPts;
    }
    public Integer getDefIntReturnYds() {
        return defIntReturnYds;
    }
    public void setDefIntReturnYds(Integer defIntReturnYds) {
        this.defIntReturnYds = defIntReturnYds;
    }
    public Integer getStatsId() {
        return statsId;
    }
    public void setStatsId(Integer statsId) {
        this.statsId = statsId;
    }
    public Integer getSeasonIndex() {
        return seasonIndex;
    }
    public void setSeasonIndex(Integer seasonIndex) {
        this.seasonIndex = seasonIndex;
    }
    public Integer getScheduleId() {
        return scheduleId;
    }
    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }
    public Integer getDefCatchAllowed() {
        return defCatchAllowed;
    }
    public void setDefCatchAllowed(Integer defCatchAllowed) {
        this.defCatchAllowed = defCatchAllowed;
    }
    public Integer getStageIndex() {
        return stageIndex;
    }
    public void setStageIndex(Integer stageIndex) {
        this.stageIndex = stageIndex;
    }
    public Integer getDefDeflections() {
        return defDeflections;
    }
    public void setDefDeflections(Integer defDeflections) {
        this.defDeflections = defDeflections;
    }
    public Integer getDefSafties() {
        return defSafties;
    }
    public void setDefSafties(Integer defSafties) {
        this.defSafties = defSafties;
    }
    public Integer getDefFumRec() {
        return defFumRec;
    }
    public void setDefFumRec(Integer defFumRec) {
        this.defFumRec = defFumRec;
    }
    public Integer getTeamId() {
        return teamId;
    }
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
    public Double getDefSacks() {
        return defSacks;
    }
    public void setDefSacks(Double defSacks) {
        this.defSacks = defSacks;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Integer getWeekIndex() {
        return weekIndex;
    }
    public void setWeekIndex(Integer weekIndex) {
        this.weekIndex = weekIndex;
    }
    public Integer getDefTDs() {
        return defTDs;
    }
    public void setDefTDs(Integer defTDs) {
        this.defTDs = defTDs;
    }
    public Integer getPassComp() {
        return passComp;
    }
    public void setPassComp(Integer passComp) {
        this.passComp = passComp;
    }
    public Double getPassCompPct() {
        return passCompPct;
    }
    public void setPassCompPct(Double passCompPct) {
        this.passCompPct = passCompPct;
    }
    public Integer getRushFum() {
        return rushFum;
    }
    public void setRushFum(Integer rushFum) {
        this.rushFum = rushFum;
    }
    public Integer getRushAtt() {
        return rushAtt;
    }
    public void setRushAtt(Integer rushAtt) {
        this.rushAtt = rushAtt;
    }
    public Integer getRushTDs() {
        return rushTDs;
    }
    public void setRushTDs(Integer rushTDs) {
        this.rushTDs = rushTDs;
    }
    public Integer getPassSacks() {
        return passSacks;
    }
    public void setPassSacks(Integer passSacks) {
        this.passSacks = passSacks;
    }
    public Double getRushToPct() {
        return rushToPct;
    }
    public void setRushToPct(Double rushToPct) {
        this.rushToPct = rushToPct;
    }
    public Integer getPassAtt() {
        return passAtt;
    }
    public void setPassAtt(Integer passAtt) {
        this.passAtt = passAtt;
    }
    public Integer getRushYds() {
        return rushYds;
    }
    public void setRushYds(Integer rushYds) {
        this.rushYds = rushYds;
    }
    public Integer getPassTDs() {
        return passTDs;
    }
    public void setPassTDs(Integer passTDs) {
        this.passTDs = passTDs;
    }
    public Integer getRushLongest() {
        return rushLongest;
    }
    public void setRushLongest(Integer rushLongest) {
        this.rushLongest = rushLongest;
    }
    public Double getRushYdsPerAtt() {
        return rushYdsPerAtt;
    }
    public void setRushYdsPerAtt(Double rushYdsPerAtt) {
        this.rushYdsPerAtt = rushYdsPerAtt;
    }
    public Integer getRushYdsAfterContact() {
        return rushYdsAfterContact;
    }
    public void setRushYdsAfterContact(Integer rushYdsAfterContact) {
        this.rushYdsAfterContact = rushYdsAfterContact;
    }
    public Integer getPassInts() {
        return passInts;
    }
    public void setPassInts(Integer passInts) {
        this.passInts = passInts;
    }
    public Integer getPassYds() {
        return passYds;
    }
    public void setPassYds(Integer passYds) {
        this.passYds = passYds;
    }
    public Integer getRushPts() {
        return rushPts;
    }
    public void setRushPts(Integer rushPts) {
        this.rushPts = rushPts;
    }
    public Double getPassYdsPerGame() {
        return passYdsPerGame;
    }
    public void setPassYdsPerGame(Double passYdsPerGame) {
        this.passYdsPerGame = passYdsPerGame;
    }
    public Integer getRush20PlusYds() {
        return rush20PlusYds;
    }
    public void setRush20PlusYds(Integer rush20PlusYds) {
        this.rush20PlusYds = rush20PlusYds;
    }
    public Integer getRushBrokenTackles() {
        return rushBrokenTackles;
    }
    public void setRushBrokenTackles(Integer rushBrokenTackles) {
        this.rushBrokenTackles = rushBrokenTackles;
    }
    public Integer getPassLongest() {
        return passLongest;
    }
    public void setPassLongest(Integer passLongest) {
        this.passLongest = passLongest;
    }
    public Double getPassYdsPerAtt() {
        return passYdsPerAtt;
    }
    public void setPassYdsPerAtt(Double passYdsPerAtt) {
        this.passYdsPerAtt = passYdsPerAtt;
    }
    public Double getPasserRating() {
        return passerRating;
    }
    public void setPasserRating(Double passerRating) {
        this.passerRating = passerRating;
    }
    public Integer getPassPts() {
        return passPts;
    }
    public void setPassPts(Integer passPts) {
        this.passPts = passPts;
    }
    public Double getRushYdsPerGame() {
        return rushYdsPerGame;
    }
    public void setRushYdsPerGame(Double rushYdsPerGame) {
        this.rushYdsPerGame = rushYdsPerGame;
    }
    public Double getRecYacPerCatch() {
        return recYacPerCatch;
    }
    public void setRecYacPerCatch(Double recYacPerCatch) {
        this.recYacPerCatch = recYacPerCatch;
    }
    public Integer getRecTDs() {
        return recTDs;
    }
    public void setRecTDs(Integer recTDs) {
        this.recTDs = recTDs;
    }
    public Integer getRecDrops() {
        return recDrops;
    }
    public void setRecDrops(Integer recDrops) {
        this.recDrops = recDrops;
    }
    public Double getRecCatchPct() {
        return recCatchPct;
    }
    public void setRecCatchPct(Double recCatchPct) {
        this.recCatchPct = recCatchPct;
    }
    public Double getRecToPct() {
        return recToPct;
    }
    public void setRecToPct(Double recToPct) {
        this.recToPct = recToPct;
    }
    public Double getRecYdsPerCatch() {
        return recYdsPerCatch;
    }
    public void setRecYdsPerCatch(Double recYdsPerCatch) {
        this.recYdsPerCatch = recYdsPerCatch;
    }
    public Double getRecYdsAfterCatch() {
        return recYdsAfterCatch;
    }
    public void setRecYdsAfterCatch(Double recYdsAfterCatch) {
        this.recYdsAfterCatch = recYdsAfterCatch;
    }
    public Double getRecYdsPerGame() {
        return recYdsPerGame;
    }
    public void setRecYdsPerGame(Double recYdsPerGame) {
        this.recYdsPerGame = recYdsPerGame;
    }
    public Integer getRecYds() {
        return recYds;
    }
    public void setRecYds(Integer recYds) {
        this.recYds = recYds;
    }
    public Integer getRecCatches() {
        return recCatches;
    }
    public void setRecCatches(Integer recCatches) {
        this.recCatches = recCatches;
    }
    public Integer getRecLongest() {
        return recLongest;
    }
    public void setRecLongest(Integer recLongest) {
        this.recLongest = recLongest;
    }
    public Integer getRecPts() {
        return recPts;
    }
    public void setRecPts(Integer recPts) {
        this.recPts = recPts;
    }

}