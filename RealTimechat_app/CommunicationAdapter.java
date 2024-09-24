public interface CommunicationAdapter {
    void sendMessage(User user, String message);
    void receiveMessage(String message);
}
