package com.walker.zero.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author walker
 */
@SpringBootApplication
@ComponentScan({
        "com.walker.zero"
})
@EnableJpaRepositories({
        "com.walker.zero"
})
@EntityScan({
        "com.walker.zero"
})
public class Bootstrap {
    public static void main(final String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
