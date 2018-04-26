package in.co.psoft.hrm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;
@RequestScopedComponent("screen")
@Entity
@Table(name="ohrm_section")
public class Screen {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Id
		private Long id;
		@Column(nullable = false,name="name")
		private String name;
		@Column(nullable = false,name="created_at")
		private String createdAt;
		@Column(nullable = false,name="organization_id")
		private String organizationId;
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
	}


