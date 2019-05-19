package get;

import model.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.GroupProduct;


public class GroupProductGet {
	public ArrayList<GroupProduct> getListCategory() throws SQLException {
        Connection connection = ConnectToDatabase.getConnecttion();
        String sql = "SELECT * FROM GroupProduct";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<GroupProduct> list = new ArrayList<>();
        while (rs.next()) {
            GroupProduct groupProduct = new GroupProduct();
            groupProduct.setIdgroupproduct(rs.getLong("IdGroupProduct"));
            groupProduct.setNamegroup(rs.getString("NameGroup"));
            groupProduct.setImage(rs.getBytes("Image"));
            groupProduct.setStatus(rs.getString("Status"));
            list.add(groupProduct);
        }
        return list;
    }
    
    
    public GroupProduct getCategory(long id) throws SQLException {
        Connection connection = ConnectToDatabase.getConnecttion();
        String sql =  "SELECT * FROM GroupProduct WHERE IdGroupProduct = '" + id + "'";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        GroupProduct groupProduct = new GroupProduct();
        while (rs.next()) {
        	groupProduct.setIdgroupproduct(rs.getLong("IdGroupProduct"));
            groupProduct.setNamegroup(rs.getString("NameGroup"));
            groupProduct.setImage(rs.getBytes("Image"));
            groupProduct.setStatus(rs.getString("Status"));
            
        }
        return groupProduct;
    }
    

public boolean insert(GroupProduct c) throws SQLException {
    try {
         Connection connection = ConnectToDatabase.getConnecttion();
         String sql = "INSERT INTO GroupProduct VALUE(?,?,?,?)";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setLong(1, c.getIdgroupproduct());
         ps.setString(2, c.getNamegroup());
         ps.setBytes(3, c.getImage());
         ps.setString(4, c.getStatus());
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (Exception e) {
         return false;
    }
}

public boolean update(GroupProduct c) throws SQLException {
    try {
         Connection connection = ConnectToDatabase.getConnecttion();
         String sql = "UPDATE GroupProduct SET NameGroup = ?, Image=?, Status=? WHERE IdGroupProduct = ?";
         PreparedStatement ps = connection.prepareCall(sql);
         ps.setString(1, c.getNamegroup());
         ps.setBytes(2, c.getImage());
         ps.setString(3, c.getStatus());
         ps.setLong(4, c.getIdgroupproduct());
         int temp = ps.executeUpdate();
         return temp == 1;
    } catch (Exception e) {
         return false;
    }
}

public boolean delete(long IdGroupProduct) throws SQLException {
    try {
        Connection connection = ConnectToDatabase.getConnecttion();
        String sql = "DELETE FROM GroupProduct WHERE IdGroupProduct = ?";
        PreparedStatement ps = connection.prepareCall(sql);
        ps.setLong(1, IdGroupProduct);
        int temp = ps.executeUpdate();
            return temp == 1;
    } catch (Exception e) {
        return false;
    }
}


    public static void main(String[] args)throws SQLException {
        GroupProductGet get = new GroupProductGet();
        for(GroupProduct ds : get.getListCategory()){
        System.out.println(ds.getIdgroupproduct() + " - "+ds.getNamegroup());
       }
    }
}
