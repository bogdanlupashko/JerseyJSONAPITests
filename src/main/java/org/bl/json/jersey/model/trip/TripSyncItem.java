package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripSyncItem extends TripSimple {
    private int activitiesSyncCount;
    private TripSyncActivity[] activitiesSync;

    public TripSyncActivity[] getActivitiesSync() {
        return activitiesSync;
    }

    public void setActivitiesSync(TripSyncActivity[] activitiesSync) {
        this.activitiesSync = activitiesSync;
    }

    public int getActivitiesSyncCount() {
        return activitiesSyncCount;
    }

    public void setActivitiesSyncCount(int activitiesSyncCount) {
        this.activitiesSyncCount = activitiesSyncCount;
    }
}
