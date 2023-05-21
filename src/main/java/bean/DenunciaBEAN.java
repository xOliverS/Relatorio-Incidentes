package bean;

import javax.faces.bean.ManagedBean;

import dao.DenunciaDAO;
import entities.Denuncia;
import static util.MessageUTIL.*;

@ManagedBean
public class DenunciaBEAN {
	
	private Denuncia denuncia = new Denuncia();
	
	public String salvar() {
		
		try {
			DenunciaDAO.salvar(denuncia);
			sucesso("Sucesso", "Email Salvo com sucesso");
			denuncia = new Denuncia();
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar" + e);
		}
		return null;
	}

	public Denuncia getD() {
		return denuncia;
	}

	public void setD(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

}
