package get;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.ConnectToDatabase;
import model.Detail_Order;

public class Detail_OrderGet {
	
	public void inserDetailOrder(Detail_Order bd) throws SQLException {
        Connection connection = ConnectToDatabase.getConnecttion();
        String sql = "INSERT INTO bill_detail VALUES(?,?,?,?,?)";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, bd.getId_Oder());
        ps.setLong(2, bd.getId());
        ps.setLong(3, bd.getMagio_hang());
        ps.setDouble(4, bd.getProduct_id());
        ps.setLong(5, bd.getQuantity());
        ps.executeUpdate();
    }
    
    public ArrayList<Detail_Order> getProductNameByOrderDetailId(long orderdetailid) {
        try {
            Connection connection = ConnectToDatabase.getConnecttion();
            String sql = "SELECT * FROM Detail_Oder WHERE id = '" + orderdetailid + "'";
            PreparedStatement ps = connection.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Detail_Order> list = new ArrayList<>();
            while (rs.next()) {
                Detail_Order detailorder = new Detail_Order();
                detailorder.setProduct_id(rs.getLong("Product_Id"));              
                list.add(detailorder);
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(Detail_Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args) throws SQLException {
        new Detail_OrderGet().inserDetailOrder(new Detail_Order(0, 0, 0, 0, 0));
    }

}
