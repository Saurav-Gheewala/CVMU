package com.falconx.Talon_Tech.controller;

import com.falconx.Talon_Tech.model.FirstPage;
import com.falconx.Talon_Tech.model.ScholarShipWrapper;
import com.falconx.Talon_Tech.model.Scholarship;
import com.falconx.Talon_Tech.model.User;
import com.falconx.Talon_Tech.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
@CrossOrigin(origins = "http://localhost:5173")
public class Controller {

    @Autowired
    Service service;
    @PostMapping("/registration")
    public ResponseEntity<Boolean> firstPage(@RequestBody User user)
    {
        return service.addFirstPage(user);
    }
    @GetMapping("/generate/{email}")
    public ResponseEntity<List<ScholarShipWrapper>> showScholarShip(@PathVariable String email)
    {
        return service.mainLogic(email);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addScholar(@RequestBody Scholarship scholarship)
    {
        return service.addScholarShip(scholarship);
    }
}
