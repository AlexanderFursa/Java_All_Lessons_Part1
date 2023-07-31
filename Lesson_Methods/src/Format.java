public class Format {
  public static void main(String[] args) {
    // %s - String
    // %d - целое число: byte, short, int, long
    // %f - вещественное число: float, double
    // %e - научная нотация (1.23E+2 == 1,23 * 10^2)
    // %c - char

    String word = "УРА!";
    // аргументы нумеруются с 1
    // %номер$формат
    System.out.printf("%1$s %1$s %1$s%n", word); // УРА! УРА! УРА!
    System.out.printf("%3$d %2$d %1$d%n", 3, 5, 7); // 7 5 3

    double pi = Math.PI;

    System.out.printf("%f%n", pi);       // -->  "3.141593"
    // %.знаковПослеЗапятойf - указание количества знаков после запятой
    // %.2f - ОКРУГЛИТЬ до двух знаков после запятой
    System.out.printf("%.3f%n", pi);     // -->  "3.142"

    // %ширинаd
    // до ширины заполнит пробелами, выравнивание по правому краю
    // если в ширину не поместится - проигнорирует ширину
    System.out.printf("%10d%n", 123);
    System.out.printf("%2d%n", 123); // выведется, как обычно, проигнорирует ширину, иначе не поместится
    // %ширинаs
    System.out.printf("%10s%n", word); // -->  "      УРА!"
    // %ширинаf
    // %ширина.знаковПослеЗапятойf - ширина вместе с запятой и знаками после неё
    System.out.printf("%15.3f%n", pi);   // -->  "          3.142"

    // %-ширинаd
    System.out.printf("%-10d%n", 123);
    // %-ширинаf
    // %-ширина.знаковПослеЗапятойf
    // такая же ширина, но выравнивание по левому краю, а потом пробелы
    System.out.printf("%-10.3f%n", pi);  // -->  "3.142     "

    // научная нотация - работает так же, как f, только e
    // ширина считается у всей записи вместе
    System.out.printf("%10.3e%n", pi);  // -->  "3.142e+00"

    // с форматом можно использовать и строковые литералы, но зачем?
    System.out.printf("%10s%n", "HELLO"); // -->  "     HELLO"
    // System.out.printf("     HELLO");
  }
}