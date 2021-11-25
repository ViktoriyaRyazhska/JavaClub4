package tasks.oop;

public class Dih4{
    private Transform pictureTransform;
    public Dih4(){}
    public Dih4(Transform pictureTransform){
        this.pictureTransform = pictureTransform;
    }

    public Transform getPictureTransform() {
        return pictureTransform;
    }

    public  Transform then(Transform trans){
        return this.pictureTransform = trans;
    }

    public  Transform inv(){
        Transform transform = this.getPictureTransform();
        Transform result=Transform.IDENTITY;
        switch (transform){
            case ROTATE_90_ANTICLOCKWISE : result = Transform.ROTATE_90_CLOCKWISE;break;
            case ROTATE_90_CLOCKWISE : result = Transform.ROTATE_90_ANTICLOCKWISE;break;
            case REFLECT_VERTICAL : result = Transform.REFLECT_HORIZONTAL;break;
            case REFLECT_HORIZONTAL : result = Transform.REFLECT_VERTICAL;break;
            case REFLECT_FORWARD_DIAGONAL : result = Transform.REFLECT_REVERSE_DIAGONAL;break;
            case REFLECT_REVERSE_DIAGONAL : result = Transform.REFLECT_FORWARD_DIAGONAL;
        }
        return result;
    }
    public  Boolean is_rotation(){
        boolean flag = false;
        if(this.getPictureTransform() ==Transform.ROTATE_90_ANTICLOCKWISE ||
                this.getPictureTransform() ==Transform.ROTATE_180 ||
                this.getPictureTransform() ==Transform.ROTATE_90_CLOCKWISE){
            flag = true;
        }
        return flag;
    }
    public  Boolean is_reflection(){
        boolean flag2 = false;
        if(this.getPictureTransform() == Transform.REFLECT_VERTICAL ||
                this.getPictureTransform() == Transform.REFLECT_FORWARD_DIAGONAL ||
                this.getPictureTransform() == Transform.REFLECT_HORIZONTAL ||
                this.getPictureTransform() == Transform.REFLECT_REVERSE_DIAGONAL) {
            flag2 = true;
        }
        return flag2;
    }
    public Boolean equals(Transform pictureTransform){
        return this.getPictureTransform() == pictureTransform;
    }


}
enum Transform {
    IDENTITY,
    ROTATE_90_ANTICLOCKWISE,
    ROTATE_180,
    ROTATE_90_CLOCKWISE,
    REFLECT_VERTICAL,
    REFLECT_FORWARD_DIAGONAL,
    REFLECT_HORIZONTAL,
    REFLECT_REVERSE_DIAGONAL;

    public static String Dih4_to_String(Dih4 r) {
        return r.equals(IDENTITY) ? "identity transformation"
                : r.equals(ROTATE_90_ANTICLOCKWISE) ? "rotation 90 degrees anticlockwise"
                : r.equals(ROTATE_180) ? "rotation 180 degrees"
                : r.equals(ROTATE_90_CLOCKWISE) ? "rotation 90 degrees clockwise"
                : r.equals(REFLECT_VERTICAL) ? "reflection in vertical line"
                : r.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : r.equals(REFLECT_HORIZONTAL) ? "reflection in horizontal line"
                : r.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                : "unknown Dih4 value";
    }
}