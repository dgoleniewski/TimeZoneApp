public class TimeZone {
    private String abbreviation, client_ip, datetime, dst_from, dst_until, timezone, utc_datetime, utc_offset;
    private Double day_of_week, day_of_year, dst_offset, raw_offset, unixtime, week_number;
    private Boolean dst;

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getClient_ip() {
        return client_ip;
    }

    public void setClient_ip(String client_ip) {
        this.client_ip = client_ip;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getDst_from() {
        return dst_from;
    }

    public void setDst_from(String dst_from) {
        this.dst_from = dst_from;
    }

    public String getDst_until() {
        return dst_until;
    }

    public void setDst_until(String dst_until) {
        this.dst_until = dst_until;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getUtc_datetime() {
        return utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    public String getUtc_offset() {
        return utc_offset;
    }

    public void setUtc_offset(String utc_offset) {
        this.utc_offset = utc_offset;
    }

    public Double getDay_of_week() {
        return day_of_week;
    }

    public void setDay_of_week(Double day_of_week) {
        this.day_of_week = day_of_week;
    }

    public Double getDay_of_year() {
        return day_of_year;
    }

    public void setDay_of_year(Double day_of_year) {
        this.day_of_year = day_of_year;
    }

    public Double getDst_offset() {
        return dst_offset;
    }

    public void setDst_offset(Double dst_offset) {
        this.dst_offset = dst_offset;
    }

    public Double getRaw_offset() {
        return raw_offset;
    }

    public void setRaw_offset(Double raw_offset) {
        this.raw_offset = raw_offset;
    }

    public Double getUnixtime() {
        return unixtime;
    }

    public void setUnixtime(Double unixtime) {
        this.unixtime = unixtime;
    }

    public Double getWeek_number() {
        return week_number;
    }

    public void setWeek_number(Double week_number) {
        this.week_number = week_number;
    }

    public Boolean getDst() {
        return dst;
    }

    public void setDst(Boolean dst) {
        this.dst = dst;
    }
}
