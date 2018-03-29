package Unit2;

public class lab02f {

	public static void main( String[] args ) {
	
		Line abcd = new Line();
		abcd.setCoordinates(1, 9, 14, 2);
		abcd.calculateSlope();
		abcd.print();
		
		abcd.setCoordinates(1, 7, 18, 3);
		abcd.calculateSlope();
		abcd.print();
		
		abcd.setCoordinates(6, 4, 2, 2);
		abcd.calculateSlope();
		abcd.print();
		
		abcd.setCoordinates(4, 4, 5, 3);
		abcd.calculateSlope();
		abcd.print();
		
		abcd.setCoordinates(1, 1, 2, 9);
		abcd.calculateSlope();
		abcd.print();

		
	}
}
