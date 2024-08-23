package org.example;

import java.sql.Date;

import static java.lang.System.out;

public class Endroits {
    private static String EndroitName;
    private String name;
    private float longitude;
    private float lagitude;
    private String description;
    private int quality;
    private String descriptionQuality;
    private Date datePostQuality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLagitude() {
        return lagitude;
    }

    public void setLagitude(float lagitude) {
        this.lagitude = lagitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQualite() {
        return quality;
    }

    public void setQualite(int qualite) {
        this.quality = quality;
    }

    public String getDescriptionQualite() {
        return descriptionQuality;
    }

    public void setDescriptionQualite(String descriptionQualite) {
        this.descriptionQuality = descriptionQuality;
    }

    public Date getDatePostQualite() {
        return datePostQuality;
    }

    public void setDatePostQualite(Date datePostQualite) {
        this.datePostQuality = datePostQualite;
    }

    public static void addReview() {
        Endroits.addReview();
    }

    public static Object getAllReviews() {
        Object AllQualities = null;
        return AllQualities;
    }

    public static Object findBestHotel() {
        Object Parcs = null;
        Object Hotel = null;
        Object BestHotel = null;
        Object BestQuality = null;
        Hotel = Endroits.findBestHotel();
        if (Hotel == Parcs) {
            return true;
        }
        if (Hotel == BestQuality ){
            return true;
        }
        return BestHotel;
    }

    public static void getAllPlacesInside(){
        float latitudeMinimale = 0;
        float latitudeMaximale = 0;
        float longitudeMinimale = 0;
        float longitudeMaximale = 20.5432F;
        float EndroitLongitude = 20.5432F;

        System.out.println("Endroits" + EndroitName);
    }

    public static void findCheapestHotelPrice(){
        Object montantMinimumTotal = 0;

    }










}



