
import  java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*


değişiklikler constructor

methodları yazacaz, birbirlerine array koyma

exceptionslar var

id public yap


4 ten 8 sonra 1 saat ara

public class Read2DArray {

    private static final int ROWS = 10;
    private static final int COLUMNS = 10;

    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    private static void readFile() throws FileNotFoundException {
        int[][] numArray = new int[ROWS][COLUMNS];
        Scanner sc = new Scanner(choseTextFile());
        while (sc.hasNextLine()) {
            for (int i = 0; i < numArray.length; i++) {
                String[] line = sc.nextLine().trim().split("," + " ");
                for (int j = 0; j < line.length; j++) {
                    numArray[i][j] = Integer.parseInt(line[j]);
                }
            }
        }
        System.out.println(Arrays.deepToString(numArray));
    }

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello karray!");

        String order="order";
        String substr1 = order.substring(0,2);
        System.out.println(substr1);
        String operator="operator";
        String substr2 = operator.substring(0,2);
        String corporate_customer="corporate_customer";
        String substr3 = corporate_customer.substring(0,2);
        String retail_customer="retail_customer";
        String substr4 = retail_customer.substring(0,2);

        corporate_customer ana = new corporate_customer();

        ana.print_orders();
        /*String [][] my_text=new String[100][100];
        File file = new File("content.txt");
        Scanner = ;
        int i=0;
        int countOfLine=

*/
        String [] my_context=new String[100];

        File file = new File("content.txt");
        Scanner my_scan = null;
        int i=0;
        int countOfLine=0;
        //System.out.println(my_scan.nextLine());

        try {
            // Create a Scanner to read from the file
            my_scan = new Scanner(file);

            // Read each line from the file until the end
            while (my_scan.hasNextLine()) {
                String line = my_scan.nextLine();
               // String line = my_scan.split("\n");
                my_context[i]=line;
                System.out.println(line); // Print each line to the console
               // System.out.print(my_context[i]); // Print each line to the console

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

            System.out.println("line=" + i);
            System.out.println(my_context[0]);
            System.out.println(my_context[1]);
            int countOfOrder = 0;
            int countOfOperator=0;
            int countOfretail=0;
            int countOfcorporate=0;

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
                        System.out.println("burdayım");
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

                    String[] order_words = my_context[iter].split(";");

                    int countOfWord1= order_words.length;

                    if (countOfWord1 == 7) {
                        my_orders_array[countOfOrder] = new order(order_words[1], Integer.parseInt(order_words[2]), Integer.parseInt(order_words[3]), Integer.parseInt(order_words[4]), Integer.parseInt(order_words[5]));
                        System.out.println("burdayım");
                        countOfOrder++;

                    }

                    int index = 0;
                    while (index < order_words.length) {
                        System.out.println(order_words[index]);
                        index++;
                    }




                } else if (my_context[iter].substring(0, 2).equals(substr3)) {
                    System.out.println(my_context[iter]);
                    System.out.println("corp");

                    String[] order_words = my_context[iter].split(";");

                    int countOfWord2= order_words.length;

                    if (countOfWord2 == 8) {
                        my_orders_array[countOfOrder] = new order(order_words[1], Integer.parseInt(order_words[2]), Integer.parseInt(order_words[3]), Integer.parseInt(order_words[4]), Integer.parseInt(order_words[5]));
                        System.out.println("burdayım");
                        countOfOrder++;

                    }

                    int index = 0;
                    while (index < order_words.length) {
                        System.out.println(order_words[index]);
                        index++;
                    }

                } else if (my_context[iter].substring(0, 2).equals(substr4)) {
                    System.out.println(my_context[iter]);
                    System.out.println("ret");


                    String[] order_words = my_context[iter].split(";");

                    int countOfWord3= order_words.length;

                    if (countOfWord3 == 7) {
                       // my_orders_array[countOfOrder] = new order(order_words[1], Integer.parseInt(order_words[2]), Integer.parseInt(order_words[3]), Integer.parseInt(order_words[4]), Integer.parseInt(order_words[5]));
                        System.out.println("burdayım");
                        countOfOrder++;

                    }

                    int index = 0;
                    while (index < order_words.length) {
                        System.out.println(order_words[index]);
                        index++;
                    }

                }
                else {
                    System.out.println("yarak");
                }
            }
            // my_orders_array[countOfOrder](order_words[1],order_words[1],)
           // System.out.println(my_orders_array[0].customer_ID);

        }




        }




}

/*

import  java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello karray!");

        corporate_customer ana = new corporate_customer();

        ana.print_orders();

        String [] my_context=new String[100];

        File file = new File("content.txt");
        Scanner my_scan = null;
        int i=0;
        int countOfLine=0;
        //System.out.println(my_scan.nextLine());

        try {
            // Create a Scanner to read from the file
            my_scan = new Scanner(file);

            // Read each line from the file until the end
            while (my_scan.hasNextLine()) {
                String line = my_scan.nextLine();
                my_context[i]=line;
                //System.out.println(line); // Print each line to the console
                System.out.println(my_context[i]); // Print each line to the console

                i++;

            }
        } catch (java.io.FileNotFoundException e) {
            // Handle file not found exception
            e.printStackTrace();
        } finally {
            // Close the Scanner in the finally block to ensure it's always closed
            if (my_scan != null) {
                my_scan.close();
            }

            System.out.println("line="+i);
            String [][] my_split=new String[100][100];
            for (int j=i-1;j>=0;j--) {
                //System.out.print(str + ", ");
                int k = 0;
                for (String str : my_context) {

                    my_split[k] = (my_context[j].split(";"));
                            k++;

                }

            }
            System.out.println(my_split[0][5]);


            /*




        import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Provide the path to your text file
        String filePath = "path_to_your_file.txt";

        // Create a File object representing your text file
        File file = new File(filePath);

        java.util.Scanner scanner = null;

        try {
            // Create a Scanner to read from the file
            scanner = new java.util.Scanner(file);

            // Read each line from the file until the end
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line); // Print each line to the console
            }
        } catch (java.io.FileNotFoundException e) {
            // Handle file not found exception
            e.printStackTrace();
        } finally {
            // Close the Scanner in the finally block to ensure it's always closed
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}




        }
                }

                }
 */