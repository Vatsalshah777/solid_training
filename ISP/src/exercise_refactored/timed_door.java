package exercise_refactored;

public interface timed_door {
	void lock();

	void unlock();

	void open();

	void close();

	void timeOutCallback();

	void proximityCallback();
}
