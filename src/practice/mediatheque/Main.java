package practice.mediatheque;

public class Main {

    public static void main(String[] args) {

        Mediatheque mediatheque = new Mediatheque();
        mediatheque.add(new CD("Chikayo Fukuda", "Asura's Wrath Original Soundtrack","CD musical"));

        System.out.println(mediatheque.filter("title", "asra"));
    }
}
