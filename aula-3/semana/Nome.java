import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Nome
{
    public static void main(String[] args)
    {
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE",Locale.getDefault())));
    }
}
