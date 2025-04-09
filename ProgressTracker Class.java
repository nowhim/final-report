public class ProgressTracker {
    private int totalWorkouts;

    public ProgressTracker() {
        this.totalWorkouts = 0;
    }

    public void logWorkout() {
        totalWorkouts++;
    }

    public void showProgress() {
        System.out.println("Total Workouts Completed: " + totalWorkouts);
    }
}
