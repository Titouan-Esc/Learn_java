import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class main {
    public static void main(String[] args) {
        Path fileSource = Paths.get("newFile.truc");
        Path machinDir = Paths.get("machin");
        Path fileDestination = machinDir.resolve("newFile.newTruc");

        try {
            Files.move(fileSource, fileDestination);
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }

        Path f = Paths.get("exemple.txt");
        Charset c = Charset.forName("UTF-8");

        StandardOpenOption mode = StandardOpenOption.DELETE_ON_CLOSE;

        try {
            BufferedWriter bfw = Files.newBufferedWriter(f, c, mode);
            BufferedReader bfr = Files.newBufferedReader(f);
            String s = "Hello World";

            bfw.write(s, 2, 5);

            System.out.println(bfr.readLine());

            bfr.close();
            bfw.close();
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }
}