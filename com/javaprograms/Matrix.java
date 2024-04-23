package com.javaprograms;

public class Matrix {
    private int rows;
    private int col;
    private int[][] data;

    public Matrix(int rows, int col) {
        this.rows = rows;
        this.col = col;
        this.data = new int[rows][col];
    }

    public void fill(int[] values) {
        if (values.length != rows * col) {
            throw new IllegalArgumentException("Number of values does not match matrix dimensions");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                data[i][j] = values[i * col + j];
            }
        }
    }

    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Matrix m = new Matrix(2, 3);
        int[] values = {10, 13, 25, 73, 19, 69};
        m.fill(values);
        m.display();
    }
}
