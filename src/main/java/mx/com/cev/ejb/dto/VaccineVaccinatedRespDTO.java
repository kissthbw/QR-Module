package mx.com.cev.ejb.dto;

import java.io.Serializable;

public class VaccineVaccinatedRespDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 786439526239236252L;

	private Integer idVacunadoVacuna;
	private Integer idVacunado;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private Integer idPregunta;
	private Integer idAgrupacion;
	private String respuesta;

	public Integer getIdVacunadoVacuna() {
		return idVacunadoVacuna;
	}

	public void setIdVacunadoVacuna(Integer idVacunadoVacuna) {
		this.idVacunadoVacuna = idVacunadoVacuna;
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

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

}
