package com.learning.model;

public class Course {
    private int id;
    private String title;
    private String description;
    private String duration;

    public Course() {}

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getDuration() { return duration; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setDescription(String d) { this.description = d; }
    public void setDuration(String duration) { this.duration = duration; }
}