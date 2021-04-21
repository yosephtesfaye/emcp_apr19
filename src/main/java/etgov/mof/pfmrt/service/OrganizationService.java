package etgov.mof.pfmrt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etgov.mof.pfmrt.dao.OrganizationRepository;
import etgov.mof.pfmrt.model.Organization;

@Service

public class OrganizationService {
    
	@Autowired
	private OrganizationRepository organizationRepository;
	
	//Return list of organizations
	public List<Organization> getOrganizations(){
		return organizationRepository.findAll();
	}
	
	//SAve new organization
	public void save(Organization organization) {
		organizationRepository.save(organization);
	}
	
	//get by id
	public Optional<Organization> findById(String id) {
		return organizationRepository.findById(id);
	}

	public void delete(String id) {
		organizationRepository.deleteById(id);
	}
	
	
	
}
