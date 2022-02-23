package Com.Locker;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Locker {
	
	public static String[] getFiles(String location)
	{
		File directoryPath = new File(location);
		String[] files = directoryPath.list();
		
		//Replace with sorting algorithm
		Arrays.sort(files);
		
		return files;
	}
	
	public static Boolean addFile(String location) throws IOException
	{
		//Creating a new File
		File f = new File(location);
		if(f.createNewFile())
		{
			System.out.println("Creating File.....");
		}
			
		else
		{
			System.out.println("File already exists..Using same file.....");
		}
		
				
		//Writing into File
		FileWriter fw = new FileWriter(location);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message you want to put in file: ");
		String msg = sc.nextLine();
		fw.write(msg);
		fw.close();

		return true;
	}
	
	public static Boolean deleteFile(String location)
	{
		File file = new File(location);
		if(file.delete())
		{
			System.out.println("Deleting File....");
		}
		else
		{
			System.out.println("File does not exist");
			return false;
		}
		return true;
	}
	
	public static Boolean searchFile(String location, String userFile)
	{
		File fs = new File(location+"\\"+userFile);
		if(fs.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to LockedMe.com...This is Developed by Veena Badgujar");
		System.out.println("..............................................................");
		while(true)
		{
			System.out.println("Choose one of the following options to continue: ");
			System.out.println("1. View all Files");
			System.out.println("2. Perform Business Operations");
			System.out.println("3. Close the Application");
			int choice = sc.nextInt();
	
			if(choice == 1)
			{
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the Location to view the Files");
				String fileLoc = input.nextLine();
				String[] file = getFiles(fileLoc);
				System.out.println();
				for(int i=0; i<file.length; i++)
				{
					System.out.println(file[i]);
				}
				System.out.println();
			}
			
			else if(choice == 2)
			{
				while(true)
				{
					
					System.out.println("Welcome to Business Operations which operation would you like to perform: ");
					System.out.println("1. Add File");
					System.out.println("2. Delete File");
					System.out.println("3. Search File");
					System.out.println("4. Go Back");
					
					Scanner scan = new Scanner(System.in);
					String opString = scan.next();
					int op = Integer.parseInt(opString);
					
					if(op == 1)
					{
						Scanner input = new Scanner(System.in);
						System.out.println("Enter the location where you want to Add New File: ");
						String location = input.nextLine();
						System.out.println("Enter the name of the file you want to Add:");
						String fileName = input.nextLine();
						Boolean fileAdded=false;
						try {
							fileAdded = addFile(location+"//"+fileName);
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.out.println();
						if(fileAdded == true)
						{
							System.out.println("File Added Successfully");
						}
						else
						{
							System.out.println("Due to some error File was not Added");
						}
						System.out.println();
					}
					
					else if(op == 2)
					{
						Scanner input = new Scanner(System.in);
						System.out.println("Enter the location from where you want to delete the file: ");
						String location = input.nextLine();
						System.out.println("Enter the name of the file you want to delete: ");
						String fName = input.next();
						System.out.println();
						
						Boolean fileDeleted = deleteFile(location+"\\"+fName);
						
						if(fileDeleted == true)
						{
							System.out.println("File "+fName+" Deleted Successfully");
						}
						else
						{
							System.out.println("Error Occured..File does not exist");
						}
						System.out.println();
					}
					
					else if(op == 3)
					{
						Scanner input = new Scanner(System.in);
						System.out.println("Enter the location where you want to search the file: ");
						String location = input.nextLine();
						System.out.println("Enter the name of the file you are searching for: ");
						String fileName = input.next();
						System.out.println();
						
						Boolean search = searchFile(location,fileName);
						
						if(search == true)
						{
							System.out.println("File "+fileName+" is present in "+location);
						}
						else
						{
							System.out.println("File "+fileName+" does not exist in "+location);
						}
						System.out.println();
					}
					
					else if(op == 4)
					{
						break;
					}
					
					else
					{
						System.out.println("Invalid Input");
						System.out.println();
					}
				}
				System.out.println();
			}
			
			else if(choice == 3)
			{
				System.out.println("Thank You for using LockedMe.com...Hope to see you soon...");
				break;
			}
			
			else
			{
				System.out.println("Invalid Input");
				System.out.println();
			}
		}
	}

}

