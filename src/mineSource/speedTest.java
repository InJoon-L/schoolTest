package starTest;

public class speedTest {
	public static void main(String[] args) {
		//태양에서 지구까지 거리: 약 1억5천만km
		final int	DISTANCE	= 150_000_000;	//태양에서 지구까지 거리 1억5천만km
		final int	LIGHT_SPEED	= 300_000;		//빛의 속도 30만 km 
		double		time 		= 0;			//빛이 태양에서 지구에 도달하는 시간
		
		//도달시간 = 거리/빛의속도
		time = (double)(DISTANCE / LIGHT_SPEED);
		System.out.printf("빛이 태양에서 지구에 도달하는 시간: %.1e",time);
	}
}
