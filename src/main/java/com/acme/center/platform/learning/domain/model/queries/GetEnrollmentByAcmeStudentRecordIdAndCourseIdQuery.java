package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record GetEnrollmentByAcmeStudentRecordIdAndCourseIdQuery(AcmeStudentRecordId acmeStudentRecordId, Long courseId) {

    public GetEnrollmentByAcmeStudentRecordIdAndCourseIdQuery {
        if (acmeStudentRecordId == null) {
            throw new IllegalArgumentException("acmeStudentRecordId cannot be null");
        }
        if (courseId == null || courseId <= 0) {
            throw new IllegalArgumentException("courseId must be a positive number");
        }
    }
}
