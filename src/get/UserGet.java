package get;
import model.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

public class UserGet {
	 public ArrayList<User> getListUser() throws SQLException {
	        Connection connection = ConnectToDatabase.getConnecttion();
	        String sql = "SELECT * FROM uses";
	        PreparedStatement ps = connection.prepareCall(sql);
	        ResultSet rs = ps.executeQuery();
	        ArrayList<User> list = new ArrayList<>();
	        while (rs.next()) {
	            User user = new User();
	           user.setIduse(rs.getLong("IdUse"));
	           user.setUsename(rs.getString("UseName"));
	           user.setMail(rs.getString("Mail"));
	           user.setPassword(rs.getString("Password"));
	           user.setSdt(rs.getString("SDT"));
	           user.setGioitinh(rs.getNString("Gioi_tinh"));
	           user.setDia_chi(rs.getString("Dia_Chi"));
	           user.setStatus(rs.getString("Status"));
	           user.setName(rs.getString("Name"));
	           list.add(user);
	        }
	        return list;
	    }
	   
	    
	    public boolean checkEmail(String name) throws SQLException{
	    Connection connection = ConnectToDatabase.getConnecttion();
	    String sql = "SELECT * FROM uses WHERE UseName = '" + name + "'";
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
	    public boolean insertUser(User u) throws SQLException {
	        Connection connection = ConnectToDatabase.getConnecttion();
	        String sql = "INSERT INTO uses VALUES(?,?,?,?,?)";
	        try {
	            PreparedStatement ps = connection.prepareCall(sql);
	            ps.setLong(1, u.getIduse());
	            ps.setString(2, u.getUsename());
	            ps.setString(3, u.getMail());
	            ps.setString(4, u.getPassword());
	            ps.setString(5, u.getSdt());
	            ps.executeUpdate();
	            return true;
	        } catch (SQLException ex) {
	            Logger.getLogger(UserGet.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return false;
	    }
	   
	     public User login(String name, String password) throws SQLException {
	        Connection con = ConnectToDatabase.getConnecttion();
	        String sql = "select * from uses where UseName='" + name + "' and Password='" + password + "'";
	        PreparedStatement ps;
	        try {
	            ps = (PreparedStatement) con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                User u = new User();
	                u.setIduse(rs.getLong("IdUse"));
	 	           	u.setUsename(rs.getString("UseName"));
	                u.setPassword(rs.getString("Password"));
	                con.close();
	                return u;
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	     
	     public User getUser(long userID) throws SQLException {
	     Connection connection = ConnectToDatabase.getConnecttion();
	     String sql = "SELECT * FROM uses WHERE IdUse = '" + userID + "'";
	     PreparedStatement ps = connection.prepareCall(sql);
	     ResultSet rs = ps.executeQuery();
	     User user = new User();
	     while (rs.next()) {
	         
	          
	           user.setIduse(rs.getLong("IdUse"));
	           user.setUsename(rs.getString("UseName"));
	           user.setMail(rs.getString("Mail"));
	           user.setPassword(rs.getString("Password"));
	           user.setSdt(rs.getString("SDT"));
	           
	     }
	     return user;
	}
	     public boolean updateUser(User u) throws SQLException {
	        
	        Connection connection = ConnectToDatabase.getConnecttion();
	       // String sql = "UPDATE product SET product_id = ?, category_id = ?, product_name = ?, product_image = ?, product_image_forward = ?, product_image_back = ?, product_price = ?, product_description = ? WHERE product_id = ?";
	        String sql = "UPDATE uses SET IdUse=?, UseName=?, Mail=?, Password=?,  SDT=? WHERE IdUse = ?";
	        
	        try {
	            PreparedStatement ps = connection.prepareCall(sql);
	         	ps.setLong(1, u.getIduse());
	            ps.setString(2, u.getUsename());
	            ps.setString(3, u.getMail());
	            ps.setString(4, u.getPassword());
	            ps.setString(5, u.getSdt());
	            ps.setLong(6, u.getIduse());
	            return ps.executeUpdate() == 1;
	        } catch (SQLException ex) {
	            Logger.getLogger(UserGet.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return false;
	    }

}
