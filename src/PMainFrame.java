
public class PMainFrame {

	private PLogin pLogin;
	
	public PMainFrame() {
		this.pLogin = new PLogin();
	}

	public void signUp() {
		this.pLogin.signUp();
	}
	
	public void logIn() {
		this.pLogin.logIn();
	}

}
