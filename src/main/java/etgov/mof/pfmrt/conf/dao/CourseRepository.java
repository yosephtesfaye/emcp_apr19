package etgov.mof.pfmrt.conf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import etgov.mof.pfmrt.conf.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    
}
