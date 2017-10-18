package io.dssd.model;

import java.util.List;

public class File {

    private Long id;
    private String externalId;

    private Incident incident;
    private Budget budget;

    private List<Photo> photographs;
    private User employee;

    private boolean authorized;

}
