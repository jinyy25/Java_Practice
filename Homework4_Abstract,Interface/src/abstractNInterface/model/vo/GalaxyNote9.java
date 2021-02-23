package abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

		
		public GalaxyNote9() {
			super.setMaker("삼성");
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
			return true;	
		}		
		@Override
		public String printInformation() {
			return "갤럭시 노트9은 "+super.getMaker()+"에서 만들어졌고 제원은 다음과 같다.\n번호를 누르고 통화버튼을 누름\n"
					+ "전화받기 버튼을 누름\n13만 화소 듀얼 카메라\n고속충전, 고속 무선 충전\n정전식, 와콤펜\n블루투스 펜 탑재 여부 : "+bluetoothPen()+"\n";
		}

}
