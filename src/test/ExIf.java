
public class ExIf {
	public static void main(String[] args) {
		
		
		int deadLine		= 20;
		int reportingDate	= 25;
		
		//기간내에 맞게 제출을 하지 못했는지 판별
		if (deadLine < reportingDate) {
			System.out.println("기간 내에 제출하지 못했습니다.");
		}
	}
}
