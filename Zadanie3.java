import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie3
{
    public static void main (String[] args)throws IOException
    {
        //Ввод строки с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = reader.readLine();

        //Замена подстрок
        String newstr = str.replace("а", "я");

        //Вывод новой строки
        System.out.println(newstr);
    }
}
