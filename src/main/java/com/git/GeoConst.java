package com.git;

public enum GeoConst {
    SANKT_PETERBURG("Санкт-Петербург", 0.009, 0.0177);

    public String region;
    public double lat;
    public double lon;

    GeoConst(String region, double lat, double lon) {
        this.region = region;
        this.lat = lat;
        this.lon = lon;
    }
}
