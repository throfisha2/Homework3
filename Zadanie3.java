import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Вводится строка и 2 подстроки, заменить подстроки
public class Zadanie3
{
    public static void main (String[] args)throws IOException
    {
        //Ввод строки с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите строку: ");
        String str = reader.readLine();
        System.out.print("Введите подстроку1: ");
        String pstr1 = reader.readLine();
        System.out.print("Введите подстроку2: ");
        String pstr2 = reader.readLine();

        //Замена подстрок
        String newstr = str.replace(pstr1, pstr2);

        //Вывод новой строки
        System.out.println(newstr);
    }
}
