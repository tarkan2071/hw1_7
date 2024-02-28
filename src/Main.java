
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


         */

        }
    }

}