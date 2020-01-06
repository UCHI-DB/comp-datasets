
import java.util.Random;

public class GenHelper {

    protected Random rand = new Random(System.currentTimeMillis());

    public String genUpperChar(int numDigit) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < numDigit; i++) {
            b.append((char) ('A' + rand.nextInt(26)));
        }
        return b.toString();
    }

    public String genLowerChar(int numDigit) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < numDigit; i++) {
            b.append((char) ('a' + rand.nextInt(26)));
        }
        return b.toString();
    }

    public String genDigit(int numDigit) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < numDigit; i++) {
            b.append((char) ('0' + rand.nextInt(10)));
        }
        return b.toString();
    }

    public String genRangeDigit(int base, int max) {
        return String.valueOf(base + rand.nextInt(max));
    }

    static final char[] HEX = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    static final char[] EVERYTHING = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F',
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public String genHex(int numDigit) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < numDigit; i++) {
            b.append(HEX[rand.nextInt(16)]);
        }
        return b.toString();
    }

    public String genEverything(int numDigit) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < numDigit; i++) {
            b.append(EVERYTHING[rand.nextInt(EVERYTHING.length)]);
        }
        return b.toString();

    }
}
