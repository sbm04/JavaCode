package lld.lld2.builder.message;

public class MessageTest {
    public static void main(String[] args) {
        Message message = new Message.MessageBuilder()
                .setMessageType(MessageType.TEXT)
                .setContent("Hello, how are you?")
                .setSender("Alice")
                .setRecipient("Bob")
                .setDelivered(true)
                .setTimestamp(System.currentTimeMillis())
                .build();

        // Print the message details
        System.out.println("Message Details:");
        System.out.println("Type: " + message.getMessageType());
        System.out.println("Content: " + message.getContent());
        System.out.println("Sender: " + message.getSender());
        System.out.println("Recipient: " + message.getRecipient());
        System.out.println("Delivered: " + message.isDelivered());
        System.out.println("Timestamp: " + message.getTimestamp());
    }
}
