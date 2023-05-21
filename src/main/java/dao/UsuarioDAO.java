package dao;

import javax.persistence.EntityManager;

import entities.Usuario;
import util.JPAUTIL;

public class UsuarioDAO {
	
	public static void salvar(Usuario usuario) {
		EntityManager em = JPAUTIL.criarEntity();
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
	}

}
