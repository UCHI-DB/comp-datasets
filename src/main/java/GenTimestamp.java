import java.io.FileOutputStream;
import java.io.PrintWriter;

public class GenTimestamp {
    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(new FileOutputStream(args[1]));
        int count = Integer.parseInt(args[0]);

        GenHelper helper = new GenHelper();

        for (int i = 0; i < count; i++) {
            writer.println(String.format("%s-%s-%s %s:%s:%s %s.%s",
                    helper.genRangeDigit(1970, 50), helper.genRangeDigit(1, 12),
                    helper.genRangeDigit(1, 30), helper.genRangeDigit(1, 24),
                    helper.genRangeDigit(1, 60), helper.genRangeDigit(1, 60),
                    helper.genDigit(4), helper.genDigit(5)
            ));
        }

        writer.close();
    }
}
