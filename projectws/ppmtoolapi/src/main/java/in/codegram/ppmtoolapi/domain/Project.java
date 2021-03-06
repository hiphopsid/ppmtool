package in.codegram.ppmtoolapi.domain;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Project 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Project Name is required")
	private String projectName;
	@NotBlank(message="Project Identifier is required")
	@Size(min=4 , max=5, message="Please use 4-5 characters only.")
	@Column(updatable=false, unique=true)
	private String projectIdentifier;
	@NotBlank(message="Description is required")
	private String description;
	
	private Date start_date;
	private Date end_date;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date created_At;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date updated_At;
	
	//OneToOne with backlog
//	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
//	private Backlog backlog;
	
	
	/**
	 * Mandatory to have a default constructor.
	 */
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getProjectIdentifier() {
		return projectIdentifier;
	}


	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getStart_date() {
		return start_date;
	}


	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	public Date getEnd_date() {
		return end_date;
	}


	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}


	public Date getCreated_At() {
		return created_At;
	}


	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}


	public Date getUpdated_At() {
		return updated_At;
	}


	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}
	
	
	/**
	 * When we are creating this project this on_create will automatically called
	 * And what it is going to do=> This is going to add the current date in this variable. 
	 * 
	 * HOW THEY WILL BE CALLED AUTOMATICALLY?
	 * Ans: using @PrePersist and @PreUpdate
	 */
	@PrePersist
	public void on_Create()
	{
		this.created_At=new Date();
	}
	
	@PreUpdate
	public void on_Update()
	{
		this.updated_At=new Date();
	}
	
}
