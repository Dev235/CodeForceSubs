import java.io.*;
import java.util.StringTokenizer;
 
public class Team extends IOException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer tk = new StringTokenizer(br.readLine());
        long problems = Long.parseLong(tk.nextToken());
        int counter = 0;
        int questions = 0;
        while (counter < problems) {
            counter = counter + 1;
            StringTokenizer tk2 = new StringTokenizer(br.readLine());
            long a = Long.parseLong(tk2.nextToken());
            long b = Long.parseLong(tk2.nextToken());
            long c = Long.parseLong(tk2.nextToken());
            if (a + b + c >= 2) {
                questions = questions + 1;
            }
        }
        pw.println(questions);
        pw.close();
    }
}
