package SpringExamples;

public class CustomerManager implements ICustomerService {
    //yönetim kodları

   private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        customerDal.add();

    }

}
