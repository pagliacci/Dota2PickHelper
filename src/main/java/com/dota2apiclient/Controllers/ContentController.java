package com.dota2apiclient.Controllers;

import com.dota2apiclient.ApiClient.ApiClient;
import com.dota2apiclient.ApiClient.Models.Heroes;
import com.dota2apiclient.ApiClient.Models.Items;
import com.dota2apiclient.ApiClient.Models.MatchHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContentController {
    @Autowired
    ApiClient apiClient;


//    @RequestMapping(value = "message", method = RequestMethod.GET)
//    public ModelAndView messages() {
//        ModelAndView mav = new ModelAndView("message/list");
//        mav.addObject("messages", messageRepository.findAll());
//        return mav;
//    }

    @RequestMapping("/afterLogin")
    public String Content() {
        MatchHistory history = apiClient.GetMatchHistory("76561197996308418");
        return "content";
    }

    @RequestMapping("/history")
    public ModelAndView MatchHistory(@RequestParam("id") String id) {
        MatchHistory history = apiClient.GetMatchHistory(id);//76561197996308418
        ModelAndView modelAndView = new ModelAndView("content");
        modelAndView.addObject("history", history);
        return modelAndView;
    }

    @RequestMapping("/heroes")
    public ModelAndView Heroes() {
        Heroes heroes = apiClient.GetHeroes();
        ModelAndView modelAndView = new ModelAndView("heroes");
        modelAndView.addObject("heroes", heroes.getHeroes());
        return modelAndView;
    }

    @RequestMapping("/items")
    public ModelAndView Items() {
        Items items = apiClient.GetItems();
        ModelAndView modelAndView = new ModelAndView("items");
        modelAndView.addObject("items", items.getItems());
        return modelAndView;
    }
}