import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
       Random chisla = new Random();
        int i=1;
        int[] values = new int[7];
        boolean not_in_array;

        while (i <= 6) {
            not_in_array = true;
            int randomNumber = chisla.nextInt(34) + 1; // Generate numbers between 1 and 34
            for (int b : values){
                if (randomNumber == b){
                    not_in_array = false;
                }
            }
            if (not_in_array){
                System.out.println("Number " + i+ ": " + randomNumber);
                values[i] = randomNumber;
                i++;
            }
      }
}
}