package edu.wctc.lightbulb.commands;


import edu.wctc.lightbulb.SmartLightBulb;

public class ChangeColorCommand implements Command {
    // The smart bulb
    private SmartLightBulb light;

    // The color to which the light will be set
    private String ledColor;

    // Storing the previous state allows us to undo the command
    private String previousColor;

    /**
     * The execute() and undo() methods must be very generic,
     * so additional information needed by this command is
     * given as constructor arguments.
     * @param light The smart light bulb
     * @param ledColor The color to set the light
     */
    public ChangeColorCommand(SmartLightBulb light, String ledColor) {
        this.light = light;
        this.ledColor = ledColor;
    }

    @Override
    public void execute() {
        // In order to undo this change, we need to store the previous state
        // before setting the new one
        previousColor = light.getColor();
        light.setColor(ledColor);
    }

    @Override
    public void undo() {
        light.setColor(previousColor);
    }
}
