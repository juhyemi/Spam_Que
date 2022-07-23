// 문자열 게임2
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_20437_S {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String W = br.readLine();
            int K = Integer.parseInt(br.readLine());

            if (K == 1) {
                sb.append(1 + " " + 1).append("\n");
                continue;
            }

            int[] alpha = new int[26];
            for (int j = 0; j < W.length(); j++) {
                alpha[W.charAt(j) - 'a']++;
            }

            int min = Integer.MAX_VALUE;
            int max = -1;

            for (int j = 0; j < W.length(); j++) {
                if (alpha[W.charAt(j) - 'a'] < K) {
                    continue;
                }

                int cnt = 1;
                for (int z = j + 1; z < W.length(); z++) {
                    if (W.charAt(j) == W.charAt(z)) {
                        cnt++;
                    }

                    if (cnt == K) {
                        min = Math.min(min, z - j + 1);
                        max = Math.max(max, z - j + 1);
                        break;
                    }
                }
            }
            if (min == Integer.MAX_VALUE || max  == -1) {
                sb.append(-1).append("\n");
            } else {
                sb.append(min + " " + max).append("\n");
            }

        }
        System.out.println(sb);
    }
}
