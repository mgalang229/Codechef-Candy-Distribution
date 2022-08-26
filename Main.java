import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws java.lang.Exception {
	    Scanner fs = new Scanner(System.in);
	    PrintWriter out = new PrintWriter(System.out);
	    int T = 1;
	    T = fs.nextInt();
	    for (int tc = 1; tc <= T; tc++) {
	        int n = fs.nextInt();
	        int m = fs.nextInt();
	        out.println(n % m == 0 && (n / m) % 2 == 0 ? "Yes" : "No");
	    }
	    fs.close();
	    out.close();
	}
}
