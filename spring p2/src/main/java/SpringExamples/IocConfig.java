package SpringExamples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("SpringExamples")
@PropertySource("classpath:Values.properties")
public class IocConfig {
    @Bean
    public ICustomerDal database(){
        return new MySQLCustomer();
    }

    @Bean
    public ICustomerService service(){
        return new CustomerManager(database()); //referans oluşturarak bağımlılığını değiştirdik
    }


}
