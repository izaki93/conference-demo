package com.pluralsight.conferencedemo.config;

import org.springframework.context.annotation.Configuration;

// Overide spring configuration with java config
@Configuration
public class PersistenceConfiguration {

   /* @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url(env.getProperty("DB_URL"));
        builder.username(env.getProperty("DB_USER_NAME"));
        builder.password(env.getProperty("DB_PASSWORD"));
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();
    }*/

}
