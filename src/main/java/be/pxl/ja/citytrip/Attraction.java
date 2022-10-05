package be.pxl.ja.citytrip;

public class Attraction {
    private String name;
    private int rating;
    private double days;

    public Attraction(String name, int rating, double days) {
        this.name = name;
        this.rating = rating;
        this.days = days;
    }

    public Attraction(String name, double days, int rating){
        this.name = name;
        this.rating = rating;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareTo(Attraction attraction) {
        return Integer.compare(this.rating, attraction.rating);
    }

    public double getWeight() {
        return days;
    }

    @Override
    public String toString() {
        return "Attraction{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", days=" + days +
                '}';
    }
}
