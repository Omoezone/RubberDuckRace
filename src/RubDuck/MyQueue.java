package RubDuck;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<Duck> list;
    private boolean isEmpty;

    MyQueue(){
        list = new ArrayList<Duck>();
    }

    public ArrayList<Duck> getList() {
        return list;
    }

    public void setList(ArrayList<Duck> list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public int size(){
        return list.size();
    }
    public void add(Duck index){
        list.add(index);
    }
    public Duck get(int index){
        return list.get(index);
    }
    public void remove(){
            list.remove(0);
    }
    public void set(int index,Duck value){
        list.set(index,value);
    }

    @Override
    public String toString() {
        return "List = " + list;
    }
}
