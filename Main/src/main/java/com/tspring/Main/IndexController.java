package com.tspring.Main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController
{

    Visit visit = new Visit();

    @GetMapping("/")
    public ModelAndView index()
    {
        visit.setVisits(visit.getVisits() + 1);

        Map<String, String> model = new HashMap<>();
        model.put("Name", "Dan");
        model.put("Age", "16");
        model.put("Visits", String.valueOf(visit.getVisits()));

        return new ModelAndView("index", model);
    }
}
