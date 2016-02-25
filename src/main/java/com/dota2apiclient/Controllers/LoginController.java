package com.dota2apiclient.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Admin on 14.02.2016.
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String Login() {
        return "login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String Login(@RequestParam(name = "login", required = true)String login, @RequestParam(name="password", required = true) String password) {
        String l = login;
        String p = password;
        return "index";
    }
}
