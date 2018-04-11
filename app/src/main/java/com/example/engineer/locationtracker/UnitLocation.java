package com.example.engineer.locationtracker;

import com.google.android.gms.maps.model.LatLng;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by engineer on 3/2/18.
 */

public class UnitLocation {
    private static String uuid = "9660d29e5d";
    private long logtime;
    private double latitude;
    private double longitude;

    public String getUnit(){return uuid;}
    public long getTime(){return logtime;}
    public double getLatitude(){return latitude;}
    public double getLongitude(){return longitude;}

   // public String setUnit(){return unit;}
    public void setTime(long time){this.logtime = time;}
    public void setLatitude(double lat){this.latitude = lat;}
    public void setLongitude(double lng){this.longitude = lng;}
}
