/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.dtos;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author TuPT
 */
public class Tour implements Serializable {
    private String tourID, tourName, tourNameEng;
    private int adultPrice, childPrice;
    private String unit, transportation;
    private Date departureDay, endDay;
    private int numOfDay, numOfNight, numOfSeat;
    private String departure, arrival, tourContent, tourOverview, thumb, image, typeTourID;
    private boolean typeINOUT, fullpackagedTour;
    private int numOfBookedSeat;
    private String note;
    
    public Tour(String tourID, String tourName, String tourNameEng, int adultPrice, int childPrice,
            String unit, String transportation, Date departureDay, Date endDay, int numOfDay, 
            int numOfNight, int numOfSeat, String departure, String arrival, String tourContent, 
            String tourOverview, String image, String typeTourID, boolean typeINOUT, boolean fullpackagedTour, String note) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.tourNameEng = tourNameEng;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.unit = unit;
        this.transportation = transportation;
        this.departureDay = departureDay;
        this.endDay = endDay;
        this.numOfDay = numOfDay;
        this.numOfNight = numOfNight;
        this.numOfSeat = numOfSeat;
        this.departure = departure;
        this.arrival = arrival;
        this.tourContent = tourContent;
        this.tourOverview = tourOverview;
        this.image = image;
        this.typeTourID = typeTourID;
        this.typeINOUT = typeINOUT;
        this.fullpackagedTour = fullpackagedTour;
        this.note = note;
    }

    public Tour(String tourID, String tourName, int adultPrice, String transportation, Date departureDay,
            int numOfDay, int numOfNight, String departure, String arrival, String unit, String thumb) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.adultPrice = adultPrice;
        this.transportation = transportation;
        this.departureDay = departureDay;
        this.numOfDay = numOfDay;
        this.numOfNight = numOfNight;
        this.departure = departure;
        this.arrival = arrival;
        this.unit = unit;
        this.thumb = thumb;
    }

    public Tour(String tourID, String tourName, int adultPrice, int childPrice, String unit,
            String note, String transportation, Date departureDay, Date endDay, int numOfDay, 
            int numOfNight, int numOfSeat, String departure, String arrival, String tourOverview, 
            String tourContent, String thumb, String image, boolean fullpackagedTour, int numOfBookedSeat) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.unit = unit;
        this.note = note;
        this.transportation = transportation;
        this.departureDay = departureDay;
        this.endDay = endDay;
        this.numOfDay = numOfDay;
        this.numOfNight = numOfNight;
        this.numOfSeat = numOfSeat;
        this.departure = departure;
        this.arrival = arrival;
        this.tourOverview = tourOverview;
        this.tourContent = tourContent;
        this.thumb = thumb;
        this.image = image;
        this.fullpackagedTour = fullpackagedTour;
        this.numOfBookedSeat = numOfBookedSeat;
    }  
    
    public Tour(String tourID, String tourName, int adultPrice, int childPrice, String unit,
            String note, String transportation, Date departureDay, Date endDay, int numOfDay, 
            int numOfNight, int numOfSeat, String departure, String arrival, String tourOverview, 
            String tourContent, String thumb, String image, boolean fullpackagedTour, int numOfBookedSeat, boolean typeINOUT, String typeTourID) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.unit = unit;
        this.note = note;
        this.transportation = transportation;
        this.departureDay = departureDay;
        this.endDay = endDay;
        this.numOfDay = numOfDay;
        this.numOfNight = numOfNight;
        this.numOfSeat = numOfSeat;
        this.departure = departure;
        this.arrival = arrival;
        this.tourOverview = tourOverview;
        this.tourContent = tourContent;
        this.thumb = thumb;
        this.image = image;
        this.fullpackagedTour = fullpackagedTour;
        this.numOfBookedSeat = numOfBookedSeat;
        this.typeINOUT = typeINOUT;
        this.typeTourID = typeTourID;
    }
    
    public Tour(String tourID, String tourName, int adultPrice, int childPrice, String transportation, Date departureDay, int numOfDay, int numOfNight, String departure, String arrival) {
        this.tourID = tourID;
        this.tourName = tourName;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.transportation = transportation;
        this.departureDay = departureDay;
        this.numOfDay = numOfDay;
        this.numOfNight = numOfNight;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
    
    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourNameEng() {
        return tourNameEng;
    }

    public void setTourNameEng(String tourNameEng) {
        this.tourNameEng = tourNameEng;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(int adultPrice) {
        this.adultPrice = adultPrice;
    }

    public int getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(int childPrice) {
        this.childPrice = childPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public Date getDepartureDay() {
        return departureDay;
    }

    public void setDepartureDay(Date departureDay) {
        this.departureDay = departureDay;
    }

    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public int getNumOfNight() {
        return numOfNight;
    }

    public void setNumOfNight(int numOfNight) {
        this.numOfNight = numOfNight;
    }

    public int getNumOfSeat() {
        return numOfSeat;
    }

    public void setNumOfSeat(int numOfSeat) {
        this.numOfSeat = numOfSeat;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getTourContent() {
        return tourContent;
    }

    public void setTourContent(String tourContent) {
        this.tourContent = tourContent;
    }

    public String getTourOverview() {
        return tourOverview;
    }

    public void setTourOverview(String tourOverview) {
        this.tourOverview = tourOverview;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTypeTourID() {
        return typeTourID;
    }

    public void setTypeTourID(String typeTourID) {
        this.typeTourID = typeTourID;
    }

    public boolean isTypeINOUT() {
        return typeINOUT;
    }

    public void setTypeINOUT(boolean typeINOUT) {
        this.typeINOUT = typeINOUT;
    }

    public boolean isFullpackagedTour() {
        return fullpackagedTour;
    }

    public void setFullpackagedTour(boolean fullpackagedTour) {
        this.fullpackagedTour = fullpackagedTour;
    }

    public int getNumOfBookedSeat() {
        return numOfBookedSeat;
    }

    public void setNumOfBookedSeat(int numOfBookedSeat) {
        this.numOfBookedSeat = numOfBookedSeat;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
