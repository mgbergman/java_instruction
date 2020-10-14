package ui;

import java.io.*;

import java.nio.file.*;


public class FileProcessingApp {

	public static void main(String[] args) throws IOException {
		System.out.println("processing files!");
		String dirString = "c:/temp/sub1/sub2";
		Path dirPath = Paths.get(dirString);
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			
		}
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		System.out.println("Bye");
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			
		}
		
		System.out.println(filePath.getFileName());
		System.out.println(filePath.toAbsolutePath());
		
		
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println(dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p: dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("        "+p.getFileName());
					
				}
//				else if (Files.isDirectory(dirPath));
//					System.out.println(p.getParent().toString());
//				
				
				
				Path productsPath = Paths.get("products.txt");
				File productsFile = productsPath.toFile();
				
				
				PrintWriter out = new PrintWriter(
								  new BufferedWriter(
								  new FileWriter(productsFile)));
				
				out.println("Java\tMurach's Java Programming\t57.50");
				out.close();
				
				BufferedReader in = new BufferedReader(
									new FileReader (productsFile));
				
				String line = in.readLine();
				System.out.println(line);
				
				
				
				
				
				
				
			}
			
		}
		
		
	
		
		
		
		
		
	}

}
