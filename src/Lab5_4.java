//Прочитать текст Java-программы и все слова public в объявлении атрибутов и методов класса заменить на слово private.
import java.io.*;

public class Lab5_4 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:/replace.txt"));
        String line = "";
        String FileContent = "";
        String NL = System.getProperty("line.separator");
        while ((line = br.readLine()) != null) {
            FileContent = FileContent + line + NL;
        }
        br.close();
        FileContent = FileContent.replaceAll("public","private");
        System.out.println(FileContent);
        File file = new File("replace_new.txt");
        if(file.createNewFile()) {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(FileContent);
            bw.close();
        }
    }
}
