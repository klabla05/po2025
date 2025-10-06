import java.util.Random;
public class Rand
{
    public class Lotto
    {
        Random rand = new Random();
        int[] losowe = new int[6];
        for(int i=0; i<6 ; i++)
        {
            losowe[i] = rand.nextInt(1 - 49 + 1) + 1;
            for(int j=0; j<6 ; j++){
                if(losowe[j]==losowe[i]){

                }
            }
        }
    }

    public static void main(String[] args)
    {
    }
}



