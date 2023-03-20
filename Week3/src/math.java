public class math {
    public static void main(String[] args) {


        for (int x = -20; x <= 20; x++) {
            int t = (int)(Math.sin((x*10)*Math.PI/180)*20);
            for (int i = 0; i < t+20; i++) {
                System.out.print(' ');
                System.out.println("helloworld!");
                System.out.println(":testtest");
            }
            System.out.print('*');
        }
    }
}
