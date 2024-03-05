package com.falconx.Talon_Tech.repository;

import com.falconx.Talon_Tech.model.Scholarship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScholarShipDao extends JpaRepository<Scholarship, Integer> {
}
