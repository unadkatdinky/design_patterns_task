import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private String roomId;
    private List<User> users = new ArrayList<>();
    private List<String> messages = new ArrayList<>();

    public ChatRoom(String roomId) {
        this.roomId = roomId;
    }

    public void joinRoom(User user) {
        users.add(user);
        notifyAllUsers(user.getUsername() + " has joined the room.");
    }

    public void leaveRoom(User user) {
        users.remove(user);
        notifyAllUsers(user.getUsername() + " has left the room.");
    }

    public void sendMessage(User sender, String message) {
        String formattedMessage = sender.getUsername() + ": " + message;
        messages.add(formattedMessage);
        notifyAllUsers(formattedMessage);
    }

    private void notifyAllUsers(String message) {
        for (User user : users) {
            user.receiveMessage(message);
        }
    }
}