package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Homeworks implements Observable {
    private final List<Observer> observers;
    private final Deque<HomeworkTask> homeworkTaskDeque;
    private final String name;

    public Homeworks(String name) {
        observers = new ArrayList<>();
        homeworkTaskDeque = new ArrayDeque<>();
        this.name = name;
    }

    public void addHomeworkTask(HomeworkTask task){
        homeworkTaskDeque.offer(task);
        notifyObservers1();
    }

    public Deque<HomeworkTask> getHomeworkTaskDeque() {
        return homeworkTaskDeque;
    }

    public String getName() {
        return name;
    }


    @Override
    public void registerObserver1(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers1() {
        for (Observer observer:observers ) {
            observer.update(this);
        }
    }

    @Override
    public void removeObservers1(Observer observer) {
        observers.remove(observer);
    }
}
