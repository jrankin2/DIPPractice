package dippractice;

public class ConsoleOutputStrategy implements OutputStrategy{
    @Override
    public void outputMessage(String msg){
        System.out.println(msg);
    }
}
