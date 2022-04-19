package in.codegram.ppmtoolapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.codegram.ppmtoolapi.domain.Project;


/**
 * CrudRepository: this interface is Provided by the spring
 * @param <T> the domain type the repository manages
 * @param <ID> the type of the id of the entity the repository manages (It will of type that of which your primary key is.)
 * @author asus
 *
 */ 
@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> 
{
	//TODO: no need to implement any CRUD operation over here, if any customization is required we can customize the CRUD method
	
	Project findByProjectIdentifier(String projectIdentifier);
	
	@Override
	Iterable<Project> findAll();
	
}
  