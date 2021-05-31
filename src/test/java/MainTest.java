import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    /*
       AssertEquals để kiểm tra kqua tính toán có giống vs kqua mong đợi
       AssertNotEquals để kiểm tra kết quả tính toán được chấp nhận nếu biểu thức sai

       AssertArrayEquals để kiểm tra 2 mảng có bằng nhau không, được chấp nhận nếu hai mảng bằng nhau

       assertNull() khẳng định rằng một object là null
       assertNotNull() khẳng định rằng object là not null

       assertTrue dùng để xác minh điều kiện trả về true.
       assertFalse() dùng để xác minh điều kiện trả về là false

       assertSame() khẳng định rằng 2 object có cùng tham chiếu tới chính xác cùng một object.
       assertNotSame() khẳng định rằng 2 object không tham chiếu đến cùng một đối tượng
*/

    @Test
    void AssertEquals_assertNotEquals() {
        assertEquals(8, Demo.sum(3, 5));
        assertNotEquals(6, Demo.sum(2, 3));
    }
    @Test
    void AssertArrayEquals() {
        String[] arr1= {"aaa", "bbb","ccc"};
        String[] arr2= {"aaa", "bbb","ccc"};
        String[] arr3= {"AAA", "BBB","CCC"};

        assertArrayEquals(arr1,arr2);
        assertArrayEquals(arr2,arr3);
    }
    @Test
    void AssertNull_AssertNotNull()
    {
       String Null= null;
       String notNull = "Junit";

       assertNull(Null);
       assertNotNull(notNull);
    }
    @Test
    void AssertTrue_AssertFalse()
    {
        assertTrue(Demo.number(4));
        assertFalse(Demo.number(7));
    }
    @Test
    void AssertSame_AssertNotSame()
    {
        String method1 = "Bầu trời hôm nay thật đẹp";
        String method2 = "Cậu cũng vậy";
        String method3 = method2;

        assertSame(method2, method3);
        assertNotSame(method1, method2);
    }
}