package db;

import java.sql.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.Actor;
import business.Movie;
import db.DAO;

public class MovieDB implements DAO<Movie> {
	
	private Connection getConnection() throws SQLException {
		String dbURL = "jdbc:mysql://localhost:3306/bmdb?useSSL=false";
		String username = "bmdb_user";
		String password = "sesame";
		
		Connection conn = DriverManager.getConnection(
			dbURL, username, password);
		return conn;
		}

	@Override
	public Movie get(int id) {
		Movie m = null;
		String sql = "select * fron movie where id = ?";
		
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				m = getMoviefromResultSet(rs);
			}
			
		} catch (SQLException e ) {
			e.printStackTrace();
		}				
		return m;
	}

	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		String sql="select * from movie;";
		try (Connection conn = getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery(sql);) {			
			while (rs.next()) {
				Movie m = getMoviefromResultSet(rs);
				movies.add(m);
			}	
		} catch (SQLException e) {
			System.out.println("error getting all actors");
			e.printStackTrace();
			movies = null;
		}

		return movies;
	}
	private Movie getMoviefromResultSet(ResultSet rs) throws SQLException {
		int id= rs.getInt(1);
		String mt = rs.getString(2);
		String my = rs.getString(3);
		String mr = rs.getString(4);
		String md = rs.getString(5);
		
		Movie m = new Movie(id,mt,my,mr,md);
		return m;
	}
	@Override
	public boolean add(Movie m) {
		boolean success = false;
		String sql = "insert into movie values "
				+ "(?, ?, ?, ?, ?)";
	
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			ps.setString(2, m.getTitle());
			ps.setString(3, m.getYear());
			ps.setString(4, m.getRating());
			ps.setString(5, m.getDirector());
			ps.executeUpdate();
			success = true;
		
		} catch (SQLException e ) {
			System.out.println("error adding error");
			e.printStackTrace();
		}	
		return success;	
	}
//	@Override
	public boolean update(Movie m) {
		boolean success = false;
		String sql = "update movie set "
				+ "title = ?,"
				+ "year = ?,"
				+ "birthdate = ?,"
				+ "director = ?,"
				+ "where id = ?";
	
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.setInt(5, m.getId());
			ps.executeUpdate();
			success = true;	
			
		} catch (SQLException e ) {
			System.out.println("error updating error");
			e.printStackTrace();
		}			
		return success;
	}
	@Override
	public boolean delete(Movie m) {
		boolean success = false;
		String sql = "delete from movie "
				+ "where id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			ps.executeUpdate();
			success = true;			
			
		} catch (SQLException e ) {
			System.out.println("error deleting actor");
			e.printStackTrace();
		}			
		return success;
	
	}

//	@Override
	
	}

//	@Override
//	public boolean add(Movie t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean update(Movie t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean delete(Movie t) {
//		// TODO Auto-generated method stub
//		return false;
//	}


