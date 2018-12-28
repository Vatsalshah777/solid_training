package exercise_refactored;

import com.meditab.training.ocp.exercise.ResourceType;

public class space_slot {
	public int allocate(ResourceType resourceType) {
		int resourceId;
		resourceId = findFreeSpaceSlot();
		markSpaceSlotBusy(resourceId);
		return resourceId;
	}

	public void free(ResourceType resourceType, int resourceId) {
		markSpaceSlotFree(resourceId);
	}

	void markSpaceSlotFree(int resourceId) {
	}

	void markSpaceSlotBusy(int resourceId) {
	}

	private int findFreeSpaceSlot() {
		return 0;
	}
}
