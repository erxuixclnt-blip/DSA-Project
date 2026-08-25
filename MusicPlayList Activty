public class MusicPlaylist {

    // Node class
    static class Node {
        String songTitle;
        Node next;

        // Constructor
        Node(String songTitle, Node next) {
            this.songTitle = songTitle;
            this.next = next;
        }
    }

    // Head of the linked list
    static Node head;

    // Method to display the playlist
    static void show() {
        Node current = head;

        while (current != null) {
            System.out.print(current.songTitle + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Method to add a song at the end
    static void addSong(String songTitle) {
        Node newNode = new Node(songTitle, null);

        // If the list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Find the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Add the new node at the end
        current.next = newNode;
    }

    // Method to delete a song by title
    static void deleteSong(String songTitle) {
        // If the list is empty
        if (head == null) {
            return;
        }

        // If the song to delete is the first node
        if (head.songTitle.equals(songTitle)) {
            head = head.next;
            return;
        }

        // Search for the song
        Node current = head;

        while (current.next != null) {
            if (current.next.songTitle.equals(songTitle)) {
                current.next = current.next.next;
                return;
            }

            current = current.next;
        }
    }

    public static void main(String[] args) {

        // Create three nodes
        Node songA = new Node("Song A", null);
        Node songB = new Node("Song B", null);
        Node songC = new Node("Song C", null);

        // Link the nodes
        head = songA;
        songA.next = songB;
        songB.next = songC;

        // Display before inserting Song D
        System.out.println("Playlist before inserting Song D:");
        show();

        // Add Song D
        addSong("Song D");

        // Display after inserting Song D
        System.out.println("\nPlaylist after inserting Song D:");
        show();

        // Delete Song B
        deleteSong("Song B");

        // Display after deleting Song B
        System.out.println("\nPlaylist after deleting Song B:");
        show();
    }
}
