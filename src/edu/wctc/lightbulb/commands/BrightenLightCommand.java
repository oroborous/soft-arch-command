package edu.wctc.lightbulb.commands;


import edu.wctc.lightbulb.SmartLightBulb;

public class BrightenLightCommand implements Command {

    private SmartLightBulb light;

    public BrightenLightCommand(SmartLightBulb light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.brighten();
    }

    @Override
    public void undo() {
        light.dim();
    }
}
