package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver1(Observer observer);
    void notifyObservers1();
    void removeObservers1(Observer observer);

}
