public class HTTPAdapter implements CommunicationAdapter {
    @Override
    public void sendMessage(User user, String message) {
        // Simulate HTTP message send
        System.out.println("Sending HTTP message: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        // Simulate receiving a message over HTTP
        System.out.println("Received HTTP message: " + message);
    }
}