package com.sportsdata.tracker.team;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Player {

    @SerializedName("fightForYardsTrait")
    @Expose
    private Integer fightForYardsTrait;
    @SerializedName("college")
    @Expose
    private String college;
    @SerializedName("devTrait")
    @Expose
    private Integer devTrait;
    @SerializedName("impactBlockRating")
    @Expose
    private Integer impactBlockRating;
    @SerializedName("manCoverRating")
    @Expose
    private Integer manCoverRating;
    @SerializedName("injuryType")
    @Expose
    private Integer injuryType;
    @SerializedName("agilityRating")
    @Expose
    private Integer agilityRating;
    @SerializedName("pressRating")
    @Expose
    private Integer pressRating;
    @SerializedName("presentationId")
    @Expose
    private Integer presentationId;
    @SerializedName("homeTown")
    @Expose
    private String homeTown;
    @SerializedName("penaltyTrait")
    @Expose
    private Integer penaltyTrait;
    @SerializedName("runStyle")
    @Expose
    private Integer runStyle;
    @SerializedName("capHit")
    @Expose
    private Integer capHit;
    @SerializedName("posCatchTrait")
    @Expose
    private Integer posCatchTrait;
    @SerializedName("teamSchemeOvr")
    @Expose
    private Integer teamSchemeOvr;
    @SerializedName("sizeGrade")
    @Expose
    private Integer sizeGrade;
    @SerializedName("physicalGrade")
    @Expose
    private Integer physicalGrade;
    @SerializedName("height")
    @Expose
    private Integer height;
    @SerializedName("pursuitRating")
    @Expose
    private Integer pursuitRating;
    @SerializedName("hitPowerRating")
    @Expose
    private Integer hitPowerRating;
    @SerializedName("throwAccRating")
    @Expose
    private Integer throwAccRating;
    @SerializedName("routeRunRating")
    @Expose
    private Integer routeRunRating;
    @SerializedName("dLBullRushTrait")
    @Expose
    private Integer dLBullRushTrait;
    @SerializedName("feetInBoundsTrait")
    @Expose
    private Integer feetInBoundsTrait;
    @SerializedName("isOnIR")
    @Expose
    private Boolean isOnIR;
    @SerializedName("capReleasePenalty")
    @Expose
    private Integer capReleasePenalty;
    @SerializedName("dropOpenPassTrait")
    @Expose
    private Integer dropOpenPassTrait;
    @SerializedName("forcePassTrait")
    @Expose
    private Integer forcePassTrait;
    @SerializedName("hPCatchTrait")
    @Expose
    private Integer hPCatchTrait;
    @SerializedName("staminaRating")
    @Expose
    private Integer staminaRating;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("qBStyleTrait")
    @Expose
    private Integer qBStyleTrait;
    @SerializedName("jerseyNum")
    @Expose
    private Integer jerseyNum;
    @SerializedName("spinMoveRating")
    @Expose
    private Integer spinMoveRating;
    @SerializedName("scheme")
    @Expose
    private Integer scheme;
    @SerializedName("strengthRating")
    @Expose
    private Integer strengthRating;
    @SerializedName("isOnPracticeSquad")
    @Expose
    private Boolean isOnPracticeSquad;
    @SerializedName("reSignStatus")
    @Expose
    private Integer reSignStatus;
    @SerializedName("accelRating")
    @Expose
    private Integer accelRating;
    @SerializedName("kickPowerRating")
    @Expose
    private Integer kickPowerRating;
    @SerializedName("isFreeAgent")
    @Expose
    private Boolean isFreeAgent;
    @SerializedName("stripBallTrait")
    @Expose
    private Integer stripBallTrait;
    @SerializedName("sensePressureTrait")
    @Expose
    private Integer sensePressureTrait;
    @SerializedName("blockShedRating")
    @Expose
    private Integer blockShedRating;
    @SerializedName("portraitId")
    @Expose
    private Integer portraitId;
    @SerializedName("injuryLength")
    @Expose
    private Integer injuryLength;
    @SerializedName("toughRating")
    @Expose
    private Integer toughRating;
    @SerializedName("kickAccRating")
    @Expose
    private Integer kickAccRating;
    @SerializedName("catchRating")
    @Expose
    private Integer catchRating;
    @SerializedName("throwPowerRating")
    @Expose
    private Integer throwPowerRating;
    @SerializedName("homeState")
    @Expose
    private Integer homeState;
    @SerializedName("birthYear")
    @Expose
    private Integer birthYear;
    @SerializedName("stiffArmRating")
    @Expose
    private Integer stiffArmRating;
    @SerializedName("productionGrade")
    @Expose
    private Integer productionGrade;
    @SerializedName("tackleRating")
    @Expose
    private Integer tackleRating;
    @SerializedName("finesseMovesRating")
    @Expose
    private Integer finesseMovesRating;
    @SerializedName("powerMovesRating")
    @Expose
    private Integer powerMovesRating;
    @SerializedName("throwAccDeepRating")
    @Expose
    private Integer throwAccDeepRating;
    @SerializedName("draftRound")
    @Expose
    private Integer draftRound;
    @SerializedName("isActive")
    @Expose
    private Boolean isActive;
    @SerializedName("desiredSalary")
    @Expose
    private Integer desiredSalary;
    @SerializedName("playActionRating")
    @Expose
    private Integer playActionRating;
    @SerializedName("playRecRating")
    @Expose
    private Integer playRecRating;
    @SerializedName("injuryRating")
    @Expose
    private Integer injuryRating;
    @SerializedName("tightSpiralTrait")
    @Expose
    private Integer tightSpiralTrait;
    @SerializedName("jukeMoveRating")
    @Expose
    private Integer jukeMoveRating;
    @SerializedName("dLSwimTrait")
    @Expose
    private Integer dLSwimTrait;
    @SerializedName("runBlockRating")
    @Expose
    private Integer runBlockRating;
    @SerializedName("contractLength")
    @Expose
    private Integer contractLength;
    @SerializedName("bCVRating")
    @Expose
    private Integer bCVRating;
    @SerializedName("passBlockRating")
    @Expose
    private Integer passBlockRating;
    @SerializedName("playBallTrait")
    @Expose
    private Integer playBallTrait;
    @SerializedName("lBStyleTrait")
    @Expose
    private Integer lBStyleTrait;
    @SerializedName("rosterGoalList")
    @Expose
    private List<RosterGoalList> rosterGoalList = null;
    @SerializedName("yACCatchTrait")
    @Expose
    private Integer yACCatchTrait;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("dLSpinTrait")
    @Expose
    private Integer dLSpinTrait;
    @SerializedName("kickRetRating")
    @Expose
    private Integer kickRetRating;
    @SerializedName("jumpRating")
    @Expose
    private Integer jumpRating;
    @SerializedName("birthMonth")
    @Expose
    private Integer birthMonth;
    @SerializedName("rookieYear")
    @Expose
    private Integer rookieYear;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("yearsPro")
    @Expose
    private Integer yearsPro;
    @SerializedName("draftPick")
    @Expose
    private Integer draftPick;
    @SerializedName("specCatchRating")
    @Expose
    private Integer specCatchRating;
    @SerializedName("cITRating")
    @Expose
    private Integer cITRating;
    @SerializedName("truckRating")
    @Expose
    private Integer truckRating;
    @SerializedName("throwAccShortRating")
    @Expose
    private Integer throwAccShortRating;
    @SerializedName("position")
    @Expose
    private String position;
    @SerializedName("contractSalary")
    @Expose
    private Integer contractSalary;
    @SerializedName("throwAwayTrait")
    @Expose
    private Integer throwAwayTrait;
    @SerializedName("durabilityGrade")
    @Expose
    private Integer durabilityGrade;
    @SerializedName("throwAccMidRating")
    @Expose
    private Integer throwAccMidRating;
    @SerializedName("predictTrait")
    @Expose
    private Integer predictTrait;
    @SerializedName("coverBallTrait")
    @Expose
    private Integer coverBallTrait;
    @SerializedName("personalityRating")
    @Expose
    private Integer personalityRating;
    @SerializedName("experiencePoints")
    @Expose
    private Integer experiencePoints;
    @SerializedName("carryRating")
    @Expose
    private Integer carryRating;
    @SerializedName("releaseRating")
    @Expose
    private Integer releaseRating;
    @SerializedName("intangibleGrade")
    @Expose
    private Integer intangibleGrade;
    @SerializedName("awareRating")
    @Expose
    private Integer awareRating;
    @SerializedName("playerSchemeOvr")
    @Expose
    private Integer playerSchemeOvr;
    @SerializedName("importanceGrade")
    @Expose
    private Integer importanceGrade;
    @SerializedName("speedRating")
    @Expose
    private Integer speedRating;
    @SerializedName("legacyScore")
    @Expose
    private Integer legacyScore;
    @SerializedName("zoneCoverRating")
    @Expose
    private Integer zoneCoverRating;
    @SerializedName("throwOnRunRating")
    @Expose
    private Integer throwOnRunRating;
    @SerializedName("desiredBonus")
    @Expose
    private Integer desiredBonus;
    @SerializedName("playerBestOvr")
    @Expose
    private Integer playerBestOvr;
    @SerializedName("capReleaseNetSavings")
    @Expose
    private Integer capReleaseNetSavings;
    @SerializedName("birthDay")
    @Expose
    private Integer birthDay;
    @SerializedName("elusiveRating")
    @Expose
    private Integer elusiveRating;
    @SerializedName("bigHitTrait")
    @Expose
    private Integer bigHitTrait;
    @SerializedName("confRating")
    @Expose
    private Integer confRating;
    @SerializedName("highMotorTrait")
    @Expose
    private Integer highMotorTrait;
    @SerializedName("rosterId")
    @Expose
    private Integer rosterId;
    @SerializedName("clutchTrait")
    @Expose
    private Integer clutchTrait;
    @SerializedName("desiredLength")
    @Expose
    private Integer desiredLength;
    @SerializedName("contractBonus")
    @Expose
    private Integer contractBonus;
    @SerializedName("teamId")
    @Expose
    private Integer teamId;
    @SerializedName("contractYearsLeft")
    @Expose
    private Integer contractYearsLeft;
    @SerializedName("age")
    @Expose
    private Integer age;


    private List<PlayerStat> playerStats;

    public List<PlayerStat> getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(List<PlayerStat> playerStats) {
        this.playerStats = playerStats;
    }

    public Integer getFightForYardsTrait() {
        return fightForYardsTrait;
    }

    public void setFightForYardsTrait(Integer fightForYardsTrait) {
        this.fightForYardsTrait = fightForYardsTrait;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Integer getDevTrait() {
        return devTrait;
    }

    public void setDevTrait(Integer devTrait) {
        this.devTrait = devTrait;
    }

    public Integer getImpactBlockRating() {
        return impactBlockRating;
    }

    public void setImpactBlockRating(Integer impactBlockRating) {
        this.impactBlockRating = impactBlockRating;
    }

    public Integer getManCoverRating() {
        return manCoverRating;
    }

    public void setManCoverRating(Integer manCoverRating) {
        this.manCoverRating = manCoverRating;
    }

    public Integer getInjuryType() {
        return injuryType;
    }

    public void setInjuryType(Integer injuryType) {
        this.injuryType = injuryType;
    }

    public Integer getAgilityRating() {
        return agilityRating;
    }

    public void setAgilityRating(Integer agilityRating) {
        this.agilityRating = agilityRating;
    }

    public Integer getPressRating() {
        return pressRating;
    }

    public void setPressRating(Integer pressRating) {
        this.pressRating = pressRating;
    }

    public Integer getPresentationId() {
        return presentationId;
    }

    public void setPresentationId(Integer presentationId) {
        this.presentationId = presentationId;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public Integer getPenaltyTrait() {
        return penaltyTrait;
    }

    public void setPenaltyTrait(Integer penaltyTrait) {
        this.penaltyTrait = penaltyTrait;
    }

    public Integer getRunStyle() {
        return runStyle;
    }

    public void setRunStyle(Integer runStyle) {
        this.runStyle = runStyle;
    }

    public Integer getCapHit() {
        return capHit;
    }

    public void setCapHit(Integer capHit) {
        this.capHit = capHit;
    }

    public Integer getPosCatchTrait() {
        return posCatchTrait;
    }

    public void setPosCatchTrait(Integer posCatchTrait) {
        this.posCatchTrait = posCatchTrait;
    }

    public Integer getTeamSchemeOvr() {
        return teamSchemeOvr;
    }

    public void setTeamSchemeOvr(Integer teamSchemeOvr) {
        this.teamSchemeOvr = teamSchemeOvr;
    }

    public Integer getSizeGrade() {
        return sizeGrade;
    }

    public void setSizeGrade(Integer sizeGrade) {
        this.sizeGrade = sizeGrade;
    }

    public Integer getPhysicalGrade() {
        return physicalGrade;
    }

    public void setPhysicalGrade(Integer physicalGrade) {
        this.physicalGrade = physicalGrade;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getPursuitRating() {
        return pursuitRating;
    }

    public void setPursuitRating(Integer pursuitRating) {
        this.pursuitRating = pursuitRating;
    }

    public Integer getHitPowerRating() {
        return hitPowerRating;
    }

    public void setHitPowerRating(Integer hitPowerRating) {
        this.hitPowerRating = hitPowerRating;
    }

    public Integer getThrowAccRating() {
        return throwAccRating;
    }

    public void setThrowAccRating(Integer throwAccRating) {
        this.throwAccRating = throwAccRating;
    }

    public Integer getRouteRunRating() {
        return routeRunRating;
    }

    public void setRouteRunRating(Integer routeRunRating) {
        this.routeRunRating = routeRunRating;
    }

    public Integer getDLBullRushTrait() {
        return dLBullRushTrait;
    }

    public void setDLBullRushTrait(Integer dLBullRushTrait) {
        this.dLBullRushTrait = dLBullRushTrait;
    }

    public Integer getFeetInBoundsTrait() {
        return feetInBoundsTrait;
    }

    public void setFeetInBoundsTrait(Integer feetInBoundsTrait) {
        this.feetInBoundsTrait = feetInBoundsTrait;
    }

    public Boolean getIsOnIR() {
        return isOnIR;
    }

    public void setIsOnIR(Boolean isOnIR) {
        this.isOnIR = isOnIR;
    }

    public Integer getCapReleasePenalty() {
        return capReleasePenalty;
    }

    public void setCapReleasePenalty(Integer capReleasePenalty) {
        this.capReleasePenalty = capReleasePenalty;
    }

    public Integer getDropOpenPassTrait() {
        return dropOpenPassTrait;
    }

    public void setDropOpenPassTrait(Integer dropOpenPassTrait) {
        this.dropOpenPassTrait = dropOpenPassTrait;
    }

    public Integer getForcePassTrait() {
        return forcePassTrait;
    }

    public void setForcePassTrait(Integer forcePassTrait) {
        this.forcePassTrait = forcePassTrait;
    }

    public Integer getHPCatchTrait() {
        return hPCatchTrait;
    }

    public void setHPCatchTrait(Integer hPCatchTrait) {
        this.hPCatchTrait = hPCatchTrait;
    }

    public Integer getStaminaRating() {
        return staminaRating;
    }

    public void setStaminaRating(Integer staminaRating) {
        this.staminaRating = staminaRating;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getQBStyleTrait() {
        return qBStyleTrait;
    }

    public void setQBStyleTrait(Integer qBStyleTrait) {
        this.qBStyleTrait = qBStyleTrait;
    }

    public Integer getJerseyNum() {
        return jerseyNum;
    }

    public void setJerseyNum(Integer jerseyNum) {
        this.jerseyNum = jerseyNum;
    }

    public Integer getSpinMoveRating() {
        return spinMoveRating;
    }

    public void setSpinMoveRating(Integer spinMoveRating) {
        this.spinMoveRating = spinMoveRating;
    }

    public Integer getScheme() {
        return scheme;
    }

    public void setScheme(Integer scheme) {
        this.scheme = scheme;
    }

    public Integer getStrengthRating() {
        return strengthRating;
    }

    public void setStrengthRating(Integer strengthRating) {
        this.strengthRating = strengthRating;
    }

    public Boolean getIsOnPracticeSquad() {
        return isOnPracticeSquad;
    }

    public void setIsOnPracticeSquad(Boolean isOnPracticeSquad) {
        this.isOnPracticeSquad = isOnPracticeSquad;
    }

    public Integer getReSignStatus() {
        return reSignStatus;
    }

    public void setReSignStatus(Integer reSignStatus) {
        this.reSignStatus = reSignStatus;
    }

    public Integer getAccelRating() {
        return accelRating;
    }

    public void setAccelRating(Integer accelRating) {
        this.accelRating = accelRating;
    }

    public Integer getKickPowerRating() {
        return kickPowerRating;
    }

    public void setKickPowerRating(Integer kickPowerRating) {
        this.kickPowerRating = kickPowerRating;
    }

    public Boolean getIsFreeAgent() {
        return isFreeAgent;
    }

    public void setIsFreeAgent(Boolean isFreeAgent) {
        this.isFreeAgent = isFreeAgent;
    }

    public Integer getStripBallTrait() {
        return stripBallTrait;
    }

    public void setStripBallTrait(Integer stripBallTrait) {
        this.stripBallTrait = stripBallTrait;
    }

    public Integer getSensePressureTrait() {
        return sensePressureTrait;
    }

    public void setSensePressureTrait(Integer sensePressureTrait) {
        this.sensePressureTrait = sensePressureTrait;
    }

    public Integer getBlockShedRating() {
        return blockShedRating;
    }

    public void setBlockShedRating(Integer blockShedRating) {
        this.blockShedRating = blockShedRating;
    }

    public Integer getPortraitId() {
        return portraitId;
    }

    public void setPortraitId(Integer portraitId) {
        this.portraitId = portraitId;
    }

    public Integer getInjuryLength() {
        return injuryLength;
    }

    public void setInjuryLength(Integer injuryLength) {
        this.injuryLength = injuryLength;
    }

    public Integer getToughRating() {
        return toughRating;
    }

    public void setToughRating(Integer toughRating) {
        this.toughRating = toughRating;
    }

    public Integer getKickAccRating() {
        return kickAccRating;
    }

    public void setKickAccRating(Integer kickAccRating) {
        this.kickAccRating = kickAccRating;
    }

    public Integer getCatchRating() {
        return catchRating;
    }

    public void setCatchRating(Integer catchRating) {
        this.catchRating = catchRating;
    }

    public Integer getThrowPowerRating() {
        return throwPowerRating;
    }

    public void setThrowPowerRating(Integer throwPowerRating) {
        this.throwPowerRating = throwPowerRating;
    }

    public Integer getHomeState() {
        return homeState;
    }

    public void setHomeState(Integer homeState) {
        this.homeState = homeState;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getStiffArmRating() {
        return stiffArmRating;
    }

    public void setStiffArmRating(Integer stiffArmRating) {
        this.stiffArmRating = stiffArmRating;
    }

    public Integer getProductionGrade() {
        return productionGrade;
    }

    public void setProductionGrade(Integer productionGrade) {
        this.productionGrade = productionGrade;
    }

    public Integer getTackleRating() {
        return tackleRating;
    }

    public void setTackleRating(Integer tackleRating) {
        this.tackleRating = tackleRating;
    }

    public Integer getFinesseMovesRating() {
        return finesseMovesRating;
    }

    public void setFinesseMovesRating(Integer finesseMovesRating) {
        this.finesseMovesRating = finesseMovesRating;
    }

    public Integer getPowerMovesRating() {
        return powerMovesRating;
    }

    public void setPowerMovesRating(Integer powerMovesRating) {
        this.powerMovesRating = powerMovesRating;
    }

    public Integer getThrowAccDeepRating() {
        return throwAccDeepRating;
    }

    public void setThrowAccDeepRating(Integer throwAccDeepRating) {
        this.throwAccDeepRating = throwAccDeepRating;
    }

    public Integer getDraftRound() {
        return draftRound;
    }

    public void setDraftRound(Integer draftRound) {
        this.draftRound = draftRound;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Integer getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(Integer desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public Integer getPlayActionRating() {
        return playActionRating;
    }

    public void setPlayActionRating(Integer playActionRating) {
        this.playActionRating = playActionRating;
    }

    public Integer getPlayRecRating() {
        return playRecRating;
    }

    public void setPlayRecRating(Integer playRecRating) {
        this.playRecRating = playRecRating;
    }

    public Integer getInjuryRating() {
        return injuryRating;
    }

    public void setInjuryRating(Integer injuryRating) {
        this.injuryRating = injuryRating;
    }

    public Integer getTightSpiralTrait() {
        return tightSpiralTrait;
    }

    public void setTightSpiralTrait(Integer tightSpiralTrait) {
        this.tightSpiralTrait = tightSpiralTrait;
    }

    public Integer getJukeMoveRating() {
        return jukeMoveRating;
    }

    public void setJukeMoveRating(Integer jukeMoveRating) {
        this.jukeMoveRating = jukeMoveRating;
    }

    public Integer getDLSwimTrait() {
        return dLSwimTrait;
    }

    public void setDLSwimTrait(Integer dLSwimTrait) {
        this.dLSwimTrait = dLSwimTrait;
    }

    public Integer getRunBlockRating() {
        return runBlockRating;
    }

    public void setRunBlockRating(Integer runBlockRating) {
        this.runBlockRating = runBlockRating;
    }

    public Integer getContractLength() {
        return contractLength;
    }

    public void setContractLength(Integer contractLength) {
        this.contractLength = contractLength;
    }

    public Integer getBCVRating() {
        return bCVRating;
    }

    public void setBCVRating(Integer bCVRating) {
        this.bCVRating = bCVRating;
    }

    public Integer getPassBlockRating() {
        return passBlockRating;
    }

    public void setPassBlockRating(Integer passBlockRating) {
        this.passBlockRating = passBlockRating;
    }

    public Integer getPlayBallTrait() {
        return playBallTrait;
    }

    public void setPlayBallTrait(Integer playBallTrait) {
        this.playBallTrait = playBallTrait;
    }

    public Integer getLBStyleTrait() {
        return lBStyleTrait;
    }

    public void setLBStyleTrait(Integer lBStyleTrait) {
        this.lBStyleTrait = lBStyleTrait;
    }

    public List<RosterGoalList> getRosterGoalList() {
        return rosterGoalList;
    }

    public void setRosterGoalList(List<RosterGoalList> rosterGoalList) {
        this.rosterGoalList = rosterGoalList;
    }

    public Integer getYACCatchTrait() {
        return yACCatchTrait;
    }

    public void setYACCatchTrait(Integer yACCatchTrait) {
        this.yACCatchTrait = yACCatchTrait;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getDLSpinTrait() {
        return dLSpinTrait;
    }

    public void setDLSpinTrait(Integer dLSpinTrait) {
        this.dLSpinTrait = dLSpinTrait;
    }

    public Integer getKickRetRating() {
        return kickRetRating;
    }

    public void setKickRetRating(Integer kickRetRating) {
        this.kickRetRating = kickRetRating;
    }

    public Integer getJumpRating() {
        return jumpRating;
    }

    public void setJumpRating(Integer jumpRating) {
        this.jumpRating = jumpRating;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getRookieYear() {
        return rookieYear;
    }

    public void setRookieYear(Integer rookieYear) {
        this.rookieYear = rookieYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getYearsPro() {
        return yearsPro;
    }

    public void setYearsPro(Integer yearsPro) {
        this.yearsPro = yearsPro;
    }

    public Integer getDraftPick() {
        return draftPick;
    }

    public void setDraftPick(Integer draftPick) {
        this.draftPick = draftPick;
    }

    public Integer getSpecCatchRating() {
        return specCatchRating;
    }

    public void setSpecCatchRating(Integer specCatchRating) {
        this.specCatchRating = specCatchRating;
    }

    public Integer getCITRating() {
        return cITRating;
    }

    public void setCITRating(Integer cITRating) {
        this.cITRating = cITRating;
    }

    public Integer getTruckRating() {
        return truckRating;
    }

    public void setTruckRating(Integer truckRating) {
        this.truckRating = truckRating;
    }

    public Integer getThrowAccShortRating() {
        return throwAccShortRating;
    }

    public void setThrowAccShortRating(Integer throwAccShortRating) {
        this.throwAccShortRating = throwAccShortRating;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getContractSalary() {
        return contractSalary;
    }

    public void setContractSalary(Integer contractSalary) {
        this.contractSalary = contractSalary;
    }

    public Integer getThrowAwayTrait() {
        return throwAwayTrait;
    }

    public void setThrowAwayTrait(Integer throwAwayTrait) {
        this.throwAwayTrait = throwAwayTrait;
    }

    public Integer getDurabilityGrade() {
        return durabilityGrade;
    }

    public void setDurabilityGrade(Integer durabilityGrade) {
        this.durabilityGrade = durabilityGrade;
    }

    public Integer getThrowAccMidRating() {
        return throwAccMidRating;
    }

    public void setThrowAccMidRating(Integer throwAccMidRating) {
        this.throwAccMidRating = throwAccMidRating;
    }

    public Integer getPredictTrait() {
        return predictTrait;
    }

    public void setPredictTrait(Integer predictTrait) {
        this.predictTrait = predictTrait;
    }

    public Integer getCoverBallTrait() {
        return coverBallTrait;
    }

    public void setCoverBallTrait(Integer coverBallTrait) {
        this.coverBallTrait = coverBallTrait;
    }

    public Integer getPersonalityRating() {
        return personalityRating;
    }

    public void setPersonalityRating(Integer personalityRating) {
        this.personalityRating = personalityRating;
    }

    public Integer getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(Integer experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public Integer getCarryRating() {
        return carryRating;
    }

    public void setCarryRating(Integer carryRating) {
        this.carryRating = carryRating;
    }

    public Integer getReleaseRating() {
        return releaseRating;
    }

    public void setReleaseRating(Integer releaseRating) {
        this.releaseRating = releaseRating;
    }

    public Integer getIntangibleGrade() {
        return intangibleGrade;
    }

    public void setIntangibleGrade(Integer intangibleGrade) {
        this.intangibleGrade = intangibleGrade;
    }

    public Integer getAwareRating() {
        return awareRating;
    }

    public void setAwareRating(Integer awareRating) {
        this.awareRating = awareRating;
    }

    public Integer getPlayerSchemeOvr() {
        return playerSchemeOvr;
    }

    public void setPlayerSchemeOvr(Integer playerSchemeOvr) {
        this.playerSchemeOvr = playerSchemeOvr;
    }

    public Integer getImportanceGrade() {
        return importanceGrade;
    }

    public void setImportanceGrade(Integer importanceGrade) {
        this.importanceGrade = importanceGrade;
    }

    public Integer getSpeedRating() {
        return speedRating;
    }

    public void setSpeedRating(Integer speedRating) {
        this.speedRating = speedRating;
    }

    public Integer getLegacyScore() {
        return legacyScore;
    }

    public void setLegacyScore(Integer legacyScore) {
        this.legacyScore = legacyScore;
    }

    public Integer getZoneCoverRating() {
        return zoneCoverRating;
    }

    public void setZoneCoverRating(Integer zoneCoverRating) {
        this.zoneCoverRating = zoneCoverRating;
    }

    public Integer getThrowOnRunRating() {
        return throwOnRunRating;
    }

    public void setThrowOnRunRating(Integer throwOnRunRating) {
        this.throwOnRunRating = throwOnRunRating;
    }

    public Integer getDesiredBonus() {
        return desiredBonus;
    }

    public void setDesiredBonus(Integer desiredBonus) {
        this.desiredBonus = desiredBonus;
    }

    public Integer getPlayerBestOvr() {
        return playerBestOvr;
    }

    public void setPlayerBestOvr(Integer playerBestOvr) {
        this.playerBestOvr = playerBestOvr;
    }

    public Integer getCapReleaseNetSavings() {
        return capReleaseNetSavings;
    }

    public void setCapReleaseNetSavings(Integer capReleaseNetSavings) {
        this.capReleaseNetSavings = capReleaseNetSavings;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getElusiveRating() {
        return elusiveRating;
    }

    public void setElusiveRating(Integer elusiveRating) {
        this.elusiveRating = elusiveRating;
    }

    public Integer getBigHitTrait() {
        return bigHitTrait;
    }

    public void setBigHitTrait(Integer bigHitTrait) {
        this.bigHitTrait = bigHitTrait;
    }

    public Integer getConfRating() {
        return confRating;
    }

    public void setConfRating(Integer confRating) {
        this.confRating = confRating;
    }

    public Integer getHighMotorTrait() {
        return highMotorTrait;
    }

    public void setHighMotorTrait(Integer highMotorTrait) {
        this.highMotorTrait = highMotorTrait;
    }

    public Integer getRosterId() {
        return rosterId;
    }

    public void setRosterId(Integer rosterId) {
        this.rosterId = rosterId;
    }

    public Integer getClutchTrait() {
        return clutchTrait;
    }

    public void setClutchTrait(Integer clutchTrait) {
        this.clutchTrait = clutchTrait;
    }

    public Integer getDesiredLength() {
        return desiredLength;
    }

    public void setDesiredLength(Integer desiredLength) {
        this.desiredLength = desiredLength;
    }

    public Integer getContractBonus() {
        return contractBonus;
    }

    public void setContractBonus(Integer contractBonus) {
        this.contractBonus = contractBonus;
    }

    public Integer getTeamId() {
        return teamId;
    }

    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }

    public Integer getContractYearsLeft() {
        return contractYearsLeft;
    }

    public void setContractYearsLeft(Integer contractYearsLeft) {
        this.contractYearsLeft = contractYearsLeft;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}