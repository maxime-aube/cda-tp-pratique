package practice.mediatheque;

import java.util.ArrayList;
import java.util.List;

public class Media {

    protected String title;
    protected String author;
    protected List<Integer> notes = new ArrayList<Integer>();

    Media(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String toString() {
        return this.title + " par " + this.author;
    }

    public void voter(int note) {
        if (note >= 0 && note <= 5) {
            this.notes.add(note);
        }
    }

    public float moyenneNotes() {
        int sum = 0;
        if (!this.notes.isEmpty()) {
            for (int note : this.notes) {
                sum += note;
            }
            return sum / this.
        }
        return 0;
    }

}
