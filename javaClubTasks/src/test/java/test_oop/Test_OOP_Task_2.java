package test_oop;
import static org.junit.Assert.*;
import org.junit.Test;
import oop.OOP_Task_2;

public class Test_OOP_Task_2 extends OOP_Task_2 {
    @Test
    public void Example_Tests() throws Exception
    {
        assertEquals( true, ROTATE_180.is_rotation() );
        assertEquals( true, REFLECT_VERTICAL.is_reflection() );

        assert_Dih4_equal( ROTATE_90_ANTICLOCKWISE, ROTATE_90_CLOCKWISE.inv() );
        assert_Dih4_equal( REFLECT_REVERSE_DIAGONAL, ROTATE_90_CLOCKWISE.then(REFLECT_VERTICAL) );

        OOP_Task_2 r = ROTATE_90_ANTICLOCKWISE;
        OOP_Task_2 f = REFLECT_HORIZONTAL;
        assert_Dih4_equal( r.inv(), r.then(r).then(r) );
        assert_Dih4_equal( f.then(r), r.inv().then(f) );

        assertEquals( true, ROTATE_90_CLOCKWISE.equals(ROTATE_90_CLOCKWISE) );
        assertEquals( false, ROTATE_90_CLOCKWISE.equals(ROTATE_90_ANTICLOCKWISE) );
    }

    /* ---------------------------------------------------------------------------------------- */
    // The kata doesn't require codewarriors to make their Dih4 objects pretty-printable
    // (by providing a toString() override). Instead, the following code produces nice output
    // when asserts fail.

    public static void assert_Dih4_equal(OOP_Task_2 expected, OOP_Task_2 actual)
    {
        assertEquals(Dih4_to_String(expected), Dih4_to_String(actual));
    }

    public static String Dih4_to_String(OOP_Task_2 r)
    {
        return r.equals(IDENTITY)                 ? "identity transformation"
                : r.equals(ROTATE_90_ANTICLOCKWISE)  ? "rotation 90 degrees anticlockwise"
                : r.equals(ROTATE_180)               ? "rotation 180 degrees"
                : r.equals(ROTATE_90_CLOCKWISE)      ? "rotation 90 degrees clockwise"
                : r.equals(REFLECT_VERTICAL)         ? "reflection in vertical line"
                : r.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
                : r.equals(REFLECT_HORIZONTAL)       ? "reflection in horizontal line"
                : r.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
                :                                      "unknown Dih4 value";
    }

}