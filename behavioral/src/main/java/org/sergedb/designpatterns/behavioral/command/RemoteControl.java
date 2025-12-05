package org.sergedb.designpatterns.behavioral.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
        System.out.println("[RemoteControl] Command set");
    }

    public void pressButton() {
        System.out.println("[RemoteControl] Button pressed");
        if (command != null) {
            command.execute();
        } else {
            System.out.println("[RemoteControl] No command assigned");
        }
    }
}
