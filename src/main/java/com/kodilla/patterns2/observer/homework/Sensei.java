package com.kodilla.patterns2.observer.homework;

public class Sensei implements Observer {
    private final String username;
    private int updateCount;

    public Sensei(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(Homeworks homeworks) {
        updateCount++;
    }
}