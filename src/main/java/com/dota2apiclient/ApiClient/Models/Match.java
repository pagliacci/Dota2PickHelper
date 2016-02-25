package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {
    @JsonProperty("match_id")
    private String matchId;

    @JsonProperty("match_seq_num")
    private String matchSequenceNumber;

    @JsonProperty("start_time")
    private long startTime;

    @JsonProperty("lobby_type")
    private int lobbyType;

    @JsonProperty("radiant_team_id")
    private int radiantTeamId;

    @JsonProperty("dire_team_id")
    private int direTeamId;

    private List<Player> players;

    //region Getters / Setters
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

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getLobbyType() {
        return lobbyType;
    }

    public void setLobbyType(int lobbyType) {
        this.lobbyType = lobbyType;
    }

    public int getRadiantTeamId() {
        return radiantTeamId;
    }

    public void setRadiantTeamId(int radiantTeamId) {
        this.radiantTeamId = radiantTeamId;
    }

    public int getDireTeamId() {
        return direTeamId;
    }

    public void setDireTeamId(int direTeamId) {
        this.direTeamId = direTeamId;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    //endregion
}