package CodingQuestions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maxDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY px as parameter.
     */

    public static int maxDifference(List<Integer> px) {
    int maxAns = -1;
        int low = px.get(0);
        int n = px.size();
        for(int i = 1 ; i < n ; i++){
            if( px.get(i) <= low){
                low = px.get(i);
                continue;
            }
            int currAns = px.get(i) - low;
            maxAns = Math.max(currAns, maxAns);
        }
        return maxAns;   
        
        // 7 1 2 5
        // 7 5 3 1
        // 1 2 3 4 5 6 7
        // 1 2 3 4
        //4 1 2 3
        //5 7 3 1
        // 9 2 7 3
        //1 3 5 7
        // 2 5 3 1
        

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int pxCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> px = new ArrayList<>();

        for (int i = 0; i < pxCount; i++) {
            int pxItem = Integer.parseInt(bufferedReader.readLine().trim());
            px.add(pxItem);
        }

        int result = Result.maxDifference(px);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }



}
