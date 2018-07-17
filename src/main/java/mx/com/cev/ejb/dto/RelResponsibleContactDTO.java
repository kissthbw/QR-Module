package mx.com.cev.ejb.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RelResponsibleContactDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1300955250454364904L;

	private Integer idResponsable;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private Integer idTelefono;
	private Integer numeroInstalacionTel;
	private Integer idTabletaTel;
	private String idDispositivoVac;

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

	public Integer getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Integer idTelefono) {
		this.idTelefono = idTelefono;
	}

	public Integer getNumeroInstalacionTel() {
		return numeroInstalacionTel;
	}

	public void setNumeroInstalacionTel(Integer numeroInstalacionTel) {
		this.numeroInstalacionTel = numeroInstalacionTel;
	}

	public Integer getIdTabletaTel() {
		return idTabletaTel;
	}

	public void setIdTabletaTel(Integer idTabletaTel) {
		this.idTabletaTel = idTabletaTel;
	}

	public String getIdDispositivoVac() {
		return idDispositivoVac;
	}

	public void setIdDispositivoVac(String idDispositivoVac) {
		this.idDispositivoVac = idDispositivoVac;
	}

	public String getIdUsuarioVac() {
		return idUsuarioVac;
	}

	public void setIdUsuarioVac(String idUsuarioVac) {
		this.idUsuarioVac = idUsuarioVac;
	}

	private String idUsuarioVac;

}
