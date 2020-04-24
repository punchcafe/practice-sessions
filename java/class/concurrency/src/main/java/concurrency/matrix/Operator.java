package concurrency.matrix;

public interface Operator {
    Operator operateOn(Operator operator);
}
