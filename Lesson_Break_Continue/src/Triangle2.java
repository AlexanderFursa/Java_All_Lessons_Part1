import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle2 {
  // дано одно натуральное нечётное число - ширина основания
  // нужно вывести равнобедренный треугольник с таким основанием

  // Пример для стороны 5:
  // *
  // **
  // ***
  // **
  // *

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int shirina = Integer.parseInt(br.readLine());
    int polovina = shirina / 2;

    // двумя отдельными циклами
    // циклы раз (2 строчки): // polovina
    // *
    // **
    for (int dlinaStroki = 1; dlinaStroki <= polovina; ++dlinaStroki) {
      for (int i = 0; i < dlinaStroki; ++i) { // напечатай dlinaStroki звёздочек
        System.out.print('*');
      }
      System.out.println();
    }

    // ***
    for (int i = 0; i < polovina + 1; ++i) { // напечатай (polovina + 1) звёздочек
      System.out.print('*');
    }
    System.out.println();

    // циклы два (2 строчки): // polovina
    // **
    // *
    for (int dlinaStroki = polovina; dlinaStroki > 0; --dlinaStroki) {
      for (int i = 0; i < dlinaStroki; ++i) { // напечатай dlinaStroki звёздочек
        System.out.print('*');
      }
      System.out.println();
    }

//    for (int i = 0; i < n; ++i) { // повтори цикл n раз
  }
}