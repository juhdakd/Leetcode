public class a3233 {
    public int nonSpecialCount(int l, int r) {
        int size = r - l + 1;
        for (int i = l; i < r + 1; i++) {
            if (judge(i)) {
                size--;
            }
        }
        return size;
    }

    public boolean judge(int num) {
        // 判断是不是特殊数字 除1以外只有一个因数
        int yin = 1;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    if(yin>2) return false;
                    return true;
                }
                return false;
            }
        }
        if (yin == 2) {
            return true;
        }
        return false;
    }
}
