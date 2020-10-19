package db;

import java.io.*;
import java.nio.file.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import business.PrsVendor;

public class VendorTextFile implements DAO<PrsVendor> {
	private List<PrsVendor> vendors = null;
	private Path vendorsPath = null;
	private File vendorsFile = null;
	private final String FIELD_SEP = "\t";

	public VendorTextFile() {
		vendorsPath = Paths.get("vendors.txt");
		vendorsFile = vendorsPath.toFile();
		vendors= getAll();
	}

//	@Override
//	public PrsVendor get(int Code) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	// get all actors from text file if our list is null
	@Override
	public List<PrsVendor> getAll() {
		if (vendors != null) {
			return vendors;
		}
		vendors = new ArrayList<>();
		if (Files.exists(vendorsPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(vendorsFile))) {
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
			
					
					PrsVendor v = new PrsVendor();
					vendors.add(v);
					line = in.readLine();
				}
			} catch (IOException ioe) {
				System.out.println(ioe);
				return null;
			}

		} else {
			System.out.println(vendorsPath.toAbsolutePath() + " doesn't exist.");
			return null;
		}

		return vendors;
	}

	@Override
	public boolean add(PrsVendor v) {
		vendors.add(v);
		return saveAll();
	}

//	@Override
//	public boolean update(PrsVendor v) {
//		// get old actor and remove it
//		PrsVendor oldPrsVendor = this.get(v.getCode());
//		int i = vendors.indexOf(oldPrsVendor);
//		vendors.remove(i);
//		vendors.add(i, v);
//		return saveAll();
//	}

	@Override
	public boolean delete(PrsVendor v) {
		vendors.remove(v);
		return saveAll();
	}
	
	private boolean saveAll() {
		// after every maintenance (add, update, delete) function,
		// rewrite the text file
		try (PrintWriter out = new PrintWriter(
				  			   new BufferedWriter(
				  			   new FileWriter(vendorsFile)))) {
			// write all actors in the list to the file
			for (PrsVendor v: vendors) {
				out.print(v.getCode()+FIELD_SEP);
				out.print(v.getName()+FIELD_SEP);
				out.print(v.getAddress()+FIELD_SEP);
				out.print(v.getCity()+FIELD_SEP);
				out.print(v.getState()+FIELD_SEP);
				out.print(v.getZip()+FIELD_SEP);
				out.print(v.getPhoneNumber()+FIELD_SEP);
				out.print(v.getEmail()+FIELD_SEP);
				
				
				
				
				
			}
			return true;
		}
		catch (IOException ioe) {
			System.out.println(ioe);
			return false;
		}
	}

	public PrsVendor getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrsVendor get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(PrsVendor t) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public User get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public boolean add(PrsVendor t) {
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
//	public boolean add(PrsVendor t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public boolean update(PrsVendor t) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	@Override
//	public boolean delete(PrsVendor t) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
