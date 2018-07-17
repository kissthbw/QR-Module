package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

public class ResponsibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6038526209295171845L;
	private Integer idResponsable;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private String nombre;
	private Integer idNacionalidad;
	private Integer idEstadoNacimiento;
	private Integer idOrigenRegistro;
	private String primerApellido;
	private String segundoApellido;
	private String sexo;
	private String curp;
	private String correo;
	private Date fechaNacimiento;
	private Date fechaRegistroApp;
	private Date fechaRegistro;
	private Date fechaUltimaEdicion;
	private Integer idResponsableVacunaccion;
	private Date fechaAutorizacion;
	private Integer estadoValidacion;

	public Integer getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Integer idResponsable) {
		this.idResponsable = idResponsable;
	}

	public Integer getNumeroInstalacion() {
		return numeroInstalacion;
	}

	public void setNumeroInstalacion(Integer numeroInstalacion) {
		this.numeroInstalacion = numeroInstalacion;
	}

	public Integer getIdTableta() {
		return idTableta;
	}

	public void setIdTableta(Integer idTableta) {
		this.idTableta = idTableta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdNacionalidad() {
		return idNacionalidad;
	}

	public void setIdNacionalidad(Integer idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public Integer getIdEstadoNacimiento() {
		return idEstadoNacimiento;
	}

	public void setIdEstadoNacimiento(Integer idEstadoNacimiento) {
		this.idEstadoNacimiento = idEstadoNacimiento;
	}

	public Integer getIdOrigenRegistro() {
		return idOrigenRegistro;
	}

	public void setIdOrigenRegistro(Integer idOrigenRegistro) {
		this.idOrigenRegistro = idOrigenRegistro;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaRegistroApp() {
		return fechaRegistroApp;
	}

	public void setFechaRegistroApp(Date fechaRegistroApp) {
		this.fechaRegistroApp = fechaRegistroApp;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaEdicion() {
		return fechaUltimaEdicion;
	}

	public void setFechaUltimaEdicion(Date fechaUltimaEdicion) {
		this.fechaUltimaEdicion = fechaUltimaEdicion;
	}

	public Integer getIdResponsableVacunaccion() {
		return idResponsableVacunaccion;
	}

	public void setIdResponsableVacunaccion(Integer idResponsableVacunaccion) {
		this.idResponsableVacunaccion = idResponsableVacunaccion;
	}

	public Date getFechaAutorizacion() {
		return fechaAutorizacion;
	}

	public void setFechaAutorizacion(Date fechaAutorizacion) {
		this.fechaAutorizacion = fechaAutorizacion;
	}

	public Integer getEstadoValidacion() {
		return estadoValidacion;
	}

	public void setEstadoValidacion(Integer estadoValidacion) {
		this.estadoValidacion = estadoValidacion;
	}

}
