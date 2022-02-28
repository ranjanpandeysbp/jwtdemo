package com.mycompany.jwtdemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GstTrackerWrapper {
    private String gstNo;
    List<GstTrackerDTO> gstDetails;
}
