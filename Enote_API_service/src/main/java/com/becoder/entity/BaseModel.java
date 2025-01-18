package com.becoder.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {

   private Boolean  is_Active;
	
	private Boolean is_Deleted;
	
	private Integer created_by;
	
 
	
	private Integer updated_by;
	
	private Date updated_on;

	public BaseModel(Boolean isActive, Boolean isDeleted, Integer createdBy, Date createdon, Integer updatedBy,
			Date updatedon) {
		super();
		this.is_Active = isActive;
		this.is_Deleted = isDeleted;
		this.created_by = createdBy;
	
		this.updated_by = updatedBy;
		this.updated_on = updatedon;
	}

	public BaseModel() {
		super();
	}

	public Boolean getIsActive() {
		return is_Active;
	}

	public void setIsActive(Boolean isActive) {
		this.is_Active = isActive;
	}

	public Boolean getIsDeleted() {
		return is_Deleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.is_Deleted = isDeleted;
	}

	public Integer getCreatedBy() {
		return created_by;
	}

	public void setCreatedBy(Integer createdBy) {
		this.created_by = createdBy;
	}

 

	public Integer getUpdatedBy() {
		return updated_by;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updated_by = updatedBy;
	}

	public Date getUpdatedon() {
		return updated_on;
	}

	public void setUpdatedon(Date updatedon) {
		this.updated_on = updatedon;
	}
	
	
	
}
