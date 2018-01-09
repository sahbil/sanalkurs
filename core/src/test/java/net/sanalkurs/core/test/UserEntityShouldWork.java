package net.sanalkurs.core.test;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.Lists;
import net.sanalkurs.core.CoreConfig;
import net.sanalkurs.core.entity.User;
import net.sanalkurs.core.repo.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Testing the user for all operations
 *
 * @author Xiabili Xiahilil on 09/01/2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreConfig.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@ContextConfiguration(classes = {UserRepository.class})
public class UserEntityShouldWork {

    @Autowired
    UserRepository userRepository;

    @Test
    public void createNewUser () {
        // it should be empty first
        assertThat(Lists.newArrayList(userRepository.findAll()).size()).isEqualTo(0);
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setEmail("sahbil@sanalkurs.net");
        User savedUser = userRepository.save(user);
        assertThat(Lists.newArrayList(userRepository.findAll()).size()).isEqualTo(1);
        assertThat(savedUser.getEmail()).isEqualToIgnoringCase(user.getEmail());
        assertThat(savedUser.getPrimaryKey()).isNotNull();
    }
}
