package com.dp;

public class Adapter {

	static interface ThreePlug {
		public void powerWithThree();
	}

	static class TwoPlug {
		public void powerWithTwo() {
			System.out.println("使用二相电流供电");
		}
	}

	static class TwoPlugAdapter implements ThreePlug {

		private TwoPlug plug;

		public TwoPlugAdapter(TwoPlug plug) {
			this.plug = plug;
		}

		public void powerWithThree() {
			System.out.println("通过转化");
			plug.powerWithTwo();
		}
	}

	static class NoteBook {

		private ThreePlug plug;

		public NoteBook(ThreePlug plug) {
			this.plug = plug;
		}

		public void charge() {
			plug.powerWithThree();
		}

	}

	public static void main(String[] args) {
		TwoPlug two = new TwoPlug();
		ThreePlug three = new TwoPlugAdapter(two);
		NoteBook nb = new NoteBook(three);
		nb.charge();
	}
}
