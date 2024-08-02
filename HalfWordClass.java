import java.util.Scanner;


//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв
//        (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и
//второй половины второго слова. распечатать на консоль.
//        Например:
//ввод - mama, papa
//вывод - mapa

public class HalfWordClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String firstWord = scan.nextLine();

       System.out.print("Введите второе слово: ");
        String secondWord = scan.nextLine();

        if (firstWord.length() % 2 != 0 || secondWord.length() % 2 != 0) {
            System.out.println("Введите 2 слова, состоящие из четного количества букв.");
        } else {

            String halfFirstWord = firstWord.substring(0, firstWord.length() / 2);

            String halfSecondWord = secondWord.substring(secondWord.length() / 2);

            String bothWord = halfFirstWord + halfSecondWord;

            System.out.println("Результат: " + bothWord);
        }
        scan.close();
    }
}
