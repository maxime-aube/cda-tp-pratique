package exceptions;

public class Country {

    protected String name;

    Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNameLength() {
        return this.name.length();
    }
}
