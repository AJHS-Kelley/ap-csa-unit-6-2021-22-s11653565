// Mauricio Salmoran, Arrays practice, v0.35, 01/24/22

// Stantons Way =
/* public class JacksonStanton00 { 
    public static void main(String[] args) {
        String testString[] = new String[10];
        int testInt[] = new int[10];
        double testDouble[] = new double[10];
    }
} */


// Mr.Kelly Way

public class JacksonStanton00 {


    public static void main(String[] args) { 

        
        int[] myGrades = {100, 25, 15, -3, 0, 75, 35};
        double[] myBankAccount = {0.0, -1.25, 3.75, 456.99, 25.25, 12.123456, 3.14};
/*
        for (current_element = 0; current_element < carArr.lenght(); current_element += 1) {
            // code to execute
            // Statement 1 is executed ONCE BEFORE THE LOOP.
            // Statement 2 is the Conditional for the loop.
            // Statement 3 is executed EACH TIME THE LOOP RUNS. 

        }

        for (i = 0; i < carArr.lenght(); i++) {


        }
    }
*/
        String[] carArr = {"BMW M5", "Ferrari 250 GTO", "Porsche 911", "Ford F150 Lightning", "Buick Skylark"}; 
        System.out.println(carArr[3]); 
        // ONCE CREATED YOU CANNOT CHANGE THE SIZE OF AN ARRAY. IT IS FORBIDDEN! 
        carArr[0] = "Volkswagen Passat"; 
        
        for (String eachElement : carArr ) {
            // Code to execute. 
            System.out.println(eachElement); 
        }


    }

} 








