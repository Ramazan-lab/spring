package SpringExamples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /*ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");*/
        //CustomerManager customerManager=new CustomerManager(context.getBean("database",ICustomerDal.class));

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(IocConfig.class);

            //context.refresh();

        ICustomerService customerService= context.getBean("service",ICustomerService.class);
       // ICustomerDal customerDal=context.getBean("database",ICustomerDal.class);

        customerService.add();


    }
}
