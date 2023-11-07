import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Учет тезок
public class Zadanie2
{
    public static void main (String[] args)throws IOException
    {
        //Ввод имен с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя1: ");
        String name1 = reader.readLine();
        System.out.print("Введите имя2: ");
        String name2 = reader.readLine();

        //Определение равенства строк
        //равенство строк без учёта регистра и вывод
        if(name1.equalsIgnoreCase(name2))
        {
            System.out.println("тезки");
        }
        else
        {
            System.out.println("не тезки");
        }

        /*  // равенство строк без учёта регистра
        if(name1.equals(name2)){
            System.out.println("тезки");
        }else{
            System.out.println("не тезки");
        }*/

    }
}
