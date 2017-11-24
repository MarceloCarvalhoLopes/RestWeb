package service.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import bean.rest.Usuario;
import dao.rest.UserDao;

@Path("/user")
public class UserService extends Application {

	private Usuario usuario = new Usuario();

	@Inject
	private UserDao userDao;

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> getAllUsers() {

		List<Usuario> listOfUsers = userDao.getAllUser();
		return listOfUsers;

	}

	public Usuario getUser() {
		return usuario;
	}

	public void setUser(Usuario usuario) {
		this.usuario = usuario;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
