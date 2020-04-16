package Observer;

import java.util.List;

public class ChatWindow implements Observer{
    private String user;
    private ChatSession chatSession;

    public void update(){
        List<Message> messages = chatSession.getMessages();
        System.out.println("I'm " + user + ". Inbox:");
        for(Message message : messages){
            if(!message.user.equals(user)){
                System.out.println("Sender: " + message.user + " -> " + message.message);
            }
        }
    }

    public ChatWindow(String user, ChatSession session) {
        this.user = user;
        this.chatSession = session;
        chatSession.registerObserver(this);
    }

    void sendMessage(String text){
        Message message = new Message(user, text);
        this.chatSession.addMessage(message);
        this.chatSession.notifyAllListening();
    }
}
