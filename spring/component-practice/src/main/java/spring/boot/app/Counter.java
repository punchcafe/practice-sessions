package spring.boot.app;

import org.springframework.stereotype.Component;

@Component
public class Counter {

    private int count;

    Counter() {
        count = 0;
    }

    public void increaseCount() {
        count = count + 1;
    }

    public int getCount() {return count;}

    ;
}
