package com.dota2apiclient.Controllers;

import com.dota2apiclient.ApiClient.ApiClient;
import com.dota2apiclient.ApiClient.Models.*;
import com.dota2apiclient.Controllers.Models.MatchDetailsViewModel;
import com.dota2apiclient.Controllers.Models.PlayerViewModel;
import com.dota2apiclient.Services.HeroesService;
import com.dota2apiclient.Services.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class ContentController {
    @Autowired
    ApiClient apiClient;

    @Autowired
    HeroesService heroesService;

    @Autowired
    ItemsService itemsService;

    @RequestMapping("/afterLogin")
    public String Content() {
        MatchHistory history = apiClient.GetMatchHistory(76561197996308418L);
        return "content";
    }

    @RequestMapping("/history")
    public ModelAndView MatchHistory(@RequestParam("id") long id) {
        MatchHistory history = apiClient.GetMatchHistory(id);
        ModelAndView modelAndView = new ModelAndView("history");
        modelAndView.addObject("history", history);
        return modelAndView;
    }

    @RequestMapping("/details")
    public ModelAndView MatchDetails(@RequestParam("matchId") String matchId) {
        MatchDetails details = apiClient.GetMatchDetails(matchId);
        MatchDetailsViewModel viewModel = new MatchDetailsViewModel();
        List<PlayerViewModel> playerViewModels = new ArrayList<>();
        for(Player player : details.getPlayers()) {
            Profile profile = apiClient.GetProfileData(Collections.singletonList(player.getAccountId() + 76561197960265728L)).get(0);
            PlayerViewModel playerViewModel = new PlayerViewModel();
            playerViewModel.setPersonName(profile.getPersonName());
            playerViewModel.setAvatar(profile.getAvatar());
            playerViewModel.setKills(player.getKills());
            playerViewModel.setDeaths(player.getDeaths());
            playerViewModel.setAssists(player.getAssists());

            playerViewModel.setHero(heroesService.get(player.getHeroId()));

            List<Item> playerItems = new ArrayList<>();
            playerItems.add(itemsService.get(player.getItem0()));
            playerItems.add(itemsService.get(player.getItem1()));
            playerItems.add(itemsService.get(player.getItem2()));
            playerItems.add(itemsService.get(player.getItem3()));
            playerItems.add(itemsService.get(player.getItem4()));
            playerItems.add(itemsService.get(player.getItem5()));

            playerViewModel.setItems(playerItems);

            playerViewModels.add(playerViewModel);
        }
        viewModel.setPlayers(playerViewModels);
        ModelAndView modelAndView = new ModelAndView("details");
        modelAndView.addObject("details", viewModel);
        return modelAndView;
    }

    @RequestMapping("/heroes")
    public ModelAndView Heroes(@RequestParam(value = "id", required = false) Long id) {
        List<Hero> heroes = new ArrayList<>();
        if(id != null) {
            heroes.add(heroesService.get(id));
        } else {
            heroes = heroesService.getAll();
        }
        ModelAndView modelAndView = new ModelAndView("heroes");
        modelAndView.addObject("heroes", heroes);
        return modelAndView;
    }

    @RequestMapping("/items")
    public ModelAndView Items(@RequestParam(value = "id", required = false) Long id) {
        List<Item> items = new ArrayList<>();
        if(id != null) {
            items.add(itemsService.get(id));
        } else {
            items = itemsService.getAll();
        }
        ModelAndView modelAndView = new ModelAndView("items");
        modelAndView.addObject("items", items);
        return modelAndView;
    }

    @RequestMapping("/profiles")
    public ModelAndView Profiles(@RequestParam("nickname") String nickname) {
        List<Profile> profiles = apiClient.GetProfilesByNickname(nickname);
        ModelAndView modelAndView = new ModelAndView("profiles");
        modelAndView.addObject("profiles", profiles);
        return modelAndView;
    }
}
