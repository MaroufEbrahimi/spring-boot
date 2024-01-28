package com.example.springbootfirstwebapplication.locationWeb.repos;

import com.example.springbootfirstwebapplication.locationWeb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Integer> {
}
