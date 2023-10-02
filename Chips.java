import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.io.InputStreamReader;
import java.util.Collections;
public class Chips extends IOException {
    public static void main(String[] args) throws IOException {
        ArrayList<Long> r = new ArrayList<>();
        ArrayList<Long> c = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int input = Integer.parseInt(br.readLine());
        while (input > 0) {
            long size = Long.parseLong(br.readLine());
            long sum1 = 0;
            long sum2 = 0;
            StringTokenizer tk = new StringTokenizer(br.readLine());
            StringTokenizer tk2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < size; i++) {
                r.add(Long.parseLong(tk.nextToken()));
                sum1 = sum1 + r.get(i);
            }
            for (int i = 0; i < size; i++) {
                c.add(Long.parseLong(tk2.nextToken()));
                sum2 = sum2 + c.get(i);

            }
            // System.out.println(sum2);
            Collections.sort(r);
            Collections.sort(c);
            long min = Math.min(sum1 + (c.get(0) * size), sum2 + (r.get(0) * size));
            pw.println(min);
            r.clear(); c.clear();
            sum1 = 0;
            sum2 = 0;
            input--;
        }
        pw.close();
    }
}
