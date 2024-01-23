package de.skyfly.callanalyse.Entities;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;

@Entity(name = "appStatus")
@Cacheable
public class AppStatus {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(unique = true)
    private String status = "status";

    public Boolean getBuildIndexFinish() {
        return buildIndexFinish;
    }

    public void setBuildIndexFinish(Boolean buildIndexFinish) {
        this.buildIndexFinish = buildIndexFinish;
    }

    private Boolean buildIndexFinish = false;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
