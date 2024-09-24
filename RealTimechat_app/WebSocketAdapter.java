public class WebSocketAdapter implements CommunicationAdapter {
    @Override
    public void sendMessage(User user, String message) {
        // Send a message over WebSocket
        System.out.println("Sending WebSocket message: " + message);
    }

    @Override
    public void receiveMessage(String message) {
        // Handle WebSocket message reception
        System.out.println("Received WebSocket message: " + message);
    }
}
