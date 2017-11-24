package dao.rest;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import bean.rest.Usuario;

@Stateless
@Transactional(dontRollbackOn = { NoResultException.class })
public class UserDao {

//	private static Logger logger = LoggerFactory.getLogger(UserDao.class);

	@PersistenceContext
	private EntityManager em;

	// Grava Registro

	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public Usuario save(Usuario user) throws Exception {

		Usuario existente = null;

		if (user.getId() != null) {

			existente = em.find(Usuario.class, user.getId());
		}

		if (existente == null) {
			em.persist(user);
		}

	//	logger.info("Salvando registro (%s): %s", user);

		return user;

	}

	// Lista todos usuários
	@TransactionAttribute(TransactionAttributeType.SUPPORTS)
	public List<Usuario> getAllUser() {

		CriteriaBuilder cb = em.getCriteriaBuilder();

		CriteriaQuery<Usuario> root = cb.createQuery(Usuario.class);
		root.select(root.from(Usuario.class));

		List<Usuario> resultado = em.createQuery(root).getResultList();

		return resultado;

	}

}
