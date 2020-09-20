package RubDuck;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {

    @Test
    void duckGeneration(){
        Duck duck = new Duck(1);
        assertEquals(1,duck.getNumber());
        duck.setNumber(5);
        assertEquals(5,duck.getNumber());
    }
    @Test
    void printDuck(){
        Duck duck = new Duck(1);
        String expression = "Number " + duck.getNumber();
        assertEquals(expression,duck.toString());
    }
}