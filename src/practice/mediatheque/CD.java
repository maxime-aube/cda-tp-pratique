package practice.mediatheque;

public class CD extends Media {

    protected String format;

    CD(String author, String title, String format) {
        super(author, title);
        this.format = format;
    }

    public String toString() {
        return "\"" + this.title + "\" par " + this.author + " [" + this.format + "]";
    }
}
