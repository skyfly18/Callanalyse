package de.skyfly.callanalyse.Repositories;

import de.skyfly.callanalyse.Entities.AppStatus;
import de.skyfly.callanalyse.Entities.PackageName;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppStatusRepository extends CrudRepository<AppStatus,Long> {

    AppStatus findByStatus(String Status);

    Boolean existsByStatus(String Status);


}
