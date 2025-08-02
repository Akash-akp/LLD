package edu.lldpractice.commanddesignpattern.invoker;

import edu.lldpractice.commanddesignpattern.command.ICommand;

public class Menu {
    private final ICommand openCommand;
    private final ICommand saveCommand;

    public Menu(ICommand openCommand, ICommand saveCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
    }

    public void openDocument() {
        openCommand.execute();
    }

    public void saveDocument() {
        saveCommand.execute();
    }
}
