class Matrix {
 
    int [][] element;
    int rows;
    int cols;
 
 
    Matrix(int rows, int cols, int max) {
        this.rows = rows;
        this.cols = cols;
        element = new int[rows][cols];
 
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                element[i][j] = (int) Math.round(Math.abs(max)*Math.random());
            }
        }
    }
 
    public int getValue(int row, int col) {
        return this.element[row][col];
    }
 
    public void setValue(int row, int col, int value) {
        this.element[row][col] = value;
    }
 
    public int getNumRows() {
        return this.rows;
    }
 
    public int getNumCols() {
        return this.cols;
    }	
    
    private void changeNumRowsCols(){
        int tmp;
        tmp = this.getNumRows();
        this.rows = this.getNumCols();
        this.cols = tmp;
    }
 
 
    public void DisplayMatrix() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print((this.element[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    void rotate90(){
        int [][] rotMatrix = new int[this.cols][this.rows];
 
            for (int rw = 0; rw < this.rows; rw++)
                for (int cl = 0; cl < this.cols; cl++) {
                    rotMatrix[cl][this.rows - 1 - rw] = this.element[rw][cl];
                }
 
            this.element = rotMatrix; 
            changeNumRowsCols();
    }    
}