package get;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.ConnectToDatabase;
import model.Customers;

public class CustomerGet {
	 public ArrayList<Customers> getListUser() throws SQLException {
	        Connection connection = ConnectToDatabase.getConnecttion();
	        String sql = "SELECT * FROM Custumers";
	        PreparedStatement ps = connection.prepareCall(sql);
	        ResultSet rs = ps.executeQuery();
	        ArrayList<Customers> list = new ArrayList<>();
	        while (rs.next()) {
	        	Customers customer = new Customers();
	        	customer.setId(rs.getLong("Id"));
	        	customer.setName(rs.getString("Name"));
	        	customer.setBirth(rs.getDate("BirthDay"));
	        	customer.setProvince(rs.getString("province"));
	        	customer.setAddress(rs.getString("Address"));
	        	customer.setTel(rs.getString("Tel"));
	        	customer.setEmail(rs.getString("mail"));
	        	customer.setPassword(rs.getString("Password"));
	        	
	           
	        
	           
	           list.add(customer);
	        }
	        return list;
	    }
	   
	    
	    public boolean checkEmail(String name) throws SQLException{
	    Connection connection = ConnectToDatabase.getConnecttion();
	    String sql = "SELECT * FROM Custumers WHERE Name = '" + name + "'";
	    PreparedStatement ps;
	    try {
	        ps = connection.prepareCall(sql);
	        ResultSet rs = ps.executeQuery();
	        while(rs.next()){
	            connection.close();
	            return true;
	        }
	    } catch (SQLException ex) {
	        Logger.getLogger(UserGet.class.getName()).log(Level.SEVERE,null, ex);
	    }
	    return false;
	    }
	    public boolean insertUser(Customers u) throws SQLException {
	        Connection connection = ConnectToDatabase.getConnecttion();
	        String sql = "INSERT INTO Custumers VALUES(?,?,?,?,?)";
	        try {
	            PreparedStatement ps = connection.prepareCall(sql);
	            ps.setLong(1, u.getId());
	            ps.setString(2,u.getName());
	            ps.setString(3, u.getEmail());
	            ps.setString(4, u.getPassword());
	            ps.setString(4, u.getTel());
	            ps.executeUpdate();
	            return true;
	        } catch (SQLException ex) {
	            Logger.getLogger(UserGet.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return false;
	    }
	   
	     public Customers login(String name, String password) throws SQLException {
	        Connection con = ConnectToDatabase.getConnecttion();
	        String sql = "select * from Custumers where Name='" + name + "' and Password='" + password + "'";
	        PreparedStatement ps;
	        try {
	            ps = (PreparedStatement) con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                Customers u = new Customers();
	                u.setId(rs.getLong("Id"));
	                u.setName(rs.getString("Name"));
	 	           	u.setPassword(rs.getString("Password"));
	                con.close();
	                return u;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	     
	     public Customers getCustomers(long userID) throws SQLException {
	     Connection connection = ConnectToDatabase.getConnecttion();
	     String sql = "SELECT * FROM Customers WHERE Id = '" + userID + "'";
	     PreparedStatement ps = connection.prepareCall(sql);
	     ResultSet rs = ps.executeQuery();
	     Customers user = new Customers();
	     while (rs.next()) {
	         
	          	user.setId(rs.getLong("Id"));
	          	user.setId(rs.getLong("Id"));
	          	user.setName(rs.getString("UseName"));
	          	user.setEmail(rs.getString("Mail"));
	          	user.setPassword(rs.getString("Password"));
	          	user.setTel(rs.getString("Tel"));
	           
	     }
	     return user;
	}
	     public boolean updateUser(Customers u) throws SQLException {
	        
	        Connection connection = ConnectToDatabase.getConnecttion();
	       // String sql = "UPDATE product SET product_id = ?, category_id = ?, product_name = ?, product_image = ?, product_image_forward = ?, product_image_back = ?, product_price = ?, product_description = ? WHERE product_id = ?";
	        String sql = "UPDATE Custumers SET Id=?, Name=?, Email=?, Password=?,  Tel=? WHERE Id = ?";
	        
	        try {
	            PreparedStatement ps = connection.prepareCall(sql);
	         	ps.setLong(1, u.getId());
	            ps.setString(2, u.getName());
	            ps.setString(3, u.getEmail());
	            ps.setString(4, u.getPassword());
	            ps.setString(5, u.getTel());
	            return ps.executeUpdate() == 1;
	        } catch (SQLException ex) {
	            Logger.getLogger(UserGet.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return false;
	    }
}
