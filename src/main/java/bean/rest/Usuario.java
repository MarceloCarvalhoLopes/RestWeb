package bean.rest;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.log4j.Logger;

@XmlRootElement
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
	
	
//	final static Logger logger = Logger.getLogger(Usuario.class);


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableGenerator(name = "userUID", allocationSize = 1)
	@Id
	@GeneratedValue(generator = "userUID", strategy = GenerationType.TABLE)

	private Integer id;

	@Column(name = "username", nullable = false, length = 20)
	private String username;

	@Column(name = "password", nullable = false, length = 20)
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
