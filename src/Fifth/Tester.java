package Fifth;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Music> playlist = new ArrayList<Music>();

        playlist.add(new Music("Beethoven", "Destiny"));
        playlist.add(new GenreMusic("Beethoven", "Destiny", "Symphony"));
        playlist.add(new Music("Handel", "Messiah"));
        playlist.add(new GenreMusic("Handel", "Messiah", "Oratorio"));
        playlist.add(new Music("Vivaldi", "Four Seasons"));
        playlist.add(new GenreMusic("Vivaldi", "Four Seasons", "Concerto"));

        for (int i = 0; i < playlist.size(); i++) {
            Music music = playlist.get(i);
            music.printPlaydata();
            System.out.println();
        }
    }
}
