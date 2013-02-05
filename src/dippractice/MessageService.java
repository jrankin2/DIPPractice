package dippractice;

public class MessageService{
    private static final String MSG = "Hello";
    private OutputStrategy out;
    private InputStrategy in;
    private String message;
    
    public MessageService(InputStrategy in, OutputStrategy out){
        this.in = in;
        this.out = out;
    }
    
    private void inputMessage(){
        message = in.inputMessage();
    }
    
    public void outputMessage(){
        inputMessage();
        if(message != null){
            out.outputMessage(message);
        }else{
            out.outputMessage("No message input");
        }
        
    }
}