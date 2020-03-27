package dev.punchcafe.cafe.app;

import org.springframework.context.annotation.Bean;

@CafeEquipment
public class MyBeanMachine {

    class LightBean implements CoffeeBean {

        public String getBeanType() {return "Light Bean";}
    }

    class DarkBean implements CoffeeBean {

        public String getBeanType() {return "Dark Bean";}
    }

    @Bean
    public CoffeeBean darkBean() {
        return new LightBean();
    }

    @Bean
    public CoffeeBean lightBean() {
        return new DarkBean();
    }
}
