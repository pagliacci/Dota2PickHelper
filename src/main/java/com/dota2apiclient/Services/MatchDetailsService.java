package com.dota2apiclient.Services;

import com.dota2apiclient.ApiClient.ApiClient;
import com.dota2apiclient.ApiClient.Models.MatchDetails;
import com.dota2apiclient.Database.MatchDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatchDetailsService {
    @Autowired
    ApiClient apiClient;

    public MatchDetails get(long matchId) {
        return apiClient.GetMatchDetails(matchId);
    }
}
