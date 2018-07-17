package mx.com.cev.ejb.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class VaccineDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1300955250454364904L;
	private Integer idVacunadoVacuna;
	private Integer idVacunado;
	private Integer numeroInstalacion;
	private Integer idTableta;
	private Integer idVacuna;
	private Integer idOrigenRegistro;
	private Integer idEtapa;
	private Integer idEquivalencia;
	private Integer idClues;
	private Integer dosis;
	private Integer idColorAplicacion;
	private String lote;
	private Date fechaExpiracion;
	private Date fechaAplicacion;
	private String vacunaHistorica;
	private String origenAplicacion;
	private Date fechaConsignacionApp;
	private Date fechaRegistroBd;
	private String idUsuarioVac;
	private Integer idVacunadoVacunaVac;
	private Integer idDispositivoVac;
	private Date fechaAutorizacion;
	private Integer estadoValidacion;

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

	public Integer getIdVacuna() {
		return idVacuna;
	}

	public void setIdVacuna(Integer idVacuna) {
		this.idVacuna = idVacuna;
	}

	public Integer getIdOrigenRegistro() {
		return idOrigenRegistro;
	}

	public void setIdOrigenRegistro(Integer idOrigenRegistro) {
		this.idOrigenRegistro = idOrigenRegistro;
	}

	public Integer getIdEtapa() {
		return idEtapa;
	}

	public void setIdEtapa(Integer idEtapa) {
		this.idEtapa = idEtapa;
	}

	public Integer getIdEquivalencia() {
		return idEquivalencia;
	}

	public void setIdEquivalencia(Integer idEquivalencia) {
		this.idEquivalencia = idEquivalencia;
	}

	public Integer getIdClues() {
		return idClues;
	}

	public void setIdClues(Integer idClues) {
		this.idClues = idClues;
	}

	public Integer getDosis() {
		return dosis;
	}

	public void setDosis(Integer dosis) {
		this.dosis = dosis;
	}

	public Integer getIdColorAplicacion() {
		return idColorAplicacion;
	}

	public void setIdColorAplicacion(Integer idColorAplicacion) {
		this.idColorAplicacion = idColorAplicacion;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public Date getFechaAplicacion() {
		return fechaAplicacion;
	}

	public void setFechaAplicacion(Date fechaAplicacion) {
		this.fechaAplicacion = fechaAplicacion;
	}

	public String getVacunaHistorica() {
		return vacunaHistorica;
	}

	public void setVacunaHistorica(String vacunaHistorica) {
		this.vacunaHistorica = vacunaHistorica;
	}

	public String getOrigenAplicacion() {
		return origenAplicacion;
	}

	public void setOrigenAplicacion(String origenAplicacion) {
		this.origenAplicacion = origenAplicacion;
	}

	public Date getFechaConsignacionApp() {
		return fechaConsignacionApp;
	}

	public void setFechaConsignacionApp(Date fechaConsignacionApp) {
		this.fechaConsignacionApp = fechaConsignacionApp;
	}

	public Date getFechaRegistroBd() {
		return fechaRegistroBd;
	}

	public void setFechaRegistroBd(Date fechaRegistroBd) {
		this.fechaRegistroBd = fechaRegistroBd;
	}

	public String getIdUsuarioVac() {
		return idUsuarioVac;
	}

	public void setIdUsuarioVac(String idUsuarioVac) {
		this.idUsuarioVac = idUsuarioVac;
	}

	public Integer getIdVacunadoVacunaVac() {
		return idVacunadoVacunaVac;
	}

	public void setIdVacunadoVacunaVac(Integer idVacunadoVacunaVac) {
		this.idVacunadoVacunaVac = idVacunadoVacunaVac;
	}

	public Integer getIdDispositivoVac() {
		return idDispositivoVac;
	}

	public void setIdDispositivoVac(Integer idDispositivoVac) {
		this.idDispositivoVac = idDispositivoVac;
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
