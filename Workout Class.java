public class Workout {
    private String type;
    private int duration; // in minutes
    private int intensity; // 1 - low, 2 - medium, 3 - high

    public Workout(String type, int duration, int intensity) {
        this.type = type;
        this.duration = duration;
        this.intensity = intensity;
    }

    public String getType() {
        return type;
    }

    public int getDuration() {
        return duration;
    }

    public int getIntensity() {
        return intensity;
    }

    public String getDetails() {
        return "Workout Type: " + type + ", Duration: " + duration + " mins, Intensity: " + intensity;
    }
}
