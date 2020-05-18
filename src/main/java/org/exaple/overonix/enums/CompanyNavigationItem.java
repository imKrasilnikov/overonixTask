package org.exaple.overonix.enums;

import lombok.Getter;

public enum CompanyNavigationItem {
    VACANCY ("Вакансии");

    @Getter
    private final String value;

    CompanyNavigationItem(String val) {
        value = val;
    }
}
