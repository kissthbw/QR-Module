package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

public class AddressDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1097379157286596472L;
	private Integer idTelefono;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private String idTipo;
	private Integer idOperador;
	private Integer numero;
	private String idUsuarioVac;
	private Integer idDispositivoVac;
	private Date fechaRegistroBd;

	public Integer getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Integer idTelefono) {
		this.idTelefono = idTelefono;
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

	public String getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(String idTipo) {
		this.idTipo = idTipo;
	}

	public Integer getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Integer idOperador) {
		this.idOperador = idOperador;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getIdUsuarioVac() {
		return idUsuarioVac;
	}

	public void setIdUsuarioVac(String idUsuarioVac) {
		this.idUsuarioVac = idUsuarioVac;
	}

	public Integer getIdDispositivoVac() {
		return idDispositivoVac;
	}

	public void setIdDispositivoVac(Integer idDispositivoVac) {
		this.idDispositivoVac = idDispositivoVac;
	}

	public Date getFechaRegistroBd() {
		return fechaRegistroBd;
	}

	public void setFechaRegistroBd(Date fechaRegistroBd) {
		this.fechaRegistroBd = fechaRegistroBd;
	}

}
