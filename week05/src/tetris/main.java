package tetris;
public class main {
    public static void main(String[] args) {
        System.out.println("자바프로그래밍 실습 5주차 #board 학번: 20201115 이름: 육수민");
        Shape shape = new Shape(3);
        char [][] board = new char[10][5];
//        Board board = new Board(10,5); //3번
//        board.show(); //3번
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '.';
            }
        }
        shape.x = 2; //setX(2)
        shape.y = 2; //setY(2)

        for (int k = 2; k < 8; k++) {
            shape.y = k;
            System.out.println("*****************");

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = '.';
                }
            }
//        shape.rotateLeft(); //shape.rotateRight();
            shape = shape.rotateRight();
            for (int i = 0; i < 4; i++) {
                int x = shape.x + shape.currentShape[i][0]; //getPosX(i)
                int y = shape.y + shape.currentShape[i][1]; //getPosY(i)
                //if(x>=0 && x<board[0].length && y >=0 &&  y<board.length
                board[y][x] = shape.currentTexture; //getTexture
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("%c", board[i][j]);
                }
                System.out.println();
            }
        }
    }
}