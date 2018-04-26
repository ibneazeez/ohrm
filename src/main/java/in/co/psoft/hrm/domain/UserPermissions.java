package in.co.psoft.hrm.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import in.co.psoft.hrm.bone.spring.RequestScopedComponent;

@Table(name="ohrm_user_permissions")
@RequestScopedComponent("userPermissions")
@Entity
public class UserPermissions {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long id;
	@Column(nullable = false,name="organization_id")
	private int organization_id;
	@Column(nullable = false,name="role_id")
	private int role_id;
	@Column(nullable = false,name="section_id")
	private int section_id;
	@Column(nullable = false,name="can_read")
	private String canRead;
	@Column(nullable = false,name="can_write")
	private String canWrite;
	@Column(nullable = false,name="can_delete")
	private String canDelete;
	@Column(name="created_at",nullable=false)
	Date createdAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getSection_id() {
		return section_id;
	}
	public void setSection_id(int section_id) {
		this.section_id = section_id;
	}
	public String getCanRead() {
		return canRead;
	}
	public void setCanRead(String canRead) {
		this.canRead = canRead;
	}
	public String getCanWrite() {
		return canWrite;
	}
	public void setCanWrite(String canWrite) {
		this.canWrite = canWrite;
	}
	public String getCanDelete() {
		return canDelete;
	}
	public void setCanDelete(String canDelete) {
		this.canDelete = canDelete;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
