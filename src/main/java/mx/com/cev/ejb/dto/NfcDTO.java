package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

public class NfcDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 786439526239236252L;

	private Integer idNfc;
	private Integer idVacunado;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private Integer idEstatus;
	private String idProveedor;
	private Date fechaAsignacion;
	private Date fechaInactiva;
	private Date fechaActualizacion;
	private Date fechaRegistroBd;

	public Integer getIdNfc() {
		return idNfc;
	}

	public void setIdNfc(Integer idNfc) {
		this.idNfc = idNfc;
	}

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

	public Integer getIdEstatus() {
		return idEstatus;
	}

	public void setIdEstatus(Integer idEstatus) {
		this.idEstatus = idEstatus;
	}

	public String getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaInactiva() {
		return fechaInactiva;
	}

	public void setFechaInactiva(Date fechaInactiva) {
		this.fechaInactiva = fechaInactiva;
	}

	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Date getFechaRegistroBd() {
		return fechaRegistroBd;
	}

	public void setFechaRegistroBd(Date fechaRegistroBd) {
		this.fechaRegistroBd = fechaRegistroBd;
	}

}
