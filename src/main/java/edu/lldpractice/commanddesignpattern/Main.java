package edu.lldpractice.commanddesignpattern;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.concretecommand.OpenCommand;
import edu.lldpractice.commanddesignpattern.concretecommand.SaveCommand;
import edu.lldpractice.commanddesignpattern.invoker.Menu;
import edu.lldpractice.commanddesignpattern.reciever.Document;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        ICommand openCommand = new OpenCommand(document);
        ICommand saveCommand = new SaveCommand(document);

        Menu menu = new Menu(openCommand, saveCommand);

        menu.openDocument(); // Output: Document opened
        menu.saveDocument(); // Output: Document saved
    }
}
