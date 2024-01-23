package de.skyfly.callanalyse.Entities;

import jakarta.persistence.*;
import org.hibernate.Length;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.Set;

@Entity(name = "package_name")
@Cacheable
public class PackageName {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(unique = true, length= Length.LONG32)
    private String gaString;



    @OneToOne(fetch = FetchType.LAZY)
    private CalculatedResult calculatedResult;


    @OneToMany(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "packageName"
    )
    public Set<PackageVersion> versionsList;

    private Boolean processed = false;


    public void setVersionsList(Set<PackageVersion> versionsList)
    {
        this.versionsList = versionsList;
    }

    public Set<PackageVersion> getVersionsList()
    {
        return versionsList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public void setGaString(String Ga) {
        this.gaString = Ga;
    }

    public String getGaString() {
        return gaString;
    }


    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }
}
