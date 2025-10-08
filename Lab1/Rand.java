import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Rand
{
    public static class Lotto
    {
        int min = 1;
        int max = 49;
        int count = 6;
        Random rand = new Random();
        Set<Integer> numbers = new HashSet<>();
        public void Generate()
        {
            while(numbers.size() < count)
            {
                int lott = rand.nextInt(max - min + 1) + min;
                numbers.add(lott);
            }
            System.out.println("Numbers: " + numbers);
        }
    }


    public static void main(String[] args)
    {
    Lotto lotto = new Lotto();
    lotto.Generate();
    }
}



