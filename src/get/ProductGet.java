package get;

import model.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

public class ProductGet {
	public ArrayList<Product> getListProductByNav(long groupID, int firstResult, int maxResult) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product WHERE Group_Product_Id = '" + groupID + "' limit ?,?";
		PreparedStatement ps = connection.prepareCall(sql);
		ps.setInt(1, firstResult);
		ps.setInt(2, maxResult);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {
			Product product = new Product();
			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			list.add(product);
		}
		return list;
	}

	public int countProductByCategory(long group_Product_Id) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT count(Id_SP) FROM Product WHERE Group_Product_Id = '" + group_Product_Id + "'";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	public ArrayList<Product> getListProductByCategory(long group_Product_Id) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product WHERE Group_Product_Id = '" + group_Product_Id + "'";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {

			Product product = new Product();

			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			list.add(product);
		}
		return list;
	}

	public ArrayList<Product> getList3ProductByCategory(long group_Product_Id) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product WHERE Group_Product_Id = '" + group_Product_Id + "' LIMIT 3;";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {

			Product product = new Product();

			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			list.add(product);
		}
		return list;
	}

	public ArrayList<Product> getListProductByBrand(long companyId) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product WHERE CompanyId = '" + companyId + "'";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {

			Product product = new Product();

			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			list.add(product);
		}
		return list;
	}

	public ArrayList<Product> getListProductRelated(long group_Product_Id, long id_SP) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product WHERE Group_Product_Id = '" + group_Product_Id + "' and Id_SP != '" + id_SP
				+ "'";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {

			Product product = new Product();

			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			list.add(product);
		}
		return list;
	}

	public ArrayList<Product> getListProduct() throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		ArrayList<Product> list = new ArrayList<>();
		while (rs.next()) {
			Product product = new Product();

			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			list.add(product);
		}
		return list;
	}

//Hiển thị chi tiết sản phẩm

	public Product getProduct(long productID) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "SELECT * FROM Product WHERE Id_SP = '" + productID + "'";
		PreparedStatement ps = connection.prepareCall(sql);
		ResultSet rs = ps.executeQuery();
		Product product = new Product();
		while (rs.next()) {
			product.setId_sp(rs.getLong("Id_SP"));
			product.setNameproduct(rs.getString("NameProduct"));
			product.setPrice(rs.getDouble("Price"));
			product.setImage(rs.getBytes("Image"));
			product.setCompanyid(rs.getLong("CompanyId"));
			product.setDate(rs.getDate("Date"));
			product.setStatus(rs.getString("Status"));
			product.setGroup_product_id(rs.getLong("Group_Product_Id"));
			product.setDetail(rs.getString("Detail"));
			}
		return product;
	}
	public boolean insertProduct(Product c) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "INSERT INTO Product VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getId_sp());
			ps.setString(2, c.getNameproduct());
			ps.setDouble(3, c.getPrice());
			ps.setBytes(4, c.getImage());
			ps.setDate(5, c.getDate());
			ps.setString(6, c.getStatus());
			ps.setLong(7, c.getGroup_product_id());
			ps.setString(8, c.getDetail());
			ps.setLong(9, c.getCompanyid());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(ProductGet.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	// cập nhật dữ liệu
	public boolean updateProduct(Product c) throws SQLException {

		Connection connection = ConnectToDatabase.getConnecttion();
		// String sql = "UPDATE product SET id_SP = ?, group_Product_Id = ?,
		// product_name = ?, product_image = ?, product_image_forward = ?,
		// product_image_back = ?, product_price = ?, product_description = ? WHERE
		// id_SP = ?";
		String sql = "UPDATE Product SET Id_SP=?, NameProduct=?, Price=?, Image=?, Date=?, Status=?, Group_Product_Id=?, Detail=? CompanyId=? WHERE Id_SP = ?";

		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, c.getId_sp());
			ps.setString(2, c.getNameproduct());
			ps.setDouble(3, c.getPrice());
			ps.setBytes(4, c.getImage());
			ps.setDate(5, c.getDate());
			ps.setString(6, c.getStatus());
			ps.setLong(7, c.getGroup_product_id());
			ps.setString(8, c.getDetail());
			ps.setLong(9, c.getCompanyid());
			ps.setLong(10, c.getId_sp());
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(ProductGet.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	// xóa dữ liệu
	public boolean deleteProduct(long id_SP) throws SQLException {
		Connection connection = ConnectToDatabase.getConnecttion();
		String sql = "DELETE FROM product WHERE Id_SP = ?";
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ps.setLong(1, id_SP);
			return ps.executeUpdate() == 1;
		} catch (SQLException ex) {
			Logger.getLogger(ProductGet.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}

	public static void main(String[] args) throws SQLException {
		ProductGet get = new ProductGet();
		// for(Product p : get.getListProductByCategory(2)){
		// System.out.println(p.getProductID() + " - "+p.getProductName());}

		System.out.println(get.getProduct(1).getNameproduct());
	}
}
