package de.skyfly.callanalyse.Entities;

import org.springframework.data.annotation.Id;
import jakarta.persistence.*;


/** Entity class representing an app status. */
@Entity(name = "appStatus")
@Cacheable
public class AppStatus {
    /**
     * Unique ID for this app status.
     */
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     *  getter for the status
     * @return get the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the status of this app status.
     *
     * @param status set Name of status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    @Column(unique = true)
    private String status = "status";

    /**
     * Gets whether the index building is finished.
     *
     * @return Status of Index Build
     */
    public Boolean getBuildIndexFinish() {
        return buildIndexFinish;
    }

    /**
     * Sets whether the index building is finished.
     *
     * @param buildIndexFinish set new status of index building
     */
    public void setBuildIndexFinish(Boolean buildIndexFinish) {
        this.buildIndexFinish = buildIndexFinish;
    }

    private Boolean buildIndexFinish = false;


    /**
     * Sets the value of the id field to the specified value.
     *
     * @param id The new value to set the id field to
     */
    public void setId(Long id) {
        // Sets the value of the id field to the specified value
        this.id = id;
    }

    /**
     * Returns the current value of the id field.
     *
     * @return The current value of the id field
     */
    public Long getId() {
        // Returns the current value of the id field
        return id;
    }
    
}
