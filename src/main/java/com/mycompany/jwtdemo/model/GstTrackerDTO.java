package com.mycompany.jwtdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GstTrackerDTO {
    private String returnType;
    private List<GstTrackerDetail> filingDetails;
}
