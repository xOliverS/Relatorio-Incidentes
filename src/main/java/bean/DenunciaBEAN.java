package bean;

import javax.faces.bean.ManagedBean;

import dao.DenunciaDAO;
import entities.Denuncia;
import static util.MessageUTIL.*;

import java.util.List;

@ManagedBean
public class DenunciaBEAN {
	
	private Denuncia denuncia = new Denuncia();
	private List<Denuncia> lista;
	
	public String salvar() {
		
		try {
			DenunciaDAO.salvar(denuncia);
			sucesso("Sucesso", "Denuncia salva com sucesso");
			denuncia = new Denuncia();
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar" + e);
		}
		return null;
	}
	
	public String deletar() {
		DenunciaDAO.deletar(denuncia);
		sucesso("Sucesso", "Denuncia deletada ");
		lista = DenunciaDAO.listarTodos();
		return null;
	}

	public Denuncia getD() {
		return denuncia;
	}

	public void setD(Denuncia denuncia) {
		this.denuncia = denuncia;
	}



	public List<Denuncia> getLista() {
		if(lista == null) {
			lista = DenunciaDAO.listarTodos();
		}
		return lista;
	}

	public void setLista(List<Denuncia> lista) {
		this.lista = lista;
	}
	
	

}
