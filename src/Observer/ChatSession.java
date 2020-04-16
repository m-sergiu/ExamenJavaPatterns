package Observer;

import java.util.ArrayList;
import java.util.List;

public class ChatSession extends Subject{
    private List<Message> messages;

    public ChatSession(){
        super();
        messages = new ArrayList<>();
    }

    public List<Message> getMessages() { return messages;}

    public void addMessage(Message message) { messages.add(message);}
}
