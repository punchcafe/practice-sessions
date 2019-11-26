package dev.punchcafe.cafe.app;

import javax.annotation.PostConstruct;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Barista {

    private Map<String, SteamStrategy> steamingStrategies;


    @Autowired
    public Barista(List<SteamStrategy> steamingStrategiesList) {
        steamingStrategies = steamingStrategiesList.stream().collect(Collectors.toMap(SteamStrategy::strategy, (strategy) -> strategy));
    }

    @PostConstruct
    public void serve(){
        System.out.println("Hello, how may I help you today? we have");
        System.out.println(steamingStrategies.toString());
    }
}
