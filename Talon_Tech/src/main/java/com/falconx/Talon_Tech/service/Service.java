package com.falconx.Talon_Tech.service;

import com.falconx.Talon_Tech.model.FirstPage;
import com.falconx.Talon_Tech.model.ScholarShipWrapper;
import com.falconx.Talon_Tech.model.Scholarship;
import com.falconx.Talon_Tech.model.User;
import com.falconx.Talon_Tech.repository.ScholarShipDao;
import com.falconx.Talon_Tech.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    UserDao userDao;
    @Autowired
    ScholarShipDao scholarShipDao;


    public ResponseEntity<Boolean> addFirstPage(User user) {
        try
        {
            userDao.save(user);
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }

    }

    public ResponseEntity<String> addScholarShip(Scholarship scholarship) {
        scholarShipDao.save(scholarship);
        return new ResponseEntity<>("Added",HttpStatus.CREATED);
    }

    public ResponseEntity<List<ScholarShipWrapper>> mainLogic(String email)
    {
        List<ScholarShipWrapper> verifyUserForScholarship = new ArrayList<>();
        User user = userDao.findByEmail(email);
        List<Scholarship> scholarships= scholarShipDao.findAll();
        for(Scholarship scholarship : scholarships)
        {
            System.out.println(scholarship);
            if(Objects.equals(scholarship.getCategory(), "All") && (!Objects.equals(scholarship.getGender(),"Both")))
            {
                if(Objects.equals(user.getGender().toLowerCase(),scholarship.getGender().toLowerCase()) && user.getAnnualIncome() <= scholarship.getAnnualIncome() && user.getSscMarks() >= scholarship.getSsc() && user.getHscMarks() >= scholarship.getHsc() && user.getCgpa() >= scholarship.getCgpa())
                {
                    Scholarship scholarship1 = scholarship;
                    System.out.println(scholarship1);
                    ScholarShipWrapper scholarShipWrapper = new ScholarShipWrapper(scholarship1.getId(), scholarship1.getName(), scholarship1.getType(), scholarship1.getScholarshipAmount(), scholarship1.getLink());
                    verifyUserForScholarship.add(scholarShipWrapper);
                    System.out.println("1");
                    System.out.println("IN");
                }
                else {
                    System.out.println("OUT");
                }
            }
            else if(Objects.equals(scholarship.getGender(), "Both") && (!Objects.equals(scholarship.getCategory(),"All")))
            {
                if(Objects.equals(user.getCategory().toLowerCase(),scholarship.getCategory().toLowerCase()) && user.getAnnualIncome() <= scholarship.getAnnualIncome() && user.getSscMarks() >= scholarship.getSsc() && user.getHscMarks() >= scholarship.getHsc() && user.getCgpa() >= scholarship.getCgpa())
                {
                    Scholarship scholarship1 = scholarship;
                    System.out.println(scholarship1);
                    ScholarShipWrapper scholarShipWrapper = new ScholarShipWrapper(scholarship1.getId(), scholarship1.getName(), scholarship1.getType(), scholarship1.getScholarshipAmount(), scholarship1.getLink());
                    verifyUserForScholarship.add(scholarShipWrapper);
                    System.out.println("2");
                    System.out.println("IN");
                }
                else {
                    System.out.println("OUT");
                }
            }
            else if(Objects.equals(scholarship.getGender(),"Both") && Objects.equals(scholarship.getCategory(),"All"))
            {
                if(user.getAnnualIncome() <= scholarship.getAnnualIncome() && user.getSscMarks() >= scholarship.getSsc() && user.getHscMarks() >= scholarship.getHsc() && user.getCgpa() >= scholarship.getCgpa())
                {
                    Scholarship scholarship1 = scholarship;
                    System.out.println(scholarship1);
                    ScholarShipWrapper scholarShipWrapper = new ScholarShipWrapper(scholarship1.getId(),scholarship1.getName(),scholarship1.getType(),scholarship1.getScholarshipAmount(),scholarship1.getLink());
                    verifyUserForScholarship.add(scholarShipWrapper);
                    System.out.println("3");
                    System.out.println("IN");
                }
                else {
                    System.out.println("OUT");
                }

            }
            else {
                if (Objects.equals(user.getGender().toLowerCase(), scholarship.getGender().toLowerCase()) && Objects.equals(user.getCategory().toLowerCase(), scholarship.getCategory().toLowerCase()) && user.getAnnualIncome() <= scholarship.getAnnualIncome() && user.getSscMarks() >= scholarship.getSsc() && user.getHscMarks() >= scholarship.getHsc() && user.getCgpa() >= scholarship.getCgpa())
                {
                    Scholarship scholarship1 = scholarship;
                    System.out.println(scholarship1);
                    ScholarShipWrapper scholarShipWrapper = new ScholarShipWrapper(scholarship1.getId(),scholarship1.getName(),scholarship1.getType(),scholarship1.getScholarshipAmount(),scholarship1.getLink());
                    verifyUserForScholarship.add(scholarShipWrapper);
                    System.out.println("4");
                    System.out.println("IN");
                }
                else {
                    System.out.println("OUT");
                }
            }
        }
        return new ResponseEntity<>(verifyUserForScholarship,HttpStatus.OK);
    }
}
