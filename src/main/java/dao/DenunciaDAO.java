package dao;

import javax.persistence.EntityManager;

import entities.Denuncia;
import util.JPAUTIL;

public class DenunciaDAO {
	
	public static void salvar(Denuncia denuncia) {
		EntityManager em = JPAUTIL.criarEntity();
		em.getTransaction().begin();
		em.persist(denuncia);
		em.getTransaction().commit();
	}

}
