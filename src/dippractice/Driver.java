package dippractice;

public class Driver {
    public static void main(String[] args) {
        OutputStrategy out = new GuiOutputStrategy();
        InputStrategy in = new ConsoleInputStrategy();
        MessageService service = new MessageService(in, out);
        service.outputMessage();
    }
}
