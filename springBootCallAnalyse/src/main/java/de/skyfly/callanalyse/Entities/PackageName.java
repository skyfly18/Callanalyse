package de.skyfly.callanalyse.Entities;

import jakarta.persistence.*;
import org.hibernate.Length;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Set;

@Entity(name = "package_name")
@Cacheable
public class PackageName {
    // Primary key of the entity
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // Unique identifier for this package
    @Column(unique = true, length= Length.LONG32)
    private String gaString;



    @OneToOne(fetch = FetchType.LAZY)
    private CalculatedResult calculatedResult;

    // List of PackageVersions
    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "packageName"
    )
    public Set<PackageVersion> versionsList;

    // Whether or not the entity has been processed
    private Boolean processed = false;


    /**
     * This method sets the versionsList variable to the given Set of PackageVersion objects.
     * @param versionsList set of PackageVersions
     */
    public void setVersionsList(Set<PackageVersion> versionsList) {
        this.versionsList = versionsList;
    }

    /**
     * This method returns the current versionList, which is a Set of PackageVersion objects.
     * @return set of PackageVersions
     */
    public Set<PackageVersion> getVersionsList() {
        return versionsList;
    }

    /**
     * This method sets the ID variable to the given Long value.
     * @param id Databank
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method returns the current ID, which is a Long integer.
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * This method sets the gaString variable to the given String value.
     * @param Ga
     */
    public void setGaString(String Ga) {
        this.gaString = Ga;
    }

    /**
     * This method returns the current gaString, which is a String value.
     * @return
     */
    public String getGaString() {
        return gaString;
    }

    /**
     * This method returns the processed variable, which is a Boolean indicating whether or not the package has been processed.
     * @return
     */
    public Boolean getProcessed() {
        return processed;
    }

    /**
     * This method sets the processed variable to the given value, which should be a boolean value indicating whether or not the package has been processed.
     * @param processed
     */
    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }
}
