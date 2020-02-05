package se.nackademin.simplechat.Model;

public class Chat {

    //stringsen från sendmessage metoden i messageactivity.java classen

    private String sender;
    private String receiver;
    private String message;

    //generera konstruktör alt + insert

    public Chat(String sender, String receiver, String message) {
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
    }

    //konstruktör utan String

    public Chat() {
    }

    //getter and setter genererade

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
