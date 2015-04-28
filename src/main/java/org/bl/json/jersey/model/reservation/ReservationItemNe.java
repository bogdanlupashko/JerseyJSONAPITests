package org.bl.json.jersey.model.reservation;

import org.bl.json.jersey.model.components.HostRes;
import org.bl.json.jersey.model.components.Offers;
import org.bl.json.jersey.model.components.Request;

import java.util.Map;

/**
 * Created by blupashko on 23.04.2015.
 */
public class ReservationItemNe {
    private int reservationId;

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }
}
