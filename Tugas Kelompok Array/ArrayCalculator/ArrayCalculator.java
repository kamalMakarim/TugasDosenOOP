import java.util.Scanner;

public class ArrayCalculator {
  public int[] array1;
  public int[] array2;

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = input.nextInt();
    int[] array1 = new int[size];
    int[] array2 = new int[size];

    System.out.println("Enter the first array: ");
    for (int i = 0; i < array1.length; i++) {
      array1[i] = input.nextInt();
    }
    System.out.println("Enter the second array: ");
    for (int i = 0; i < array2.length; i++) {
      array2[i] = input.nextInt();
    }
    int choice;
    do
    {
      System.out.println("=======================");
      System.out.println("Enter 1 to add the arrays");
      System.out.println("Enter 2 to subtract the arrays");
      System.out.println("Enter 3 to change the data in the arrays");
      System.out.println("Enter 4 to exit");
      System.out.println("=======================");
      choice = input.nextInt();

      switch (choice) {
        case 1:
          addArray(array1, array2);
          break;
        case 2:
          subtract(array1, array2);
          break;
        case 3:
          changeData(array1, array2);
          break;
        case 4:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice");
          break;
      }
    } while (choice != 4);
  }

  public static void changeData(int[] array1, int[] array2) {
    //choose what array to change
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1 to change the first array");
    System.out.println("Enter 2 to change the second array");
    int choice = input.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Enter the index of the array you want to change");
        int index = input.nextInt();
        System.out.println("Enter the new value");
        int value = input.nextInt();
        array1[index] = value;
        break;
      case 2:
        System.out.println("Enter the index of the array you want to change");
        int index2 = input.nextInt();
        System.out.println("Enter the new value");
        int value2 = input.nextInt();
        array2[index2] = value2;
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }

  }

  ;

  public static void addArray(int[] array1, int[] array2) {
    int[] array3 = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
      array3[i] = array1[i] + array2[i];
    }
    for (int i = 0; i < array3.length; i++) {
      System.out.println(array3[i]);
    }
  }

  public static void subtract(int[] array1, int[] array2) {
    int[] array3 = new int[array1.length];
    for (int i = 0; i < array1.length; i++) {
      array3[i] = array1[i] - array2[i];
    }
    for (int i = 0; i < array3.length; i++) {
      System.out.println(array3[i]);
    }
  }

}
