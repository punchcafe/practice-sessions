package dev.punchcafe.cafe.app;

import org.springframework.context.annotation.Bean;

@CafeEquipment
public class SteamingStrategies {

    @Bean
    SteamStrategy latteSteaming(){
        return new LatteSteaming();
    }

    @Bean
    SteamStrategy cappucinoSteaming(){
        return new CappucinoSteaming();
    }

    class LatteSteaming implements SteamStrategy {

        public String steamMilk() {
            return "Occasionally surface nozzle to steam milk. Tilt jug so milk spins clockwise. Milk volume should only increase ~30%.";
        }

        public String strategy() { return "latte"; }
    }

    class CappucinoSteaming implements SteamStrategy {

        public String steamMilk() {
            return "Regularly surface nozzle to steam milk. Milk shouldn't spin, and increase in volume by around 80%.";
        }

        public String strategy() { return "cappucino"; }
    }
}
