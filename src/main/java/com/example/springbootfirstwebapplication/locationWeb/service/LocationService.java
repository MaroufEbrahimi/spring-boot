package com.example.springbootfirstwebapplication.locationWeb.service;

import com.example.springbootfirstwebapplication.locationWeb.entities.Location;

import java.util.List;

public interface LocationService {

    Location saveLocation(Location location);

    Location updateLocation(Location location);

    void deleteLocation(Location location);

    Location getLocationById(int id);

    List<Location> getAllLocations();
}
