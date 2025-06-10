package com.acme.center.platform.learning.domain.model.commands;

import com.acme.center.platform.learning.domain.model.valueobjects.TutorialId;

public record CompleteTutorialForEnrollmentCommand(Long enrollmentId, TutorialId tutorialId) {
    public CompleteTutorialForEnrollmentCommand {
        if (enrollmentId == null || enrollmentId <= 0) {
            throw new IllegalArgumentException("Enrollment ID must be a positive number.");
        }
        if (tutorialId == null) {
            throw new IllegalArgumentException("Tutorial ID cannot be null.");
        }
    }
}
