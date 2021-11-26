package OOP;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dih4 {
    static final Dih4 IDENTITY = new Dih4();
    static final Dih4 ROTATE_90_ANTICLOCKWISE = new Dih4();
    static final Dih4 ROTATE_180 = new Dih4();
    static final Dih4 ROTATE_90_CLOCKWISE = new Dih4();
    static final Dih4 REFLECT_VERTICAL = new Dih4();
    static final Dih4 REFLECT_FORWARD_DIAGONAL = new Dih4();
    static final Dih4 REFLECT_HORIZONTAL = new Dih4();
    static final Dih4 REFLECT_REVERSE_DIAGONAL = new Dih4();
    private static final Map<Dih4, PointsOnSquare> states = createMap();


    private static Map<Dih4, PointsOnSquare> createMap() {
        Map<Dih4, PointsOnSquare> states = new HashMap<>();
        states.put(IDENTITY, new PointsOnSquare('A', 'B', 'C', 'D'));
        states.put(ROTATE_90_ANTICLOCKWISE, new PointsOnSquare('B', 'C', 'D', 'A'));
        states.put(ROTATE_180, new PointsOnSquare('C', 'D', 'A', 'B'));
        states.put(ROTATE_90_CLOCKWISE, new PointsOnSquare('D', 'A', 'B', 'C'));
        states.put(REFLECT_VERTICAL, new PointsOnSquare('B', 'A', 'D', 'C'));
        states.put(REFLECT_FORWARD_DIAGONAL, new PointsOnSquare('C', 'B', 'A', 'D'));
        states.put(REFLECT_HORIZONTAL, new PointsOnSquare('D', 'C', 'B', 'A'));
        states.put(REFLECT_REVERSE_DIAGONAL, new PointsOnSquare('A', 'D', 'C', 'B'));
        return Collections.unmodifiableMap(states);
    }
    private PointsOnSquare rotate90anticlockwise(PointsOnSquare point) {
        PointsOnSquare pointThis = new PointsOnSquare(point);
        char leftTopPoint = pointThis.getLeftTopPoint(); // storing top left point
        //rotating 90 anticlockwise
        pointThis.setLeftTopPoint(pointThis.getRightTopPoint()); // setting top left point
        pointThis.setRightTopPoint(pointThis.getRightBottomPoint()); // setting top right point
        pointThis.setRightBottomPoint(pointThis.getLeftBottomPoint()); // setting bottom left point
        pointThis.setLeftBottomPoint(leftTopPoint);//setting bottom right point
        return pointThis;
    }

    private PointsOnSquare rotate90(PointsOnSquare point) {
        PointsOnSquare pointThis = new PointsOnSquare(point);
        char leftTopPoint = pointThis.getLeftTopPoint(); // storing top left point
        //rotating 90 clockwise
        pointThis.setLeftTopPoint(pointThis.getLeftBottomPoint()); // setting top left point
        pointThis.setLeftBottomPoint(pointThis.getRightBottomPoint());//setting bottom right point
        pointThis.setRightBottomPoint(pointThis.getRightTopPoint()); // setting bottom left point
        pointThis.setRightTopPoint(leftTopPoint); // setting top right point
        return pointThis;
    }

    private PointsOnSquare reflectVertical(PointsOnSquare point) {
        PointsOnSquare pointThis = new PointsOnSquare(point);
        char leftTopPoint = pointThis.getLeftTopPoint();
        char leftBottomPoint = pointThis.getLeftBottomPoint();
        pointThis.setLeftTopPoint(pointThis.getRightTopPoint());
        pointThis.setLeftBottomPoint(pointThis.getRightBottomPoint());
        pointThis.setRightTopPoint(leftTopPoint);
        pointThis.setRightBottomPoint(leftBottomPoint);
        return pointThis;
    }

    private PointsOnSquare reflectForwardDiagonal(PointsOnSquare point) {
        PointsOnSquare pointThis = new PointsOnSquare(point);
        char leftTopPoint = pointThis.getLeftTopPoint();
        pointThis.setLeftTopPoint(pointThis.getRightBottomPoint());
        pointThis.setRightBottomPoint(leftTopPoint);
        return pointThis;
    }

    private PointsOnSquare reflectHorizontal(PointsOnSquare point) {
        PointsOnSquare pointThis = new PointsOnSquare(point);
        char leftTopPoint = pointThis.getLeftTopPoint();
        char rightTopPoint = pointThis.getRightTopPoint();
        pointThis.setLeftTopPoint(pointThis.getLeftBottomPoint());
        pointThis.setLeftBottomPoint(leftTopPoint);
        pointThis.setRightTopPoint(pointThis.getRightBottomPoint());
        pointThis.setRightBottomPoint(rightTopPoint);
        return pointThis;
    }

    private PointsOnSquare reflectReverseDiagonal(PointsOnSquare point) {
        PointsOnSquare pointThis = new PointsOnSquare(point);
        char rightTopPoint = pointThis.getRightTopPoint();
        pointThis.setRightTopPoint(pointThis.getLeftBottomPoint());
        pointThis.setLeftBottomPoint(rightTopPoint);
        return pointThis;
    }

    public Dih4 then(Dih4 state) {
        PointsOnSquare pointThis = new PointsOnSquare(states.get(this));

        if (state.equals(ROTATE_90_ANTICLOCKWISE)) {
            pointThis = rotate90anticlockwise(pointThis);
        }

        if (state.equals(ROTATE_180)) {
            pointThis = rotate90anticlockwise(rotate90anticlockwise(pointThis));
        }

        if (state.equals(ROTATE_90_CLOCKWISE)) {
            pointThis = rotate90(pointThis);
        }

        if (state.equals(REFLECT_VERTICAL)) {
            pointThis = reflectVertical(pointThis);
        }
        if (state.equals(REFLECT_FORWARD_DIAGONAL)) {
            pointThis = reflectForwardDiagonal(pointThis);
        }

        if (state.equals(REFLECT_HORIZONTAL)) {
            pointThis = reflectHorizontal(pointThis);
        }
        if (state.equals(REFLECT_REVERSE_DIAGONAL)) {
            pointThis = reflectReverseDiagonal(pointThis);
        }
        for (Dih4 dih4 : states.keySet()) {
            System.out.println("\n\n");
            System.out.println(dih4);
            System.out.print(states.get(dih4));
            System.out.print("     +     " + pointThis);
            if (states.get(dih4).equals(pointThis))
                return dih4;
        }

        return null;
    }

    public Dih4 inv() {
        if (this.equals(ROTATE_90_ANTICLOCKWISE))
            return ROTATE_90_CLOCKWISE;
        if (this.equals(ROTATE_90_CLOCKWISE))
            return ROTATE_90_ANTICLOCKWISE;
        return this;
    }

    public boolean is_rotation() {
        if(this.equals(IDENTITY)) return true;
        if (this.equals(ROTATE_90_ANTICLOCKWISE))
            return true;
        if (this.equals(ROTATE_180))
            return true;
        if (this.equals(ROTATE_90_CLOCKWISE))
            return true;
        return false;
    }

    public boolean is_reflection() {
        if (this.equals(REFLECT_FORWARD_DIAGONAL))
            return true;
        if (this.equals(REFLECT_VERTICAL))
            return true;
        if (this.equals(REFLECT_HORIZONTAL))
            return true;
        if (this.equals(REFLECT_REVERSE_DIAGONAL))
            return true;
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    @Override
    public String toString() {
        return this.equals(IDENTITY)                 ? "identity transformation"
                : this.equals(ROTATE_90_ANTICLOCKWISE)  ? "rotation 90 degrees anticlockwise"
                : this.equals(ROTATE_180)               ? "rotation 180 degrees"
                : this.equals(ROTATE_90_CLOCKWISE)      ? "rotation 90 degrees clockwise"
                : this.equals(REFLECT_VERTICAL)         ? "reflection in vertical line"
                : this.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : this.equals(REFLECT_HORIZONTAL)       ? "reflection in horizontal line"
                : this.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                :                                      "unknown Dih4 value";
    }

    public static void main(String[] args) {
        System.out.println(ROTATE_180.is_rotation());
        System.out.println(ROTATE_90_CLOCKWISE.equals(ROTATE_90_ANTICLOCKWISE));
        System.out.println(REFLECT_VERTICAL.is_reflection());
        Dih4 r = ROTATE_90_ANTICLOCKWISE;
        Dih4 f = REFLECT_HORIZONTAL;
        System.out.println(r.inv().equals(r.then(r).then(r)));
        System.out.println(ROTATE_90_ANTICLOCKWISE.is_rotation());
    }
}
class PointsOnSquare {
    private char leftTopPoint;
    private char rightTopPoint;
    private char rightBottomPoint;
    private char leftBottomPoint;

    public PointsOnSquare() {
        this.leftTopPoint = 'A';
        this.rightTopPoint = 'B';
        this.rightBottomPoint = 'C';
        this.leftBottomPoint = 'D';
    }

    public PointsOnSquare(char leftTopPoint, char rightTopPoint, char rightBottomPoint, char leftBottomPoint) {
        this.leftTopPoint = leftTopPoint;
        this.rightTopPoint = rightTopPoint;
        this.rightBottomPoint = rightBottomPoint;
        this.leftBottomPoint = leftBottomPoint;
    }

    public PointsOnSquare(PointsOnSquare point) {
        this.leftTopPoint = point.leftTopPoint;
        this.rightTopPoint = point.rightTopPoint;
        this.rightBottomPoint = point.rightBottomPoint;
        this.leftBottomPoint = point.leftBottomPoint;
    }

    public void setLeftTopPoint(char leftTopPoint) {
        this.leftTopPoint = leftTopPoint;
    }

    public void setRightTopPoint(char rightTopPoint) {
        this.rightTopPoint = rightTopPoint;
    }

    public void setLeftBottomPoint(char leftBottomPoint) {
        this.leftBottomPoint = leftBottomPoint;
    }

    public void setRightBottomPoint(char rightBottomPoint) {
        this.rightBottomPoint = rightBottomPoint;
    }

    public char getLeftTopPoint() {
        return leftTopPoint;
    }

    public char getRightTopPoint() {
        return rightTopPoint;
    }

    public char getLeftBottomPoint() {
        return leftBottomPoint;
    }

    public char getRightBottomPoint() {
        return rightBottomPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PointsOnSquare)) return false;
        PointsOnSquare that = (PointsOnSquare) o;
        return leftTopPoint == that.leftTopPoint && rightTopPoint == that.rightTopPoint && rightBottomPoint == that.rightBottomPoint && leftBottomPoint == that.leftBottomPoint;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftTopPoint, rightTopPoint, rightBottomPoint, leftBottomPoint);
    }
}
