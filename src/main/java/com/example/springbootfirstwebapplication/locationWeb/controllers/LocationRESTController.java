package com.example.springbootfirstwebapplication.locationWeb.controllers;

import com.example.springbootfirstwebapplication.locationWeb.entities.Location;
import com.example.springbootfirstwebapplication.locationWeb.repos.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

    @Autowired
    LocationRepository locationRepository;

    @GetMapping
    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @PutMapping
    public Location updateLocation(@RequestBody Location location) {
        return locationRepository.save(location);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable("id") int id) {
        locationRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable("id") int id) {
        return locationRepository.findById(id).orElse(null);
    }

    /*
     *
     * Second Method for Get Location By ID
    @GetMapping("/{id}")
    public ResponseEntity<Location> getLocationById2(@PathVariable("id") int id) {
        Optional<Location> locationOptional = locationRepository.findById(id);

        return locationOptional
                .map(location -> new ResponseEntity<>(location, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
     */

}
