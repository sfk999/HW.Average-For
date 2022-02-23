public class HWfor {
    public static void main(String[] args) {

        for (int j = 100; j >= 1; j--){
            if  (isMultiplyFour(j)) {
                System.out.print(j + " ");
            }
        }
        }
        public static boolean isMultiplyFour(int value) {
            return value % 4== 0;
        }
}
