import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

int sum = 0;
int numb = 0;


while (true)
{

 String s = buffer.readLine();
	if (s.equals("сумма")){
		break;
    }

    numb =  Integer.parseInt(s);
    sum = sum  + numb;
    
        }
    System.out.println(sum);
    }
}
