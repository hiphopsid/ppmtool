 package in.codegram.ppmtoolapi.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.codegram.ppmtoolapi.domain.Project;
import in.codegram.ppmtoolapi.service.ProjectService;
import in.codegram.ppmtoolapi.serviceimpl.MapValidationErrorService;

/**
 * When you want to make it as a Rest web Service and you want to send Rest JSON Data
 * then we have to declare it as @RestController.
 * @author asus
 *
 */
@RestController
@RequestMapping("api/projects")
public class ProjectController 
{
	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private MapValidationErrorService mapValidationErrorService;
	
	
	/**
	 * @PostMapping: This is used to specify that it is for POST Request.
	 * @param project
	 * @return
	 */
	@PostMapping("")
	public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result)
	{
		ResponseEntity<?> errorMap= mapValidationErrorService.mapValidationError(result);
		if(errorMap!=null)return errorMap;
		Project savedProject=projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(savedProject, HttpStatus.CREATED) ;
	}
	
	@GetMapping("/{projectId}")
	public ResponseEntity<?> getProjectById(@PathVariable String projectId)
	{
		Project project=projectService.findProjectByProjectIdentifier(projectId);
		return new ResponseEntity<Project>(project, HttpStatus.OK) ;
		
	}
	
	@GetMapping("/all")
	public Iterable<Project> getAllProject(){
		return projectService.findAllProjects();
	}
	
	@DeleteMapping("/{projectId}")
	public ResponseEntity<?> deleteProject(@PathVariable String projectId)
	{
		projectService.deletProjectByProjectIdentifier(projectId);
		return new ResponseEntity<String>("Project with id: "+projectId.toUpperCase()+" "+"is deleted successfully!" , HttpStatus.OK) ;
	}
}
