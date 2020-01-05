import 'dart:math';

/**
 * 配列の中でTOP3の値を取得する
 */
main() { 
  List<int> list = [25, 36, 4, 55, 71, 18, 0, 71, 89, 65];
  list.sort((num1, num2) => num2 - num1);  // 逆順ソート
  for (int i = 0; i < 3; i++) {
    print(list[i]);
  }
}