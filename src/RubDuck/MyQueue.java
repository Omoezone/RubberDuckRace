package RubDuck;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Integer> list;

    MyQueue(){
        list = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getList() {
        return list;
    }

    public void setList(ArrayList<Integer> list) {
        this.list = list;
    }
    public int size(){
        return list.size();
    }
    public void add(int index){
        list.add(index);
    }
    public int get(int index){
        return list.get(index);
    }
    public void remove(){
        if(list.size() == 0){
            System.out.println("Can't remove value, as the Queue is empty!");
        }else {
            list.remove(0);
        }
    }
    public void set(int index,int value){
        list.set(index,value);
    }
    @Override
    public String toString() {
        return "MyQueue: " + "list = " + list;
    }
}
