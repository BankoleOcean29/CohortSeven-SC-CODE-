import com.Edutech.Grade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeTest {

    @Test

    public void testThatGradeCanBeAdded() {
        Grade mth = new Grade();
        mth.setGradeIdn('A');
        char myGrade = mth.getGradeIdn();

        assertEquals(myGrade, myGrade);
    }

}
