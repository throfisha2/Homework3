import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//Цензура. Заменить заданное слово, оставив 1 и последнюю буквы. Например СУПРЯ=>С***Я
public class Zadanie1
{
    public static void main (String[] args)throws IOException
    {
         /* Не изменяемое слово
          String word="СУПРЯ";
          String neword = word.replace("УПР","***");
          System.out.println(neword);*/

        //Ввод слова с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите слово: ");
        String name = reader.readLine();

        //Определение количесва символов и замена
        int pos = name.length();
        String s="*";
        String ch = s.repeat(pos-2);
        name = name.substring(0, 1) + ch + name.substring(pos - 1);

        //Вывод полученного слова
        System.out.println("Измененное слово: "+name);
    }

}
