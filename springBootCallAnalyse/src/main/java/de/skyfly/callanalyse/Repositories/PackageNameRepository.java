package de.skyfly.callanalyse.Repositories;

import de.skyfly.callanalyse.Entities.PackageName;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PackageNameRepository extends CrudRepository<PackageName,Long> {

    Boolean existsByGaString(String Ga);
    PackageName findByGaString(String Ga);

    PackageName findAllByProcessedIsFalse();

    @EntityGraph(attributePaths = "versionsList")
    PackageName getById(Long id);

    @EntityGraph(attributePaths = "versionsList")
    PackageName getByGaString(String Ga);




}
