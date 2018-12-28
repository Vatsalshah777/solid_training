package exercise_refactored;

import com.meditab.training.ocp.exercise.ResourceType;

public class time_slot {
	public int allocate(ResourceType resourceType) {
		int resourceId;
		resourceId = findFreeTimeSlot();
		markTimeSlotBusy(resourceId);
		return resourceId;
	}

	public void free(ResourceType resourceType, int resourceId) {
		markTimeSlotFree(resourceId);
	}

	void markTimeSlotFree(int resourceId) {
	}

	void markTimeSlotBusy(int resourceId) {
	}

	private int findFreeTimeSlot() {
		return 0;
	}
}
