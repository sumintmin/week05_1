public class DrawEqWithArray {
    public static void main(String[] args) {
//배열을 이용한 경우
        int[][] xy = new int[41][41]; // y*x

        for (int x = -20; x <= 20 ; x++) {
            int t = (int)(Math.sin(x * 10. * Math.PI/180.) * 20);
//            xy[t+20][x=20] = 1;
//            y값을 뒤집어서 저장
            xy[20-t][x + 20] = 1;
        }
//        저장된 그래프를 출력
        for (int y = 0; y < xy.length; y++) {
            for (int x = 0; x < xy[y].length; x++) {
                //System.out.printf("%d", xy[y][x]);
                if(xy[y][x] == 1)
                    System.out.print("*");
                else System.out.print(" ");

            }
            System.out.println();
        }
    }
}
