//public class ArrayList {
//    public static void main(String[] args) {
//        int [][] multi = new int[10][];
//        int n = 100;
//        for (int i = 0; i < 10; i++) { //0~9번째 배열에 배수 저장
//            ArrayList<Integer> al = new ArrayList<Integer>();
//            for (int j = 0; j < 10; j++) { //1~n까지의 정수에 대해
//                if(j % i != 0) //0번째 배열에는 10의 배수 저장
//                    al.add(j);
//                else if(j % i == 0 ) // 0번째 배열이 아닌 경우, j의 배수 검사
//                    al.add(j);
//            }
//            multi[i] = new int[al.size()];
//            for (int j = 0; j < 10 ; j++) { // ArrayList를 i번쨰 배열에 복사
//                multi[i][j] = al.get(j);
//            }
//        }
//
//        for (int i = 0; i < multi.length; i++) {
//            System.out.printf("%2d의 배수 (%d개)", i == 0?10:i, multi[i].length);
//            for (int j = 0; j < multi[i].length; j++) {
//                System.out.println();
//
//            }
//
//        }
//    }
//}
