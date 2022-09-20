package SpringExamples;

import org.springframework.beans.factory.annotation.Value;

public class MySQLCustomer implements ICustomerDal{
    @Value("${database.connectionString}")
    String connectionString;


    @Value("${local.email}")
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println("Connection String: " +this.connectionString);
        System.out.println("email: "+this.email);
        System.out.println("mysql eklendi");
    }
}
