package org.sergedb.designpatterns.behavioral.command;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("[Command] Executing: Turn light OFF");
        light.turnOff();
    }
}
