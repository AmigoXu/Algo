package com.algostudy;

/**
 * 背包问题 
 * V[i][j]= 
 * (1)max{V[i-1,j],vi+V[i-1,j-wi]} (j-wi >=0)  
 * (2)V[i-1,j] (j-w1 < 0)
 * 
 * 初始条件 ： j>=0,V[0][j] = 0; i >=0,V[i][0] = 0
 * 
 * O(nW)
 */
public class KnapsackOri
{
	// 物体价值和重量
	static int[] weight;
	static int[] value;

	// 背包重量
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
	 * 初始化 <br/>
	 * 初始条件 ： j>=0,V[0][j] = 0; i >=0,V[i][0] = 0 其余格为-1
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
	 *            第i个物件
	 * @param j
	 *            包在第i物件中加入的物件之后剩下的能加入重量
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
