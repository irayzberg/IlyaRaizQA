// Напишите следующую программу:
// ØСоздайте 2 массива из 4 случайных целых чисел из отрезка [0;8] каждый
// ØВыведите массивы на экран в двух отдельных строках
// ØПосчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
public class Task5 {
    public static void main(String[] args) {
        int[] array1 = new int[4];
        int[] array2 = new int[4];

        int sum1 = 0, sum2 = 0;

        System.out.println("Массив 1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random()*9);
            System.out.print(array1[i] + " ");
            sum1 += array1[i];}
            
        System.out.print("\n" + "Массив 2:" + "\n");

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random()*9);
            System.out.print(array2[i] + " ");
            sum2 += array2[i];}  


        int avg1 = sum1/array1.length;
        int avg2 = sum2/array2.length;

        System.out.print("\n" + "Среднее арифметическое массива 1: " + avg1 + "\n" + "Среднее арифметическое массива 2: " + avg2);
    
  }
}