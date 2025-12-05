package org.sergedb.designpatterns.behavioral.command;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("[Command] Executing: Turn light ON");
        light.turnOn();
    }
}
