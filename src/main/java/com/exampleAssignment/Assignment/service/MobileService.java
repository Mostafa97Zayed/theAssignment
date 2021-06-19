package com.exampleAssignment.Assignment.service;


import com.exampleAssignment.Assignment.model.Mobile;
import com.exampleAssignment.Assignment.repo.MobileRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MobileService {

    @Autowired
    private MobileRepo mobileRepo;


    public List<Mobile> search(String priceEur,String simEu,String announceDate) {
        if (simEu == null && announceDate == null) {

            return mobileRepo.findByPriceEur(priceEur);
        } else if (priceEur == null && simEu == null) {
            return mobileRepo.findByAnnounceDate(announceDate);
        } else if (priceEur == null && announceDate == null) {
            return mobileRepo.findBySimEu(simEu);
        } else if (priceEur == null) {
            return mobileRepo.findByAnnounceDateAndSimEu(announceDate, simEu);
        } else if (simEu == null) {
            return mobileRepo.findByAnnounceDateAndPriceEur(announceDate, priceEur);
        } else if (announceDate == null) {
            return mobileRepo.findByPriceEurAndSimEu(priceEur, simEu);
        }else return mobileRepo.findByAnnounceDateAndPriceEurAndSimEu(announceDate,priceEur,simEu);
    }

    }






