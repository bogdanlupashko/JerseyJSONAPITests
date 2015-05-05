package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.trip.TripActivity;
import org.bl.json.jersey.model.trip.TripId;
import org.bl.json.jersey.model.trip.TripItem;
import org.bl.json.jersey.model.trip.TripPlan;
import org.bl.json.jersey.model.trip.TripRequest;
import org.bl.json.jersey.model.trip.TripSimple;
import org.bl.json.jersey.model.trip.TripSync;
import org.bl.json.jersey.model.trip.TripSyncItem;
import org.bl.json.jersey.rest.service.Trip;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * @author Bogdan Lupashko
 */

public class TestTrip {
    private static final String userCreatedTripsDescription = "Get user-created trips test";
    private static final String userCreatedTripItemDescription = "Trip info test";
    private static final String userCreationTripItemDescription = "Trip creation test";
    private static final String userUpdateTripItemDescription = "Trip update test";
    private static final String activityGetInfoDescription = "Get trip activity info test";
    private static final String activityPostInfoDescription = "Create activity for a trip test";
    private static final String activityPutInfoDescription = "Update activity for a trip test";
    private static final String activityDeleteInfoDescription = "Update activity for a trip test";
    private static final String tripSyncDescription = "SYNC get test";
    private static final String tripSyncItemDescription = "Get trip SYNC item test";
    private static final String createTripRequestDescription = "Create trip request test";
    private static final String getPlanTripDescription = "Get PLAN trip info test";
    private static final String changePlanTripStatusDescription = "Create PLAN trip info test";
    private static final String getTripRequestDescription = "Get trip request test";
    private static final String activityTypesDescription = "Activity types test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#trip";
    public static TripSimple[] userCreatedTrips;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userCreatedTripsDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripListGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            userCreatedTrips = service.tripListGet(TestVariables.getToken());
            TestVariables.reportFiller(docLink, userCreatedTripsDescription, userCreatedTrips);
            JerseyClient.LOG.error(userCreatedTrips.toString());
            Assert.assertNotNull(userCreatedTrips);
            JerseyClient.LOG.error(userCreatedTrips.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userCreatedTripsDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userCreatedTripItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripItemGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripItem response = service.tripItemGet(TestVariables.getToken(),
                    getTripId(userCreatedTrips));
            TestVariables.reportFiller(docLink, userCreatedTripItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userCreatedTripItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userCreationTripItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripCreate() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripId response = service.tripCreate(TestVariables.getToken(),
                    TestVariables.beginDateTime);
            TestVariables.reportFiller(docLink, userCreationTripItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userCreationTripItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userUpdateTripItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripUpdate() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripId response = service.tripUpdate(TestVariables.getToken(),
                    getTripId(userCreatedTrips),
                    TestVariables.beginDateTime);
            TestVariables.reportFiller(docLink, userUpdateTripItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userUpdateTripItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + userCreationTripItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripDelete() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            String response = service.tripDelete(TestVariables.getToken(),
                    getTripId(userCreatedTrips));
            TestVariables.reportFiller(docLink, userCreationTripItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, userCreationTripItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + activityGetInfoDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripActivityGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripActivity response = service.tripActivityGet(TestVariables.getToken(),
                    tripId.getId(),
                    getTripId(userCreatedTrips));
            TestVariables.reportFiller(docLink, activityGetInfoDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, activityGetInfoDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }
    public static TripId tripId;

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + activityPostInfoDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripActivityCreate() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            tripId = service.tripActivityCreate(TestVariables.getToken(),
                    getTripId(userCreatedTrips),
                    TestVariables.tripName,
                    TestVariables.type,
                    TestVariables.beginDateTime);

            TestVariables.reportFiller(docLink, activityPostInfoDescription, tripId);
            JerseyClient.LOG.error(tripId.toString());
            Assert.assertNotNull(tripId);
            JerseyClient.LOG.error(tripId.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, activityPostInfoDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + activityPutInfoDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripActivityUpdate() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            tripId = service.tripActivityUpdate(TestVariables.getToken(),
                    getTripId(userCreatedTrips),
                    TestVariables.tripName,
                    TestVariables.type,
                    TestVariables.beginDateTime);

            TestVariables.reportFiller(docLink, activityPutInfoDescription, tripId);
            JerseyClient.LOG.error(tripId.toString());
            Assert.assertNotNull(tripId);
            JerseyClient.LOG.error(tripId.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, activityPutInfoDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + activityDeleteInfoDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripActivityDelete() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            String response = service.tripActivityDelete(TestVariables.getToken(),
                    tripId.getId(),
                    getTripId(userCreatedTrips));

            TestVariables.reportFiller(docLink, activityDeleteInfoDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, activityDeleteInfoDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + tripSyncDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripSyncCreate() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripSync response = service.tripSyncCreate(TestVariables.getToken(),
                    TestVariables.syncCode);

            TestVariables.reportFiller(docLink, tripSyncDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, tripSyncDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + activityTypesDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripActivityTypesGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            Map<Integer, String> response = service.tripActivityTypesGet(TestVariables.getToken());

            TestVariables.reportFiller(docLink, activityTypesDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, activityTypesDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + tripSyncItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripSyncItemGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripSyncItem response = service.tripSyncItemGet(TestVariables.getToken(),
                    getTripId(userCreatedTrips));

            TestVariables.reportFiller(docLink, tripSyncItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, tripSyncItemDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + getTripRequestDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripRequestGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripRequest response = service.tripRequestGet(TestVariables.getToken(),
                    getTripId(userCreatedTrips));

            TestVariables.reportFiller(docLink, getTripRequestDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, getTripRequestDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + createTripRequestDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripRequestCreate() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            tripId = service.tripRequestCreate(TestVariables.getToken(),
                    TestVariables.travelType,
                    TestVariables.categories,
                    TestVariables.malesCount,
                    TestVariables.femalesCount,
                    TestVariables.budget,
                    TestVariables.costType);

            TestVariables.reportFiller(docLink, createTripRequestDescription, tripId);
            JerseyClient.LOG.error(tripId.toString());
            Assert.assertNotNull(tripId);
            JerseyClient.LOG.error(tripId.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, createTripRequestDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }


    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + getPlanTripDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripPlanItemGet() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            TripPlan response = service.tripPlanItemGet(TestVariables.getToken(),
                    tripId.getId());

            TestVariables.reportFiller(docLink, getPlanTripDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(tripId);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, getPlanTripDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + changePlanTripStatusDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void tripChangeStatusRequest() {
        try {
            Trip service = TestVariables.getClient().proxy(Trip.class);
            String response = service.tripChangeStatusRequest(TestVariables.getToken(),
                    tripId.getId(),
                    TestVariables.tripStatus);

            TestVariables.reportFiller(docLink, changePlanTripStatusDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(tripId);
            JerseyClient.LOG.error(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            TestVariables.reportFillerStackTrace(docLink, changePlanTripStatusDescription, e.getLocalizedMessage());
            Assert.fail();
        }
    }

    private int getTripId(TripSimple[] userCreatedTrips) {
        for (TripSimple item : userCreatedTrips)
            return item.getId();
        return 0;

    }
}
