package de.skyfly.callanalyse.Repositories;

import de.skyfly.callanalyse.Entities.PackageVersion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.net.URI;

@Repository
public interface PackageVersionRepository extends CrudRepository<PackageVersion,Long> {

    Boolean existsByGaString(String Ga);

    Boolean existsByUrlJar(String urlJar);

    PackageVersion findByUrlJar(String urlJar);


}
