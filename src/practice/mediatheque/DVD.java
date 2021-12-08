package practice.mediatheque;

public class DVD extends Media {

    protected int zone;

    DVD(String author, String title, int zone) {
        super(author, title);
        this.zone = zone;
    }

    public boolean isReadable(int[] zones) {
        for(int zone : zones) if (this.zone == zone) return true;
        return false;
    }
}
