
package tetris;
public class Shape {
    int[][] currentShape;
    char currentTexture; // '■', '□', '▤', '▥', '▨', '▧', '▦'
    int x,y ;
    public Shape(int shapeNo){
        char[] shapeTexture = new char[] {'■', '□', '▤', '▥', '▨', '▧', '▦'};
        int [] [] [] shapeTable = new int[][][]{
                //2, 5, 6
                {{0,0}, {0,0}, {0,0},{0,0}}, //의미x?
                {{0,-1},{0,0},{0,1},{0,2}}, //1번 I
                {{0,-1}, {0,1}, {0,0},{-1,1}}, //  J-shape(2번)
                {{0,-1},{0,0},{0,1},{1,1}},//L-shape
                {{-1,-1},{0,-1},{-1,0},{0,0}},
                {{1,0}, {1,-1}, {2,-1},{0,0}},//S-shape
                {{1,0}, {0,1}, {-1,0},{0,0}},//T-shape
                {{-1,0},{0,0},{0,1},{1,1}},
                {{0,0}, {0,0}, {0,0},{0,0}}
        };
        currentShape = new int[shapeTable[shapeNo].length][shapeTable[shapeNo][0].length];
        //currentShape = new int[4][2];
        for (int i = 0; i < currentShape.length; i++) {
            for (int j = 0; j < currentShape[0].length ; j++) {
                currentShape[i][j] = shapeTable[shapeNo][i][j];
            }
        }
        currentTexture = shapeTexture[shapeNo];
        x = 0;
        y = 0;
    }

    public Shape(Shape src){
        //this.currentShape = src.currentShape
        this.currentTexture = src.currentTexture;
        this.x = src.x;
        this.y = src.y;
    }

    Shape rotateLeft(){
        Shape rotated = new Shape(this);
        rotated.currentShape = new int[currentShape.length][currentShape[0].length]; // [4][2]
        for (int i = 0; i < this.currentShape.length; i++) {//4
            rotated.currentShape[i][0] = this.currentShape[i][1];
            rotated.currentShape[i][1] = -this.currentShape[i][0];
        }
        return rotated;
    }
    Shape rotateRight(){
        Shape rotated = new Shape(this);
        rotated.currentShape = new int[currentShape.length][currentShape[0].length]; // [4][2]
        for (int i = 0; i < this.currentShape.length; i++) {//4
            rotated.currentShape[i][0] =-this.currentShape[i][1];
            rotated.currentShape[i][1] = this.currentShape[i][0];
        }
        return rotated;
    }
}