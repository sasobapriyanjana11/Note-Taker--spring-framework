package lk.ijse.gdse.aad68.notetaker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/healthTest")
public class HealthTestController {

    @GetMapping
    public String healthTest(){
        return "note collector app run successfully";
    }
}
