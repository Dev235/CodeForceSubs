import java.io.*;
import java.util.StringTokenizer;
 
public class Main extends IOException {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer tk = new StringTokenizer(br.readLine());
 
        long a, b, c, d;
        a = Long.parseLong(tk.nextToken());
        b = Long.parseLong(tk.nextToken());
        c = Long.parseLong(tk.nextToken());
        d = 0;
 
        for (long i = 1; i <= c; i++) {
                d = d + (a * i);
        }
        pw.println((d > b) ? d- b: 0 );
        pw.close();
    }
}
