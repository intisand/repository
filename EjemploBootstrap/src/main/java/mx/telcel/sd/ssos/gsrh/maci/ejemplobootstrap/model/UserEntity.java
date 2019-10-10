package mx.telcel.sd.ssos.gsrh.maci.ejemplobootstrap.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="USUARIOS")
public class UserEntity {

	public UserEntity(String idUSuario, String passwd, String nombre) {
		// TODO Auto-generated constructor stub
		this.idUsuario=idUSuario;
		this.passwd=passwd;
		this.nombre=nombre;		
	}
	
	@Id
	@Column(name="ID", length = 128)
	private String idUsuario;	
	
	@Column(name="passwd", nullable = false, length = 128)
	private String passwd;
	
	@Column(name="nombre", nullable = false, length = 128)
	private String nombre;
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	 @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        UserEntity userEntity = (UserEntity) o;
	        return idUsuario == userEntity.idUsuario &&
	                Objects.equals(passwd, userEntity.passwd) &&
	                Objects.equals(nombre, userEntity.nombre);
	    }

	    @Override
	    public int hashCode() {
	        return Objects.hash(idUsuario, nombre, passwd);
	    }

	    @Override
	    public String toString() {
	        final StringBuilder sb = new StringBuilder("Country{");
	        sb.append("idUsuario=").append(idUsuario);
	        sb.append(", nombre='").append(nombre).append('\'');
	        sb.append(", passwd=").append(passwd);
	        sb.append('}');
	        return sb.toString();
	    }
	
	
}
