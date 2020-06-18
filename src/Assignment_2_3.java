public class Assignment_2_3 {
    public static void main (String [] args) {
        
        //Tell the user what the program does
        System.out.println("This program calculates pounds per kilogram in a table.");

        //Print table header
        System.out.println("\tkilograms     pounds");
        System.out.println("\t---------     ------");

        

        for(int i = 1; i < 15; i++){
        int kilograms = 1;
        double pounds = kilograms * 2.2;
        System.out.format("%9d\t     %4.1f", kilograms, pounds);
        }

        System.out.println("\n");
    }
}