// однострочный комментарий - от слешей до конца строки
/* многострочный комментарий - от слеша и звёздочки
   до звёздочки и слеша */
// комментарий игнорируется компьютером,
// даже если в комментарии есть код
// комментарии принято писать везде, где автору кажется, что его
// могут не понять
// и в тех местах, которые вы можете не понять позже

// сделать выделенный текст комментарием -- Ctrl + /
// делает (и возвращает) только однострочные комментарии
public class Main {
  // public - модификатор доступа, в данном случае - общедоступный
  /* класс - абстрактная (общая) категория, группа объектов
     объект - конкретный экземпляр класса */

  // static означает, что метод статический -
  // общий для всех экземпляров класса

  // внутри класса может быть только один метод с конкретными:
  // идентификатором доступа (public)
  // сроком жизни (static)
  // возвращаемым значением (void)
  // названием (main)
  // и набором аргументов (String[])
  //   (считаются только типа и последовательность)
  // вместе всё это сигнатура - public static void main(String[])
  // у каждого метода она должна быть уникальной
  // сигнатура - "полное имя" метода

  // метод public static void main(String[]) класса Main -
  // точка входа в программу -
  // место, с которого Java начнёт программу, даже если в ней
  // много файлов, классов и методов

  // void - означает, что у метода пустой результат -
  // оставшееся после него значение
  public static void main(String[] args) {
    // класс System
    // поле out (класса PrintStream)
    // метод println()

    // Команда System.out.println() -
    // команда вывода на экран аргументов и
    // ПОСЛЕ этого перехода на новую строку
    // ln - line
    System.out.println("Привет!");
    System.out.println("Bonjour!");
    System.out.println("Hello!");
    // команды пишутся по одной и заканчиваются "точкой с запятой"

    // Команда System.out.print() -
    // команда вывода на экран аргументов
    System.out.print("Привет!");
    // здесь может быть что-то ещё, а потом вывод надо продолжить
    // в той же строчке
    System.out.print("Bonjour!");
    System.out.println("Hello!"); // в конце вывода всей программы
    // принято писать println
    // последний print - всегда println
  }
}

