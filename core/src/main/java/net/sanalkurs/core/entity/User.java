package net.sanalkurs.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

/**
 * Represents an User as an entity.
 *
 * @author Xiabili Xiahilil on 09/01/2018.
 */
@Entity
public final class User extends BaseEntity {

    /**
     * Because of an user should login with their email address, therefore the column email must be
     * unique
     */

    @Getter
    @Setter
    @NotBlank
    private String firstName;

    @Getter
    @Setter
    @NotBlank
    private String lastName;

    @Getter
    @Setter
    @NotBlank
    @Column(unique = true)
    private String email;

}
