package com.volodymyr.pletniov.completed_spring_boot_for_interview.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Slf4j
@Service
public class VeryHardBusinessLogicService {

    private final static Logger LOGGER = Logger.getLogger(VeryHardBusinessLogicService.class.getName());

    public void makeSomeLogic() {
        try {
            Thread.sleep(4000L);
            throw new InterruptedException();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return;
        } finally {
            LOGGER.info("Finally was executed");
            return;
        }
    }
}