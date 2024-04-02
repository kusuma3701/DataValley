import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookReview {
    private String title;
    private int rating;

    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }
}

public class BookReviewAnalyzer {

    public static void main(String[] args) {
        List<BookReview> reviews = new ArrayList<>();
        reviews.add(new BookReview("Book 1", 4));
        reviews.add(new BookReview("Book 2", 8));
        reviews.add(new BookReview("Book 3", 2));
        reviews.add(new BookReview("Book 4", 6));
        reviews.add(new BookReview("Book 5", 9));

        int[] ratingRanges = {1, 5, 6, 10};
        int[] ratingCounts = new int[ratingRanges.length - 1];

        int positiveReviews = 0;
        int neutralReviews = 0;
        int negativeReviews = 0;

        for (BookReview review : reviews) {
            int rating = review.getRating();
            if (rating >= ratingRanges[0] && rating <= ratingRanges[1]) {
                ratingCounts[0]++;
            } else if (rating >= ratingRanges[2] && rating <= ratingRanges[3]) {
                ratingCounts[1]++;
            }

            if (rating >= 7) {
                positiveReviews++;
            } else if (rating >= 4) {
                neutralReviews++;
            } else {
                negativeReviews++;
            }
        }

        System.out.println("Books reviewed within rating range 1-5 stars: " + ratingCounts[0]);
        System.out.println("Books reviewed within rating range 6-10 stars: " + ratingCounts[1]);
        System.out.println("Positive reviews: " + positiveReviews);
        System.out.println("Neutral reviews: " + neutralReviews);
        System.out.println("Negative reviews: " + negativeReviews);
    }
}