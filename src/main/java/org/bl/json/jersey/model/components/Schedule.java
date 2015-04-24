package org.bl.json.jersey.model.components;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by blupashko on 23.04.2015.
 */
@JsonIgnoreProperties
public class Schedule {

    private IntervalForADay[] mon;
    private IntervalForADay[] tue;
    private IntervalForADay[] wed;
    private IntervalForADay[] thu;
    private IntervalForADay[] fri;
    private IntervalForADay[] sat;
    private IntervalForADay[] sun;


    private class IntervalForADay {
        private String open;
        private String close;
        private String inteval;

        public String getOpen() {
            return open;
        }

        public void setOpen(String open) {
            this.open = open;
        }

        public String getClose() {
            return close;
        }

        public void setClose(String close) {
            this.close = close;
        }

        public String getInteval() {
            return inteval;
        }

        public void setInteval(String inteval) {
            this.inteval = inteval;
        }
    }
}
