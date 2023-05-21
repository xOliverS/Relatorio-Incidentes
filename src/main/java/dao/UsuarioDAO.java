package dao;

import javax.persistence.Query;

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
	
	public static Usuario findUser(String login, String senha) {
		try {
			EntityManager em = JPAUTIL.criarEntity();
			Query q = em.createQuery("Select u FROM Usuario u WHERE u.login = :login AND u.senha = :senha");
			q.setParameter("login", login);
			q.setParameter("senha", senha);
			return (Usuario) q.getSingleResult();
		} catch (Exception e) {
			return null;
		}
	}

}
