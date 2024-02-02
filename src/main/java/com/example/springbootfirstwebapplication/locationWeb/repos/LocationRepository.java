package com.example.springbootfirstwebapplication.locationWeb.repos;

import com.example.springbootfirstwebapplication.locationWeb.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LocationRepository extends JpaRepository<Location, Integer> {
    
    @Query("SELECT l.type, COUNT(l.type) FROM Location l GROUP BY l.type")
    public List<Object[]> findTypeAndTypeCount();
}
