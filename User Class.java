import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private ArrayList<Workout> workouts;
    private SubscriptionManager subscription;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.workouts = new ArrayList<>();
        this.subscription = new SubscriptionManager();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addWorkout(Workout workout) {
        workouts.add(workout);
    }

    public void showWorkouts() {
        for (Workout workout : workouts) {
            System.out.println(workout.getDetails());
        }
    }

    public SubscriptionManager getSubscription() {
        return subscription;
    }
}
