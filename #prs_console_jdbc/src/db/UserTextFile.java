package db;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import business.PrsUser;

public class UserTextFile implements DAO<PrsUser> {
	private List<PrsUser> users = null;
	private Path usersPath = null;
	private File usersFile = null;
	private final String FIELD_SEP = "\t";

	public UserTextFile() {
		usersPath = Paths.get("users.txt");
		usersFile = usersPath.toFile();
		users = getAll();
	}

	@Override
	public PrsUser get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	// get all actors from text file if our list is null
	@Override
	public List<PrsUser> getAll() {
		if (users != null) {
			return users;
		}
		users = new ArrayList<>();
		if (Files.exists(usersPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(usersFile))) {
				// read actors from file into our list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);
					String idStr = fields[0];
					int id = Integer.parseInt(idStr);
					String userName = fields[1];
					String firstName = fields[2];
					String lastName = fields[3];
					String phoneNumber = fields[4];
					String eMail = fields[5];
					String reviewer = fields[6];
					String admin = fields[7];
			
					
					PrsUser u = new PrsUser();
					users.add(u);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(usersPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return users;
	}

	@Override
	public boolean add(PrsUser u) {
		users.add(u);
		return saveAll();
	}

	@Override
	public boolean update(PrsUser u) {
		// get old actor and remove it
		PrsUser oldPrsUser = this.get(u.getId());
		int i = users.indexOf(oldPrsUser);
		users.remove(i);
		users.add(i, u);
		return saveAll();
	}

	@Override
	public boolean delete(PrsUser u) {
		users.remove(u);
		return saveAll();
	}
	
	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(
				  			   new BufferedWriter(
				  			   new FileWriter(usersFile)))) {
			// write all actors in the list to the file
			for (PrsUser u: users) {
				out.print(u.getId()+FIELD_SEP);
				out.print(u.getFirstName()+FIELD_SEP);
				out.print(u.getLastName()+FIELD_SEP);
				out.print(u.getId()+FIELD_SEP);
				out.print(u.getFirstName()+FIELD_SEP);
				out.print(u.getLastName()+FIELD_SEP);
				
				
				
				
				
			}
			return true;
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	public PrsUser getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public User get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean add(PrsUser t) {
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
//	public User get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean add(PrsUser t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean update(PrsUser t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean delete(PrsUser t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
