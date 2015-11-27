package com.algostudy;
import static org.junit.Assert.assertEquals; //��̬����

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
	 * JUnit4�Ĳ���������
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
			//�ö�ά��������ͱ�����Object���͵�
			//�ö�ά�����е�������Ϊ����Calculator�е�add()������׼����
			//�ö�ά�����е�ÿһ��Ԫ���е����ݶ���Ӧ�Ź��췽��ParameterTest()�еĲ�����λ��
			//�������ݹ��췽���Ĳ���λ���жϣ��ö�ά�����еĵ�һ��Ԫ������ĵ�һ�����ݵ��ں��������ݵĺ�
			//�й����־����ʹ�ù�����ο�JUnit4��API�ĵ��е�org.junit.runners.Parameterized���˵��
			Object[][] object = {{3,1,2}, {0,0,0}, {-4,-1,-3}, {6,-3,9}};
			return Arrays.asList(object);
		}
		
		@Test
		public void testAdd(){
			Calculator cal = new Calculator();
			assertEquals(expected, cal.add(input11, input22));
		}
	}
	/********************���ò��Ե�ִ�����̡�************************************************************************/
	//1..���Ȼ�ִ��prepareData()��������׼���õ�������Ϊһ��Collection����
	//2..����������׼���õ����ݵ��ù��췽����Collection���м���Ԫ�أ��ù��췽���ͻᱻ���ü���
	//   ��������Collection����4��Ԫ�أ�����ParameterTest()���췽���ᱻ����4�Σ����ǻ����4���ò�����Ķ���
	//   ����ÿһ��������Ķ��󣬶���ȥִ��testAdd()����
	//   ��Collection�е���������JUnit����ParameterTest(int expected, int input11, int input22)���췽����
	//   ����testAdd()�õ�������˽�в������ͱ�ParameterTest()���췽�����ú�ֵ�ˣ�������������ֵ��������Collection
	/************************************************************************************************************/
}
