package RubDuck;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    // Excercise 1
    @Test
    void createQueueObject(){
        //Create the MyQueue object
        MyQueue mq = new MyQueue();
        //Confirms that it is null when created
        assertNull(mq);
        //adds different values to and does checks
        mq.add(4);
        assertEquals(4,mg.get(0));
        mq.add(6);
        assertEquals(6,mg.get(1));
        //removes the first value, which should be the first one to be added
        mq.remove();
        assertEquals(6,mg.get(0));
    }
    @Test
    void size(){
        MyQueue mq = new MyQueue();
        mq.add(4);
        mq.add(5);
        // Size should return 2
        assertEquals(2,mq.size());
    }
    @Test
    void get(){
        MyQueue mq = new MyQueue();
        mq.add(4);
        mq.add(5);
        //index 1 should return 5
        assertEquals(5,mq.get(1));
    }
    @Test
    void set(){
        MyQueue mq = new MyQueue();
        mq.add(4);
        //Sets the value at index 0 = 4, to be 5
        mq.set(5);
        assertEquals(5,mg.get(0));
    }
    

}