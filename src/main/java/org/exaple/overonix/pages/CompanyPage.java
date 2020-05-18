package org.exaple.overonix.pages;

import org.openqa.selenium.By;

public class CompanyPage {
    public static final By companyNameTitle = By.cssSelector(".company-info h1");

    public static class VacancyList {
        public static final By vacancyTitle = By.cssSelector(".vacancy a");
    }

    public static class Navigation {
        private static final String rootElement = "ul.company-nav ";
        public static final By vacancyTab = By.cssSelector(rootElement + "li");
    }

    public static class Vacancy {
        public static final By description = By.cssSelector("div.vacancy-section");
        public static final By vacancyTitle = By.cssSelector("h1");
        public static final By paragraph = By.cssSelector("p");
    }
}
