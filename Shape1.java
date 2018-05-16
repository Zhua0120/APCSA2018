package tetris;

import java.util.Random;
import java.lang.Math;


public class Shape1 {

    enum Dominoes { NoShape, DShape };

    private Dominoes pieceShape;
    private int coords[][];
    private int[][][] coordsTable;


    public Shape1() {

        coords = new int[4][2];
        setShape(Dominoes.NoShape);

    }

    public void setShape(Dominoes shape) {

         coordsTable = new int[][][] {
            { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
            { { 0, 0 },   { 0, 1 },   { 0, 1 },   { 0, 1 } },
        };

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 2; ++j) {
                coords[i][j] = coordsTable[shape.ordinal()][i][j];
            }
        }
        pieceShape = shape;

    }

    private void setX(int index, int x) { coords[index][0] = x; }
    private void setY(int index, int y) { coords[index][1] = y; }
    public int x(int index) { return coords[index][0]; }
    public int y(int index) { return coords[index][1]; }
    public Dominoes getShape()  { return pieceShape; }

    public void setRandomShape()
    {
        Random r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;
        Dominoes[] values = Dominoes.values(); 
        setShape(values[x]);
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
}