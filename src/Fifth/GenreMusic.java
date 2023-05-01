package Fifth;

class GenreMusic extends Music {
    public String genre;

    public GenreMusic(String name, String song, String genre) {
        super(name, song);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void printPlaydata() {
        super.printPlaydata();
        System.out.print(" (" + genre + ")");
    }
}
