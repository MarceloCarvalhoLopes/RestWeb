package service.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import bean.rest.Usuario;

@Path("/login")
public class ServiceLogin extends Application{

	
/*	@POST
	@Path("/validaUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario validaUsuario(Usuario user) {


		if (user.getUsuario().equals("Admin") && user.getPassword().equals("123")) {
			
		}
	
		

		return user;
	}

*/}
