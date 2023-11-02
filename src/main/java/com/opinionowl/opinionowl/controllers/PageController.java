package com.opinionowl.opinionowl.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class PageController {

    //    @Autowired
    //    SurveyRepository sRepo;

    @GetMapping("/")
    public String getHomePage(Model model) {
        // mocking survey results
        return "index";
    }

    @GetMapping("/createSurvey")
    public String getCreateSurveyPage(Model model) {
        return "createSurvey";
    }

    @GetMapping("/answerSurvey")
    public String getAnswerSurveyPage(Model model) {
        return "answerSurvey";
    }

    @GetMapping("/viewResponse")
    public String getViewResponsePage(Model model) {
        return "viewResponse";
    }
}
