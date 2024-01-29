package de.skyfly.callanalyse.Entities;

import jakarta.persistence.*;
import org.hibernate.Length;
import org.springframework.data.annotation.Id;

/**  This class represents a package version in the database. */
@Entity(name = "package_version")
public class PackageVersion {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // The GA string for this package version.
    @Column(length= Length.LONG32, name = "ga_string")
    private String gaString;

    // The URL to download the jar file for this package version.
    @Column(unique = true, length= Length.LONG32)
    private String urlJar;

    // The associated package name for this package version.
    @ManyToOne
    public PackageName packageName;


    public PackageVersion(PackageName packageName, String gaString, String urlJar) {
        this.packageName = packageName;
        this.gaString = gaString;
        this.urlJar = urlJar;
    }
    
    /**
     * Default constructor for a new PackageVersion object.
     */
    public PackageVersion() {
    
    }

    /**
     * Set the id of the package version.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Get the id of the package version.
     */
    public Long getId() {
        return id;
    }

    /**
     * Set the URL for downloading the package version's jar file.
     */
    public void setUrlJar(String urlJar) {
        this.urlJar = urlJar;
    }

    /**
     * Get the URL for downloading the package version's jar file.
     */
    public String getUrlJar() {
        return urlJar;
    }

    /**
     * Set the GaString of the package version.
     */
    public void setGaString(String Ga) {
        this.gaString = Ga;
    }

    /**
     * Get the GaString of the package version.
     */
    public String getGaString() {
        return gaString;
    }


}
