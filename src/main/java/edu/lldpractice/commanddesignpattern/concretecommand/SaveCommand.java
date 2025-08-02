package edu.lldpractice.commanddesignpattern.concretecommand;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.reciever.Document;

public class SaveCommand implements ICommand {
    private final Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.save();
    }
}
