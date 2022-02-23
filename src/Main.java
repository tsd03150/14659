import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        int answer = 0;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                } else {
                    break;
                }
            }
            answer = Math.max(answer, cnt);
        }
        System.out.println(answer);

    }

}
