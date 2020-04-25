package exceptions;

import exceptions.model.GroupOutOfBoundsException;
import exceptions.view.Console;

public class Main {
    public static void main(String[] args) throws GroupOutOfBoundsException {
        Console console = new Console();
        console.start();
    }
}
