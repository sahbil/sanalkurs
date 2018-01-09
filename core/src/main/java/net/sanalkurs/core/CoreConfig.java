package net.sanalkurs.core;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Configure core as a library project
 *
 * @author Xiabili Xiahilil on 09/01/2018.
 */
@Configuration
@EntityScan("net.sanalkurs.core.*")
@EnableJpaAuditing
@EnableJpaRepositories
@EnableTransactionManagement
@ComponentScan(basePackages = {"net.sanalkurs.core.*"})
public class CoreConfig {

}
