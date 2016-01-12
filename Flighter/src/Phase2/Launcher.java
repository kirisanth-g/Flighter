/**
 * 
 */
package Phase2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Managers.UserManager;

/**
 * ASSUMING THE FILE FORMAT IS: username,password
 * for each of the users.
 * @author Helen
 *
 */
public class Launcher {
	
	private static ArrayList<ArrayList<String>> userdata;
	private static UserManager manager;
	private static Admin admin = new Admin("Steve", "David", "admin@flighter.com", "123 Hello Rd", "10001010010", "2015-03-21");
	private static Client client = new Client("Bobby", "McCoy", "exampleclient@flighter.com", "123 Hello Rd", "10001010010", "2015-03-21");
	private static Map<User, String> LOGIN_INFO;
	/**
	 * read username/pw file
	 * 
	 */
	//TODO: Ask about Constructor
	public Launcher(File path) throws FileNotFoundException {
		LOGIN_INFO = new HashMap<User, String>();		
		LOGIN_INFO.put(admin, "iampowerful");
		LOGIN_INFO.put(client, "iamgettingrippedoff");
		try {
			manager = new UserManager(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userdata = new ArrayList<ArrayList<String>> ();
		readFile(path.getPath());
		
	}
	
	/**
	 * 
	 */
	public ArrayList<ArrayList<String>> getUserData() {
		return userdata;
	}
	
	/**
	 * @param path The path of the file which holds the usernames and passwords
	 * @return An ArrayList that holds and ArrayList that contains a user's
	 * username and password.
	 */
	private static ArrayList<ArrayList<String>> readFile (String path) {
		Scanner reader = new Scanner(path);
		while (reader.hasNext()) {
			String line = reader.nextLine();
			userdata.add(new ArrayList<String>(Arrays.asList(line.split(String
					.valueOf(',')))));
		}
		reader.close();
		return userdata;
	}
	
	
	/**
	 * closes and saves data
	 */
	public void close() {
		manager.saveToFile();
	}
	
	
	public User checkUser(String email, String password) {
		for(User user: LOGIN_INFO.keySet()){
			if(user.getEmail().equals(email) && LOGIN_INFO.get(user).equals(password)){
				return user;
			}
		}
		return null;
	}
}
