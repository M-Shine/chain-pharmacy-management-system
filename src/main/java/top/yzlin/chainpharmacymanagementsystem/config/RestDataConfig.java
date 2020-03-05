package top.yzlin.chainpharmacymanagementsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import top.yzlin.chainpharmacymanagementsystem.entity.Customer;
import top.yzlin.chainpharmacymanagementsystem.entity.Medicine;
import top.yzlin.chainpharmacymanagementsystem.entity.Store;
import top.yzlin.chainpharmacymanagementsystem.entity.User;

@Configuration
public class RestDataConfig {
    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {
        return new RepositoryRestConfigurer() {
            @Override
            public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
                config.exposeIdsFor(
                        Medicine.class,
                        Customer.class,
                        Store.class,
                        User.class
                );
            }
        };

    }
}
