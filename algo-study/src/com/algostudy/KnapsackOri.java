package com.algostudy;

/**
 * �������� 
 * V[i][j]= 
 * (1)max{V[i-1,j],vi+V[i-1,j-wi]} (j-wi >=0)  
 * (2)V[i-1,j] (j-w1 < 0)
 * 
 * ��ʼ���� �� j>=0,V[0][j] = 0; i >=0,V[i][0] = 0
 * 
 * O(nW)
 */
public class KnapsackOri
{
	// �����ֵ������
	static int[] weight;
	static int[] value;

	// ��������
	static int W;

	static int[][] V;

	public static void main(String[] args)
	{
		value = new int[] { 12, 10, 20, 15 };
		weight = new int[] { 2, 1, 3, 2 };
		W = 5;

		V = new int[value.length + 1][W + 1];

		init(V);

		System.out.println(knapsack(value.length, W));

	}

	/**
	 * ��ʼ�� <br/>
	 * ��ʼ���� �� j>=0,V[0][j] = 0; i >=0,V[i][0] = 0 �����Ϊ-1
	 * 
	 */
	public static void init(int[][] V)
	{
		for (int i = 1; i < V.length; i++)
			for (int j = 1; j < W + 1; j++)
			{
				V[i][j] = -1;
			}

	}

	/**
	 * 
	 * @param i
	 *            ��i�����
	 * @param j
	 *            ���ڵ�i����м�������֮��ʣ�µ��ܼ�������
	 * @return
	 */
	public static int knapsack(int i, int j)
	{
		if (V[i][j] < 0)
		{
			if (j < weight[i - 1])
			{
				V[i][j] = knapsack(i - 1, j);
			}
			else
			{
				V[i][j] =  Math.max(knapsack(i - 1, j),
						value[i - 1] + knapsack(i - 1, j - weight[i - 1]));
			}
		}

		return V[i][j];
	}

}
