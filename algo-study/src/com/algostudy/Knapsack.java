package com.algostudy;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ŀ��(��̬�滮)
 * ������������ n �� m��������1��2��3.......n �� ����ȡ������, ʹ��͵��� m ,Ҫ���������еĿ�������г���.
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

    // if n < m , n = m ȥ����m�����
    int up = n > m ? m : n;

    printList(m, up, list);
  }

  /**
   * 
   * @param m
   *            ʣЩ���ܼ�ȥ����
   * @param n
   *            �����������е���󣬴�1��2��3...n������У��
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

