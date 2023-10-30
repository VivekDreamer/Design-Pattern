package com.vivek.CommandPattern.UndoExample.command;

public interface ICommand {
    public void execute();
    public void undo();
}
