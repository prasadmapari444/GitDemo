package InterfacePracticeWork;

public class AustraliaTraffic implements CentralTraffic,WestTraffic{

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Its GreenGo");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Its redStop");
	}


	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
	System.out.println("Its FlashYellow");	
	}
	
	public void Walkin()
	{
		System.out.println("Walkin..");
	}
	
	public static void main(String[] args)
	{
		CentralTraffic at=new AustraliaTraffic();
		at.FlashYellow();
		at.GreenGo();
		at.redStop();
		
		AustraliaTraffic aa= new AustraliaTraffic();
		aa.Walkin();
		
		WestTraffic wt=new AustraliaTraffic();
		
		wt.goFast();
	}

	@Override
	public void goFast() {
		System.out.println("this is goFast method from west traffic() ");
		
	}


	

}
