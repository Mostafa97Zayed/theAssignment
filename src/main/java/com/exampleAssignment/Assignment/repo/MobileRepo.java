package com.exampleAssignment.Assignment.repo;


import com.exampleAssignment.Assignment.model.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MobileRepo extends JpaRepository<Mobile, Long>, JpaSpecificationExecutor<Mobile> {


    List<Mobile> findByPriceEur(String pricEur);




     List<Mobile> findBySimEu( String simEu);


    List<Mobile> findByAnnounceDateAndPriceEur( String announceDate,
                                          String priceEur);
    List<Mobile> findByAnnounceDate( String announceDate);

    List<Mobile> findByAnnounceDateAndSimEu( String announceDate,
                                                String simEu);
    List<Mobile> findByPriceEurAndSimEu( String priceEur,
                                             String simEu);
    List<Mobile> findByAnnounceDateAndPriceEurAndSimEu( String announceDate,
                                                String priceEur,String simEu);


}
