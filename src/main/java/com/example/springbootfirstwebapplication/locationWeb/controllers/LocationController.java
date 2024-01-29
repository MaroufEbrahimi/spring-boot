package com.example.springbootfirstwebapplication.locationWeb.controllers;

import com.example.springbootfirstwebapplication.locationWeb.entities.Location;
import com.example.springbootfirstwebapplication.locationWeb.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        Location locationSaved = locationService.saveLocation(location);
        String msg = "Location saved with the ID: " + locationSaved.getId();
        modelMap.put("msg", msg);
//        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }
}
