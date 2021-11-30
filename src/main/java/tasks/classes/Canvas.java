package tasks.classes;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Canvas {

    private String[][] canvas;

    public Canvas(int width, int height) {
        this.canvas = new String[width][height];
    }

    public String[][] getCanvas() {
        return canvas;
    }

    public void setCanvas(String[][] newCanvas) {
        this.canvas = newCanvas;
    }

    private Canvas draw(int x1, int y1, int x2, int y2) {
        if ((x1 < canvas.length && y1 < canvas.length))
            canvas[x1][y1] = "X";
        else {
            System.out.println("spaces reserved");
        }
        if ((x2 < canvas.length && y2 < canvas.length) && (x1 == x2 || y1 == y2)) {
            canvas[x2][y2] = "X";
            drawLines(x1, y1, x2, y2, canvas);
        } else if ((x2 < canvas.length && y2 < canvas.length) && !(x1 == x2 || y1 == y2)) {
            canvas[x2][y2] = "X";
            drawRectangle(x1, y1, x2, y2, canvas);
        } else {

        }
        return this;
    }

    private void drawRectangle(int x1, int y1, int x2, int y2, String[][] canvas) {
        for (int i = y1 + 1; i <= y2; i++) {
            canvas[x1][i] = "X";
        }
        for (int i = x1 + 1; i <= x2; i++) {
            canvas[i][y1] = "X";
        }
        for (int i = y1 + 1; i <= y2; i++) {
            canvas[x2][i] = "X";
        }
        for (int i = x2 - 1; i > x1; i--) {
            canvas[i][y2] = "X";
        }

    }

    private void drawLines(int x1, int y1, int x2, int y2, String[][] canvas) {
        if (x1 == x2 && y1 < y2) {
            for (int i = y1; i < y2; i++) {
                canvas[x1][i] = "X";
            }
        } else if (x1 == x2 && y1 > y2) {
            for (int i = y2; i < y1; i++) {
                canvas[x1][i] = "s";
            }
        } else if (y1 == y2 & x1 < x2) {
            for (int i = x1; i < x2; i++) {
                canvas[i][y1] = "X";
            }
        } else if (y1 == y2 & x1 > x2) {
            for (int i = x2; i < x1; i++) {
                canvas[i][y1] = "X";
            }
        }
    }

    private Canvas fill(int x, int y, char ch) {
        //draw o up till X
        String letter = Character.toString(ch);
        for (int i = x; i >= 0; i--) {
            if (canvas[i][y].equals("~")) {
                canvas[i][y] = letter;
            } else {
                break;
            }
        }
        // taking care of to far beginning point
        if (x == canvas.length && y == canvas.length) {
            x -= x;
            y -= y;
        }
        //draw o horizontally till x
        for (int i = y; i >= 0; i--) {
            if (canvas[x][i].equals("~") || canvas[x][i].equals("o")) {
                canvas[x][i] = letter;

                //  draw o up till x
                for (int j = x; j >= 0; j--) {
                    if (canvas[j][i].equals("~") || canvas[j][i].equals("o")) {
                        canvas[j][i] = letter;
                    } else {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        return this;
    }

    private String drawCanvas() {
        // upper border
        System.out.print(" - ");
        for (int i = 0; i < canvas.length; i++) {
            System.out.print("- ");
        }
        System.out.println();
        //drawing canvas
        for (String[] row : canvas) {
            //separating each cell
            System.out.println("| " + Arrays.stream(row).collect(Collectors.joining(" ")) + " |");
        }
        // lower border
        System.out.print(" - ");
        for (int i = 0; i < canvas.length; i++) {
            System.out.print("- ");
        }
        System.out.println();

        return "draw the canvas with borders";
    }

    private void fillCanvas() {
        for (String[] row : canvas) {
            Arrays.fill(row, "~");
        }
    }
}