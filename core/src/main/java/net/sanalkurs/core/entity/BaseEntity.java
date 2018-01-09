package net.sanalkurs.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * The base class for all entities.
 *
 * @author Xiabili Xiahilil on 09/01/2018.
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * The primary key in the database (SQL "PRIMARY KEY").
     *
     * NOTE: It is not named 'id', because id could be used for public identification.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long primaryKey;

    @Version
    @JsonIgnore
    @Column(name = "version")
    private Long entityVersion;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private long createAt;

    @Column(nullable = false)
    @LastModifiedDate
    private long updateAt;

    /**
     * @return True when entity was persisted in database.
     */
    public final boolean isPersisted () {
        return primaryKey != 0;
    }

}
