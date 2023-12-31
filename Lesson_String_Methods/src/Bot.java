import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ВНИМАНИЕ!
// Бот получился сложным, если вы не можете разобраться в нём сразу - не переживайте!
public class Bot {
  final public static int SMALL_PIZZA_PRICE = 700;
  final public static int LARGE_PIZZA_PRICE = 1050;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // Цель -- заказ пиццы
    System.out.println("Бот v.0.0.3 == ЗАКАЗ ПИЦЦЫ ==");

    // 1. Узнаём имя
    System.out.println("Как вас зовут?");
    String name = br.readLine();

    // 2. Узнаём адрес:
    // 2.1 Узнаём город
    System.out.println("Из какого вы города?");
    String city = br.readLine();
    //     Проверяем город (зона обслуживания -- Берлин)
    //     !Условие-стражник!
    if (city.equalsIgnoreCase("Берлин")) {
      // всё хорошо
      System.out.println("Замечательно!");
    } else if (city.equalsIgnoreCase("Berlin")) {
      // всё тоже хорошо
      System.out.println("Замечательно! Но дальше, пожалуйста, используйте русский язык.");
    } else {
      // всё плохо
      System.out.printf("К сожалению, ваш город пока не обслуживается. Нам очень жаль, %s!%n",
          name);
      return; // завершить программму (ВООБЩЕ)
    }
    // 2.2 Узнаём улицу и дом
    //     Однажды от этого будет зависеть стоимость и время доставки
    System.out.println("Введите улицу и номер дома: ");
    String building = br.readLine();
    // 2.3 Узнаём подъезд, квартиру и другие инструкции для курьера
    System.out.println("Введите инструкции для курьера (подъезд, этаж, квартира и др.)");
    String addressDetails = br.readLine();

    // 3. Узнаём всё про пиццу
    // 3.1 Название
    System.out.println("Введите название пиццы:");
    String pizza = br.readLine();
    // 3.2 Размер - выбор между большой и маленькой
    System.out.println("Выберите размер: S - маленькая, L - большая");
    String size = br.readLine().toUpperCase(); // если ввели "s", сделаем "S"
    boolean small; // true - маленькая, false - большая
    if (size.equals("S")) {
      small = true;
    } else if (size.equals("L")) {
      small = false; // если не маленькая, то большая
    } else {
      System.out.println("Мы пока не делаем пиццы такого размера.");
      System.out.println("Приходите ещё, " + name + "!");
      return; // завершить программу (ВООБЩЕ)
    }
    //     Стоимость
    int lowestPrice;
    if (small) { // small == true, значит, пицца маленькая
      lowestPrice = SMALL_PIZZA_PRICE;
    } else { // small == false, значит, пицца НЕ маленькая -- то есть большая
      lowestPrice = LARGE_PIZZA_PRICE;
    }
    int highestPrice = lowestPrice;
    // 3.3 Пожелания - искать слова "хочу", "не" - очень плохая идея, но какая есть
    //     Ответы:
    //     - хорошо, мы добавим
    //     - хорошо, мы уберём
    //     - передам повару
    //     если убрать, то не меняем стоимость, в остальных случаях называем диапазон - до +10%
    System.out.println("Напишите дополнительные пожелания:");
    String addons = br.readLine();
    if (addons.toLowerCase().contains("хочу")) {
      if (addons.toLowerCase().contains("не")) {
        System.out.println("Хорошо, мы уберём!");
      } else { // есть слово "хочу", но нет слова "не"
        System.out.println("Хорошо, мы добавим!");
        // точно увеличиваем стоимость на 10%
        lowestPrice += lowestPrice * 0.1; // +10% от стоимости пиццы к нижней границе
        highestPrice = lowestPrice; // верхнюю поднимаем следом за нижней
      }
    } else { // мы не понимаем пожелание - нет слова "хочу" - даже не проверяем "не"
      System.out.println("Хорошо, я передам повару!");
      // увеличиваем верхнюю границу стоимости
      // оставляем нижнюю, как была
      highestPrice += lowestPrice * 0.1; // +10% от стоимости пиццы
    }

    int lowEur = lowestPrice / 100; // получить из центов только целые евро
    int lowCnt = lowestPrice % 100; // оставшиеся центы
    int highEur = highestPrice / 100;
    int highCnt = highestPrice % 100;
    String total = "Стоимость заказа: ";
    if (lowestPrice != highestPrice) { // нижняя граница отличается от верхней
      total = total + "от %d.%d до %d.%d".formatted(lowEur, lowCnt, highEur, highCnt);
//      total = total + String.format("от %d.%d до %d.%d", lowEur, lowCnt, highEur, highCnt);
    } else { // границы одинаковы, можно использовать любое значение
      total = total + lowEur + "." + lowCnt;
    }

    // 4. Способ оплаты - выбор между наличными и картой
    System.out.println("Выберите способ оплаты:");
    System.out.println("1 - наличными");
    System.out.println("2 - картой");
    String payment = br.readLine();
    boolean byCard;
    if (payment.equals("1")) {
      byCard = false;
    } else if (payment.equals("2")) {
      byCard = true;
    } else {
      System.out.println("Выбран некорректный способ оплаты");
      return;
    }

    // TODO доделать вывод заказа
    System.out.println("Спасибо за заказ!");
  }
}