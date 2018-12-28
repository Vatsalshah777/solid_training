package exercise_refactored;

import java.util.TimerTask;

public class Timer {
	public void register(long timeOut, final timed_door timed_door) {
		java.util.Timer timerUtility = new java.util.Timer();
		timerUtility.schedule(new TimerTask() {
			public void run() {
				timed_door.timeOutCallback();
			}
		}, timeOut);
	}
}
