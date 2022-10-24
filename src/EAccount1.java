import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EAccount1 {

	private String id;
	private String password;
	private String name;
	// ...
	
	public EAccount1() {
	}

	public VLogin1 getLogin(String id, String password) {
		VLogin1 vLogin = null;
		try {
			File file = new File("data/account");
			Scanner scanner = new Scanner(file);
			// file read
			boolean found = false;
			while (scanner.hasNext() && !found) {
				this.id = scanner.next();
				this.password = scanner.next();
				this.name = scanner.next();
				
				if (this.id.compareTo(id) == 0 && this.password.compareTo(password)==0) {
					found = true;
				}
			}
			scanner.close();
			
			if (found) {
				vLogin = new VLogin1();
				vLogin.setId(this.id);
				vLogin.setPassword(this.password);
				vLogin.setName(this.name);
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return vLogin;
	}

}
