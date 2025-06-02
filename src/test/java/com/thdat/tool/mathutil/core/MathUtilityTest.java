package com.thdat.tool.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test  //@Test mang ý nghĩa biến hàm ở sát dươ thành hàm main() thì mới chạy lệnh test khi run app!!!
    //TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0
    void testFactorialGivenRightArgument0RunWell() {
        int n = 0;
        long expected = 1; //hy vọng n = 0, tức là 0! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so giùm tao xem thực tế có như kì vọng không???
        //nếu ko thì ra màu đỏ, tick đỏ
        //nếu expected == actual, ra màu xanh
    }
    //TEST CASE #2: VERIFY GETFACTORIAL WITH N = 1
    @Test
    void testFactorialGivenRightArgument1RunWell() {
        int n = 1;
        long expected = 1; //hy vọng n = 0, tức là 0! sẽ có giá trị là 1
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual); //so giùm tao xem thực tế có như kì vọng không???
        //nếu ko thì ra màu đỏ, tick đỏ
        //nếu expected == actual, ra màu xanh
    }

    //TEST CASE #3: VERIFY GETFACTORIAL WITH N = 1
    @Test
    void testFactorialGivenRightArgumentRunWell() {

        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        //nếu ko thì ra màu đỏ, tick đỏ
        //nếu expected == actual, ra màu xanh
    }
}