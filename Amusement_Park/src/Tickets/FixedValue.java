package Tickets;

public class FixedValue {
	//변수 클래스
	final static String File_Route = "C:\\Users\\kopo39\\Desktop\\AmusementPark_Ticket.csv"; 
	
	public static final int ONEDAY_Ticket = 1;//주간
	public static final int NIGHT_Ticket = 2;//야간
	
	//이용권종류 - 주간권
	public static final int ONEDAY_Adult = 56000;//대인
	public static final int ONEDAY_Teenager = 47000;//청소년
	public static final int ONEDAY_Children = 44000;//소인
	public static final int ONEDAY_Elderly = 44000;//경로
	public static final int ONEDAY_baby = 0;//유아 (36개월 미만은 무료)
	
	//이용권종류 - 야간권
	public static final int NIGHT_Adult = 46000;//대인
	public static final int NIGHT_Teenager = 40000;//청소년
	public static final int NIGHT_Children = 37000;//소인
	public static final int NIGHT_Elderly = 37000;//경로
	public static final int NIGHT_baby = 0;//유아 (36개월 미만은 무료)
	
	//연령 선정
	public static final int AGE_Elderly = 65; //경로 : 만 65세 ~
	public static final int AGE_Adult = 19; //어른 : 만 19세 ~ 만 64세
	public static final int AGE_Teenager = 13;// 청소년 : 만 13세 ~ 만 18세
	public static final int AGE_Children = 3;//소인 : 36개월 ~ 만 12세
	
	//우대사항
	public static final double NormalPpl = 1.0; //우대사항 없음
	public static final double Disabled = 0.6; //장애인 우대
	public static final double Veterans = 0.5; //국가유공자 우대
	public static final double MultiKindFam = 0.8; //다자녀우대
	public static final double Schwangere = 0.85; //임산부 우대
}

