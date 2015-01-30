package com.japharr.guestbook.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Japharr on 29/1/2015.
 */
@Component
public class CarService {
    private static Logger logger = LoggerFactory.getLogger(CarService.class);

    public void updateCarAgeJob() {
        //System.out.println("About to Run Task");
        logger.info("About to Run Task");
    }
}
