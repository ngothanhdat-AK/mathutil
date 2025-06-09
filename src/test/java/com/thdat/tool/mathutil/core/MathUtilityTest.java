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

    //TEST CASE #4: (BẮT NGOẠI LỆ)
    //VERIFY getFactorial() with n < 0, e.g n =5 throw an Exception
    //Step:
    //1. Given an invalid number n =-5
    //2. Call/invoke the function getFactorial(-5)
    //Expected result
    //              an IllegalArgumentException will be thrown
    //NẾU ĐƯA - 5 CÀ CHỚN, HY VỌNG SẼ NHÌN THẤY NGOẠI LỆ

    @Test
    void testFactorialGivenWrongArgumentMinus5ThrowsException() {
        //MathUtility.getFactorial(-5)
        //Ta phải kiểm soát, ta phải đo xem ngoại lệ đã đến chưa nếu
        //là -5 đưa vào
        assertThrows(IllegalArgumentException.class, () -> MathUtility
                .getFactorial(-5));
        //so sánh, đo xem, nhóm xem, ngoại lệ đã xh chưa nếu gọi -5!
        //cú pháp biểu thức lambda
    }
}