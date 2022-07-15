import java.io.*;

public class BOJ_2751_H {
    // 임시로 정렬 된 숫자들이 저장될 공간
    private static int[] sorted;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total = Integer.parseInt(br.readLine());
        int[] arr = new int[total];
        for (int i = 0; i < total; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        sorted = new int [total];
        mergeSort(arr,0,total-1);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 출력 과정
        for(int a: arr){
            bw.write(a+"\n");
        }
        bw.flush();
        bw.close();
    }
    // 재귀를 통해  2조각으로 나누며 재귀는 각 조각의 크기가 1이 될 때 멈춘다.
    private static void mergeSort(int[] arr,int start,int end){
        if (start < end){
            int mid = (start + end) / 2;
            // start가 0이고 end가 1일 때를 가정한다면
            // mergeSort(0,1)은 mergeSort(0,0)과 mergeSort(1,1)로 분할되고
            // 각 함수는 조건에 부합하지 못하게 되며 mergeSort(0,1)에선 merge(arr,0,0,1)만 실행된다.
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
    }
    // 정렬하며 병합하는 과정
    private static void merge(int[] arr,int start,int mid,int end){
        int lidx = start;
        int s_idx = start;
        int ridx = mid +1;
        // 각 인덱스가 마지막 인덱스까지 진행되도록 반복
        while (lidx<=mid && ridx<=end){
            // 왼쪽 배열의 lidx가 더 작은 경우
            if (arr[lidx] <= arr[ridx]){
                sorted[s_idx] = arr[lidx];
                s_idx++;
                lidx++;
            }
            // 오른쪽 배열의 ridx가 더 작은 경우
            else {
                sorted[s_idx] = arr[ridx];
                s_idx++;
                ridx++;
            }
        }
        // 왼쪽 배열이 먼저 끝난 경우
        if (lidx > mid){
            while (ridx <= end){
                sorted[s_idx] = arr[ridx];
                s_idx++;
                ridx++;
            }
        }
        // 오른쪽 배열이 먼저 끝난 경우
        else {
            while (lidx <= mid){
                sorted[s_idx] = arr[lidx];
                s_idx++;
                lidx++;
            }
        }
        // sorted에 저장된 값을 arr로 옮겨준다
        for (int i = start; i <= end; i++) {
            arr[i] = sorted[i];
        }
    }
}
