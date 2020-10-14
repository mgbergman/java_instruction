package ui;


import business.PrsLineItem;
import business.PrsProduct;
import business.PrsRequest;
import business.PrsUser;
import business.PrsVendor;

import db.DAO;

import db.UserDB;
import ui.console.Console;

public class PrsConsoleApp {

	private static DAO<PrsUser> userDAO = new UserDB();
	
	public static void main(String[] args) {
	
		System.out.println("Welcome to the PRS Console App");
		
		String command = "";		
		
			while (!command.equalsIgnoreCase("6")) {
				System.out.println();
				System.out.println("MENU"); 	
				System.out.println("1 - Add User     ");
				System.out.println("2 - Add Vendor     ");
				System.out.println("3 - Add Product     ");
				System.out.println("4 - Add Request   ");
				System.out.println("5 - Add LineItem   ");
				System.out.println("6 - Exit   ");
				System.out.println("7 - List Users");
				System.out.println();	
				
				command = Console.getString("Command?   ");
				
				switch (command) {
					case "1":
				
						int Id = Console.getInt("ID?");
						String UserName = Console.getString("User Name?                 ");
						String Password = Console.getString("Password?                  ");
						String FirstName = Console.getString("First Name?               ");
						String LastName = Console.getString("Last Name?                 ");
						String PhoneNumber = Console.getString("Phone Number            ");
						String Email = Console.getString("Email?                        ");
						String Reviewer = Console.getString("Reviewer?                  ");
						String Admin = Console.getString("Admin?                        ");
						
						
	//					PrsUser u = new PrsUser(Id, UserName, Password, FirstName, LastName, PhoneNumber, Email, Reviewer, Admin);
	//					userDAO.add(u);
						System.out.println("user Added!");
	//					System.out.println(u.toString());
						System.out.println();
						break;
		
				
					case "2":
						
						String Code = Console.getString("Code?                          ");
						String Name = Console.getString("Name?                          ");
						String Address = Console.getString("Address?                    ");
						String City = Console.getString("City?                          ");
						String State = Console.getString("State?                        ");
						String Zip = Console.getString("Zip?                            ");
						String VendPhoneNumber = Console.getString("Phone Number?       ");
						String VendEmail = Console.getString("Email?                    ");
						
						
						PrsVendor v = new PrsVendor(Code, Name, Address, City, State, Zip, VendPhoneNumber, VendEmail);
						System.out.println();
						System.out.println(v.toString());
				
						
				   break;
				
					case "3":
						
						int VendorID = Console.getInt("Vendor ID                         ");
						String PartNumber = Console.getString("Part Number?              ");
						String PartName = Console.getString("Name?                       ");
						Double Price = Console.getDouble("Price?                         ");
						String Unit = Console.getString("Unit?                           ");
						String PhotoPath = Console.getString("Photo Path?                ");
						
						
						PrsProduct p = new PrsProduct(VendorID, PartNumber, PartName, Price, Unit, PhotoPath);
						System.out.println();
						System.out.println(p.toString());
				
						
				  break;
				
				
					case "4":
						
						int UnitID = Console.getInt("User ID                                 ");
						String Description = Console.getString("Description?                 ");
						String Justification = Console.getString("Justification?             ");
						String DateNeeded = Console.getString("Date Needed?                  ");
						String DeliveryMode = Console.getString("Delivery Mode?              ");
						String Status = Console.getString("Status?                           ");
						Double Total = Console.getDouble("Total?                             ");
						String SubmittedDate = Console.getString("Date Submitted?            ");
						String ReasonForRejection = Console.getString("Reason for rejection? ");
						
						
						PrsRequest r = new PrsRequest(UnitID, Description, Justification, DateNeeded, DeliveryMode, Status,
														Total, SubmittedDate, ReasonForRejection);
						System.out.println();
						System.out.println(r.toString());
						
				  break;
				
			
				
					case "5":
						
						int LineItemID = Console.getInt("ID?                                   ");
						int RequestID = Console.getInt("Request ID?                            ");
						int ProductID = Console.getInt("Product ID?                            ");
						int Quantity = Console.getInt("Quantity?                               ");
						
						
						PrsLineItem l = new PrsLineItem(LineItemID, RequestID, ProductID, Quantity);
						System.out.println();
						System.out.println(l.toString());
				 
				 break;
				
					case "7":
						// List Actors
						System.out.println("List of all Users");
						for (PrsUser u: userDAO.getAll()) {
							if (u!=null) { 
								System.out.println(u.toString());
							}
						}
						System.out.println();
						break;
				 
				 
			
				}
			
			
		}

	}

}
