public class ChatApplication {
    public static void main(String[] args) {
        // Initialize ChatRoomManager (Singleton)
        ChatRoomManager manager = ChatRoomManager.getInstance();

        // Create or get a chat room
        ChatRoom chatRoom = manager.getOrCreateChatRoom("Room123");

        // Create users
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");

        // Join chat room
        alice.joinChatRoom(chatRoom);
        bob.joinChatRoom(chatRoom);
        charlie.joinChatRoom(chatRoom);

        // Send messages
        alice.sendMessage(chatRoom, "Hello, everyone!");
        bob.sendMessage(chatRoom, "How's it going?");
        charlie.sendMessage(chatRoom, "Goodbye!");

        // Leave chat room
        charlie.leaveChatRoom(chatRoom);
    }
}
