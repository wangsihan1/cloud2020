import java.time.ZonedDateTime;

public class T2 {

    public static void main(String[] args) {
        /*ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);*/
        int i = 1;
        i  = i++;
        int j = i++;
        int k = i + ++i * i++;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
