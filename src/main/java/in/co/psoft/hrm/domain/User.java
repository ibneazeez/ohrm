/*
 * Copyright 2012-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package in.co.psoft.hrm.domain;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import in.co.psoft.hrm.bone.jsf.ViewScopedComponent;
import in.co.psoft.hrm.bone.spring.RequestScopedComponent;

@ViewScopedComponent("user")
@Entity
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;

	@Column(nullable = false,name="firstname")
	private String firstName;

	@Column(nullable = false,name="lastname")
	private String lastName;
	@Column(nullable = false,name="user_role")
	private String userRole;
	@Column(nullable = false,name="password")
	private String password;
	@Column(nullable = false,name="username")
	private String username;
	@Column(nullable = false,name="status")
	private String status;
	@Column(nullable = false,name="organization_id")
	private int organizationId;
	@Column(nullable = false,name="middlename")
	private String middleName;
	@Column(nullable = false,name="employee_id")
	private String employeeId;
	@Column(nullable = false,name="employee_photo")
	private String employeePhoto;
	@Column(nullable = false,name="gender")
	private String gender;
	@Column(nullable = false,name="dob")
	private String dob;
	@Column(nullable = false,name="country")
	private String country;
	@Column(nullable = false,name="marital_status")
	private String maritalStatus;
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}



	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeePhoto() {
		return employeePhoto;
	}

	public void setEmployeePhoto(String employeePhoto) {
		this.employeePhoto = employeePhoto;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public void setId(Long id) {
		this.id = id;
	}

	protected User() {
	}

		public Long getId() {
		return id;
	}

		public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
		public User(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}



	public void setLastName(String lastName) {
		this.lastName=lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userRole=" + userRole
				+ ", password=" + password + ", username=" + username + ", status=" + status + ", organizationId="
				+ organizationId + ", middleName=" + middleName + ", employeeId=" + employeeId + ", employeePhoto="
				+ employeePhoto + ", gender=" + gender + ", dob=" + dob + ", country=" + country + ", maritalStatus="
				+ maritalStatus + "]";
	}

	
	
}

