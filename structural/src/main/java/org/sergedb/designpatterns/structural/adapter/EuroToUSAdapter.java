package org.sergedb.designpatterns.structural.adapter;

public class EuroToUSAdapter implements Plug {
    private final EuroSocket euroSocket;

    public EuroToUSAdapter(EuroSocket euroSocket) {
        this.euroSocket = euroSocket;
    }

    @Override
    public void plugIn() {
        System.out.println("[Adapter] Converting US plug to European socket...");
        euroSocket.connect();
        System.out.println("[Adapter] Power converted, device is running.");
    }
}
