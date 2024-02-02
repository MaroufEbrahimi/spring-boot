package com.example.springbootfirstwebapplication.locationWeb.controllers;

import com.example.springbootfirstwebapplication.locationWeb.entities.Location;
import com.example.springbootfirstwebapplication.locationWeb.repos.LocationRepository;
import com.example.springbootfirstwebapplication.locationWeb.service.LocationService;
import com.example.springbootfirstwebapplication.locationWeb.util.EmailUtil;
import com.example.springbootfirstwebapplication.locationWeb.util.ReportUtil;
import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class LocationController {

    @Autowired
    LocationService locationService;

    @Autowired
    LocationRepository repository;

    @Autowired
    EmailUtil emailUtil;

    @Autowired
    ReportUtil reportUtil;

    @Autowired
    ServletContext sc;

    @RequestMapping("/showCreate")
    public String showCreate() {
        return "createLocation";
    }

    @RequestMapping("/saveLoc")
    public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        Location locationSaved = locationService.saveLocation(location);
        String msg = "Location saved with the ID: " + locationSaved.getId();
        modelMap.put("msg", msg);
//        emailUtil.sendEmail("maroufprogrammer@gmail.com", "Test", "Test for Body");
//        modelMap.addAttribute("msg", msg);
        return "createLocation";
    }

    @RequestMapping("/displayLocations")
    public String displayLocations(ModelMap modelMap) {
        List<Location> locations = locationService.getAllLocations();
        modelMap.addAttribute("locations", locations);
        return "displayLocations";
    }

    @RequestMapping("deleteLocation")
    public String deleteLocation(@RequestParam("id") int id, ModelMap modelMap) {
//        locationService.deleteLocation(locationService.getLocationById(id));
        Location location = new Location();
        location.setId(id);
        locationService.deleteLocation(location);
        List<Location> locations = locationService.getAllLocations();
        modelMap.put("locations", locations);
        return "displayLocations";
    }

    @RequestMapping("/showUpdate")
    public String showLocation(@RequestParam("id") int id, ModelMap modelMap) {
        Location location = locationService.getLocationById(id);
        modelMap.put("location", location);
        return "updateLocation";
    }

    @RequestMapping("/updateLoc")
    public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
        locationService.updateLocation(location);
        List<Location> locations = locationService.getAllLocations();
        modelMap.put("locations", locations);
        return "displayLocations";
    }

    @RequestMapping("/generateReport")
    public String generateReport() {
        String path = sc.getRealPath("/");
        List<Object[]> data = repository.findTypeAndTypeCount();
        reportUtil.generatePieChart(path, data);
        return "report";
    }
}
