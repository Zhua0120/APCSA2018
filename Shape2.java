package tetris;

import java.util.Random;
import java.lang.Math;


public class Shape2 {

    enum Triominos { NoShape,  LineShape, LShape };

    private Triominos pieceShape;
    private int coords[][];
    private int[][][] coordsTable;


    public Shape2() {

        coords = new int[4][2];
        setShape2(Triominos.NoShape);

    }

    public void setShape2(Triominos Shape2) {

         coordsTable = new int[][][] {
        	 { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
             { { 0, -1 },   { 0, 0 },   { 0, 1 },   { 0, 1 } },
             { { 0, -1 },   { 0, 0 },   { 0, 1 },   { 0, 1 } },
             { { 0, -1 },   { 0, 0 },   { 0, 1 },   { 0, 1 } },
             { { 0, -1 },   { 0, 0 },   { 0, 1 },   { 0, 1 } },
             { { 0, -1 },   { 0, 0 },   { -1, 0 },   { -1, 0 } },
             { { 0, -1 },   { 0, 0 },   { -1, 0 },   { -1, 0 } },
             { { 0, -1 },   { 0, 0 },   { -1, 0 },   { -1, 0 } },
         };
            
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                coords[i][j] = coordsTable[Shape2.ordinal()][i][j];
            }
        }
        pieceShape = Shape2;

    }

    private void setX(int index, int x) { coords[index][0] = x; }
    private void setY(int index, int y) { coords[index][1] = y; }
    public int x(int index) { return coords[index][0]; }
    public int y(int index) { return coords[index][1]; }
    public Triominos getShape2()  { return pieceShape; }

    public void setRandomShape2()
    {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;
        Triominos[] values = Triominos.values(); 
        setShape2(values[x]);
    }

    public int minX()
    {
      int m = coords[0][0];
      for (int i=0; i < 4; i++) {
          m = Math.min(m, coords[i][0]);
      }
      return m;
    }


    public int minY() 
    {
      int m = coords[0][1];
      for (int i=0; i < 4; i++) {
          m = Math.min(m, coords[i][1]);
      }
      return m;
    }

    public Shape2 rotateLeft() 
    {
        Shape2 result = new Shape2();
        result.pieceShape = pieceShape;

        for (int i = 0; i < 4; ++i) {
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }
        return result;
    }

    public Shape2 rotateRight()
    {
        Shape2 result = new Shape2();
        result.pieceShape = pieceShape;

        for (int i = 0; i < 4; ++i) {
            result.setX(i, -y(i));
            result.setY(i, x(i));
        }
        return result;
    }
}