package in.co.psoft.hrm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
@Table(name="ohrm_organization")
@RequestScopedComponent("organization")
@Entity
public class Organization implements Serializable{

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column(nullable = false,name="name")
	private String name;
	@Column(nullable = false,name="tax_id")
	private String taxId;
	@Column(nullable = false,name="registration_number")
	private String registrationNumber;
	@Column(nullable = false,name="phone")
	private String phone;
	@Column(nullable = false,name="fax")
	private String fax;
	@Column(nullable = false,name="email")
	@Email(message = "must be a valid email")
	private String email;
	@Column(nullable = false,name="country")
	private String country;
	@Column(nullable = false,name="state")
	private String state;
	@Column(nullable = false,name="city")
	private String city;
	@Column(nullable = false,name="zip_code")
	private String zipCode;
	@Column(nullable = false,name="street1")
	private String street1;
	@Column(nullable = false,name="street2")
	private String street2;
	@Column(nullable = false,name="note")
	private String note;
	@Column(name="created_at")
	Date createdAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
	}
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	

}
