package de.skyfly.callanalyse.Repositories;

import de.skyfly.callanalyse.Entities.CalculatedResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatedResultRepository extends CrudRepository<CalculatedResult,Long> {


}
