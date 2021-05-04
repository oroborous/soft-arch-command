package edu.wctc.lightbulb.commands;


import edu.wctc.lightbulb.SmartLightBulb;

public class DimLightCommand implements Command {

    private SmartLightBulb light;

    public DimLightCommand(SmartLightBulb light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.dim();
    }

    @Override
    public void undo() {
        light.brighten();
    }
}
