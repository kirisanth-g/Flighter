/**
 * 
 */
package Managers;

import android.annotation.SuppressLint;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import Phase2.Admin;
import Phase2.User;

/**
 * @author Kirisanth
 * 
 */
public class UserManager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7787663128962075738L;
	private Map<String, ArrayList<Object>> users;
	private String filePath;

	/**
	 * @throws IOException
	 * 
	 */
	public UserManager(File file) throws IOException {
		users = new HashMap<String, ArrayList<Object>>();

		// Populates the record list using stored data, if it exists.
		if (file.exists()) {
			readFromFile(file.getPath());
		} else {
			file.createNewFile();
		}
		filePath = file.getPath();
	}

	/**
	 * Adds record to this StudentManager.
	 * 
	 * @param record
	 *            a record to be added.
	 */
	public void add(User record, String pwd) {
		ArrayList<Object> info = new ArrayList<Object>();
		info.add(pwd);
		info.add(record);
		users.put(record.getEmail(), info);
	}

	public User checkLogIn(String username, String pwd) {
		if (users.containsKey(username)) {
			if (users.get(username).get(0) == pwd) {
				return (User) users.get(username).get(1);
			}
		}
		return null;
	}

	public void changeUsername(String OldUsername, String newUsername) {
		ArrayList<Object> info = users.get(OldUsername);
		users.remove(OldUsername);
		users.put(newUsername, info);
	}

	public void changePwd(String username, String newPwd) {
		users.get(username).set(0, newPwd);
	}

	// @Override
	// public String toString() {
	// String result = "";
	// for (User r : ((Map<String, ArrayList<Object>>) users.values()).get(1)) {
	// result += r.toString() + "\n";
	// }
	// return result;
	// }

	/**
	 * Writes the students to file at filePath.
	 * 
	 * @param filePath
	 *            the file to write the records to
	 */
	@SuppressLint("NewApi")
	public void saveToFile() {

		OutputStream file = null;
		OutputStream buffer = null;
		ObjectOutput output = null;

		try {
			file = new FileOutputStream(filePath);
			buffer = new BufferedOutputStream(file);
			output = new ObjectOutputStream(buffer);
			output.writeObject(users);
		} catch (IOException ex) {
			fLogger.log(Level.SEVERE,
					"Cannot perform output. File I/O failed.", ex);
		}
	}

	@SuppressLint("NewApi")
	@SuppressWarnings("unchecked")
	private void readFromFile(String path) {
		InputStream file = null;
		InputStream buffer = null;
		ObjectInput input = null;
		try{
			file = new FileInputStream(path);
			buffer = new BufferedInputStream(file);
			input = new ObjectInputStream(buffer);
			// deserialize the Map
			users = (Map<String, ArrayList<Object>>) input.readObject();
		} catch (ClassNotFoundException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform input. Class not found.",
					ex);
		} catch (IOException ex) {
			fLogger.log(Level.SEVERE, "Cannot perform input. File I/O failed.",
					ex);
		}
	}

	private static final Logger fLogger = Logger.getLogger(UserManager.class
			.getPackage().getName());

	public static void main(String[] args) {
		// File f = new
		// File("C:/Users/Kirisanth/School/CSCB07/group_0346/PIII/Flighter/users.txt");
		System.out.println("hi");
		// try {
		// //UserManager user = new UserManager(f);
		// //Admin ad = new Admin("lastName", "firstName", "email", "address",
		// "creditCardNum", "expireDate");
		// //user.add(ad, "admin");
		// //user.saveToFile();
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}

}
