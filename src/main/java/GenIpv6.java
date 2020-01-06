import java.io.FileOutputStream;
import java.io.PrintWriter;

public class GenIpv6 {

    public static void main(String[] args) throws Exception {
        PrintWriter writer = new PrintWriter(new FileOutputStream(args[1]));
        int count = Integer.parseInt(args[0]);

        GenHelper helper = new GenHelper();

        for (int i = 0; i < count; i++) {
            writer.println(String.format("%s:%s:%s:%s:%s:%s:%s:%s", helper.genHex(4), helper.genHex(4),
                    helper.genHex(4), helper.genHex(4), helper.genHex(4), helper.genHex(4),
                    helper.genHex(4), helper.genHex(4)));
        }

        writer.close();
    }
}
