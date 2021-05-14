import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ModuleTest {

    @Test

    public void testThatModuleNameCanBeAdded() {

        Module javac = new Module();
        javac.setModuleName("java compiler");

        String moduleOne = javac.getModuleName();

        assertEquals(moduleOne, moduleOne);

    }

}
