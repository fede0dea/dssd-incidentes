package io.dssd.model;

import io.dssd.model.incident.IncidentType;

import java.util.Date;

public class Incident {

    private Long id;
    private IncidentType type;
    private Long objectQuantity;
    private Date createdAt;

}
