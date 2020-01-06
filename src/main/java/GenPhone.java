
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class GenPhone {

    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(new FileOutputStream(args[1]));
        int count = Integer.parseInt(args[0]);

        GenHelper helper = new GenHelper();

        for (int i = 0; i < count; i++) {
            writer.println(String.format("(%s)%s-%s", helper.genDigit(3), helper.genDigit(3), helper.genDigit(4)));
        }

        writer.close();
    }
}
