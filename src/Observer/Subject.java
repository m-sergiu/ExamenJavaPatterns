package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject implements Observer{
    private List<Observer> observers;

    void registerObserver(Observer observer){
        observers.add(observer);
    }
    void unregisterObserver(Observer observer){
        observers.remove(observer);
    }

    void notifyAllListening(){
        for(Observer observer : observers){
            observer.update();
        }
    }

    public Subject(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void update(){

    }
}

