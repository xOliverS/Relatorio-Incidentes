package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUTIL {
	
private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Relatos");
	
	public static EntityManager criarEntity() {
		return emf.createEntityManager();
		
	}

}
