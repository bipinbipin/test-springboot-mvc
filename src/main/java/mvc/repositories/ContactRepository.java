package mvc.repositories;

import mvc.models.ContactModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bipin on 3/17/2016.
 */
public interface ContactRepository extends CrudRepository<ContactModel, Integer> {
}
