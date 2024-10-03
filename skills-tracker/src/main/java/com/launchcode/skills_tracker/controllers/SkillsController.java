package com.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping()
    public String skillsTrackerList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!<h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsTrackerForm() {
        return "<html>" +
                "<body>" +
                "<form action='/form/results' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='name'>" +
                "<br>" +

                "<label>My favorite language:</label>" +
                "<select name='favorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +

                "<label>My second favorite language:</label>" +
                "<select name='favorite2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +

                "<label>My third favorite language:</label>" +
                "<select name='favorite3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +

                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form/results")
    public String displaySkillsTrackerForm(@RequestParam String name, String favorite, String favorite2, String favorite3) {
        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>1.</th>" +
                "<th>" + favorite + "</th>" +
                "</tr>" +

                "<tr>" +
                "<th>2.</th>" +
                "<th>" + favorite2 + "</th>" +
                "</tr>" +

                "<tr>" +
                "<th>3.</th>" +
                "<th>" + favorite3 + "</th>" +
                "</tr>" +

                "</table>" +
                "</body>" +
                "</html>";
    }
}