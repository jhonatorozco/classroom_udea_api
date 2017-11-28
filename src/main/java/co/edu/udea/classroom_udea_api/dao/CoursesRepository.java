package co.edu.udea.classroom_udea_api.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import co.edu.udea.classroom_udea_api.model.Courses;

@Repository
public interface CoursesRepository extends MongoRepository<Courses,Serializable>{
	@Query("{'teacher.email': ?0}")
	List<Courses> findByEmail(final String country);

}
