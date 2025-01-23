package com.becoder.dto;

public class CategoryResponseDto {
	
	    private Integer id;
		
		private String name;
		
		private String description;
		
	    private Boolean  is_Active;
		
		private Boolean is_Deleted;
		
		private Integer created_by;

		public CategoryResponseDto(Integer id, String name, String description, Boolean is_Active, Boolean is_Deleted,
				Integer created_by) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.is_Active = is_Active;
			this.is_Deleted = is_Deleted;
			this.created_by = created_by;
		}

		public CategoryResponseDto() {
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

		@Override
		public String toString() {
			return "CategoryResponseDto [id=" + id + ", name=" + name + ", description=" + description + ", is_Active="
					+ is_Active + ", is_Deleted=" + is_Deleted + ", created_by=" + created_by + "]";
		}
		
		
	 

}
