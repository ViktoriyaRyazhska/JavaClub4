package application.tasks.classes;

import java.util.Arrays;
import java.util.Scanner;
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

    public static void task(Scanner in) {
        System.out.print("Width of the canvas:\n> ");
        int width = in.nextInt();
        System.out.print("Height of the canvas:\n> ");
        int height = in.nextInt();

        Canvas canvas = new Canvas(width, height);

        System.out.print("For Lines press 1 and rectangle press any digit:\n> ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.print("Coordinates of line 1 :\n ");
            System.out.print("X1:\n> ");
            int x1 = in.nextInt();
            if (x1 >= canvas.canvas.length) {
                System.out.println("Try again,your x1 value is out of the boundary!");
                Canvas.task(in);
            }

            System.out.print("Y1:\n> ");
            int y1 = in.nextInt();
            if (y1 >= canvas.canvas.length) {
                System.out.println("Try again,your y1 value is out of the boundary!");
                Canvas.task(in);
            }

            System.out.print("X2\n> ");
            int x2 = in.nextInt();
            if (x2 >= canvas.canvas.length) {
                System.out.println("Try again,your x2 value is out of the boundary!");
                Canvas.task(in);
            }
            System.out.print("Y2:\n> ");
            int y2 = in.nextInt();
            if (y2 >= canvas.canvas.length) {
                System.out.println("Try again,your y2 value is out of the boundary!");
                Canvas.task(in);
            }

            canvas.fillCanvas();
            canvas.draw(x1, y1, x2, y2);

            System.out.print("Coordinates of line 2 :\n");
            System.out.print("X1:\n> ");
            int x1l2 = in.nextInt();
            if (x1l2 >= canvas.canvas.length) {
                System.out.println("Try again,your x1 value is out of the boundary!");
                Canvas.task(in);
            }

            System.out.print("Y1:\n> ");
            int y1l2 = in.nextInt();
            if (y1l2 >= canvas.canvas.length) {
                System.out.println("Try again,your y1 value is out of the boundary!");
                Canvas.task(in);
            }
            System.out.print("X2\n> ");
            int x2l2 = in.nextInt();
            if (x2l2 >= canvas.canvas.length) {
                System.out.println("Try again,your x2 value is out of the boundary!");
                Canvas.task(in);
            }

            System.out.print("Y2:\n> ");
            int y2l2 = in.nextInt();
            if (y2l2 >= canvas.canvas.length) {
                System.out.println("Try again,your y2 value is out of the boundary!");
                Canvas.task(in);
            }

            canvas.draw(x1l2, y1l2, x2l2, y2l2);
        } else {
            System.out.print("Coordinates of the rectangle(1 point - top left corner of the rectangle, 2 point - bottom right corner of the rectangle:\n ");
            System.out.print("X1:\n> ");
            int x1 = in.nextInt();
            if (x1 >= canvas.canvas.length) {
                System.out.println("Try again,your x1 value is out of the boundary!");
                Canvas.task(in);
            }
            System.out.print("Y1:\n> ");
            int y1 = in.nextInt();
            if (y1 >= canvas.canvas.length) {
                System.out.println("Try again,your y1 value is out of the boundary!");
                Canvas.task(in);
            }
            System.out.print("X2\n> ");
            int x2 = in.nextInt();
            if (x2 >= canvas.canvas.length) {
                System.out.println("Try again,your x2 value is out of the boundary!");
                Canvas.task(in);
            }
            System.out.print("Y2:\n> ");
            int y2 = in.nextInt();
            if (y2 >= canvas.canvas.length) {
                System.out.println("Try again,your y2 value is out of the boundary!");
                Canvas.task(in);
            }

            canvas.fillCanvas();
            canvas.draw(x1, y1, x2, y2);
            canvas.fill(x2 - 1, y2 - 1, 'o');
        }

        canvas.drawCanvas();
    }
}
