package co.edu.udea.classroom_udea_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.classroom_udea_api.dao.CoursesRepository;
import co.edu.udea.classroom_udea_api.model.Courses;

@RestController
@RequestMapping("/courses")
public class CoursesController {

	@Autowired
	private CoursesRepository coursesRepository;

	@PostMapping
	public ResponseEntity<Void> addCourses(@RequestBody Courses courses) {
		try {
			coursesRepository.save(courses);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	

}
