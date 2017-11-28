package co.edu.udea.classroom_udea_api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.classroom_udea_api.dao.CoursesRepository;
import co.edu.udea.classroom_udea_api.model.Courses;

@RestController
@RequestMapping("/persons")
public class PersonsController {

	@Autowired
	private CoursesRepository coursesRepository;
	
	@RequestMapping("/teacher/{email:.+}/courses")
	@GetMapping
	public ResponseEntity<List<Courses>> getNotificationsByManager(@PathVariable String email) {
		List<Courses> courses= new ArrayList<>();
		try{
			courses= coursesRepository.findByEmail(email);
		}catch(Exception e){
			return new ResponseEntity<List<Courses>>(courses,HttpStatus.CONFLICT);
		}
		return new ResponseEntity<List<Courses>>(courses,HttpStatus.OK);
	}
	
}
