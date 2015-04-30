package org.bl.json.jersey.model.trip;

/**
 * @author Bogdan Lupashko
 */

public class TripSync extends TripSimple {

    private int activitiesSyncCount;
    private TripSyncActivity[] activitiesSync;

    public int getActivitiesSyncCount() {
        return activitiesSyncCount;
    }

    public void setActivitiesSyncCount(int activitiesSyncCount) {
        this.activitiesSyncCount = activitiesSyncCount;
    }

    public TripSyncActivity[] getActivitiesSync() {
        return activitiesSync;
    }

    public void setActivitiesSync(TripSyncActivity[] activitiesSync) {
        this.activitiesSync = activitiesSync;
    }
}
