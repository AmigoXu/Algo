package com.algostudy;
import static org.junit.Assert.assertEquals; //静态导入

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class JunitDemo {

	class Calculator {
		public int add(int a, int b) {
			return a + b;
	}


	/**
	 * JUnit4的参数化测试
	 */
	@RunWith(Parameterized.class)
	class ParameterTest {
		private int expected;
		private int input11;
		private int input22;
		
		public ParameterTest(int expected, int input11, int input22){
			this.expected = expected;
			this.input11 = input11;
			this.input22 = input22;
		}
		
		@Parameters
		public  Collection prepareData(){
			//该二维数组的类型必须是Object类型的
			//该二维数组中的数据是为测试Calculator中的add()方法而准备的
			//该二维数组中的每一个元素中的数据都对应着构造方法ParameterTest()中的参数的位置
			//所以依据构造方法的参数位置判断，该二维数组中的第一个元素里面的第一个数据等于后两个数据的和
			//有关这种具体的使用规则，请参考JUnit4的API文档中的org.junit.runners.Parameterized类的说明
			Object[][] object = {{3,1,2}, {0,0,0}, {-4,-1,-3}, {6,-3,9}};
			return Arrays.asList(object);
		}
		
		@Test
		public void testAdd(){
			Calculator cal = new Calculator();
			assertEquals(expected, cal.add(input11, input22));
		}
	}
	/********************【该测试的执行流程】************************************************************************/
	//1..首先会执行prepareData()方法，将准备好的数据作为一个Collection返回
	//2..接下来根据准备好的数据调用构造方法。Collection中有几个元素，该构造方法就会被调用几次
	//   我们这里Collection中有4个元素，所以ParameterTest()构造方法会被调用4次，于是会产生4个该测试类的对象
	//   对于每一个测试类的对象，都会去执行testAdd()方法
	//   而Collection中的数据是由JUnit传给ParameterTest(int expected, int input11, int input22)构造方法的
	//   于是testAdd()用到的三个私有参数，就被ParameterTest()构造方法设置好值了，而它们三个的值就来自于Collection
	/************************************************************************************************************/
}
