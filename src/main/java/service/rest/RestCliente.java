package service.rest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import bean.rest.Usuario;
import dao.rest.UserDao;

public class RestCliente {

	public static void main(String[] args) {

		Usuario user = new Usuario();
		UserDao dao = new UserDao();

		dao.getAllUser();

		/*
		 * EntityManagerFactory emf =
		 * Persistence.createEntityManagerFactory("estudos"); EntityManager em =
		 * emf.createEntityManager();
		 * 
		 * 
		 * em.getTransaction().begin();
		 * 
		 * user.setUsername("Marcia"); user.setPassword("123456");
		 * 
		 * em.persist(user);
		 * 
		 * 
		 * 
		 * em.getTransaction().commit(); em.close();
		 * 
		 */
	}

}
