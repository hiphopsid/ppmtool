package in.codegram.ppmtoolapi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.codegram.ppmtoolapi.domain.Project;
import in.codegram.ppmtoolapi.exception.ProjectIdException;
import in.codegram.ppmtoolapi.repository.ProjectRepository;
import in.codegram.ppmtoolapi.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	
	@Override
	public Project saveOrUpdate(Project project) {
		// TODO Auto-generated method stub
		//Biz logic
		try 
		{
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}
		catch(Exception ex)
		{
			throw new ProjectIdException("ProjectId: "+project.getProjectIdentifier().toUpperCase()+" "+"already exists");
		}
	}


	@Override
	public Project findProjectByProjectIdentifier(String projectId) {
		// TODO Auto-generated method stub
		Project project=projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if(project==null)
		{
			throw new ProjectIdException("Project Identifier: "+ projectId.toUpperCase()+" "+"not available!");
		}
		return project;
	}


	@Override
	public Iterable<Project> findAllProjects() {
		// TODO Auto-generated method stub
		return projectRepository.findAll();
	}


	@Override
	public void deletProjectByProjectIdentifier(String projectId) {
		// TODO Auto-generated method stub
		Project project=projectRepository.findByProjectIdentifier(projectId.toUpperCase());
		if(project==null)
		{
			throw new ProjectIdException("Project Identifier: "+ projectId.toUpperCase()+" "+"not available!");
		}
		projectRepository.delete(project);
		
	}

}
