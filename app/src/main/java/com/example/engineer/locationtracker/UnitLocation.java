package com.example.engineer.locationtracker;

import com.google.android.gms.maps.model.LatLng;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by engineer on 3/2/18.
 */

public class UnitLocation {
    private static String unit = "MoBiLET_01";
    private Date logTime;
    private double latitude;
    private double longitude;

    public String getUnit(){return unit;}
    public Date getDate(){return logTime;}
    public double getLatitude(){return latitude;}
    public double getLongitude(){return longitude;}

   // public String setUnit(){return unit;}
    public void setDate(Date time){this.logTime = time;}
    public void setLatitude(double lat){this.latitude = lat;}
    public void setLongitude(double lng){this.longitude = lng;}
}
