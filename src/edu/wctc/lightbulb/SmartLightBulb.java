package edu.wctc.lightbulb;

public class SmartLightBulb {

    private final int MAX_BRIGHTNESS = 10;
    private final int MIN_BRIGHTNESS = 1;

    private boolean isBulbOn = false;
    private String ledColor = "White";

    private int brightness = MAX_BRIGHTNESS / 2;

    public void setColor(String color) {
        this.ledColor = color;
        shine();
    }

    public void turnOn() {
        isBulbOn = true;
        shine();
    }

    public void turnOff() {
        isBulbOn = false;
        shine();
    }

    public void dim() {
        brightness = Math.max(MIN_BRIGHTNESS, brightness - 1);
        shine();
    }

    public void brighten() {
        brightness = Math.min(MAX_BRIGHTNESS, brightness + 1);
        shine();
    }

    /**
     * A thematically-named version of a toString() method
     */
    public void shine() {
        if (isBulbOn) {
            System.out.println("Light bulb is on (brightness " + brightness + ", color " + ledColor + ")");
        } else {
            System.out.println("Light bulb is off");
        }

    }

    public String getColor() {
        return ledColor;
    }
}
