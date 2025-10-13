import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Rand
{
    public static class Lotto
    {
        int min = 1;
        int max = 49;
        int count = 6;
        Random rand = new Random();
        ArrayList<Integer> numbers_user = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        public void User_input(String[] numbers_user_input)
        {
            String[] ss = numbers_user_input;
            for(int i = 0; i < ss.length; i++){
                numbers_user.add(Integer.parseInt(ss[i]));
                if (numbers_user.get(i) < min || numbers_user.get(i) > max) {
                    System.out.println("Try again");
                    System.exit(1);
                }
            }
        }
        public void Generate_lotto()
        {
            while(numbers.size() < count)
            {
                int lott = rand.nextInt(max - min + 1) + min;
                numbers.add(lott);
            }
            System.out.println("Numbers: " + numbers);
        }
        public void Compare()
        {
            int count = 0;
            for(int i = 0; i < numbers.size(); i++){
                if(numbers.get(i).equals(numbers_user.get(i)))
                {
                    System.out.println("Trafiles: " +  numbers_user.get(i));
                    count++;
                }
            }
            if(count == numbers.size())
            {
                System.out.println("Szostka!");
                System.exit(1);
            }

        }
    }


    public static void main(String[] args)
    {
        Lotto lotto = new Lotto();
        while(true) {
            lotto.Generate_lotto();
            String[] numbers_user_input = args;
            lotto.User_input(numbers_user_input);
            lotto.Compare();
        }
    }
}



