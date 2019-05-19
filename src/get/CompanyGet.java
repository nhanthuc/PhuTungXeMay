package get;
import model.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Company;

public class CompanyGet {
	public ArrayList<Company> getListCompany() throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
        String sql = "SELECT * FROM Company";
        PreparedStatement ps = connection.prepareCall(sql);
        ResultSet rs = ps.executeQuery();
        ArrayList<Company> list = new ArrayList<>();
        while (rs.next()) {
            Company company = new Company();
            company.setId(rs.getLong("CompanyId"));
           company.setName(rs.getString("Name"));
           company.setAddress(rs.getString("Address"));
           company.setPhone(rs.getString("Phone"));
           company.setFax(rs.getString("Fax"));
           list.add(company);
        }
        return list;
	}
	public boolean insertCompany(Company c) throws SQLException {
        Connection connection = ConnectToDatabase.getConnecttion();
        String sql = "INSERT INTO Company VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, c.getId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getAddress());
            ps.setString(4, c.getPhone());
            ps.setString(5, c.getFax());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
	public Company getCompany(long id) throws SQLException {
	     Connection connection = ConnectToDatabase.getConnecttion();
	     String sql = "SELECT * FROM Company WHERE Name = '" + id + "'";
	     PreparedStatement ps = connection.prepareCall(sql);
	     ResultSet rs = ps.executeQuery();
	     Company company = new Company();
	     while (rs.next()) {
	         company.setId(rs.getLong("CompanyId"));
	           company.setName(rs.getString("Name"));
	           company.setAddress(rs.getString("Address"));
	           company.setPhone(rs.getString("Phone"));
	           company.setFax(rs.getString("Fax"));
	           }
	     return company;
	}
	public boolean updateCompany(Company c) throws SQLException {
        
        Connection connection = ConnectToDatabase.getConnecttion();
       // String sql = "UPDATE product SET product_id = ?, category_id = ?, product_name = ?, product_image = ?, product_image_forward = ?, product_image_back = ?, product_price = ?, product_description = ? WHERE product_id = ?";
        String sql = "UPDATE Company SET CompanyId=?, Name=?, Address=?, Phone=?, Fax=? WHERE Name = ?";
        
        try {
            PreparedStatement ps = connection.prepareCall(sql);
            ps.setLong(1, c.getId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getAddress());
            ps.setString(4, c.getPhone());
            ps.setString(5, c.getFax());
            return ps.executeUpdate() == 1;
        } catch (SQLException ex) {
            Logger.getLogger(CompanyGet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
	public boolean deleteCompany(String name) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "DELETE FROM Company WHERE CompanyId = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setString(1, name);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(CompanyGet.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

}
