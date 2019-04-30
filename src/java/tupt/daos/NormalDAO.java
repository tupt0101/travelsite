/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupt.daos;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import tupt.db.MyConnection;
import tupt.dtos.BookTour;
import tupt.dtos.Contact;
import tupt.dtos.Customer;
import tupt.dtos.Member;
import tupt.dtos.Tour;
import java.sql.Date;

/**
 *
 * @author TuPT
 */
public class NormalDAO implements Serializable {

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

    public NormalDAO() {
    }

    public String checkLogin(String username, String password) throws Exception {
        String role = "fail";
        String sql = "Select role From Member Where username = ? and password = ? and active = 1";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            preStm.setString(2, password);
            rs = preStm.executeQuery();
            if (rs.next()) {
                role = rs.getString("role");
            }
        } finally {
            closeConnection();
        }
        return role;
    }

    public String findCustomerID(String username) throws Exception {
        String cusID = "failed";
        try {
            String sql = "Select customerID From Member where username = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, username);
            rs = preStm.executeQuery();
            if (rs.next()) {
                cusID = rs.getString("customerID");
            }
        } finally {
            closeConnection();
        }
        return cusID;
    }

    public String findCustomerName(String username) throws Exception {
        String cusID = findCustomerID(username);
        String cusName = "failed";
        try {
            String sql = "Select customerName From Customer Where customerID = ?";
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, cusID);
            rs = preStm.executeQuery();
            if (rs.next()) {
                cusName = rs.getString("customerName");
            }
        } finally {
            closeConnection();
        }
        return cusName;
    }
    
    public Customer loadUserProfile(String username) throws Exception {
        String cusID = findCustomerID(username);
        Customer cust = null;
        String sql = "Select customerName, dob, sex, address, mail, phone From Customer Where customerID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, cusID);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String customerName = rs.getString("customerName");
                String dob = rs.getString("dob");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                String mail = rs.getString("mail");
                String phone = rs.getString("phone");
                cust = new Customer(cusID, customerName, dob, sex, address, mail, phone);
            }
        } finally {
            closeConnection();
        }
        return cust;
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

    public boolean insertCustomer(Customer cust) throws Exception {
        boolean check = false;
        String sql = "Insert Into Customer (customerID,customerName,address,mail,phone) values (?,?,?,?,?)";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, cust.getCustomerID());
            preStm.setString(2, cust.getCustomerName());
            preStm.setString(3, cust.getAddress());
            preStm.setString(4, cust.getMail());
            preStm.setString(5, cust.getPhone());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }

    public boolean insert(Customer cust, Member mem) throws Exception {
        boolean check = false;
        String sql = "Insert Into Member (customerID,username,password,role) values (?,?,?,?)";
        if (insertCustomer(cust)) {
            try {
                conn = MyConnection.getMyConnection();
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, cust.getCustomerID());
                preStm.setString(2, mem.getUsername());
                preStm.setString(3, mem.getPassword());
                preStm.setString(4, mem.getRole());
                check = preStm.executeUpdate() > 0;
            } finally {
                closeConnection();
            }
        }
        return check;
    }

    public boolean updateCustomer(Customer cust) throws Exception {
        boolean check = false;
        String sql = "Update Customer set customerName = ?, phone = ?, sex = ?, dob = ?, address= ? Where customerID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, cust.getCustomerName());
            preStm.setString(2, cust.getPhone());
            preStm.setString(3, cust.getSex());
            preStm.setString(4, cust.getDob());
            preStm.setString(5, cust.getAddress());
            preStm.setString(6, cust.getCustomerID());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }

    public List<Tour> findTourByLikeName(String search) throws Exception {
        List<Tour> result = null;
        String sql = "Select tourID, tourName, departure, arrival, numOfDay, numOfNight, departureDay, transportation, adultPrice, unit, thumb "
                + "From Tour Where tourName Like ? And active = 1";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + search + "%");
            String tourID, tourName, departure, arrival, transportation, unit, thumb;
            Date departureDay;
            int adultPrice, numOfDay, numOfNight;
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
                unit = rs.getString("unit");
                thumb = rs.getString("thumb");
                dto = new Tour(tourID, tourName, adultPrice, transportation, departureDay, numOfDay, numOfNight, departure, arrival, unit, thumb);
                result.add(dto);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public List<Tour> findTourByLikeName(String search, String txtDeparture) throws Exception {
        List<Tour> result = null;
        String sql = "Select tourID, tourName, departure, arrival, numOfDay, numOfNight, departureDay, transportation, adultPrice, unit, thumb "
                + "From Tour Where tourName Like ? And departure Like ? And active = 1";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, "%" + search + "%");
            preStm.setString(2, "%" + txtDeparture + "%");
            String tourID, tourName, departure, arrival, transportation, unit, thumb;
            Date departureDay;
            int adultPrice, numOfDay, numOfNight;
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
                unit = rs.getString("unit");
                thumb = rs.getString("thumb");
                dto = new Tour(tourID, tourName, adultPrice, transportation, departureDay, numOfDay, numOfNight, departure, arrival, unit, thumb);
                result.add(dto);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public Tour findTourByPK(String tourID) throws Exception {
        Tour tour = null;
        String sql = "Select tourName, departure, arrival, departureDay, endDay, transportation, tourOverview, tourContent, "
                + "thumb, image, unit, note, adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat, "
                + "fullpackagedTour From Tour Where tourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, tourID);
            rs = preStm.executeQuery();
            String tourName, departure, arrival, transportation, tourOverview, tourContent, thumb, image, unit, note;
            Date departureDay, endDay;
            int adultPrice, childPrice, numOfDay, numOfNight, numOfSeat, numOfBookedSeat;
            boolean fullpackagedTour;
            if (rs.next()) {
                tourName = rs.getString("tourName");
                departure = rs.getString("departure");
                arrival = rs.getString("arrival");
                departureDay = rs.getDate("departureDay");
                endDay = rs.getDate("endDay");
                transportation = rs.getString("transportation");
                tourOverview = rs.getString("tourOverview");
                tourContent = rs.getString("tourContent");
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
                tour = new Tour(tourID, tourName, adultPrice, childPrice, unit, note, transportation, departureDay, endDay,
                        numOfDay, numOfNight, numOfSeat, departure, arrival, tourOverview, tourContent, thumb, image, fullpackagedTour, numOfBookedSeat);
            }
        } finally {
            closeConnection();
        }
        return tour;
    }
    
    //Profile
    
    public Customer reloadProfile(String customerID) throws Exception {
        Customer cust = null;
        String sql = "Select customerName, dob, sex, address, mail, phone From Customer Where customerID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, customerID);
            rs = preStm.executeQuery();
            if (rs.next()) {
                String customerName = rs.getString("customerName");
                String dob = rs.getString("dob");
                String sex = rs.getString("sex");
                String address = rs.getString("address");
                String mail = rs.getString("mail");
                String phone = rs.getString("phone");
                cust = new Customer(customerID, customerName, dob, sex, address, mail, phone);
            }
        } finally {
            closeConnection();
        }
        return cust;
    }
    
    public List<BookTour> loadBookedTour(String customerID) throws Exception {
        List<BookTour> result = null;
        String sql = "Select bookTourID, tourID, bookDay, expiredDay, numOfSeat, totalPrice, unit, status From BookTour "
                + "Where active = 1 And bookTourID In (Select bookTourID From BookTourDetail Where customerID = ?)";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, customerID);
            rs = preStm.executeQuery();
            String bookTourID, tourID, unit, status;
            Date bookDay, expiredDay;
            int numOfSeat, totalPrice;
            BookTour bt = null;
            result = new ArrayList<>();
            while (rs.next()) {
                bookTourID = rs.getString("bookTourID");
                tourID = rs.getString("tourID");
                bookDay = rs.getDate("bookDay");
                expiredDay = rs.getDate("expiredDay");
                numOfSeat = rs.getInt("numOfSeat");
                totalPrice = rs.getInt("totalPrice");
                status = rs.getString("status");
                unit = rs.getString("unit");
                bt = new BookTour(bookTourID, tourID, bookDay, expiredDay, numOfSeat, totalPrice, unit, status);
                result.add(bt);
            }
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public boolean changePassword(String customerID, String oldPassword, String newPassword) throws Exception {
        boolean check = false;
        String sql = "Update Member Set password = ? Where customerID = ? And password = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, newPassword);
            preStm.setString(2, customerID);
            preStm.setString(3, oldPassword);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public int countOfBookedTour() throws Exception {
        int count = 0;
        String sql = "Select Count(bookTourID) From BookTour";
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
    
    public boolean addBookedTour(BookTour dto) throws Exception {
        boolean check = false;
        String sql = "Insert Into BookTour (bookTourID, tourID, bookDay, expiredDay, numOfSeat, totalPrice, unit, status, active) "
                + "values(?,?,?,?,?,?,?,?,?)";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getBookTourID());
            preStm.setString(2, dto.getTourID());
            preStm.setDate(3, dto.getBookDay());
            preStm.setDate(4, dto.getExpiredDay());
            preStm.setInt(5, dto.getNumOfSeat());
            preStm.setInt(6, dto.getTotalPrice());
            preStm.setString(7, dto.getUnit());
            preStm.setString(8, dto.getStatus());
            preStm.setBoolean(9, dto.isActive());
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean bookTour(String customerID, BookTour dto) throws Exception {
        boolean check = false;
        String sql = "Insert Into BookTourDetail (bookTourID, customerID) values (?,?)";
        if (addBookedTour(dto)) {
            try {
                conn = MyConnection.getMyConnection();
                preStm = conn.prepareStatement(sql);
                preStm.setString(1, dto.getBookTourID());
                preStm.setString(2, customerID);
                check = preStm.executeUpdate() > 0;
            } finally {
                closeConnection();
            }
        }
        return check;
    }
    
    public int numOfAvailableSeat(String tourID) throws Exception {
        int result = 0;
        String sql = "Select numOfSeat - numOfBookedSeat As numOfAvailableSeat From Tour Where tourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, tourID);
            rs = preStm.executeQuery();
            if (rs.next())
                result = rs.getInt("numOfAvailableSeat");
        } finally {
            closeConnection();
        }
        return result;
    }
    
    public void updateNumOfBookedSeat(int seat, String tourID) throws Exception {
        String sql = "Update Tour Set numOfBookedSeat = numOfSeat - ? Where TourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setInt(1, seat);
            preStm.setString(2, tourID);
            preStm.executeUpdate();
        } finally {
            closeConnection();
        }
    }
    
    public int countOfContact() throws Exception {
        int count = 0;
        String sql = "Select Count(contactID) From Contact";
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
    
    public boolean addContact(Contact dto) throws Exception {
        boolean check = false;
        String sql = "Insert Into Contact (contactID, fullname, email, subject, message) values (?,?,?,?,?)";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, dto.getContactID());
            preStm.setString(2, dto.getFullname());
            preStm.setString(3, dto.getEmail());
            preStm.setString(4, dto.getSubject());
            preStm.setString(5, dto.getMessage());
            check = preStm.executeUpdate() > 0;
            System.out.println(check);
        } finally {
            closeConnection();
        }
        return check;
    }
    
    public boolean deleteBookedTour(String bookTourID) throws Exception {
        boolean check = false;
        String sql = "Update BookTour Set active = 0 Where bookTourID = ?";
        try {
            conn = MyConnection.getMyConnection();
            preStm = conn.prepareStatement(sql);
            preStm.setString(1, bookTourID);
            check = preStm.executeUpdate() > 0;
        } finally {
            closeConnection();
        }
        return check;
    }
}
