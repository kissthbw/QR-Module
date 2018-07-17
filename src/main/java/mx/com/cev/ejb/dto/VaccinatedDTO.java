package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VaccinatedDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1300955250454364904L;

	private Integer idVacunado;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private Integer idDireccion;
	private Integer idTabletaDireccion;
	private Integer numeroInstalacionDireccion;
	private Integer idNacionalidad;
	private Integer idEstadoNacimiento;
	private Integer idOrigenRegistro;
	private Integer idTipoSangre;
	private String idVacunaccion;
	private String certificadoNacimiento;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private String sexo;
	private String curp;
	private String rfc;
	private String correo;
	private Integer idEstatus;
	private String gemelo;
	private Integer idClues;
	private Integer idUsuario;
	private Date fechaRegistroApp;
	private Date fechaUltimaEdicion;
	private Date fechaNacimiento;
	private String idUsuarioVac;
	private String idDispositivoVac;
	private Integer idVacunadoVac;
	private Integer idDireccionVac;
	private String idUsuarioDireccionVac;
	private Date fechaAutorizacion;
	private Integer estadoValidacion;

	public Integer getIdVacunado() {
		return idVacunado;
	}

	public void setIdVacunado(Integer idVacunado) {
		this.idVacunado = idVacunado;
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

	public Integer getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(Integer idDireccion) {
		this.idDireccion = idDireccion;
	}

	public Integer getIdTabletaDireccion() {
		return idTabletaDireccion;
	}

	public void setIdTabletaDireccion(Integer idTabletaDireccion) {
		this.idTabletaDireccion = idTabletaDireccion;
	}

	public Integer getNumeroInstalacionDireccion() {
		return numeroInstalacionDireccion;
	}

	public void setNumeroInstalacionDireccion(Integer numeroInstalacionDireccion) {
		this.numeroInstalacionDireccion = numeroInstalacionDireccion;
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

	public Integer getIdTipoSangre() {
		return idTipoSangre;
	}

	public void setIdTipoSangre(Integer idTipoSangre) {
		this.idTipoSangre = idTipoSangre;
	}

	public String getIdVacunaccion() {
		return idVacunaccion;
	}

	public void setIdVacunaccion(String idVacunaccion) {
		this.idVacunaccion = idVacunaccion;
	}

	public String getCertificadoNacimiento() {
		return certificadoNacimiento;
	}

	public void setCertificadoNacimiento(String certificadoNacimiento) {
		this.certificadoNacimiento = certificadoNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getGemelo() {
		return gemelo;
	}

	public void setGemelo(String gemelo) {
		this.gemelo = gemelo;
	}

	public Integer getIdClues() {
		return idClues;
	}

	public void setIdClues(Integer idClues) {
		this.idClues = idClues;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaRegistroApp() {
		return fechaRegistroApp;
	}

	public void setFechaRegistroApp(Date fechaRegistroApp) {
		this.fechaRegistroApp = fechaRegistroApp;
	}

	public Date getFechaUltimaEdicion() {
		return fechaUltimaEdicion;
	}

	public void setFechaUltimaEdicion(Date fechaUltimaEdicion) {
		this.fechaUltimaEdicion = fechaUltimaEdicion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getIdUsuarioVac() {
		return idUsuarioVac;
	}

	public void setIdUsuarioVac(String idUsuarioVac) {
		this.idUsuarioVac = idUsuarioVac;
	}

	public String getIdDispositivoVac() {
		return idDispositivoVac;
	}

	public void setIdDispositivoVac(String idDispositivoVac) {
		this.idDispositivoVac = idDispositivoVac;
	}

	public Integer getIdVacunadoVac() {
		return idVacunadoVac;
	}

	public void setIdVacunadoVac(Integer idVacunadoVac) {
		this.idVacunadoVac = idVacunadoVac;
	}

	public Integer getIdDireccionVac() {
		return idDireccionVac;
	}

	public void setIdDireccionVac(Integer idDireccionVac) {
		this.idDireccionVac = idDireccionVac;
	}

	public String getIdUsuarioDireccionVac() {
		return idUsuarioDireccionVac;
	}

	public void setIdUsuarioDireccionVac(String idUsuarioDireccionVac) {
		this.idUsuarioDireccionVac = idUsuarioDireccionVac;
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
