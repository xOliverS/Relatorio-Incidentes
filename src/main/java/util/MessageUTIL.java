package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class MessageUTIL {

	public static void sucesso(String indice, String detalhes) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, indice, detalhes));
	}
	
	public static void erro(String indice, String detalhes) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, indice, detalhes));
	}
	
}
