package com.spring_cloud.eureka.client.company.presentation.request;

import com.spring_cloud.eureka.client.company.domain.enums.CompanyType;
import com.spring_cloud.eureka.client.company.domain.enums.SortType;
import jakarta.validation.constraints.Min;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDateTime;

@Data
public class CompanySearch {
    private String companyName;
    private CompanyType companyType;
    private String companyAddress;


    @Min(value = 0,  message = "Page is less than 0")
    private Integer page = 0;
    @Range(min = 1, max = 50, message = "Size is less than 0 or more than 50")
    private Integer size = 10;
    private SortType sortBy = SortType.CREATED_AT;
    private Boolean ascending = false;
    private LocalDateTime startDate;
    private LocalDateTime endDate;


}
