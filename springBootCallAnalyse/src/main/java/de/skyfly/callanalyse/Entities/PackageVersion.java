package de.skyfly.callanalyse.Entities;

import jakarta.persistence.*;
import org.hibernate.Length;
import org.springframework.data.annotation.Id;

@Entity(name = "package_version")
public class PackageVersion {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length= Length.LONG32, name = "ga_string")
    private String gaString;

    @Column(unique = true, length= Length.LONG32)
    private String urlJar;


    @ManyToOne
    public PackageName packageName;



    public PackageVersion(PackageName packageName, String gaString, String urlJar) {
        this.packageName = packageName;
        this.gaString = gaString;
        this.urlJar =urlJar;

    }

    public PackageVersion() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public void setUrlJar(String urlJar) {
        this.urlJar = urlJar;
    }

    public String getUrlJar() {
        return urlJar;
    }


    public void setGaString(String Ga) {
        this.gaString = Ga;
    }

    public String getGaString() {
        return gaString;
    }


}
