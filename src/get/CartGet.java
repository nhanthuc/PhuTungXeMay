package get;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.ConnectToDatabase;
import model.Gio_hang;

public class CartGet {
	public Gio_hang getCart(long id) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Gio_Hang WHERE MaGio_Hang = '" + id + "'";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		Gio_hang c = new Gio_hang();
		while (rs.next()) {
			c.setMagiohang(rs.getLong("MaGio_Hang"));
			c.setName_guest(rs.getString("name_guest"));
			c.setTotal_money(rs.getDouble("Total_Money"));
			c.setDate(rs.getDate("Date"));
			c.setStatus(rs.getString("Status"));
			c.setSdt(rs.getString("SDT"));
			c.setDiachi(rs.getString("DiaChi"));
			}
		return c;
	}
	public boolean insert(Gio_hang c) throws SQLException {
	    try {
	         Connection connection = ConnectToDatabase.getConnecttion();
	         String sql = "INSERT INTO Gio_Hang VALUE(?,?,?,?,?,?,?)";
	         PreparedStatement ps = connection.prepareCall(sql);
	         ps.setLong(1, c.getMagiohang());
	         ps.setString(2, c.getName_guest());
	         ps.setDouble(3, c.getTotal_money());
	         ps.setDate(4, c.getDate());
	         ps.setString(5, c.getStatus());
	         ps.setString(6,c.getSdt());
	         ps.setString(7, c.getDiachi());
	         int temp = ps.executeUpdate();
	         return temp == 1;
	    } catch (Exception e) {
	         return false;
	    }
	}

	public boolean update(Gio_hang c) throws SQLException {
	    try {
	         Connection connection = ConnectToDatabase.getConnecttion();
	         String sql = "UPDATE Gio_Hang SET name_guest=?,Total_Money=?,Date=?,Status=?,SDT=?,DiaChi=? WHERE MaGio_Hang = ?";
	         PreparedStatement ps = connection.prepareCall(sql);
	         ps.setString(1, c.getName_guest());
	         ps.setDouble(2, c.getTotal_money());
	         ps.setDate(3, c.getDate());
	         ps.setString(4, c.getStatus());
	         ps.setString(5,c.getSdt());
	         ps.setString(6, c.getDiachi());
	         ps.setLong(7, c.getMagiohang());
	         int temp = ps.executeUpdate();
	         return temp == 1;
	    } catch (Exception e) {
	         return false;
	    }
	}

	public boolean delete(long id) throws SQLException {
	    try {
	        Connection connection = ConnectToDatabase.getConnecttion();
	        String sql = "DELETE FROM Gio_Hang WHERE MaGio_Hang = ?";
	        PreparedStatement ps = connection.prepareCall(sql);
	        ps.setLong(1, id);
	        int temp = ps.executeUpdate();
	            return temp == 1;
	    } catch (Exception e) {
	        return false;
	    }
	}
}
