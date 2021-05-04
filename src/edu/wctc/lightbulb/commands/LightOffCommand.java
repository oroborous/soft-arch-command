package edu.wctc.lightbulb.commands;


import edu.wctc.lightbulb.SmartLightBulb;

public class LightOffCommand implements Command {

    private SmartLightBulb light;

    public LightOffCommand(SmartLightBulb light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}
