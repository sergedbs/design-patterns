package org.sergedb.designpatterns.behavioral.observer;

public class PhoneUser implements Subscriber {
    private final String name;

    public PhoneUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("[PhoneUser " + name + "] Received notification: " + news);
    }
}
