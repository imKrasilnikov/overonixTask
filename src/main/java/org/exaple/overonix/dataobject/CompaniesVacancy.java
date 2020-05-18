package org.exaple.overonix.dataobject;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CompaniesVacancy {
    String company;
    String vacancy;
}
