package Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import models.Yelp_business;

@Repository
public interface BusinessRepository extends CrudRepository<Yelp_business, String> {

    @Query("SELECT DISTINCT CATEGORY FROM DBO.YELP_BUSINESS")
    List<?> findCategory();

}