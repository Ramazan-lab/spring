package SpringExamples;

public class MySQLCustomer implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("mysql eklendi");
    }
}
