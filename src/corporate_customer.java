public class corporate_customer extends customer{

    String company_name;

    public corporate_customer(String name, String surname, String address, String phone, int ID, int operator_id,String company_name) {
        super(name,surname,address,phone,ID,operator_id);

        this.company_name = company_name;
    }

    void print_customer(){

        System.out.println("Name & Surname: " +name+" "+surname);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("ID: "+ID);
        System.out.println("Operator ID: "+operator_id);
        System.out.println("Company Name: "+company_name);


    }
}
