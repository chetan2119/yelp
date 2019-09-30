package Repository;

import org.springframework.data.repository.CrudRepository;

import models.Yelp_location;

public interface LocationRepository extends CrudRepository<Yelp_location, Integer> {

}