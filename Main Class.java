import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a new user
        User user = new User("John Doe", "john@example.com");

        // User logs a workout
        user.addWorkout(new Workout("Running", 30, 3));
        user.addWorkout(new Workout("Cycling", 45, 2));

        // Display user workouts
        System.out.println("Workouts logged by " + user.getName() + ":");
        user.showWorkouts();

        // Upgrade user to premium
        user.getSubscription().upgradeToPremium();

        // Show progress
        ProgressTracker tracker = new ProgressTracker();
        tracker.logWorkout();
        tracker.logWorkout();
        tracker.showProgress();

        // Handle subscription status
        System.out.println("User subscription premium status: " + (user.getSubscription().isPremium() ? "Premium" : "Basic"));
    }
}
