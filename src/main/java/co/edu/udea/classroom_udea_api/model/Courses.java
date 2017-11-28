package co.edu.udea.classroom_udea_api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="courses")
public class Courses {
	@Id
	private String id;
	private String course_id; 
	private String course_name;
	private String semester;
	private Persons teacher;
	private List<Persons> students;
	
	public Courses(){}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public Persons getTeacher() {
		return teacher;
	}

	public void setTeacher(Persons teacher) {
		this.teacher = teacher;
	}

	public List<Persons> getStudents() {
		return students;
	}

	public void setStudents(List<Persons> students) {
		this.students = students;
	}
	
	
	

	
}

