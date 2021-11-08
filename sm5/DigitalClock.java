package sm5;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {
    private Clock clock = (Clock) Clock.getInstance();

    @Override
    public void update(Observable o, Object arg) {
        if (!(o instanceof Clock) || !(arg instanceof Long)) {
            throw new IllegalArgumentException(
                    "DigitalClock must be subscribed to Clock-compatible Observables only");
        }

        System.out.printf("\r%02d:%02d:%02d", clock.getHours(), clock.getMinutes(), clock.getSeconds());
    }
}