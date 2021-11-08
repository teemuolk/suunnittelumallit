package sm5;

import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;


@SuppressWarnings({"IntegerDivisionInFloatingPointContext"})
public class Clock extends Observable {
    private static final Clock instance = new Clock();

    private static long time = 0;

    private Clock() {
        new Timer()
                .scheduleAtFixedRate(
                        new TimerTask() {
                            @Override
                            public void run() {
                                tick();
                            }
                        },
                        0,
                        1000);
    }

    public static Observable getInstance() {
        return instance;
    }

    private void tick() {
        setChanged();
        time++;
        notifyObservers(time);
    }

    public long getSeconds() {
        long overrun = time / 60;
        return overrun >= 1 ? time - (overrun * 60) : time;
    }

    public long getMinutes() {
        return (long) Math.floor(time / 60);
    }

    public long getHours() {
        return (long) Math.floor(time / 60 / 60);
    }
}