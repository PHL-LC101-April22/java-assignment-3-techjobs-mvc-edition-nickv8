package org.launchcode.techjobs.mvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;

//Super Bonus Mission
public class TechJobsController {

    static HashMap<String, String> actionChoices = new HashMap<>();

    static HashMap<String, String> columnChoices = new HashMap<>();


//    static HashMap<String, String> TechJobsController() {
//
//        return actionChoices;
//    }

    @ModelAttribute("actions")
    static HashMap<String, String> getActionChoices(){
        HashMap<String, String> actions = actionChoices;
        return actions;
    }


}
