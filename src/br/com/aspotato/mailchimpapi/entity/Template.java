package br.com.aspotato.mailchimpapi.entity;

import java.io.Serializable;

public class Template extends Model implements Serializable{

	private static final long serialVersionUID = 6142757661321045013L;
	
	private Integer id;
	private String created_by;
	private String category;
	private String thumbnail; 
	private Boolean drag_and_drop; 
	private String share_url; 
	private String name; 
	private Boolean responsive;  
	private Boolean active;
	private String date_created; 
	private String type;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public Boolean getDrag_and_drop() {
		return drag_and_drop;
	}
	public void setDrag_and_drop(Boolean drag_and_drop) {
		this.drag_and_drop = drag_and_drop;
	}
	public String getShare_url() {
		return share_url;
	}
	public void setShare_url(String share_url) {
		this.share_url = share_url;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getResponsive() {
		return responsive;
	}
	public void setResponsive(Boolean responsive) {
		this.responsive = responsive;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	public String getDate_created() {
		return date_created;
	}
	public void setDate_created(String date_created) {
		this.date_created = date_created;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	

}
