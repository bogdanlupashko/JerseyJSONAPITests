package org.bl.json.jersey.test;

import org.bl.json.jersey.TestVariables;
import org.bl.json.jersey.client.JerseyClient;
import org.bl.json.jersey.model.errors.ErrorString;
import org.bl.json.jersey.model.reservation.ReservationItemGetId;
import org.bl.json.jersey.model.shows.ShowsItem;
import org.bl.json.jersey.rest.service.Shows;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.ws.rs.ProcessingException;
import javax.ws.rs.WebApplicationException;

/**
 * Created by blupashko on 25.06.2015.
 */
public class TestShows {
    private static final String showsItemDescription = "Shows item  test";
    private static final String showsListDescription = "Shows list test";
    private static final String showsReservationDescription = "Shows reservation test";
    private static final String docLink = "http://vegaster.webprv.com/api/doc#showTour";

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + showsItemDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void showsItem() {
        try {
            Shows service = TestVariables.getClient().proxy(Shows.class);
            ShowsItem response = service.showsItem(TestVariables.getToken(),
                    TestVariables.showsId,
                    TestVariables.showType );
            TestVariables.reportFiller(docLink, showsItemDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, showsItemDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, showsItemDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, showsItemDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, showsItemDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + showsListDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void showsList() {
        try {
            Shows service = TestVariables.getClient().proxy(Shows.class);
            ShowsItem[] response = service.showsList(TestVariables.getToken());

            TestVariables.reportFiller(docLink, showsListDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, showsListDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, showsListDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, showsListDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, showsListDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

    @Test(description = TestVariables.DESCRIPTION_TESTS_HEADER + showsReservationDescription + "<br> <a href=" + docLink + ">" + TestVariables.LINK_API_DOC_HEADER + "</a>")
    public void showsReservationPost() {
        try {
            Shows service = TestVariables.getClient().proxy(Shows.class);
            ReservationItemGetId response = service.reservationItemPost(TestVariables.getToken(),
                    TestVariables.eventId,
                    TestVariables.periodId,
                    TestVariables.firstName,
                    TestVariables.lastName,
                    TestVariables.email,
                    TestVariables.phone);

            TestVariables.reportFiller(docLink, showsReservationDescription, response);
            JerseyClient.LOG.error(response.toString());
            Assert.assertNotNull(response);
            JerseyClient.LOG.error(response.toString());
        } catch (WebApplicationException errorsMessage) {
            try {
                TestVariables.reportFiller(docLink, showsReservationDescription, errorsMessage.getResponse().readEntity(org.bl.json.jersey.model.errors.Error.class));

            } catch (ProcessingException e) {
                try {
                    TestVariables.reportFiller(docLink, showsReservationDescription, errorsMessage.getResponse().readEntity(ErrorString.class));
                } catch (ProcessingException e1) {
                    TestVariables.reportFillerStackTrace(docLink, showsReservationDescription, errorsMessage.getLocalizedMessage());
                }
            }
        } catch (ProcessingException pro) {
            TestVariables.reportFillerStackTrace(docLink, showsReservationDescription, pro.getLocalizedMessage());
            Assert.fail("Object mapping failed : ", pro.getCause());
        }
    }

}
