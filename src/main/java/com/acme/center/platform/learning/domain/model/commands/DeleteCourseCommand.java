package com.acme.center.platform.learning.domain.model.commands;

public record DeleteCourseCommand(long courseId) {

    public DeleteCourseCommand {
        if (courseId <= 0) {
            throw new IllegalArgumentException("Course ID must be a positive number.");
        }
    }
}
