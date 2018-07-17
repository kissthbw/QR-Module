package mx.com.cev.ejb.dto;

import java.io.Serializable;

public class ContactDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1097379157286596472L;

	PhoneDTO phone;
	RelVaccinatedContactDTO relVaccinatedContact;
	RelResponsibleContactDTO relResponsibleContact;

	public PhoneDTO getPhone() {
		return phone;
	}

	public void setPhone(PhoneDTO phone) {
		this.phone = phone;
	}

	public RelVaccinatedContactDTO getRelVaccinatedContact() {
		return relVaccinatedContact;
	}

	public void setRelVaccinatedContact(
			RelVaccinatedContactDTO relVaccinatedContact) {
		this.relVaccinatedContact = relVaccinatedContact;
	}

	public RelResponsibleContactDTO getRelResponsibleContact() {
		return relResponsibleContact;
	}

	public void setRelResponsibleContact(
			RelResponsibleContactDTO relResponsibleContact) {
		this.relResponsibleContact = relResponsibleContact;
	}

}
