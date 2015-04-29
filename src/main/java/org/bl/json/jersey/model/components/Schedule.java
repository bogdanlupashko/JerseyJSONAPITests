package org.bl.json.jersey.model.components;

/**
 * @author Bogdan Lupashko
 */
public class Schedule {

    private IntervalForADay[] mon;
    private IntervalForADay[] tue;
    private IntervalForADay[] wed;
    private IntervalForADay[] thu;
    private IntervalForADay[] fri;
    private IntervalForADay[] sat;
    private IntervalForADay[] sun;

    private static class IntervalForADay {
        private String open;
        private String close;
        private String interval;

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

        public String getInterval() {
            return interval;
        }

        public void setInterval(String interval) {
            this.interval = interval;
        }
    }

    public IntervalForADay[] getMon() {
        return mon;
    }

    public void setMon(IntervalForADay[] mon) {
        this.mon = mon;
    }

    public IntervalForADay[] getTue() {
        return tue;
    }

    public void setTue(IntervalForADay[] tue) {
        this.tue = tue;
    }

    public IntervalForADay[] getWed() {
        return wed;
    }

    public void setWed(IntervalForADay[] wed) {
        this.wed = wed;
    }

    public IntervalForADay[] getThu() {
        return thu;
    }

    public void setThu(IntervalForADay[] thu) {
        this.thu = thu;
    }

    public IntervalForADay[] getFri() {
        return fri;
    }

    public void setFri(IntervalForADay[] fri) {
        this.fri = fri;
    }

    public IntervalForADay[] getSat() {
        return sat;
    }

    public void setSat(IntervalForADay[] sat) {
        this.sat = sat;
    }

    public IntervalForADay[] getSun() {
        return sun;
    }

    public void setSun(IntervalForADay[] sun) {
        this.sun = sun;
    }
}
