package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import entities.Denuncia;
import util.JPAUTIL;

public class DenunciaDAO {
	
	public static void salvar(Denuncia denuncia) {
		EntityManager em = JPAUTIL.criarEntity();
		em.getTransaction().begin();
		em.persist(denuncia);
		em.getTransaction().commit();
	}
	
	public static List<Denuncia> listarTodos(){
		EntityManager em = JPAUTIL.criarEntity();
		Query q = em.createQuery("SELECT d FROM Denuncia d");
		List<Denuncia> lista = q.getResultList();
		em.close();
		return lista;
	}
	
	public static void deletar(Denuncia denuncia) {
		EntityManager em = JPAUTIL.criarEntity();
		em.getTransaction().begin();
		denuncia = em.find(Denuncia.class, denuncia.getId());
		em.remove(denuncia);
		em.getTransaction().commit();
		em.close();
	}

}
