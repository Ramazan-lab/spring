package SpringExamples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerManager customerManager=new CustomerManager(context.getBean("database",ICustomerDal.class));

        ICustomerService customerService= context.getBean("service",ICustomerService.class);


        customerService.add();


    }
}
