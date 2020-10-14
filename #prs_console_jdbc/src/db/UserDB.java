package db;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import business.PrsUser;
import db.DAO;

public class UserDB implements DAO<PrsUser> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/prs?useSSL=false";
		String username = "root";
		String password = "Train@MAX";
		
		Connection conn = DriverManager.getConnection(
			dbURL, username, password);
		return conn;
		}

	@Override
	public PrsUser get(int id) {
		PrsUser u = null;
		String sql = "select * from actor where id = ?";
		
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
//	public PrsUser findByLastName(String lastName) {
//		List<PrsUser> users = new ArrayList<>();
//		String sql="select * from actor where lastName = ?";
//		try (Connection conn = getConnection();
//			PreparedStatement ps = conn.prepareStatement(sql);
//			ResultSet rs = ps.executeQuery(sql);) {			
//			while (rs.next()) {
//				PrsUser u = getUserfromResultSet(rs);
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
	
	
	public List<PrsUser> getAll() {
		List<PrsUser> users = new ArrayList<>();
		String sql="select * from user";
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);) {			
			while (rs.next()) {
				PrsUser u = getUserfromResultSet(rs);
				users.add(u);
			}	
		} catch (SQLException e) {
			System.out.println("error getting all actors");
			e.printStackTrace();
			users = null;
		}

		return users;
	}
	private PrsUser getUserfromResultSet(ResultSet rs) throws SQLException {
		int id= rs.getInt(1);
		String un = rs.getString(2);
		String pw = rs.getString(3);
		String fn = rs.getString(4);
		String ln = rs.getString(5);
		String pn = rs.getString(6);
		String em = rs.getString(7);
		String ir = rs.getString(8);
		String ia = rs.getString(9);
		
		PrsUser u = new PrsUser(id,un,pw,fn,ln,pn,em,ir,ia);
		return u;
	}
	
	
	@Override
	public boolean add(PrsUser u) {
		boolean success = false;
		String sql = "insert into actor (ID, UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setLong(1, u.getId());
			ps.setString(2, u.getUserName());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getFirstName());
			ps.setString(5, u.getLastName());
			ps.setString(6, u.getUserPhoneNumber());
			ps.setString(7, u.getUserEmail());
			ps.setString(8, u.getReviewer());
			ps.setString(9, u.getAdmin());
			ps.executeUpdate();
			success = true;
		
		} catch (SQLException e ) {
			System.out.println("error adding error");
			e.printStackTrace();
		}	
		return success;	
	}
	@Override
	public boolean update(PrsUser u) {
		
		boolean success = false;
		String sql = "update actor set "
				+ "firstName = ?,"
				+ "lastName = ?,"
				+ "gender = ?,"
				+ "birthdate = ?,"
				+ "where id = ?";
	
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, u.getUserName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getUserPhoneNumber());
			ps.setString(6, u.getUserEmail());
			ps.setString(7, u.getReviewer());
			ps.setString(7, u.getAdmin());
			ps.executeUpdate();
			success = true;	
			
		} catch (SQLException e ) {
			System.out.println("error updating error");
			e.printStackTrace();
		}			
		return success;
	}
	@Override
	public boolean delete(PrsUser u) {
		boolean success = false;
		String sql = "delete from actor "
				+ "where id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, u.getId());
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
//	public PrsUser get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean add(PrsUser t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean update(PrsUser t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean delete(PrsUser t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
