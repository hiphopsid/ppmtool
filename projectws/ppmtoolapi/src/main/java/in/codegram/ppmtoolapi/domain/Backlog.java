//package in.codegram.ppmtoolapi.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//@Entity
//public class Backlog
//{
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	private Long id;
//	
//	
//	/**
//	 * 
//	 */
//	private Integer PTSequence=0;
//	
//	private String projectIdentifier;
//
//	
//	//OneToone with project
//	@OneToOne(fetch=FetchType.EAGER)
//	@JoinColumn(name="project_id", nullable=false)
//	@JsonIgnore
//	private Project project;
//	
//	//We will be having OneToOne relationship with the project
//	//oneTomany with ProjectTask.
//	public Backlog() {
//		super();
//	}
//
//
//
//	public Long getId() {
//		return id;
//	}
//
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//
//	public Integer getPTSequence() {
//		return PTSequence;
//	}
//
//
//
//	public void setPTSequence(Integer pTSequence) {
//		PTSequence = pTSequence;
//	}
//
//
//
//	public String getProjectIdentifier() {
//		return projectIdentifier;
//	}
//
//
//
//	public void setProjectIdentifier(String projectIdentifier) {
//		this.projectIdentifier = projectIdentifier;
//	}
//
//
//
//	public Project getProject() {
//		return project;
//	}
//
//
//
//	public void setProject(Project project) {
//		this.project = project;
//	}
//	
//	
//	
//	
//	
//}
