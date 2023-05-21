package bean;

import javax.faces.bean.ManagedBean;

import dao.UsuarioDAO;
import entities.Usuario;

import static util.MessageUTIL.*;

@ManagedBean
public class UsuarioBEAN {
	
	private Usuario usuario = new Usuario();
	
	public String salvar() {
		
		try {
			UsuarioDAO.salvar(usuario);
			sucesso("Sucesso", "Email Salvo com sucesso");
			usuario = new Usuario();
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar" + e);
		}
		return null;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
