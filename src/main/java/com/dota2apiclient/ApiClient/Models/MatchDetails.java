package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchDetails {
    @JsonProperty("radiant_win")
    private boolean radiantWin;

    private int duration;

    @JsonProperty("start_time")
    private long startTime;

    @JsonProperty("match_id")
    private String matchId;

    @JsonProperty("match_seq_num")
    private String matchSequenceNumber;

    @JsonProperty("tower_status_radiant")
    private int towerStatusRadiant;

    @JsonProperty("tower_status_dire")
    private int towerStatusDire;

    @JsonProperty("barracks_status_radiant")
    private int barracksStatusRadiant;

    @JsonProperty("barracks_status_dire")
    private int barracksStatusDire;

    private int cluster;

    @JsonProperty("first_blood_time")
    private long firstBloodTime;

    @JsonProperty("lobby_type")
    private int lobbyType;

    @JsonProperty("human_players")
    private int humamPlayers;

    @JsonProperty("leagueid")
    private int leagueId;

    @JsonProperty("positive_votes")
    private int positiveVotes;

    @JsonProperty("negative_votes")
    private int negativeVotes;

    @JsonProperty("game_mode")
    private int gameMode;

    private int flags;

    private int engine;

    private List<Player> players;

    //region Getters / Setters
    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getMatchSequenceNumber() {
        return matchSequenceNumber;
    }

    public void setMatchSequenceNumber(String matchSequenceNumber) {
        this.matchSequenceNumber = matchSequenceNumber;
    }

    public int getTowerStatusRadiant() {
        return towerStatusRadiant;
    }

    public void setTowerStatusRadiant(int towerStatusRadiant) {
        this.towerStatusRadiant = towerStatusRadiant;
    }

    public int getTowerStatusDire() {
        return towerStatusDire;
    }

    public void setTowerStatusDire(int towerStatusDire) {
        this.towerStatusDire = towerStatusDire;
    }

    public int getBarracksStatusRadiant() {
        return barracksStatusRadiant;
    }

    public void setBarracksStatusRadiant(int barracksStatusRadiant) {
        this.barracksStatusRadiant = barracksStatusRadiant;
    }

    public int getBarracksStatusDire() {
        return barracksStatusDire;
    }

    public void setBarracksStatusDire(int barracksStatusDire) {
        this.barracksStatusDire = barracksStatusDire;
    }

    public int getCluster() {
        return cluster;
    }

    public void setCluster(int cluster) {
        this.cluster = cluster;
    }

    public long getFirstBloodTime() {
        return firstBloodTime;
    }

    public void setFirstBloodTime(long firstBloodTime) {
        this.firstBloodTime = firstBloodTime;
    }

    public int getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
    }

    public int getHumamPlayers() {
        return humamPlayers;
    }

    public void setHumamPlayers(int humamPlayers) {
        this.humamPlayers = humamPlayers;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public int getPositiveVotes() {
        return positiveVotes;
    }

    public void setPositiveVotes(int positiveVotes) {
        this.positiveVotes = positiveVotes;
    }

    public int getNegativeVotes() {
        return negativeVotes;
    }

    public void setNegativeVotes(int negativeVotes) {
        this.negativeVotes = negativeVotes;
    }

    public int getGameMode() {
        return gameMode;
    }

    public void setGameMode(int gameMode) {
        this.gameMode = gameMode;
    }

    public int getFlags() {
        return flags;
    }

    public void setFlags(int flags) {
        this.flags = flags;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    //endregion
}
