/**
 * Created by SamAD on 20.09.2015.
 */
public class main
{
    public static void main(String[] args)
    {
        buch TestBuch = new buch("Alles ueber die 42", "123-4-56-789012-8");
        TestBuch.incBestand(42);
        TestBuch.output();
    }
}
