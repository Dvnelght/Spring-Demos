package udemy.spring.tutorial1;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k.";
    }
}
