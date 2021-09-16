package UC2;

public class LineCompare {

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison Computation Programs ");
        int x1 = 5;
        int x2 = 7;
        int y1 = 8;
        int y2 = 89;

        double lengthOfLine1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of Line : "+lengthOfLine1);
        }

}
