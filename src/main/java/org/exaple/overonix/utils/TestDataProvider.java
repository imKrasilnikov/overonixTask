package org.exaple.overonix.utils;

import org.exaple.overonix.dataobject.CompaniesVacancy;

public class TestDataProvider {
    public static CompaniesVacancy getCompaniesVacancy() {
        return CompaniesVacancy.builder()
                .company("Overonix Technologies")
                .vacancy("QA Automation Engineer")
                .build();
    }
}




