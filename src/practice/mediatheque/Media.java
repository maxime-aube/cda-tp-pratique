package practice.mediatheque;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.round;

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
        } else {
            System.out.println("La note doit être comprise entre 0 et 5");
        }
    }

    public float moyenneNotes() {
        int sum = 0;
        if (!this.notes.isEmpty()) {
            for (int note : this.notes) {
                sum += note;
            }
            return round((sum / (float) this.notes.size()) * 100) / 100.0f;
        }
        return 0;
    }

}
