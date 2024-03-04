public class  operator extends person{

   int wage;
   customer[] customers;

   public operator(String name, String surname, String address, String phone, int ID,int wage) {

      super(name,surname,address,phone,ID);
      this.wage = wage;
      //this.customers = customers;
   }

   void print_operator(){

      System.out.println(" *** Operator Screen ***");
      System.out.println("----------------------------");
      System.out.println("Name & Surname: "+name+" "+surname);
      System.out.println("Address: "+address);
      System.out.println("Phone: "+phone);
      System.out.println("ID: "+ID);
      System.out.println("Wage: "+wage);
      System.out.println("----------------------------");
   }
   void print_customer(){



   }
   void define_customer(customer[] m){



   }


}
