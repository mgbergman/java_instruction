package db;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import business.PrsVendor;
import db.DAO;

public class VendorDB implements DAO<PrsVendor> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false";
		String username = "root";
		String password = "Train@MAX";
		
		Connection conn = DriverManager.getConnection(
			dbURL, username, password);
		return conn;
		}

	@Override
	public PrsVendor get(int id) {
		PrsVendor u = null;
		String sql = "select * from user where id = ?";
		
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = getUserfromResultSet(rs);
			}
			
		} catch (SQLException e ) {
			e.printStackTrace();
		}				
		return u;
	}
//	public PrsVendor findByLastName(String lastName) {
//		List<PrsVendor> users = new ArrayList<>();
//		String sql="select * from actor where lastName = ?";
//		try (Connection conn = getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery(sql);) {			
//			while (rs.next()) {
//				PrsVendor u = getUserfromResultSet(rs);
//				users.add(u);
//			}	
//		} catch (SQLException e) {
//			System.out.println("error getting all actors");
//			e.printStackTrace();
//			users = null;
//		}
//
//		return users;
//	}
	
	
	public List<PrsVendor> getAll() {
		List<PrsVendor> users = new ArrayList<>();
		String sql="select * from vendor";
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);) {			
			while (rs.next()) {
				PrsVendor u = getUserfromResultSet(rs);
				users.add(u);
			}	
		} catch (SQLException e) {
			System.out.println("error getting all actors");
			e.printStackTrace();
			users = null;
		}

		return users;
	}
	private PrsVendor getUserfromResultSet(ResultSet rs) throws SQLException {
		String code= rs.getString(1);
		String nm = rs.getString(2);
		String ad = rs.getString(3);
		String ci = rs.getString(5);
		String st = rs.getString(6);
		String zi = rs.getString(7);
		String pn = rs.getString(8);
		String em = rs.getString(9);
		
		PrsVendor v = new PrsVendor(code,nm,ad, ci, st,zi,pn,em);
		return v;
	}
	
	
	@Override
	public boolean add(PrsVendor v) {
		boolean success = false;
		String sql = "insert into vendor (Name, Address, City, State, Zip, PhoneNumber, Email) "
				+ "values (?, ?, ?, ?, ?, ?, ?)";
	
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, v.getName());
			ps.setString(2, v.getAddress());
			ps.setString(3, v.getCity());
			ps.setString(4, v.getState());
			ps.setString(5, v.getZip());
			ps.setString(6, v.getPhoneNumber());
			ps.setString(7, v.getEmail());
		
			ps.executeUpdate();
			success = true;
		
		} catch (SQLException e ) {
			System.out.println("error adding error");
			e.printStackTrace();
		}	
		return success;	
	}
	@Override
	public boolean update(PrsVendor v) {
		
		boolean success = false;
		String sql = "update actor set "
				+ "firstName = ?,"
				+ "lastName = ?,"
				+ "gender = ?,"
				+ "birthdate = ?,"
				+ "where id = ?";
	
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, v.getName());
			ps.setString(2, v.getAddress());
			ps.setString(3, v.getCity());
			ps.setString(4, v.getState());
			ps.setString(5, v.getZip());
			ps.setString(6, v.getPhoneNumber());
			ps.setString(7, v.getEmail());
			ps.executeUpdate();
			success = true;	
			
		} catch (SQLException e ) {
			System.out.println("error updating error");
			e.printStackTrace();
		}			
		return success;
	}
	@Override
	public boolean delete(PrsVendor v) {
		boolean success = false;
		String sql = "delete from vendor "
				+ "where id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, v.getCode());
			ps.executeUpdate();
			success = true;			
			
		} catch (SQLException e ) {
			System.out.println("error deleting actor");
			e.printStackTrace();
		}			
		return success;
	
	}

//	@Override
//	public db.Actor get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public User get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean add(User t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean update(User t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean delete(User t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public PrsVendor get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean add(PrsVendor t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean update(PrsVendor t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean delete(PrsVendor t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
