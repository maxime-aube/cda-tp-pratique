package practice.mediatheque;

public class Main {

    public static void main(String[] args) {

        Mediatheque mediatheque = new Mediatheque();
        mediatheque.add(new CD("Chikayo Fukuda", "Asura's Wrath Original Soundtrack","CD musical"));

        System.out.println(mediatheque.filter("title", "asura"));

        mediatheque.getMedia(0).voter(5);
        mediatheque.getMedia(0).voter(8);
        mediatheque.getMedia(0).voter(3);
        mediatheque.getMedia(0).voter(4);
        mediatheque.getMedia(0).voter(0);
        mediatheque.getMedia(0).voter(2);
        mediatheque.getMedia(0).voter(4);
        mediatheque.getMedia(0).voter(5);
        mediatheque.getMedia(0).voter(1);
        mediatheque.getMedia(0).voter(1);

        System.out.println("La moyenne des notes de " + mediatheque.getMedia(0).toString() + " est de " + mediatheque.getMedia(0).moyenneNotes());
    }
}
