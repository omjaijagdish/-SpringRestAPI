package com.sid.springbootdata.course;

//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sid.springbootdata.topic.Topic;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	/*@RequestMapping("/courses")
	public List<Course> getAllCourses() {
		return courseService.getAllCourses();
	}*/
	
	// OR
	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	/*@RequestMapping("/courses/{id}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);
	}*/
	
	// OR
	/*@RequestMapping("/courses/{foo}")
	public Course getCourse(@PathVariable("foo") String id) {
		return courseService.getCourse(id);
	}*/
	
	// OR
	@GetMapping("/topics/{topicId}/courses/{id}")
		public Course getCourse(@PathVariable String id) {
			return courseService.getCourse(id);
	}
	
	/*@RequestMapping(method = RequestMethod.POST, value = "/courses")
	public void addCourse(@RequestBody Course course) {
		courseService.addCourse(course); 
	}*/
	
	// OR
	@PostMapping(path = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course); 
	}
	
	/*@RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String id) {
		courseService.updateCourse(id, course); 
	}*/
	
	// OR
	@PutMapping(path = "/topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course); 
	}
	
	/*@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id); 
	}*/
	
	// OR
	@DeleteMapping(path = "/topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id); 
	}
}
