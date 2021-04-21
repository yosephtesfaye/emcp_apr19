package etgov.mof.pfmrt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import etgov.mof.pfmrt.dao.DirectorateRepository;
import etgov.mof.pfmrt.model.Directorate;


@Service
public class DirectorateService {
	
	    @Autowired
      private DirectorateRepository directorateRepository;
        
	    public List<Directorate> GetAllDirectorates(){
	    	return directorateRepository.findAll();
	    }

	    
		public void save(Directorate directorate) {
		
			directorateRepository.save(directorate);
			
		}

		public Optional<Directorate> findById(String id) {
			// return specific directorate id
			return directorateRepository.findById(id);
		}

		public void delete(String id) {
			// delete directorate by id
		directorateRepository.deleteById(id);
			
		}
}
