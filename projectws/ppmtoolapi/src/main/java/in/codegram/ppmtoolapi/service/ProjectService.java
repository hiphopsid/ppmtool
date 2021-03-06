package in.codegram.ppmtoolapi.service;

import org.springframework.stereotype.Repository;
import in.codegram.ppmtoolapi.domain.Project;


public interface ProjectService 
{
	public Project saveOrUpdate(Project project);
	public Project findProjectByProjectIdentifier(String projectId);
	public Iterable<Project> findAllProjects();
	public void deletProjectByProjectIdentifier(String projectId);
	
}
