package in.co.psoft.hrm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
@Table(name="ohrm_role")
@RequestScopedComponent("role")
@Entity
public class Role {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column(name = "name",unique=true,nullable=false)
	private String name;

	@Column(nullable = false,name="status")
	private String status;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
