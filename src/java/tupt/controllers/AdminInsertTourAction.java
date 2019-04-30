/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.controllers;

import com.opensymphony.xwork2.ActionSupport;
import java.io.File;
import java.sql.Date;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import tupt.daos.AdminDAO;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
@MultipartConfig(fileSizeThreshold = 1024 * 1024,
        maxFileSize = 1024 * 1024 * 5,
        maxRequestSize = 1024 * 1024 * 5 * 5)
public class AdminInsertTourAction extends ActionSupport {

    private String tourName, departure, arrival, transportation, tourOverview, tourContent, typeTourID, unit, note;
    private File thumb, image;
    private Date departureDay, endDay;
    private int adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat;
    private boolean fullpackagedTour, typeINOUT;
    private String imgUrl, thumbUrl;
    private String imageFileName, thumbFileName;
    
    private static final String UPLOAD_DIRECTORY = "img\\tour";

    public AdminInsertTourAction() {
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
    
    public String getThumbFileName() {
        return thumbFileName;
    }

    public void setThumbFileName(String thumbFileName) {
        this.thumbFileName = thumbFileName;
    }
    
    public String getTourName() {
        return tourName;
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

    public File getThumb() {
        return thumb;
    }

    public void setThumb(File thumb) {
        this.thumb = thumb;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
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

    @Override
    public String execute() throws Exception {
        AdminDAO dao = new AdminDAO();
        int index = dao.countOfTour() + 1;
        String tourID = "TK119-2019-" + index;
        String uploadPath = ServletActionContext.getServletContext().getRealPath("") + File.separator + UPLOAD_DIRECTORY;

        try {
            File thumbDestFile = new File(uploadPath, thumbFileName);
            File imgDestFile = new File(uploadPath, imageFileName);
            FileUtils.copyFile(thumb, thumbDestFile);
            FileUtils.copyFile(image, imgDestFile);
            thumbUrl = UPLOAD_DIRECTORY + File.separator + thumbFileName;
            imgUrl = UPLOAD_DIRECTORY + File.separator + imageFileName;
        } catch (Exception e) {
            e.printStackTrace();
        }

        Tour dto = new Tour(tourID, tourName, adultPrice, childPrice, unit, note, transportation,
                departureDay, endDay, numOfDay, numOfNight, numOfSeat, departure, arrival, tourOverview,
                tourContent, thumbUrl, imgUrl, fullpackagedTour, numOfBookedSeat, typeINOUT, typeTourID);

        if (dao.insertTour(dto)) {

            return "success";
        }
        return "fail";
    }

}
