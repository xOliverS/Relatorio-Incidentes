package bean;

import javax.faces.bean.ManagedBean;

import dao.DenunciaDAO;
import entities.Denuncia;

@ManagedBean
public class DenunciaBEAN {
	
	private Denuncia d = new Denuncia();
	
	public void Salvar() {
		DenunciaDAO.salvar(d);
	}

	public Denuncia getD() {
		return d;
	}

	public void setD(Denuncia d) {
		this.d = d;
	}

}
