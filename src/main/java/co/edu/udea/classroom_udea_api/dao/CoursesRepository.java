package co.edu.udea.classroom_udea_api.dao;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import co.edu.udea.classroom_udea_api.model.Courses;

@RepositoryRestResource(collectionResourceRel="courses", path="courses")
public interface CoursesRepository extends MongoRepository<Courses,Serializable>{

}
