package net.sanalkurs.core.repo;

import net.sanalkurs.core.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * The DAO for user operation interruptions.
 *
 * @author Xiabili Xiahilil on 09/01/2018.
 */
@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

}
