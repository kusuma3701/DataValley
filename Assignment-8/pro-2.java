import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Movie {
    private String title;
    private String category;
    private double rating;
    
    public Movie(String title, String category, double rating) {
        this.title = title;
        this.category = category;
        this.rating = rating;
    }
    
    public String getCategory() {
        return category;
    }
    
    public double getRating() {
        return rating;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie1", "PG", 4.5));
        movies.add(new Movie("Movie2", "PG-13", 3.8));
        movies.add(new Movie("Movie3", "R", 4.2));
        movies.add(new Movie("Movie4", "PG", 3.9));
        movies.add(new Movie("Movie5", "R", 4.8));
        movies.add(new Movie("Movie6", "PG-13", 4.1));
        
        Map<String, Integer> categoryCount = new HashMap<>();
        Map<String, Double> categoryTotalRating = new HashMap<>();
        
        for (Movie movie : movies) {
            String category = movie.getCategory();
            double rating = movie.getRating();
            
            categoryCount.put(category, categoryCount.getOrDefault(category, 0) + 1);
            categoryTotalRating.put(category, categoryTotalRating.getOrDefault(category, 0.0) + rating);
        }
        
        System.out.println("Number of movies in each category and average rating:");
        for (Map.Entry<String, Integer> entry : categoryCount.entrySet()) {
            String category = entry.getKey();
            int count = entry.getValue();
            double totalRating = categoryTotalRating.get(category);
            double averageRating = totalRating / count;
            
            System.out.println("Category: " + category + ", Movies: " + count + ", Average Rating: " + averageRating);
        }
    }
}