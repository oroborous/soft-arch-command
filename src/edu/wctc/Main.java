package edu.wctc;

import edu.wctc.lightbulb.Macro;
import edu.wctc.lightbulb.Remote;
import edu.wctc.lightbulb.SmartLightBulb;
import edu.wctc.lightbulb.commands.*;

public class Main {

    public static void main(String[] args) {
        SmartLightBulb light = new SmartLightBulb();

        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);
        // Null object pattern
        Command none = new NoCommand();
        Command brighten = new BrightenLightCommand(light);
        Command color = new ChangeColorCommand(light, "Blue");

        Command romanticDinner = new Macro(
                new LightOnCommand(light),
                new DimLightCommand(light),
                new ChangeColorCommand(light, "Red")
        );

        Remote remote = new Remote();
        remote.setButtonA(romanticDinner);
        remote.setButtonB(off);
        remote.setButtonC(color);
        remote.setButtonD(brighten);

        remote.buttonAPressed();
        remote.buttonCPressed();

        for (int i = 0; i < 4; i++) {
            remote.buttonDPressed();
        }

        remote.buttonBPressed();

        System.out.println("Begin undoing...");

        for (int i = 0; i < 10; i++) {
            remote.undo();
        }
    }
}
