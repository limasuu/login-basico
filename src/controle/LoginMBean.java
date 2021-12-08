package controle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelo.Login;

@ManagedBean
@SessionScoped
public class LoginMBean {
	
	private Login login;
	
	public LoginMBean (){
		
		login= new Login();
	}
	
	public String logar() {
		
		return "/boas-vindas.jsf";
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}
}
