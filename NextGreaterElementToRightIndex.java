import java.io.*;
import java.util.*;

public class NextGreaterElementToRightIndex {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] nger = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        // int k = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        nger[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && a[st.peek()] <= a[i]) {
                st.pop();
            }
            if(st.size() > 0){
                nger[i] = st.peek();
            }else{
                nger[i] = -1;
            }
            st.push(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(i + "," + nger[i] + " . ");
        }
    }
}