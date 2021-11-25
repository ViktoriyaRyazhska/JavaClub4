package oop;

public class OOP_Task_2 {
    public static final OOP_Task_2 IDENTITY = new OOP_Task_2(0);
    public static final OOP_Task_2 ROTATE_90_ANTICLOCKWISE = new OOP_Task_2(1);
    public static final OOP_Task_2 ROTATE_180 = new OOP_Task_2(2);
    public static final OOP_Task_2 ROTATE_90_CLOCKWISE = new OOP_Task_2(3);
    public static final OOP_Task_2 REFLECT_VERTICAL = new OOP_Task_2(4);
    public static final OOP_Task_2 REFLECT_FORWARD_DIAGONAL = new OOP_Task_2(5);
    public static final OOP_Task_2 REFLECT_HORIZONTAL = new OOP_Task_2(6);
    public static final OOP_Task_2 REFLECT_REVERSE_DIAGONAL = new OOP_Task_2(7);

    private final int index;
    private static int[][] matrix = {{0, 1, 2, 3, 4, 5, 6, 7},
            {1, 2, 3, 0, 5, 6, 7, 4},
            {2, 3, 0, 1, 6, 7, 4, 5},
            {3, 0, 1, 2, 7, 4, 5, 6},
            {4, 7, 6, 5, 0, 3, 2, 1},
            {5, 4, 7, 6, 1, 0, 3, 2},
            {6, 5, 4, 7, 2, 1, 0, 3},
            {7, 6, 5, 4, 3, 2, 1, 0}};

    private OOP_Task_2(int index) {
        this.index = index;
    }

    public OOP_Task_2() {
        this.index = -1;
    }

    public OOP_Task_2 then(OOP_Task_2 f) {
        return new OOP_Task_2(matrix[this.index][f.index]);
    }

    public OOP_Task_2 inv() {
        switch (index) {
            case 1: return new OOP_Task_2(3);
            case 3: return new OOP_Task_2(1);
            default: return this;
        }
    }

    public boolean is_rotation() {
        return index < 4;
    }

    public boolean is_reflection() {
        return index >= 4;
    }

    public boolean equals(OOP_Task_2 other) {
        return this.index == other.index;
    }
}
