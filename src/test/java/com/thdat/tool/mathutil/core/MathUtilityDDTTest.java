package com.thdat.tool.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //Tách data ra khỏi hàm test
    //Dựng một mảng 2 chiều, input và expected
    //Sau đó nhồi vào, fill vào câu lệnh so sánh!!!
    //Data này sẽ là nguồn dữ liệu để hàm so sánh gọi, nhiều lần như thế,
    //do nhiều data -> nguồn này là static để tìm kiếm nhanh chóng
    public static Object[][] initTestData(){
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 720},
        };
    }
    @ParameterizedTest
    @MethodSource("initTestData")
    public void testFactorialGivenRightArgumentRunsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}