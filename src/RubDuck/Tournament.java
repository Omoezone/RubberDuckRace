package RubDuck;

import java.util.ArrayList;
import java.util.Queue;

public class Tournament {
    private int queueAmount;
    private ArrayList<MyQueue> queueList;

    public Tournament(int queueAmount) {
        this.queueAmount = queueAmount;
        queueList = new ArrayList<MyQueue>();
        createDuckSetup();
    }

    public int getQueueAmount() {
        return queueAmount;
    }
    public void setQueueAmount(int queueAmount) {
        this.queueAmount = queueAmount;
    }
    public void createDuckSetup(){
        int value = 0;
        for(int i = queueAmount; i < queueAmount; i++){
            MyQueue que = new MyQueue();
            for(int j = 0; j < queueAmount; j++){
                value++;
                Duck duck = new Duck(value);
                que.getList().add(duck);
            }
            queueList.add(que);
        }
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "queueAmount=" + queueAmount +
                ", queueList=" + queueList +
                '}';
    }
}
