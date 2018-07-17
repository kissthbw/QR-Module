package mx.com.cev.ejb.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RelVaccinatedContactDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1300955250454364904L;

	private Integer idVacunado;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private Integer idTelefono;
	private Integer numeroInstalacionTel;
	private Integer idTabletaTel;
	private String idDispositivoVac;
	private String idUsaurioVac;

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

	public String getIdUsaurioVac() {
		return idUsaurioVac;
	}

	public void setIdUsaurioVac(String idUsaurioVac) {
		this.idUsaurioVac = idUsaurioVac;
	}

}
