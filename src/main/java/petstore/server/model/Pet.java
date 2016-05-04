package petstore.server.model;

public class Pet {
	private java.util.List<String> photoUrls = null;
	private String name = null;
	private Integer id = null;
	private petstore.server.model.Category category = null;
	private java.util.List<petstore.server.model.Tag> tags = null;
	private String status = null;
	
	public java.util.List<String> getPhotoUrls() {
		return photoUrls;
	}
	public void setPhotoUrls(java.util.List<String> value) {
		photoUrls = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String value) {
		name = value;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer value) {
		id = value;
	}
	
	public petstore.server.model.Category getCategory() {
		return category;
	}
	public void setCategory(petstore.server.model.Category value) {
		category = value;
	}
	
	public java.util.List<petstore.server.model.Tag> getTags() {
		return tags;
	}
	public void setTags(java.util.List<petstore.server.model.Tag> value) {
		tags = value;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String value) {
		status = value;
	}
	
}

