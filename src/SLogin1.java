
public class SLogin1 {
	
	private EAccount1 eAccount;
	public SLogin1() {
		this.eAccount = new EAccount1();
	}

	public VLogin1 login(String id, String password) {
		VLogin1 vLogin = this.eAccount.getLogin(id, password);
		return vLogin;
	}

}
