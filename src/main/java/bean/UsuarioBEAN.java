package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.DenunciaDAO;
import dao.UsuarioDAO;
import entities.Usuario;

import static util.MessageUTIL.*;

import java.util.List;

@ManagedBean
@SessionScoped
public class UsuarioBEAN {
	
	private String login;
	private String senha;
	private Usuario usuario = new Usuario();
	private boolean logado;
	private List<Usuario> lista;
	
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
	
	public String deletar() {
		UsuarioDAO.deletar(usuario);
		lista = UsuarioDAO.listarTodos();
		return null;
	}
	
	public String userAutentication() {
		usuario = UsuarioDAO.findUser(login, senha);
		
		if(usuario != null) {
			logado = true;
			return "/pages/listing/icident_log.xhtml?faces-redirect=true";
		}else {
			erro("Erro", "Usuário não registrado !");
		}
		return null;
	}
	
	
	public String logout() {
		logado = false;
		return "/index.xhtml?faces-redirect=true";
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

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public List<Usuario> getLista() {
		if(lista == null) {
			lista = UsuarioDAO.listarTodos();
		}
		return lista;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

}
