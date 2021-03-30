package net.lgylgy.proto.manager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

    @Column(name = "project_id")
    private Integer projectID;

    @Column(name = "project_name")
    private String projectName;

    private String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getProject_ID() {
        return projectID;
    }

    public void setProject_ID(Integer projectID) {
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
