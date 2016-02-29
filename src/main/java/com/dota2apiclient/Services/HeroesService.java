package com.dota2apiclient.Services;

import com.dota2apiclient.ApiClient.ApiClient;
import com.dota2apiclient.ApiClient.Models.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroesService {
    @Autowired
    ApiClient apiClient;

    @Cacheable
    public List<Hero> getAll() {
        return apiClient.GetHeroes().getHeroes();
    }

    public Hero get(long id) {
        return getAll().stream()
                .filter((hero) -> hero.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
