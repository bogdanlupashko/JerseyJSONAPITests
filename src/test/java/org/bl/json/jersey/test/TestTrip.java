package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
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

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userCreatedTripsDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userCreatedTripsDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userCreatedTripsDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userCreatedTripsDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userCreatedTripItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userCreatedTripItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userCreatedTripItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userCreatedTripItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userCreationTripItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userCreationTripItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userCreationTripItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userCreationTripItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userUpdateTripItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userUpdateTripItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userUpdateTripItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userUpdateTripItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, userCreationTripItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, userCreationTripItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, userCreationTripItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, userCreationTripItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, activityGetInfoDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, activityGetInfoDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, activityGetInfoDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, activityGetInfoDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, activityPostInfoDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, activityPostInfoDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, activityPostInfoDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, activityPostInfoDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, activityPutInfoDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, activityPutInfoDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, activityPutInfoDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, activityPutInfoDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, activityDeleteInfoDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, activityDeleteInfoDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, activityDeleteInfoDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, activityDeleteInfoDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, tripSyncDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, tripSyncDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, tripSyncDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, tripSyncDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, activityTypesDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, activityTypesDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, activityTypesDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, activityTypesDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, tripSyncItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, tripSyncItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, tripSyncItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, tripSyncItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, getTripRequestDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, getTripRequestDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, getTripRequestDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, getTripRequestDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, createTripRequestDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, createTripRequestDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, createTripRequestDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, createTripRequestDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, getPlanTripDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, getPlanTripDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, getPlanTripDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, getPlanTripDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
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
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, changePlanTripStatusDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, changePlanTripStatusDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, changePlanTripStatusDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, changePlanTripStatusDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    private int getTripId(TripSimple[] userCreatedTrips) {
        for (TripSimple item : userCreatedTrips)
            return item.getId();
        return 0;

    }
}
