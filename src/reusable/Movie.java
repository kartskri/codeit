package reusable;

public class Movie {

    public Movie() {
    }

    public Movie(String name, Double rating) {
        this.name = name;
        this.rating = rating;
    }

    String name;
    Double rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
