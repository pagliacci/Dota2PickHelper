package com.dota2apiclient.Controllers.Models;

import java.util.List;

public class MatchDetailsViewModel {
    List<PlayerViewModel> players;

    public List<PlayerViewModel> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerViewModel> players) {
        this.players = players;
    }
}
