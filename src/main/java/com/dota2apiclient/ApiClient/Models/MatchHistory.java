package com.dota2apiclient.ApiClient.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchHistory {
    private int status;

    @JsonProperty("num_results")
    private int numberOfResults;

    @JsonProperty("total_results")
    private int totalResults;

    @JsonProperty("results_remaining")
    private int resultsRemaining;

    private List<Match> matches;

    //region Getters / Setters
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getNumberOfResults() {
        return numberOfResults;
    }

    public void setNumberOfResults(int numberOfResults) {
        this.numberOfResults = numberOfResults;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getResultsRemaining() {
        return resultsRemaining;
    }

    public void setResultsRemaining(int resultsRemaining) {
        this.resultsRemaining = resultsRemaining;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
    //endregion
}
