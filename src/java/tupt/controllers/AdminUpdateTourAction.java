/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import java.sql.Date;
import tupt.daos.AdminDAO;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class AdminUpdateTourAction {
    String tourID, tourName, departure, arrival, transportation, tourOverview, tourContent, typeTourID, thumb, image, unit, note;
    Date departureDay, endDay;
    int adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat;
    boolean fullpackagedTour, typeINOUT;

    public AdminUpdateTourAction() {
    }

    public String getTourName() {
        return tourName;
    }

    public String getTourID() {
        return tourID;
    }

    public void setTourID(String tourID) {
        this.tourID = tourID;
    }
    
    public void setTourName(String tourName) {
        this.tourName = tourName;
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
    
    public String getTransportation() {
        return transportation;
    }

    public void setTransportation(String transportation) {
        this.transportation = transportation;
    }

    public String getTourOverview() {
        return tourOverview;
    }

    public void setTourOverview(String tourOverview) {
        this.tourOverview = tourOverview;
    }

    public String getTourContent() {
        return tourContent;
    }

    public void setTourContent(String tourContent) {
        this.tourContent = tourContent;
    }

    public String getTypeTourID() {
        return typeTourID;
    }

    public void setTypeTourID(String typeTourID) {
        this.typeTourID = typeTourID;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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

    public int getNumOfBookedSeat() {
        return numOfBookedSeat;
    }

    public void setNumOfBookedSeat(int numOfBookedSeat) {
        this.numOfBookedSeat = numOfBookedSeat;
    }

    public boolean isFullpackagedTour() {
        return fullpackagedTour;
    }

    public void setFullpackagedTour(boolean fullpackagedTour) {
        this.fullpackagedTour = fullpackagedTour;
    }

    public boolean isTypeINOUT() {
        return typeINOUT;
    }

    public void setTypeINOUT(boolean typeINOUT) {
        this.typeINOUT = typeINOUT;
    }

    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        Tour dto = new Tour(tourID, tourName, adultPrice, childPrice, unit, note, transportation,
                departureDay, endDay, numOfDay, numOfNight, numOfSeat, departure, arrival, tourOverview,
                tourContent, thumb, image, fullpackagedTour, numOfBookedSeat, typeINOUT, typeTourID);
        if (dao.updateTour(dto))
            return "success";
        return "fail";
    }

}
