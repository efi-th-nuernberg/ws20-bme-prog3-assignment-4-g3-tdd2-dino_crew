import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
    @Test 
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }

    @Test
    public void testIfNotValidTriangleWhenOneSideTooLong() {

        // Arrange
        float a = 70;
        float b = 1;
        float c = 1;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIfNotValidTriangleWhenOneSideEqualsNegativeNumber() {

        // Arrange
        float a = 1;
        float b = 2;
        float c = -3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIfNotValidTriangleWhenOneSideEqualsNull() {

        // Arrange
        float a = 50;
        float b = 50;
        float c = 0;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIfNotValidTriangleWhenSumOfTwoSidesEqualsThird() {

        // Arrange
        float a = 18;
        float b = 22;
        float c = 40;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIfNotValidTriangleWhenOneSideToShort() {

        // Arrange
        float a = 2;
        float b = 13;
        float c = 38;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    // (a + b <= c || a + c <= b || b + c <= a

    @Test
    public void testIfNotValidTriangleWhenAandBLessEqualsC() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIfNotValidTriangleWhenWhenAandCLessEqualsB() {

        // Arrange
        float a = 2;
        float b = 5;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testIfNotValidTriangleWhenWhenBandCLessEqualsA() {

        // Arrange
        float a = 5;
        float b = 2;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NONE, type);

    }

    @Test
    public void testEquilateralTriangle() {

        // Arrange
        float a = 1;
        float b = 1;
        float c = 1;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);

    }

    @Test
    public void testIsoscelesTriangleIfAEqualsB() {

        // Arrange
        float a = 5;
        float b = 5;
        float c = 3;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    }

    @Test
    public void testIsoscelesTriangleIfBEqualsC() {

        // Arrange
        float a = 3;
        float b = 5;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    }

    @Test
    public void testIsoscelesTriangleIfAEqualsC() {

        // Arrange
        float a = 5;
        float b = 3;
        float c = 5;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);

    }
}
