package Fifth;

public class Music {
    public String name;
    public String song;

    public Music(String name, String song) {
        this.name = name;
        this.song = song;
    }

    public String getName() {
        return name;
    }

    public String getSong() {
        return song;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void printPlaydata() {
        System.out.print(song + " of " + name);
    }
}
