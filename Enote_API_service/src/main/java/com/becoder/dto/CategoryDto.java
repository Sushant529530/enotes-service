package com.becoder.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

	
    private Integer id;
	
	private String name;
	
	private String description;
	
    private Boolean  is_Active;
	
	private Boolean is_Deleted;
	
	private Integer created_by;
	
	private Integer updated_by;
	
	private Date updated_on;

	public CategoryDto(Integer id, String name, String description, Boolean is_Active, Boolean is_Deleted,
			Integer created_by, Integer updated_by, Date updated_on) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.is_Active = is_Active;
		this.is_Deleted = is_Deleted;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.updated_on = updated_on;
	}

	public CategoryDto() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIs_Active() {
		return is_Active;
	}

	public void setIs_Active(Boolean is_Active) {
		this.is_Active = is_Active;
	}

	public Boolean getIs_Deleted() {
		return is_Deleted;
	}

	public void setIs_Deleted(Boolean is_Deleted) {
		this.is_Deleted = is_Deleted;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Integer getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Integer updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	
	
}
