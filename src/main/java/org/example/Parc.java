package org.example;

import java.sql.Date;

public class Parc extends Endroits{

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public float getLongitude() {
        return super.getLongitude();
    }

    @Override
    public void setLongitude(float longitude) {
        super.setLongitude(longitude);
    }

    @Override
    public float getLagitude() {
        return super.getLagitude();
    }

    @Override
    public void setLagitude(float lagitude) {
        super.setLagitude(lagitude);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public void setDescription(String description) {
        super.setDescription(description);
    }

    @Override
    public int getQualite() {
        return super.getQualite();
    }

    @Override
    public void setQualite(int qualite) {
        super.setQualite(qualite);
    }

    @Override
    public String getDescriptionQualite() {
        return super.getDescriptionQualite();
    }

    @Override
    public void setDescriptionQualite(String descriptionQualite) {
        super.setDescriptionQualite(descriptionQualite);
    }

    @Override
    public Date getDatePostQualite() {
        return super.getDatePostQualite();
    }

    @Override
    public void setDatePostQualite(Date datePostQualite) {
        super.setDatePostQualite(datePostQualite);
    }

    private String ensembleHotel;


}
