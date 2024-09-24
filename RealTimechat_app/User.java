public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void sendMessage(ChatRoom room, String message) {
        room.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.println("[" + username + "] " + message);
    }

    public void joinChatRoom(ChatRoom room) {
        room.joinRoom(this);
    }

    public void leaveChatRoom(ChatRoom room) {
        room.leaveRoom(this);
    }
}
