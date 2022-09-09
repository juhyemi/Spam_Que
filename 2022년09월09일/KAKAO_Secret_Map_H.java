public class KAKAO_Secret_Map_H {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1= {9, 20, 28, 18, 11};
        int[] arr2= {30, 1, 21, 17, 28};
        solution(n,arr1,arr2);
    }
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] bin_arr1 = new String[n];
        String[] bin_arr2 = new String[n];
        for (int i = 0; i < n; i++) {
            bin_arr1[i] = convert(arr1[i],n);
            bin_arr2[i] = convert(arr2[i],n);
        }
        for (int i = 0; i < n; i++) {
            String tmp = "";
            for (int j = 0; j < n; j++) {
                if (bin_arr1[i].charAt(j) == '1' || bin_arr2[i].charAt(j) == '1'){
                    tmp += "#";
                }
                else tmp += " ";
            }
            answer[i] = tmp;
        }
        return answer;
    }
    public static String convert(int num,int n){
        String conv = String.format("%0"+n+"d",Long.parseLong(Integer.toBinaryString(num)));
        return conv;
    }
}
