package Observer;

public class Main {
    public static void main(String[] args){
        ChatSession chatSession = new ChatSession();
        ChatWindow chatWindow1 = new ChatWindow("user1", chatSession);
        ChatWindow chatWindow2 = new ChatWindow("user2", chatSession);
        ChatWindow chatWindow3 = new ChatWindow("user3", chatSession);

        chatWindow1.sendMessage("message sent by user 1");
        chatWindow2.sendMessage("message sent by user 2");
        chatWindow3.sendMessage("message sent by user 3");
    }
}
