package com.kodilla.patterns2.observer.homework;

public class HomeworkTask {
    private final String studentName;
    private final Title taskTitle;
    private String content;
    private Status status;

    public HomeworkTask(final String studentName, final Title taskTitle, String content, Status status) {
        this.studentName = studentName;
        this.taskTitle = taskTitle;
        this.content = content;
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public Title getTaskTitle() {
        return taskTitle;
    }

    public String getContent() {
        return content;
    }

    public Status getStatus() {
        return status;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
