package com.dota2apiclient.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 11.02.2016.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String Index() {
        return "index";
    }
}
