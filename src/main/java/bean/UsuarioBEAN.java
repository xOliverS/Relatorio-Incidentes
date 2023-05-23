package bean;

import javax.faces.bean.ManagedBean;

import dao.UsuarioDAO;
import entities.Usuario;

import static util.MessageUTIL.*;

@ManagedBean
public class UsuarioBEAN {
	
	private String login;
	private String senha;
	private Usuario usuario = new Usuario();
	
	public String salvar() {
		
		try {
			UsuarioDAO.salvar(usuario);
			sucesso("Sucesso", "Usuário salvo com sucesso");
			usuario = new Usuario();
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar" + e);
		}
		return null;
	}
	
	public String userAutentication() {
		usuario = UsuarioDAO.findUser(login, senha);
		
		if(usuario != null) {
			return "/pages/listing/icident_log.xhtml?faces-redirect=true";
		}else {
			System.out.println("Usuário não existe");
		}
		return null;
	}
	
	public String logout() {
		System.out.println("oi");
		return "../index.xhtml?faces-redirect=true";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
