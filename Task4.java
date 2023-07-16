// Напишите программу создающую:
// Øмассив размера 5 элементов + заполнить его рандомальными целыми числами от 0 до 100.
// Øмассив размера 5 элементов + заполнить его произвольными именами.
// ØВывести на экран: Имя и оценку ученика с наибольшей оценкой*.
public class Task4 {
    public static void main(String[] args) {
        int[] grades = new int[5];
        String[] names = {"Anton", "Ivan", "Boris", "Stepan", "Rebeca"};

        // Присваиваем рандомные значения массиву от 0 до 100
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random()*101);}

        
        // // Присваиваем оценки именам
        // for (int i = 0; i < names.length; i++) {
        //     System.out.print(names[i] + " " + grades[i] + "\n");}

        
        int MaxGrade = 0;
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[MaxGrade]) {
                MaxGrade = i; }
        }

        System.out.print("The best student is " + names[MaxGrade] + "\n" + "His grade is " + grades[MaxGrade]);




  }
}
