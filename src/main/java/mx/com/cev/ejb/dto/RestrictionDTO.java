package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

public class RestrictionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 786439526239236252L;
	private Integer idRestriccion;
	private Integer idVacunado;
	private Integer idTableta;
	private Integer numeroInstalacion;
	private Integer idAgrupacion;
	private Integer idPregunta;
	private Date fechaFin;
	private Date fechaRegistroBd;

	public Integer getIdRestriccion() {
		return idRestriccion;
	}

	public void setIdRestriccion(Integer idRestriccion) {
		this.idRestriccion = idRestriccion;
	}

	public Integer getIdVacunado() {
		return idVacunado;
	}

	public void setIdVacunado(Integer idVacunado) {
		this.idVacunado = idVacunado;
	}

	public Integer getIdTableta() {
		return idTableta;
	}

	public void setIdTableta(Integer idTableta) {
		this.idTableta = idTableta;
	}

	public Integer getNumeroInstalacion() {
		return numeroInstalacion;
	}

	public void setNumeroInstalacion(Integer numeroInstalacion) {
		this.numeroInstalacion = numeroInstalacion;
	}

	public Integer getIdAgrupacion() {
		return idAgrupacion;
	}

	public void setIdAgrupacion(Integer idAgrupacion) {
		this.idAgrupacion = idAgrupacion;
	}

	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaRegistroBd() {
		return fechaRegistroBd;
	}

	public void setFechaRegistroBd(Date fechaRegistroBd) {
		this.fechaRegistroBd = fechaRegistroBd;
	}

}
