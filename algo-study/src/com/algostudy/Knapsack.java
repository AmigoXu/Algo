package com.algostudy;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：(动态规划)
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中 随意取几个数, 使其和等于 m ,要求将其中所有的可能组合列出来.
 * prinList(sum,n)= printList(sum-n,n-1)+printList(sum,n-1);
 * 
 */
public class Knapsack
{
  public static void main(String[] args)
  {
    int n = 20;
    int m = 15;
    List<Integer> list = new ArrayList<Integer>();

    // if n < m , n = m 去掉比m大的数
    int up = n > m ? m : n;

    printList(m, up, list);
  }

  /**
   * 
   * @param m
   *            剩些的能减去的数
   * @param n
   *            遍历的树列中的最大，从1，2，3...n右往左校验
   * @param list
   */
  public static void printList(int m, int n, List<Integer> list)
  {
    if (m == 0)
    {
      System.out.println(list);
      return;
    }

    if (n <= 0 || m < 0)
    {
      return;
    }

    List<Integer> list1 = new ArrayList<Integer>(list);
    printList(m, n - 1, list);

    list1.add(n);
    printList(m - n, n - 1, list1);

  }
}

