package abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{
		
		public V40() {
			super.setMaker("LG");
		}
		@Override
		public String charge() {
			return null;
		}
		@Override
		public String picture() {
			return null;
		}
		@Override
		public String makeCall() {
			return null;
		}
		@Override
		public String takeCall() {
			return null;
		}
		@Override
		public String touch() {
			return null;
		}
		@Override
		public boolean bluetoothPen() {
			return false;
		}
		
		@Override
		public String printInformation() {
			return "V40는 "+super.getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n번호를 누르고 통화버튼을 누름\n"
					+ "전화받기 버튼을 누름\n1200,1600만 화소 트리플 카메라\n고속충전, "
					+ "고속 무선 충전\n정전식\n블루투스 펜 탑재 여부 : "+bluetoothPen()+"\n";

		};
	
}	
		

