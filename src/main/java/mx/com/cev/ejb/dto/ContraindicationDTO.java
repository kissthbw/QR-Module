package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

public class ContraindicationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 786439526239236252L;

	private Integer idContraindicacion;
	private Integer idVacunado;
	private Integer idTableta;
	private Integer numeroInstalacion;
	private Integer idPregunta;
	private Integer idAgrupacion;
	private Date fechaFin;
	private Date fechaRegistroBd;

	public Integer getIdContraindicacion() {
		return idContraindicacion;
	}

	public void setIdContraindicacion(Integer idContraindicacion) {
		this.idContraindicacion = idContraindicacion;
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

	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

	public Integer getIdAgrupacion() {
		return idAgrupacion;
	}

	public void setIdAgrupacion(Integer idAgrupacion) {
		this.idAgrupacion = idAgrupacion;
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
