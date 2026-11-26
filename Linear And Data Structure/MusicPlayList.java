public class MusicPlaylist {

    static class Node {
        String songTitle;
        Node next;

        Node(String songTitle, Node next) {
            this.songTitle = songTitle;
            this.next = next;
        }
    }

    static Node head;

    static void show() {
        Node current = head;

        while (current != null) {
            System.out.print(current.songTitle + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    static void addSong(String songTitle) {
        Node newNode = new Node(songTitle, null);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    static void deleteSong(String songTitle) {
        if (head == null) {
            return;
        }

        if (head.songTitle.equals(songTitle)) {
            head = head.next;
            return;
        }

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

        Node songA = new Node("Song A", null);
        Node songB = new Node("Song B", null);
        Node songC = new Node("Song C", null);

        head = songA;
        songA.next = songB;
        songB.next = songC;

        System.out.println("Playlist before inserting Song D:");
        show();

        addSong("Song D");

        System.out.println("\nPlaylist after inserting Song D:");
        show();

        deleteSong("Song B");

        System.out.println("\nPlaylist after deleting Song B:");
        show();
    }
}
