public abstract class customer extends person{
    order [] orders;
    int operator_id;

    void print_customer(){


        System.out.println("Name & Surname: " +name+" "+surname);
        System.out.println("Address: "+address);
        System.out.println("Phone: "+phone);
        System.out.println("ID: "+ID);
        System.out.println("Operator ID: "+operator_id);

    }

    public customer(String name, String surname, String address, String phone, int ID, int operator_id) {
        super(name,surname,address,phone,ID);
        //this.orders = orders;
        this.operator_id = operator_id;
    }

    void print_orders(){


    }

    void define_orders(order []k){

    }

}
