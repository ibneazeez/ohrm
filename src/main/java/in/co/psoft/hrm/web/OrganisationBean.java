package in.co.psoft.hrm.web;

import java.util.Date;

import javax.faces.bean.ManagedBean;

import org.hibernate.validator.constraints.Email;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;

@RequestScopedComponent("organisation")
@ManagedBean

public class OrganisationBean {

	private Integer integer;
	private String name;
	private String tax_id;
	private Integer registration_number;
	private Integer phone;
	private String fax;
	
	@Email(message = "must be a valid email")
	private String email;
	
	private String state;
	
	private Integer zip_code;
	private String street1;
	private String street2;
	private String note;
	private Date created_at;
	public Integer getInteger() {
		return integer;
	}
	public void setInteger(Integer integer) {
		this.integer = integer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTax_id() {
		return tax_id;
	}
	public void setTax_id(String tax_id) {
		this.tax_id = tax_id;
	}
	public Integer getRegistration_number() {
		return registration_number;
	}
	public void setRegistration_number(Integer registration_number) {
		this.registration_number = registration_number;
	}
	public Integer getPhone() {
		return phone;
	}
	public void setPhone(Integer phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Integer getZip_code() {
		return zip_code;
	}
	public void setZip_code(Integer zip_code) {
		this.zip_code = zip_code;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	

}
