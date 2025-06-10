package com.acme.center.platform.learning.domain.model.queries;

import com.acme.center.platform.learning.domain.model.valueobjects.AcmeStudentRecordId;

public record ExistByAcmeStudentRecordIdQuery(AcmeStudentRecordId acmeStudentRecordId) {

    public ExistByAcmeStudentRecordIdQuery {
        if (acmeStudentRecordId == null) {
            throw new IllegalArgumentException("AcmeStudentRecordId cannot be null");
        }
    }
}
