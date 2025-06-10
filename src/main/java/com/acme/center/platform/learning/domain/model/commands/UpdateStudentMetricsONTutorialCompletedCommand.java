package com.acme.center.platform.learning.domain.model.commands;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record UpdateStudentMetricsONTutorialCompletedCommand(AcmeStudentRecordId acmeStudentRecordId) {
    public UpdateStudentMetricsONTutorialCompletedCommand {
        if (acmeStudentRecordId == null) {
            throw new IllegalArgumentException("AcmeStudentRecordId cannot be null.");
        }
    }
}
