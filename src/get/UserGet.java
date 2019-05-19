package get;
import model.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;

public class UserGet {
	 public boolean insertUser(User u) throws SQLException{
	        Connection connection = ConnectToDatabase.getConnecttion();
	        String sql = "INSERT INTO users VALUES(?,?,?,?)";
	        try{
	            PreparedStatement ps = connection.prepareCall(sql);
	            ps.setLong(1, u.getIduse());
	            ps.setString(2, u.getMail());
	            ps.setString(3, u.getPassword());
	            ps.executeUpdate();
	            return true;
	        }catch(SQLException ex){
	            Logger.getLogger(UserGet.class.getName()).log(Level.SEVERE,null,ex);
	        }
	        return false;
	    } 
	    
	     public User login(String email, String password) throws SQLException {
	        Connection con = ConnectToDatabase.getConnecttion();
	        String sql = "select * from Uses where Name='" + email + "' and Password='" + password + "'";
	        PreparedStatement ps;
	        try {
	            ps = (PreparedStatement) con.prepareStatement(sql);
	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                User ad = new User();
	                ad.setIduse(rs.getLong("IdUse"));
	                ad.setMail(rs.getString("Mail"));
	                ad.setPassword(rs.getString("Password"));
	                con.close();
	                return ad;
	            }
	        } catch (SQLException e) {
	        }
	        return null;
	    }

}
