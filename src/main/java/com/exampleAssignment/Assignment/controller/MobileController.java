package com.exampleAssignment.Assignment.controller;


import com.exampleAssignment.Assignment.model.Mobile;
import com.exampleAssignment.Assignment.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("bins")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @GetMapping("searchgit remote add origin https://github.com/Mostafa97Zayed/theAssignment.git")
    public List<Mobile> searchby(@RequestParam(name ="priceEur")String priceEur,
                                 @RequestParam(name = "sim") String simEu,
                                 @RequestParam(name = "announceDate") String announceDate){
        return mobileService.search(priceEur,simEu,announceDate);
    }
}
