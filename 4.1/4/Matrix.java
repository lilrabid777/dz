import java.lang.Math;
public class Matrix {

    private int r;
    private int c;
    private int[][] m;

    public Matrix(int r, int c){
        this.r = r;
        this.c = c;
        this.m = new int[r][c];
    }

    public void Generate(){
        for (int i = 0; i<this.r; i++){
            for (int j = 0; j<this.c; j++){
                this.m[i][j] = (int)((Math.random()-0.5)*20);
            }
        }
    }

    public void Print(){
        for (int i = 0; i<this.r; i++){
            for (int j = 0; j<this.c; j++){
                System.out.print(this.m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public Matrix Sum(Matrix A){
        Matrix C = new Matrix(this.r,this.c);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                C.m[i][j] = this.m[i][j]+A.m[i][j];
            }
        }
        return C;
    }

    public Matrix Multiply(int x){
        Matrix N = new Matrix(this.r,this.c);
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < this.c; j++) {
                N.m[i][j] = this.m[i][j]*x;
            }
        }
        return N;
    }
}
