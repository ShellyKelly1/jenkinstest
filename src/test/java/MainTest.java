import com.testproject.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testAdd() {
        assertEquals(8, Main.add(3, 5), "add(3, 5) должно вернуть 8");
        assertEquals(-2, Main.add(-1, -1), "add(-1, -1) должно вернуть -2");
        assertEquals(0, Main.add(0, 0), "add(0, 0) должно вернуть 0");
    }

    @Test
    void testFactorial() {
        assertEquals(120, Main.factorial(5), "factorial(5) должно вернуть 120");
        assertEquals(1, Main.factorial(0), "factorial(0) должно вернуть 1");
        assertEquals(1, Main.factorial(1), "factorial(1) должно вернуть 1");

        assertThrows(IllegalArgumentException.class, () -> Main.factorial(-1), "factorial(-1) должно выбросить IllegalArgumentException");
    }

    @Test
    void testIsPalindrome() {
        assertTrue(Main.isPalindrome("A man, a plan, a canal, Panama"), "Строка должна быть палиндромом");
        assertTrue(Main.isPalindrome("madam"), "Строка должна быть палиндромом");
        assertFalse(Main.isPalindrome("Hello"), "Строка не должна быть палиндромом");
        assertFalse(Main.isPalindrome(null), "Null не должен быть палиндромом");
        assertTrue(Main.isPalindrome(""), "Пустая строка должна быть палиндромом");
    }
}

