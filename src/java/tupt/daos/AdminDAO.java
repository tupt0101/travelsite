/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tupt.db.MyConnection;
import tupt.dtos.Customer;
import tupt.dtos.Member;
import tupt.dtos.Tour;

/**
 *
 * @author TuPT
 */
public class AdminDAO implements Serializable {

    private Connection conn = null;
    private PreparedStatement preStm = null;
    private Statement stm = null;
    private ResultSet rs = null;

    public void closeConnection() throws Exception {
        if (rs != null) {
            rs.close();
        }
        if (preStm != null) {
            preStm.close();
        }
        if (stm != null) {
            stm.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    public AdminDAO() {
    }
    
    public List<Tour> findTourByLikeName(String search) throws Exception {
        List<Tour> result = null;
        String sql = "Select tourID, tourName, departure, arrival, numOfDay, numOfNight, departureDay, transportation, adultPrice, childPrice "
                + "From Tour Where tourName Like ? And active = 1";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + search + "%");
            String tourID, tourName, departure, arrival, transportation;
            Date departureDay;
            int adultPrice, childPrice, numOfDay, numOfNight;
            Tour dto = null;
            result = new ArrayList<>();
            rs = preStm.executeQuery();
            while (rs.next()) {
                tourID = rs.getString("tourID");
                tourName = rs.getString("tourName");
                departure = rs.getString("departure");
                arrival = rs.getString("arrival");
                numOfDay = rs.getInt("numOfDay");
                numOfNight = rs.getInt("numOfNight");
                departureDay = rs.getDate("departureDay");
                transportation = rs.getString("transportation");
                adultPrice = rs.getInt("adultPrice");
                childPrice = rs.getInt("childPrice");
                dto = new Tour(tourID, tourName, adultPrice, childPrice, transportation, departureDay, numOfDay, numOfNight, departure, arrival);
                result.add(dto);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public int countOfMember() throws Exception {
        int count = 0;
        String sql = "Select Count(CustomerID) From Customer";
        try {
            conn = MyConnection.getMyConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } finally {
            closeConnection();
        }
        return count;
    }
    
    public int countOfTour() throws Exception {
        int count = 0;
        String sql = "Select Count(tourID) From Tour";
        try {
            conn = MyConnection.getMyConnection();
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } finally {
            closeConnection();
        }
        return count;
    }
    
    public boolean deleteTour(String tourID) throws Exception {
        boolean check = false;
        String sql = "Update Tour Set active = 0 Where tourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, tourID);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public Tour findTourByPK(String tourID) throws Exception {
        Tour tour = null;
        String sql = "Select tourName, departure, arrival, departureDay, endDay, transportation, tourOverview, tourContent, "
                + "thumb, image, unit, note, adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat, "
                + "typeTourID, typeINOUT, fullpackagedTour From Tour Where tourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, tourID);
            rs = preStm.executeQuery();
            String tourName, departure, arrival, transportation, tourOverview, tourContent, typeTourID, thumb, image, unit, note;
            Date  departureDay, endDay;
            int adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat;
            boolean fullpackagedTour, typeINOUT;
            if (rs.next()) {
                tourName = rs.getString("tourName");
                departure = rs.getString("departure");
                arrival = rs.getString("arrival");
                departureDay = rs.getDate("departureDay");
                endDay = rs.getDate("endDay");
                transportation = rs.getString("transportation");
                tourOverview = rs.getString("tourOverview");
                tourContent = rs.getString("tourContent");
                typeTourID = rs.getString("typeTourID");
                thumb = rs.getString("thumb");
                image = rs.getString("image");
                unit = rs.getString("unit");
                note = rs.getString("note");
                adultPrice = rs.getInt("adultPrice");
                childPrice = rs.getInt("childPrice");
                numOfDay = rs.getInt("numOfDay");
                numOfNight = rs.getInt("numOfNight");
                numOfSeat = rs.getInt("numOfSeat");
                numOfBookedSeat = rs.getInt("numOfBookedSeat");
                fullpackagedTour = rs.getBoolean("fullpackagedTour");
                typeINOUT = rs.getBoolean("typeINOUT");
                tour = new Tour(tourID, tourName, adultPrice, childPrice, unit, note, transportation, departureDay, endDay,
                        numOfDay, numOfNight, numOfSeat, departure, arrival, tourOverview, tourContent, thumb, image, fullpackagedTour,
                        numOfBookedSeat, typeINOUT, typeTourID);
            }
        } finally {
            closeConnection();
        }
        return tour;
    }
    
    public boolean updateTour(Tour dto) throws Exception {
        boolean check = false;
        String sql = "Update Tour Set tourName = ?, departure = ?, arrival = ?, departureDay = ?, endDay = ?, transportation = ?, tourOverview = ?,"
                + " tourContent = ?, thumb = ?, image = ?, unit = ?, note = ?, adultPrice = ?, childPrice = ?, numOfDay = ?, numOfNight = ?,"
                + " numOfSeat = ?, numOfBookedSeat = ?, fullpackagedTour = ?, typeINOUT = ?, typeTourID = ? Where tourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getTourName());
            preStm.setString(2, dto.getDeparture());
            preStm.setString(3, dto.getArrival());
            preStm.setDate(4, dto.getDepartureDay());
            preStm.setDate(5, dto.getEndDay());
            preStm.setString(6, dto.getTransportation());
            preStm.setString(7, dto.getTourOverview());
            preStm.setString(8, dto.getTourContent());
            preStm.setString(9, dto.getThumb());
            preStm.setString(10, dto.getImage());
            preStm.setString(11, dto.getUnit());
            preStm.setString(12, dto.getNote());
            preStm.setInt(13, dto.getAdultPrice());
            preStm.setInt(14, dto.getChildPrice());
            preStm.setInt(15, dto.getNumOfDay());
            preStm.setInt(16, dto.getNumOfNight());
            preStm.setInt(17, dto.getNumOfSeat());
            preStm.setInt(18, dto.getNumOfBookedSeat());
            preStm.setBoolean(19, dto.isFullpackagedTour());
            preStm.setBoolean(20, dto.isTypeINOUT());
            preStm.setString(21, dto.getTypeTourID());
            preStm.setString(22, dto.getTourID());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean insertTour(Tour dto) throws Exception {
        boolean check = false;
        String sql = "Insert Into Tour (tourName, departure, arrival, departureDay, endDay, transportation, tourOverview, tourContent, "
                + "thumb, image, unit, note, adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat, "
                + "typeTourID, typeINOUT, fullpackagedTour, active, tourID) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getTourName());
            preStm.setString(2, dto.getDeparture());
            preStm.setString(3, dto.getArrival());
            preStm.setDate(4, dto.getDepartureDay());
            preStm.setDate(5, dto.getEndDay());
            preStm.setString(6, dto.getTransportation());
            preStm.setString(7, dto.getTourOverview());
            preStm.setString(8, dto.getTourContent());
            preStm.setString(9, dto.getThumb());
            preStm.setString(10, dto.getImage());
            preStm.setString(11, dto.getUnit());
            preStm.setString(12, dto.getNote());
            preStm.setInt(13, dto.getAdultPrice());
            preStm.setInt(14, dto.getChildPrice());
            preStm.setInt(15, dto.getNumOfDay());
            preStm.setInt(16, dto.getNumOfNight());
            preStm.setInt(17, dto.getNumOfSeat());
            preStm.setInt(18, dto.getNumOfBookedSeat());
            preStm.setString(19, dto.getTypeTourID());
            preStm.setBoolean(20, dto.isTypeINOUT());
            preStm.setBoolean(21, dto.isFullpackagedTour());
            preStm.setBoolean(22, true);
            preStm.setString(23, dto.getTourID());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public List<Customer> findCusByLikeName(String search) throws Exception {
        List<Customer> result = null;
        String sql = "Select customerID, customerName, dob, sex, address, mail, phone, note, active From Customer "
                + "Where customerName LIKE ? And active = 1";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + search + "%");
            rs = preStm.executeQuery();
            Customer dto = null;
            result = new ArrayList<>();
            while (rs.next()) {
                String customerID = rs.getString("customerID");
                String customerName = rs.getString("customerName");
                String dob = rs.getString("dob");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                String mail = rs.getString("mail");
                String phone = rs.getString("phone");
                String note = rs.getString("note");
                boolean active = rs.getBoolean("active");
                dto = new Customer(customerID, customerName, dob, sex, address, mail, phone, note, active);
                result.add(dto);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public boolean banMember(String customerID) throws Exception {
        boolean check = false;
        String sql = "Update Member Set active = 0 Where customerID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, customerID);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean banCustomer(String customerID) throws Exception {
        boolean check = false;
        banMember(customerID);
        String sql = "Update Customer Set active = 0 Where customerID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, customerID);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
