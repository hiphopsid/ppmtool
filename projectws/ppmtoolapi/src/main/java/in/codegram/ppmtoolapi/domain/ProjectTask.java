//package in.codegram.ppmtoolapi.domain;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import javax.persistence.PreUpdate;
//import javax.validation.constraints.NotBlank;
//
//@Entity
//public class ProjectTask 
//{
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//	
//	@Column(updatable=false)
//	private String projectSequence;
//	
//	@NotBlank(message="Please include project summary")
//	private String summary;
//	
//	private String acceptanceCriteria;
//	
//	private String status;
//	
//	private Integer priority;
//	
//	private Date dueDate;
//	
//	//ManyToOne with BackLog
//	@Column(updatable=false)
//	private String projectIdentifier;
//	
//	private Date created_At;
//	private Date updated_At;
//	
//	
//	public ProjectTask() {
//		super();
//	}
//
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public String getProjectSequence() {
//		return projectSequence;
//	}
//
//
//	public void setProjectSequence(String projectSequence) {
//		this.projectSequence = projectSequence;
//	}
//
//
//	public String getSummary() {
//		return summary;
//	}
//
//
//	public void setSummary(String summary) {
//		this.summary = summary;
//	}
//
//
//	public String getAcceptanceCriteria() {
//		return acceptanceCriteria;
//	}
//
//
//	public void setAcceptanceCriteria(String acceptanceCriteria) {
//		this.acceptanceCriteria = acceptanceCriteria;
//	}
//
//
//	public String getStatus() {
//		return status;
//	}
//
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
//
//
//	public Integer getPriority() {
//		return priority;
//	}
//
//
//	public void setPriority(Integer priority) {
//		this.priority = priority;
//	}
//
//
//	public Date getDueDate() {
//		return dueDate;
//	}
//
//
//	public void setDueDate(Date dueDate) {
//		this.dueDate = dueDate;
//	}
//
//
//	public String getProjectIdentifier() {
//		return projectIdentifier;
//	}
//
//
//	public void setProjectIdentifier(String projectIdentifier) {
//		this.projectIdentifier = projectIdentifier;
//	}
//
//
//	public Date getCreated_At() {
//		return created_At;
//	}
//
//
//	public void setCreated_At(Date created_At) {
//		this.created_At = created_At;
//	}
//
//
//	public Date getUpdated_At() {
//		return updated_At;
//	}
//
//
//	public void setUpdated_At(Date updated_At) {
//		this.updated_At = updated_At;
//	} 
//	
//	@PrePersist
//	public void on_Create()
//	{
//		this.created_At=new Date();
//	}
//	
//	@PreUpdate
//	public void on_Update()
//	{
//		this.updated_At=new Date();
//	}
//	
//	
//}
