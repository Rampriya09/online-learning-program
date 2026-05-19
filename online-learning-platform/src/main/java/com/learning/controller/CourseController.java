package com.learning.controller;

import com.learning.dao.CourseDAO;
import com.learning.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class    {

	@RequestMapping("/")
	public ModelAndView showHome() {
	    List<Course> list = courseDAO.listAll(); // Your DAO method
	    ModelAndView mav = new ModelAndView("index");
	    mav.addObject("courses", list); // <--- THIS KEY "courses" MUST MATCH JSP
	    return mav;
	}
    @RequestMapping("/course-detail")
    public ModelAndView courseDetail(@RequestParam("id") int id) {
    	CourseDAO dao = new CourseDAO();
    	Course course = ((Object) dao).getcourseById(id);
    	ModelAndView mav = new ModelAndView("course-detail");
        mav.addObject("course", course);
        return mav;
    }

    @RequestMapping("/my-courses")
    public ModelAndView myCourses() {
        return new ModelAndView("my-courses");
    }
}