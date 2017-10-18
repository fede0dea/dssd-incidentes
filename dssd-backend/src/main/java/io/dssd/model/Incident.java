package io.dssd.model;

import io.dssd.model.incident.IncidentType;

import java.util.Date;
import java.util.List;

public class Incident {

    private Long id;
    private IncidentType type;
    private Client client;
    private List<Object> objects;
    private String description;
    private Date createdAt;

}
