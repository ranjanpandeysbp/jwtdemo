package com.mycompany.jwtdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class GstTrackerDetail {
    private String month;
    private Integer year;
    private Boolean isFiled;
    private LocalDate dateOfFiling;
}
