package bean;

import javax.faces.bean.ManagedBean;

import dao.DenunciaDAO;
import entities.Denuncia;
import static util.MessageUTIL.*;

@ManagedBean
public class DenunciaBEAN {
	
	private Denuncia denuncia = new Denuncia();
	
	public void Salvar() {
		
		try {
			DenunciaDAO.salvar(denuncia);
			sucesso("Sucesso", "Email Salvo com sucesso");
		} catch (Exception e) {
			erro("Erro", "Erro ao salvar" + e);
		}
	}

	public Denuncia getD() {
		return denuncia;
	}

	public void setD(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

}
