package RubDuck;

import java.util.ArrayList;
import java.util.Random;

public class Tournament {
    private int queueAmount;
    private ArrayList<MyQueue> queueList;

    public Tournament(int queueAmount) {
        this.queueAmount = queueAmount;
        queueList = new ArrayList<>();
        createQueues();
        createDuckSetup();
    }

    public int getQueueAmount() {
        return queueAmount;
    }
    public void setQueueAmount(int queueAmount) {
        this.queueAmount = queueAmount;
    }

    public ArrayList<MyQueue> getQueueList() {
        return queueList;
    }

    public void setQueueList(ArrayList<MyQueue> queueList) {
        this.queueList = queueList;
    }
    public void createQueues(){
        for (int i = 0; i < queueAmount; i++) {
            MyQueue que = new MyQueue();
            queueList.add(que);
        }
    }
    public void createDuckSetup(){
        int value = 0;
        for(int i = 0; i < queueAmount; i++){
            for(int j = 0; j < queueAmount; j++){
                value++;
                Duck duck = new Duck(value);
                queueList.get(i).add(duck);
            }
        }
    }
    public void timeStepChange(){
        Random ran = new Random();
        setQueueAmount(queueAmount-1);
        int iterations = queueAmount*queueAmount;
        ArrayList<MyQueue> tempList = new ArrayList<>();
        for(int k = 0; k < queueAmount;k++){
            MyQueue que = new MyQueue();
            tempList.add(que);
        }
        for(int i = 0; i < iterations;i++){
            int take = ran.nextInt(queueAmount+1);
            int give = ran.nextInt(queueAmount);
            if(tempList.get(give).size() == queueAmount){
                give = ran.nextInt(queueAmount);
                i--;
            }else if(queueList.get(take).size() == 0){
                take = ran.nextInt(queueAmount);
                i--;
            }else {
                tempList.get(give).add(queueList.get(take).get(0));
                queueList.get(take).remove();
            }
        }
        queueList = tempList;
    }
    void playGame(){
        int j = getQueueAmount();
        for (int i = 1; i < j; i++) {
            System.out.println(this);
            timeStepChange();
        }
        System.out.println("The Winner is duck number " + queueList.get(0).get(0));
    }

    @Override
    public String toString() {
        return "Tournament{ " +
                "Queues: " + queueAmount +
                " " + queueList +
                '}';
    }
}
