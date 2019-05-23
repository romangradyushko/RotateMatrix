
public class Application {

	public static void main(String[] args) {
        Matrix matrix = new Matrix(5, 4, 9);
        matrix.DisplayMatrix();  
        matrix.rotate90();
        matrix.DisplayMatrix();
    }
}
