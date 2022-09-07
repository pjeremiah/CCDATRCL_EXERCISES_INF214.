import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        // Creates a new Linkedlist Object
        LinkedList<String> Playlist = new LinkedList<>();

        // Adds new songs to Playlist
        Playlist.add("Kumpas");
        Playlist.add("Paubaya");
        Playlist.add("Ikaw at ako");
        Playlist.add("Tagpuan");
        Playlist.add("Mabagal");

        // Adds a new song at the front of the Playlist
        Playlist.addFirst("Babalik sayo");

        // Adds a new song at the end of the Playlist
        Playlist.addLast("Titibo-tibo");
        

        // Display node at the front in the LinkedList
        System.out.print("\nfirst song is: ");
        System.out.println(Playlist.get(0));
        
        // Replace the last song using the set() method
        Playlist.set(6, "Malaya");

        // Remove the first song using the remove() method
        Playlist.remove(0);

        // Display all songs in Playlist
        System.out.println("Updated playlist: " + Playlist);
    }
}
