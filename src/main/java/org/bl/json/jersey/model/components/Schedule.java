package org.bl.json.jersey.model.components;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by blupashko on 23.04.2015.
 */
@JsonIgnoreProperties
public class Schedule {

    @JsonIgnore
    private IntervalForADay[] mon;
    @JsonIgnore
    private IntervalForADay[] tue;
    @JsonIgnore
    private IntervalForADay[] wed;
    @JsonIgnore
    private IntervalForADay[] thu;
    @JsonIgnore
    private IntervalForADay[] fri;
    @JsonIgnore
    private IntervalForADay[] sat;
    @JsonIgnore
    private IntervalForADay[] sun;


    private class IntervalForADay {
        @JsonIgnore
        private String open;
        @JsonIgnore
        private String close;
        @JsonIgnore
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
