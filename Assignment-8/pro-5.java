import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Restaurant {
    private String name;
    private double rating;

    public Restaurant(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant("Restaurant1", 4.5));
        restaurants.add(new Restaurant("Restaurant2", 7.2));
        restaurants.add(new Restaurant("Restaurant3", 9.8));
        restaurants.add(new Restaurant("Restaurant4", 3.7));
        restaurants.add(new Restaurant("Restaurant5", 6.5));
        restaurants.add(new Restaurant("Restaurant6", 8.1));
        restaurants.add(new Restaurant("Restaurant7", 2.9));
        restaurants.add(new Restaurant("Restaurant8", 5.6));

        Map<String, Integer> ratingRangesCount = new HashMap<>();
        ratingRangesCount.put("1-5", 0);
        ratingRangesCount.put("6-10", 0);

        Map<String, Double> ratingRangesTotal = new HashMap<>();
        ratingRangesTotal.put("1-5", 0.0);
        ratingRangesTotal.put("6-10", 0.0);

        for (Restaurant restaurant : restaurants) {
            double rating = restaurant.getRating();
            if (rating >= 1 && rating <= 5) {
                ratingRangesCount.put("1-5", ratingRangesCount.get("1-5") + 1);
                ratingRangesTotal.put("1-5", ratingRangesTotal.get("1-5") + rating);
            } else if (rating >= 6 && rating <= 10) {
                ratingRangesCount.put("6-10", ratingRangesCount.get("6-10") + 1);
                ratingRangesTotal.put("6-10", ratingRangesTotal.get("6-10") + rating);
            }
        }

        System.out.println("Number of restaurants rated within specific ranges and their average ratings:");
        for (Map.Entry<String, Integer> entry : ratingRangesCount.entrySet()) {
            String range = entry.getKey();
            int count = entry.getValue();
            double totalRating = ratingRangesTotal.get(range);
            double averageRating = totalRating / count;
            System.out.println("Range: " + range + ", Restaurants: " + count + ", Average Rating: " + averageRating);
        }
    }
}