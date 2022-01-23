package game;

public class UserInterface {
    /** Visar en dialogruta med texten msg. */
    public static void printMessage(String msg) {
        // din egen kod
    }

    /**
    * Visar en dialogruta med texten msg och och läser in ett positivt heltal. Om
    * användaren skriver något som inte kan tolkas som ett positivt heltal ska -1
    * returneras. Om användaren klickar på "Avbryt" ska -2 returneras.
    */
    public static int askForInt(String msg) {
        return Integer.parseInt(msg);  // this line is meant to equal scala's '???'
        // din egen kod
    }
}