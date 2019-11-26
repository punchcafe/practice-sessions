package dev.punchcafe.cafe.app;

import javax.annotation.PostConstruct;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StockCupboard {
    @Autowired List<CoffeeBean> beans;

    @PostConstruct public void iGotBeans(){
        if(beans != null){
            System.out.println(beans.toString());
        } else {
            System.out.println("nobeenz");
        }
    }
}
