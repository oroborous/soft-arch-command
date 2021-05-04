package edu.wctc.lightbulb;


import edu.wctc.lightbulb.commands.Command;

import java.util.ArrayList;
import java.util.List;

public class Remote {

    private Command buttonA;
    private Command buttonB;
    private Command buttonC;
    private Command buttonD;

    private List<Command> undoList = new ArrayList<>();

    public void setButtonA(Command buttonA) {
        this.buttonA = buttonA;
    }

    public void setButtonB(Command buttonB) {
        this.buttonB = buttonB;
    }

    public void setButtonC(Command buttonC) {
        this.buttonC = buttonC;
    }

    public void setButtonD(Command buttonD) {
        this.buttonD = buttonD;
    }

    public void buttonAPressed() {
        buttonA.execute();
        undoList.add(buttonA);
    }

    public void buttonBPressed() {
        buttonB.execute();
        undoList.add(buttonB);
    }

    public void buttonCPressed() {
        buttonC.execute();
        undoList.add(buttonC);
    }

    public void buttonDPressed() {
        buttonD.execute();
        undoList.add(buttonD);
    }

    public void undo() {
        if (!undoList.isEmpty()) {
            undoList.remove(undoList.size() - 1).undo();
        }
    }

}
