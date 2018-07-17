package mx.com.cev.ejb.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RelVaccineResponsibleDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6861971557612606681L;
	private Integer idResponsable;
	private Integer idVacunado;
	private Integer idParentesco;
	private Integer numeroInstalacionVac;
	private Integer idTabletaVac;
	private Integer numeroInstalacionRes;
	private Integer idTabletaRes;

	public Integer getIdResponsable() {
		return idResponsable;
	}

	public void setIdResponsable(Integer idResponsable) {
		this.idResponsable = idResponsable;
	}

	public Integer getIdVacunado() {
		return idVacunado;
	}

	public void setIdVacunado(Integer idVacunado) {
		this.idVacunado = idVacunado;
	}

	public Integer getIdParentesco() {
		return idParentesco;
	}

	public void setIdParentesco(Integer idParentesco) {
		this.idParentesco = idParentesco;
	}

	public Integer getNumeroInstalacionVac() {
		return numeroInstalacionVac;
	}

	public void setNumeroInstalacionVac(Integer numeroInstalacionVac) {
		this.numeroInstalacionVac = numeroInstalacionVac;
	}

	public Integer getIdTabletaVac() {
		return idTabletaVac;
	}

	public void setIdTabletaVac(Integer idTabletaVac) {
		this.idTabletaVac = idTabletaVac;
	}

	public Integer getNumeroInstalacionRes() {
		return numeroInstalacionRes;
	}

	public void setNumeroInstalacionRes(Integer numeroInstalacionRes) {
		this.numeroInstalacionRes = numeroInstalacionRes;
	}

	public Integer getIdTabletaRes() {
		return idTabletaRes;
	}

	public void setIdTabletaRes(Integer idTabletaRes) {
		this.idTabletaRes = idTabletaRes;
	}

}
