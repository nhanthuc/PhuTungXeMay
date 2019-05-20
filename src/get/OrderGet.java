package get;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.ConnectToDatabase;
import model.Orders;

public class OrderGet<Order> {
	public void insertOrder(Orders order) throws SQLException {
        Connection connection = ConnectToDatabase.getConnecttion();
        String sql = "INSERT INTO bill VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, order.getId_oder());
        ps.setLong(2, order.getCustumer_id());
        ps.setDouble(3, order.getTotal_money());
        ps.setDate(4, order.getDate());
       
        ps.executeUpdate();
    }
    
    
     public ArrayList<Orders> getListOrder() {
        try {
            Connection connection = ConnectToDatabase.getConnecttion();
            String sql = "SELECT * FROM bill";
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Orders> list = new ArrayList<>();
            while (rs.next()) {
                Orders order = new Orders();
                order.setId_oder(rs.getLong("Id_Oder"));
                order.setCustumer_id(rs.getLong("Custumer_Id"));
                order.setTotal_money(rs.getLong("Total_Money"));
                order.setStatus(rs.getString("Status"));
                order.setDate(rs.getDate("Date"));
                list.add(order);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OrderGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
     public ArrayList<Orders> getListBillByUser(long user_id) {
        try {
            Connection connection = ConnectToDatabase.getConnecttion();
            String sql = "SELECT * FROM Oders WHERE Custumer_Id= '" + user_id + "'";
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Orders> list = new ArrayList<>();
            while (rs.next()) {
                Orders order = new Orders();
                order.setId_oder(rs.getLong("Id_Oder"));
                order.setCustumer_id(rs.getLong("Custumer_Id"));
                order.setTotal_money(rs.getLong("Total_Money"));
                order.setStatus(rs.getString("Status"));
                order.setDate(rs.getDate("Date"));
                list.add(order);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
     
      
    
    public static void main(String[] args) throws SQLException {
       
        new OrderGet().insertOrder(new Orders(0, 0, 0 , null, "s"));
    }
}
