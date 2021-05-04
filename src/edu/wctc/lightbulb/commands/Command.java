package edu.wctc.lightbulb.commands;

/**
 * The Command's methods must be kept very generic.
 * More complex behavior is implemented by parameterizing
 * the constructor of the implementing class. (See
 * ChangeColorCommand for an example).
 */
public interface Command {
    void execute();

    void undo();
}
