import java.util.*;
class assignmentTA1_3 {
    ArrayList<Integer> maximumToys(int N, int A[], int Q, ArrayList<Integer> Queries[]) {
        int[][] a = new int[N][2];
        for (int i = 0; i < N; i++) {
            a[i][0] = A[i];
            a[i][1] = i;
        }
        Arrays.sort(a, (b, c) -> b[0] - c[0]);
        long[] prefix_sum = new long[N];
        long s = 0;
        for (int i = 0; i < N; i++) {
            A[a[i][1]] = i;
            s += (long) (a[i][0]);
            prefix_sum[i] = s;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (ArrayList<Integer> querie : Queries) {
            ans.add(find(querie, prefix_sum, A, a));
        }
        return ans;
    }
    int find(ArrayList<Integer> q, long[] prefix_sum, int[] A, int[][] a) {
        int lo = 0, hi = prefix_sum.length - 1, ans = 0, c = q.get(0), k = q.get(1);
        int mid, count_of_excluded;
        long actualSum;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            actualSum = prefix_sum[mid];
            count_of_excluded = 0;
            for (int i = 0; i < k; i++) {
                if (mid >= A[q.get(i + 2) - 1]) {
                    actualSum -= (long) a[A[q.get(i + 2) - 1]][0];
                    count_of_excluded++;
                }
            }
            if (actualSum <= c) {
                lo = mid + 1;
                ans = Math.max(ans, mid - count_of_excluded + 1);
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}