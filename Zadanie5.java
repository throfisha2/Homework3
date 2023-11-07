import java.io.IOException;
import java.lang.String;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Шифровка пароля
public class Zadanie5
{
    public static void main(String[] args)throws IOException
    {
        //Ввод пароля с клавиатуры
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите пароль: ");
        String password = reader.readLine();
       // String password="ab34e";

        for (int i=0; i<password.length(); i++)
        {
            char c2=password.charAt(i);//Посимвольный перебор
            if(Character.isDigit(c2))//Проверка на наличие цифры в строке
            {
                int k=c2-'0';
                if(k==9)
                {
                    k=0;
                }
                else
                {
                    k++;
                }
                System.out.print(k+" ");
            }

            else //иначе перевод символов в код
            {
                char c1=password.charAt(i);
                int c3=(int) c1;
                System.out.print(c3+" ");
            }
        }
    }
}
