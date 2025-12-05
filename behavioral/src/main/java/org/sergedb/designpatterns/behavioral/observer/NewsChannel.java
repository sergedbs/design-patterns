package org.sergedb.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
        System.out.println("[NewsChannel] New subscriber added");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.println("[NewsChannel] Subscriber removed");
    }

    public void publishNews(String news) {
        System.out.println("[NewsChannel] Publishing news: " + news);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
}
