import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor implements AutoCloseable {
    String word;

    FileProcessor() {}

    void setWord(String word) {
        this.word = word;
    }

    int readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        int nr_of_lines = 0;
        while (br.ready()) {
            String line = br.readLine();
            nr_of_lines++;
        }
        return nr_of_lines;
    }

    void showFiles(String givenWord) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        while (br.ready()) {
            String line = br.readLine();
            if (line.contains(givenWord)) {
                System.out.println(line);
            }
        }

    }


    @Override
    public void close()  {
        System.out.println("Closing FileProcessor");
    }
}
