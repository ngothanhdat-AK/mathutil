package com.thdat.tool.mathutil.core;

public class MathUtility {
//class này chứa các hàm static, là nhưng hàm tiện ích dùng chung cho mọi nơi


    public static long getFactorial(int n){
        //day la ham mo phong thu vien toan hoc MATH. cua JDK
        //ham nay tinh n!: 1*2*3*...*n, ko co giai thua am, 0! ma 1, 20! vua du kieu long

        //ĐEM CODE RA SỬA LÀ REFACTOR/REFACTORING
        if (n < 0 || n > 20){
            throw new IllegalArgumentException("n should be between 0 and 20");
        }   //bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko dc chay thành công, ko value trả về
        if (n == 0 || n == 1) {
            return 1;
        }

        //ĐỆ QUY - RECURSION - GỌI LẠI CHÍNH MÌNH VỚI QUY MÔ NHỎ HƠN
        return n * getFactorial(n - 1);
    }
//ĐEM LÊN SERVER MÀ RA MÀU XANH
    //1. CODE TỐI ƯU NGON VÌ PASS TEST CASE
    //2. TEST LẠI THỨ ĐÃ TỪNG TEST RẤT MẮC CÔNG, NAY CÓ SCRIPT TEST TỰ ĐỘNG, KHỎE RE
    // RECURSION TESTING, KIỂM THỬ HỒI QUY

//    public static long getFactorial(int n){
//        //day la ham mo phong thu vien toan hoc MATH. cua JDK
//        //ham nay tinh n!: 1*2*3*...*n, ko co giai thua am, 0! ma 1, 20! vua du kieu long
//
//        //ĐEM CODE RA SỬA LÀ REFACTOR/REFACTORING
//        if (n < 0 || n > 20){
//           throw new IllegalArgumentException("n should be between 0 and 20");
//        }   //bạn đưa invalid data, tớ ném ra ngoại lệ, hàm ko dc chay thành công, ko value trả về
//        if (n == 0){
//            return 1;
//        }
//
//        //sống sót đến đây n = 1..19
//        long result = 1; //thuật toán dồn con heo đất
//        for (int i = 1; i <= n; i++){
//            result *= i;    //nhân dồn vào từng cháu n
//        }
//
//        return result;
//    }
}
