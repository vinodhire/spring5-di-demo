package com.vinod.didemo.config;

import com.vinod.didemo.examplebeans.FakeDataSource;
import com.vinod.didemo.examplebeans.FakeJMSBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
public class PropertyConfig {

    /*@Autowired
    private Environment environment;*/

    @Value("${ds.username}")
    private String user;

    @Value("${ds.password}")
    private String password;

    @Value("${ds.jdbcUrl}")
    private String url;


    @Value("${jms.username}")
    private String jmsUser;

    @Value("${jms.password}")
    private String jmsPassword;

    @Value("${jms.jdbcUrl}")
    private String jmsUrl;

    @Bean
    public  FakeJMSBroker fakeJMSBroker(){
        FakeJMSBroker fakeJMSBroker = new FakeJMSBroker();
        fakeJMSBroker.setUsername(this.jmsUser);
        fakeJMSBroker.setPassword(this.jmsPassword);
        fakeJMSBroker.setUrl(this.jmsUrl);
        return fakeJMSBroker;
    }

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(this.password);
        fakeDataSource.setUser(this.user);
        fakeDataSource.setUrl(this.url);
        return fakeDataSource;
    }

    /*@Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }*/

}
