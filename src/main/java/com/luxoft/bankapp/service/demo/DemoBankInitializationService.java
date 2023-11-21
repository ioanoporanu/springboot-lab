package com.luxoft.bankapp.service.demo;

import com.luxoft.bankapp.service.feed.BankFeedServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;

@Profile("dev")
@Service
public class DemoBankInitializationService implements BankInitializationService {
    @Autowired
    BankFeedServiceImpl feedService;

    @PostConstruct
    public void createClientsForDemo() {

        feedService.loadFeed(new File("demo.feed"));
    }
}
