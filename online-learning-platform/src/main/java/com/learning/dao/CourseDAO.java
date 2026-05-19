package com.learning.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.learning.model.Course;

public class CourseDAO {
    // Database credentials
    private String url = "jdbc:mysql://localhost:3306/learning_platform_db";
    private String username = "root"; 
    private String password = "babyreddy@09"; // Put your password here

    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM courses");

         // Example of what to check
            while (rs.next()) {
                Course course = new Course();
                course.setId(rs.getInt("id"));         // LINE: Ensure "id" matches your DB column
                course.setTitle(rs.getString("title")); // LINE: Ensure "title" matches your DB column
                course.setDescription(rs.getString("description")); // LINE: Ensure "description"
                courseList.add(course);
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }
}