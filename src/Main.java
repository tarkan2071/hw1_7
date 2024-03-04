
import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        String order="order";
        String substr1 = order.substring(0,2);
        System.out.println(substr1);
        String operator="operator";
        String substr2 = operator.substring(0,2);
        String corporate_customer="corporate_customer";
        String substr3 = corporate_customer.substring(0,2);
        String retail_customer="retail_customer";
        String substr4 = retail_customer.substring(0,2);



        String [] my_context=new String[100];

        File file = new File("content.txt");
        Scanner my_scan = null;
        int i=0;



        try {
            // Create a Scanner to read from the file
            my_scan = new Scanner(file);

            // Read each line from the file until the end
            while (my_scan.hasNextLine()) {
                String line = my_scan.nextLine();
               // String line = my_scan.split("\n");
                my_context[i]=line;

                i++;

            }
        } catch (FileNotFoundException e) {
            // Handle file not found exception
            e.printStackTrace();
        } finally {
            // Close the Scanner in the finally block to ensure it's always closed
            if (my_scan != null) {
                my_scan.close();
            }


            int countOfOrder = 0;
            int countOfOperator=0;
            int countOfRetail=0;
            int countOfCorporate=0;

            order [] my_orders_array = new order[100];
            retail_customer [] my_retail =new retail_customer[100];
            corporate_customer [] my_corporate =new corporate_customer[100];
            operator [] my_operator = new operator[100];


            for (int iter = 0; iter < i; iter++) {
                if (my_context[iter].substring(0, 2).equals(substr1)) {
                    System.out.println(my_context[iter]);
                    System.out.println("order");

                    String[] order_words = my_context[iter].split(";");
                    int countOfWord= order_words.length;


                    if (countOfWord == 6) {
                        my_orders_array[countOfOrder] = new order(order_words[1], Integer.parseInt(order_words[2]), Integer.parseInt(order_words[3]), Integer.parseInt(order_words[4]), Integer.parseInt(order_words[5]));
                        System.out.println("burdayım  order");
                        countOfOrder++;

                    }

                    int index = 0;
                    while (index < order_words.length) {
                        System.out.println(order_words[index]);
                        index++;
                    }
                } else if (my_context[iter].substring(0, 2).equals(substr2)) {
                    System.out.println(my_context[iter]);
                    System.out.println("operator");

                    String[] operator_words = my_context[iter].split(";");

                    int countOfWord1= operator_words.length;

                    if (countOfWord1 == 7) {
                        my_operator[countOfOperator] = new operator(operator_words[1], (operator_words[2]), (operator_words[3]), (operator_words[4]), Integer.parseInt(operator_words[5]),Integer.parseInt(operator_words[6]));
                        System.out.println("burdayım operator karraıym");
                        countOfOperator++;

                    }

                    int index = 0;
                    while (index < operator_words.length) {
                        System.out.println(operator_words[index]);
                        index++;
                    }




                } else if (my_context[iter].substring(0, 2).equals(substr3)) {
                    System.out.println(my_context[iter]);
                    System.out.println("corp");

                    String[] corporate_words = my_context[iter].split(";");

                    int countOfWord2= corporate_words.length;

                    if (countOfWord2 == 8) {
                        my_corporate[countOfCorporate] = new corporate_customer(corporate_words[1], (corporate_words[2]),(corporate_words[3]), (corporate_words[4]), Integer.parseInt(corporate_words[5]),Integer.parseInt(corporate_words[6]),corporate_words[7]);
                        System.out.println("burdayım");
                        countOfCorporate++;

                    }

                    int index = 0;
                    while (index < corporate_words.length) {
                        System.out.println(corporate_words[index]);
                        index++;
                    }

                } else if (my_context[iter].substring(0, 2).equals(substr4)) {
                    System.out.println(my_context[iter]);
                    System.out.println("retail");


                    String[] retail_words = my_context[iter].split(";");

                    int countOfWord3= retail_words.length;

                    if (countOfWord3 == 7) {
                       // my_orders_array[countOfOrder] = new order(order_words[1], Integer.parseInt(order_words[2]), Integer.parseInt(order_words[3]), Integer.parseInt(order_words[4]), Integer.parseInt(order_words[5]));
                        my_retail [countOfRetail]= new retail_customer(retail_words[1],retail_words[2],retail_words[3],retail_words[4],Integer.parseInt(retail_words[5]),Integer.parseInt(retail_words[6]));
                        System.out.println("burdayım");
                        countOfRetail++;

                    }

                    int index = 0;
                    while (index < retail_words.length) {
                        System.out.println(retail_words[index]);
                        index++;
                    }

                }
                else {
                    System.out.println("yarak");
                }
            }

            System.out.println(my_operator[0].name+"son");
            System.out.println(my_corporate[0].operator_id+"son");
            System.out.println(my_retail[0].phone+"son");


            System.out.println("Please enter your ID...");
            Scanner scanner = new Scanner(System.in);


            int my_number = 0;
            String my_input= scanner.nextLine();
            try {
                my_number = Integer.valueOf(my_input);
            } catch (NumberFormatException ex) {
                //not a number
                System.out.println("The given input is not an integer!");
            }
            int isOperator=0;

            for(int num1=0;num1<countOfOperator;num1++){

                if(my_number==my_operator[num1].ID){
                    isOperator++;
                    my_operator[num1].print_operator();
                    int count_customer=0;
                    for(int k=0;k<countOfRetail;k++){
                        if(my_number==my_retail[k].operator_id) {
                            count_customer++;
                            System.out.println("Customer #" + count_customer + " (a retail customer):");
                            my_retail[k].print_customer();
                            System.out.println("----------------------------");
                        }


                    }


                    for(int k1=0;k1<countOfCorporate;k1++){
                        if(my_number==my_corporate[k1].operator_id) {
                            count_customer++;
                            System.out.println("Customer #" + count_customer + " (a corporate customer):");
                            my_corporate[k1].print_customer();
                            System.out.println("----------------------------");
                        }

                    }

                    if(count_customer==0){
                        System.out.println("This operator doesn't have any customer.\n" +
                                "----------------------------");

                    }


                }


            }
            if (isOperator==0){


                for(int num2=0;num2<countOfRetail;num2++){
                    if(my_number==my_retail[num2].ID){
                        my_retail[num2].print_customer();

                    }


                }

                for (int num3=0;num3<countOfCorporate;num3++){
                    if(my_number==my_corporate[num3].ID){
                        my_corporate[num3].print_customer();

                    }
                }
            }



        }





        }





}




