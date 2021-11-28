package tasks.classes;

public class Canvas {
    private int width;
    private int height;

    public Canvas() {
    }

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
    }

    {
        this.drawCanvas();
    }

    public Canvas draw(int x1, int y1, int x2, int y2) {
        // StringBuilder strBild = new StringBuilder();
        boolean flagHorizontal = (y1 == y2);
        boolean flagVertical = (x1 == x2);
        for (int i = 1; i < this.height; i++) {
            if (flagVertical) {
                for (int j = 1; j < this.width; j++) {
                    if(j==x1){
                        System.out.println("x");
                    }
                }
            }
            if ((i == y1 & flagHorizontal)) {
                for (int j = 1; j < this.width; j++) {
                    if (j == x1) {
                        System.out.println("x");
                    } else {
                        System.out.println(" ");
                    }
                }
            }else {
                System.out.println(" ");
            }
        }  return this;
    }

    public Canvas fill ( int x, int y, char ch){
        return this;
    }

    public String drawCanvas () {
        StringBuilder strBilder = new StringBuilder();
        String rez = "";
        for (int i = 0; i < this.height + 2; i++) {

            for (int j = 0; j < this.width + 2; j++) {
                if (i == 0 | i == this.height + 1) {
                    strBilder.append("-");
                } else {
                    if (j == 0 | j == this.width + 1) {
                        strBilder.append("|");
                    } else {
                        strBilder.append(" ");
                    }
                }

            }
            strBilder.append("\n");
        }
        return rez = strBilder.toString();
    }
}
