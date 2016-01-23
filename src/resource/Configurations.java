/**
 * 
 */
package resource;

/**
 * @author Team 3
 *
 *	This class is used to define some static configurations of the TFTP system
 */
public class Configurations {
	
	public static final String ROOT_FILE_DIRECTORY = System.getProperty("user.home") + "/TFTP-Storage-Folder";
	public static final int MAX_BUFFER = 512;
	public static final int ERROR_SIM_LISTEN_PORT = 0;  // Change this to something your Unix systems like
	public static final int SERVER_LISTEN_PORT = 0;		// Ditto line above
}
