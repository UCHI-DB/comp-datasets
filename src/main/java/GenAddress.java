import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class GenAddress {

    private String[][] fields;

    private String delimiter = ",";

    private Random rand = new Random(System.currentTimeMillis());

    public GenAddress() {
        try {
            Set<String>[] fieldContainers = new Set[8];
            for (int i = 0; i < fieldContainers.length; i++) {
                fieldContainers[i] = new HashSet<String>();
            }
            InputStream dictFile = Thread.currentThread().getContextClassLoader().getResourceAsStream("address_dict");

            BufferedReader reader = new BufferedReader(new InputStreamReader(dictFile));
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] fieldValues = line.split("\\|");
                for (int i = 0; i < fieldContainers.length; i++) {
                    fieldContainers[i].add(fieldValues[i]);
                }
            }
            reader.close();

            fields = new String[8][];
            for (int i = 0; i < fieldContainers.length; i++) {
                fields[i] = new String[fieldContainers[i].size()];
                fieldContainers[i].toArray(fields[i]);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String generate() {
        return Arrays.stream(fields).map(f -> f[rand.nextInt(f.length)])
                .collect(Collectors.joining(","));
    }
}
