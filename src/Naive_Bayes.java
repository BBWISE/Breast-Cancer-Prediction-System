import javax.swing.JOptionPane;

public class Naive_Bayes {
	
	static double P_result;
	static double N_result;
	
	static Results rr = new Results();
	
//	public static double Prlt;
//	public static double Nrlt;
	
	public void calculat(double age, double bmi, double glucose, double insulin, double homa, double leptin, double adiponectin, double resistin, double mcp) {
		
		
		
		double age2=0,bmi2=0,glucose2=0,insulin2=0,homa2=0,leptin2=0,adiponectin2=0,resistin2=0, mcp2=0;
		
		
		
	//	absence(Healthy)
		
		if(age<=10) {age2=0;}
		else if(age>=11 && age<=20) {age2=0;}
		else if(age>=21 && age<=30) {age2 = 5;}
		else if (age>=31 && age<=40){age2=8;}
		else if (age>=41 && age<=50) {age2=	7;}
		else if (age>=51 && age<=60) {age2=4;}
		else if (age>=61 && age<=70) {age2=11;}
		else if (age>=71 && age<=80) {age2=12;}
		else if (age>=81 && age<=90) {age2=5;}
		else if (age>=91) {age2=0;}
		else {
			JOptionPane.showMessageDialog(null, "Ensure Age input is correct!!!");
		}
		
		if(bmi<18) {bmi2=0;}
		else if(bmi>=18 && bmi<20) {bmi2=1;}
		else if(bmi>=20 && bmi<22) {bmi2=5;}
		else if(bmi>=22 && bmi<24) {bmi2=11;}
		else if(bmi>=24 && bmi<26) {bmi2=3;}
		else if(bmi>=26 && bmi<28) {bmi2=7;}
		else if(bmi>=28 && bmi<30) {bmi2=4;}
		else if(bmi>=30 && bmi<32) {bmi2=6;}
		else if(bmi>=32 && bmi<34) {bmi2=3;}
		else if(bmi>=34 && bmi<36) {bmi2=7;}
		else if(bmi>=36 && bmi<38) {bmi2=4;}
		else if(bmi>=38) {bmi2=1;}
		else {JOptionPane.showMessageDialog(null, "Ensure BMI input is correct!!!");}

		if(glucose<=70) {glucose2=2;}
		else if(glucose>=71 && glucose<=80) {glucose2=8;}
		else if(glucose>=81 && glucose<=90) {glucose2=24;}
		else if(glucose>=91 && glucose<=100) {glucose2=10;}
		else if(glucose>=101 && glucose<=110) {glucose2=7;}
		else if(glucose>=111 && glucose<=120) {glucose2=1;}
		else if(glucose>=121 && glucose<=130) {glucose2=0;}
		else if(glucose>=131) {glucose2=0;}
		else {JOptionPane.showMessageDialog(null, "Ensure Glucose input is correct!!!");}

		if(insulin<2) {insulin2=0;}
		else if(insulin>=2 && insulin<4) {insulin2=11;}
		else if(insulin>=4 && insulin<6) {insulin2=21;}
		else if(insulin>=6 && insulin<8) {insulin2=8;}
		else if(insulin>=8 && insulin<10) {insulin2=4;}
		else if(insulin>=10 && insulin<12) {insulin2=2;}
		else if(insulin>=12 && insulin<14) {insulin2=0;}
		else if(insulin>=14 && insulin<16) {insulin2=3;}
		else if(insulin>=16 && insulin<18) {insulin2=0;}
		else if(insulin>=18 && insulin<20) {insulin2=1;}
		else if(insulin>=20 && insulin<22) {insulin2=0;}
		else if(insulin>=22 && insulin<24) {insulin2=1;}
		else if(insulin>=24) {insulin2=1;}
		else {JOptionPane.showMessageDialog(null, "Ensure Insulin input is correct!!!");}
		
		if(homa<0.5) {homa2 =1;}
		else if(homa>=0.5 && homa<1.0) {homa2=17;}
		else if(homa>=1.0 && homa<1.5) {homa2=18;}
		else if(homa>=1.5 && homa<2.0) {homa2=6;}
		else if(homa>=2.0 && homa<2.5) {homa2=3;}
		else if(homa>=2.5 && homa<3.0) {homa2=1;}
		else if(homa>=3.0 && homa<3.5) {homa2=2;}
		else if(homa>=3.5 && homa<4.0) {homa2=2;}
		else if(homa>=4.0 && homa<4.5) {homa2=0;}
		else if(homa>=4.5 && homa<5.0) {homa2=0;}
		else if(homa>=5.0) {homa2=2;}
		else {JOptionPane.showMessageDialog(null, "Ensure HOMA input is correct!!!");}
		
		if(leptin<10) {leptin2=11;}
		else if(leptin>=10 && leptin<20) {leptin2=12;}
		else if(leptin>=20 && leptin<30) {leptin2=12;}
		else if(leptin>=30 && leptin<40) {leptin2=6;}
		else if(leptin>=40 && leptin<50) {leptin2=5;}
		else if(leptin>=50 && leptin<60) {leptin2=2;}
		else if(leptin>=60 && leptin<70) {leptin2=2;}
		else if(leptin>=70 && leptin<80) {leptin2=1;}
		else if(leptin>=80 && leptin<90) {leptin2=1;}
		else if(leptin>=90) {leptin2=0;}
		else {JOptionPane.showMessageDialog(null, "Ensure Leptin input is correct!!!");}
		
		if(adiponectin<5) {adiponectin2=10;}
		else if(adiponectin>=5 && adiponectin<10) {adiponectin2=26;}
		else if(adiponectin>=10 && adiponectin<15) {adiponectin2=8;}
		else if(adiponectin>=15 && adiponectin<20) {adiponectin2=1;}
		else if(adiponectin>=20 && adiponectin<25) {adiponectin2=4;}
		else if(adiponectin>=25 && adiponectin<30) {adiponectin2=1;}
		else if(adiponectin>=30 && adiponectin<35) {adiponectin2=0;}
		else if(adiponectin>=35) {adiponectin2=2;}
		else {JOptionPane.showMessageDialog(null, "Ensure Adiponectin input is correct!!!");}
		
		
		if(resistin<5) {resistin2=9;}
		else if(resistin>=5 && resistin<10) {resistin2=21;}
		else if(resistin>=10 && resistin<15) {resistin2=11;}
		else if(resistin>=15 && resistin<20) {resistin2=4;}
		else if(resistin>=20 && resistin<25) {resistin2=6;}
		else if(resistin>=25 && resistin<30) {resistin2=0;}
		else if(resistin>=30) {resistin2=1;}
		else {JOptionPane.showMessageDialog(null, "Ensure Resistin input is correct!!!");}
		
		if(mcp<100) {mcp2=2;}
		else if(mcp>=100 && mcp<200) {mcp2=4;}
		else if(mcp>=200 && mcp<300) {mcp2=10;}
		else if(mcp>=300 && mcp<400) {mcp2=7;}
		else if(mcp>=400 && mcp<500) {mcp2=5;}
		else if(mcp>=500 && mcp<600) {mcp2=8;}
		else if(mcp>=600 && mcp<700) {mcp2=6;}
		else if(mcp>=700 && mcp<800) {mcp2=2;}
		else if(mcp>=800 && mcp<900) {mcp2=2;}
		else if(mcp>=900 && mcp<1000) {mcp2=3;}
		else if(mcp>=1000 && mcp<1100) {mcp2=0;}
		else if(mcp>=1100) {mcp2=3;}
		else {JOptionPane.showMessageDialog(null, "Ensure MCP.1 input is correct!!!");}

		
// PRESIENCE(DISEASED)
		double age2p=0,bmi2p=0,glucose2p=0,insulin2p=0,homa2p=0,leptin2p=0,adiponectin2p=0,resistin2p=0, mcp2p=0;
		
		if(age<=10) {age2p=0;}
		else if(age>=11 && age<=20) {age2p=0;}
		else if(age>=21 && age<=30) {age2p= 0;}
		else if (age>=31 && age<=40){age2p=4;}
		else if (age>=41 && age<=50) {age2p=24;}
		else if (age>=51 && age<=60) {age2p=12;}
		else if (age>=61 && age<=70) {age2p=11;}
		else if (age>=71 && age<=80) {age2p=8;}
		else if (age>=81 && age<=90) {age2p=5;}
		else if (age>=91) {age2p=0;}
		else {
			JOptionPane.showMessageDialog(null, "Ensure Age input is correct!!!");
		}
		
		if(bmi<18) {bmi2p=0;}
		else if(bmi>=18 && bmi<20) {bmi2p=3;}
		else if(bmi>=20 && bmi<22) {bmi2p=9;}
		else if(bmi>=22 && bmi<24) {bmi2p=8;}
		else if(bmi>=24 && bmi<26) {bmi2p=5;}
		else if(bmi>=26 && bmi<28) {bmi2p=11;}
		else if(bmi>=28 && bmi<30) {bmi2p=10;}
		else if(bmi>=30 && bmi<32) {bmi2p=10;}
		else if(bmi>=32 && bmi<34) {bmi2p=4;}
		else if(bmi>=34 && bmi<36) {bmi2p=2;}
		else if(bmi>=36 && bmi<38) {bmi2p=2;}
		else if(bmi>=38) {bmi2p=0;}
		else {JOptionPane.showMessageDialog(null, "Ensure BMI input is correct!!!");}

		if(glucose<=70) {glucose2p=1;}
		else if(glucose>=71 && glucose<=80) {glucose2p=3;}
		else if(glucose>=81 && glucose<=90) {glucose2p=11;}
		else if(glucose>=91 && glucose<=100) {glucose2p=22;}
		else if(glucose>=101 && glucose<=110) {glucose2p=11;}
		else if(glucose>=111 && glucose<=120) {glucose2p=5;}
		else if(glucose>=121 && glucose<=130) {glucose2p=1;}
		else if(glucose>=131) {glucose2p=10;}
		else {JOptionPane.showMessageDialog(null, "Ensure glucose input is correct!!!");}

		if(insulin<2) {insulin2p=0;}
		else if(insulin>=2 && insulin<4) {insulin2p=13;}
		else if(insulin>=4 && insulin<6) {insulin2p=13;}
		else if(insulin>=6 && insulin<8) {insulin2p=6;}
		else if(insulin>=8 && insulin<10) {insulin2p=5;}
		else if(insulin>=10 && insulin<12) {insulin2p=5;}
		else if(insulin>=12 && insulin<14) {insulin2p=4;}
		else if(insulin>=14 && insulin<16) {insulin2p=2;}
		else if(insulin>=16 && insulin<18) {insulin2p=2;}
		else if(insulin>=18 && insulin<20) {insulin2p=3;}
		else if(insulin>=20 && insulin<22) {insulin2p=1;}
		else if(insulin>=22 && insulin<24) {insulin2p=1;}
		else if(insulin>=24) {insulin2p=9;}
		else {JOptionPane.showMessageDialog(null, "Ensure insulin input is correct!!!");}
		
		if(homa<0.5) {homa2p=0;}
		else if(homa>=0.5 && homa<1.0) {homa2p=14;}
		else if(homa>=1.0 && homa<1.5) {homa2p=13;}
		else if(homa>=1.5 && homa<2.0) {homa2p=5;}
		else if(homa>=2.0 && homa<2.5) {homa2p=4;}
		else if(homa>=2.5 && homa<3.0) {homa2p=7;}
		else if(homa>=3.0 && homa<3.5) {homa2p=3;}
		else if(homa>=3.5 && homa<4.0) {homa2p=1;}
		else if(homa>=4.0 && homa<4.5) {homa2p=2;}
		else if(homa>=4.5 && homa<5.0) {homa2p=2;}
		else if(homa>=5.0) {homa2p=13;}
		else {JOptionPane.showMessageDialog(null, "Ensure HOMA input is correct!!!");}
		
		if(leptin<10) {leptin2p=11;}
		else if(leptin>=10 && leptin<20) {leptin2p=23;}
		else if(leptin>=20 && leptin<30) {leptin2p=8;}
		else if(leptin>=30 && leptin<40) {leptin2p=8;}
		else if(leptin>=40 && leptin<50) {leptin2p=6;}
		else if(leptin>=50 && leptin<60) {leptin2p=4;}
		else if(leptin>=60 && leptin<70) {leptin2p=1;}
		else if(leptin>=70 && leptin<80) {leptin2p=1;}
		else if(leptin>=80 && leptin<90) {leptin2p=1;}
		else if(leptin>=90) {leptin2p=1;}
		else {JOptionPane.showMessageDialog(null, "Ensure leptin input is correct!!!");}
		
		if(adiponectin<5) {adiponectin2p=13;}
		else if(adiponectin>=5 && adiponectin<10) {adiponectin2p=25;}
		else if(adiponectin>=10 && adiponectin<15) {adiponectin2p=14;}
		else if(adiponectin>=15 && adiponectin<20) {adiponectin2p=5;}
		else if(adiponectin>=20 && adiponectin<25) {adiponectin2p=6;}
		else if(adiponectin>=25 && adiponectin<30) {adiponectin2p=0;}
		else if(adiponectin>=30 && adiponectin<35) {adiponectin2p=1;}
		else if(adiponectin>=35) {adiponectin2p=0;}
		else {JOptionPane.showMessageDialog(null, "Ensure adiponectin input is correct!!!");}
		
		
		if(resistin<5) {resistin2p=6;}
		else if(resistin>=5 && resistin<10) {resistin2p=13;}
		else if(resistin>=10 && resistin<15) {resistin2p=15;}
		else if(resistin>=15 && resistin<20) {resistin2p=11;}
		else if(resistin>=20 && resistin<25) {resistin2p=8;}
		else if(resistin>=25 && resistin<30) {resistin2p=4;}
		else if(resistin>=30) {resistin2p=7;}
		else {JOptionPane.showMessageDialog(null, "Ensure resistin input is correct!!!");}
		
		if(mcp<100) {mcp2p=3;}
		else if(mcp>=100 && mcp<200) {mcp2p=4;}
		else if(mcp>=200 && mcp<300) {mcp2p=9;}
		else if(mcp>=300 && mcp<400) {mcp2p=13;}
		else if(mcp>=400 && mcp<500) {mcp2p=5;}
		else if(mcp>=500 && mcp<600) {mcp2p=5;}
		else if(mcp>=600 && mcp<700) {mcp2p=6;}
		else if(mcp>=700 && mcp<800) {mcp2p=9;}
		else if(mcp>=800 && mcp<900) {mcp2p=1;}
		else if(mcp>=900 && mcp<1000) {mcp2p=3;}
		else if(mcp>=1000 && mcp<1100) {mcp2p=2;}
		else if(mcp>=1100) {mcp2p=4;}
		else {JOptionPane.showMessageDialog(null, "Ensure mcp input is correct!!!");}
		
		
		//PROBABILITY OF HEALTHY & DISEASED
		
		double ph= 52;ph/=116;
		double pd = 64;pd/=116;
		
		System.out.println(ph+", =,=,= ,"+pd);
//		
		//VALUE OF HEALTHY
	
	//	double Prlt= ph*(age2/52)*(bmi2/52)*(glucose2/52)*(insulin2/52)*(homa2/52)*(leptin2/52)*(adiponectin2/52)*(resistin2/52)*(mcp2/52);
		
		
		
		double Prlt= (double) ph*age2;
		
		//VALUE OF DISEASED
		double Nrlt=(double) (pd)*(age2p/64)*(bmi2p/64)*(glucose2p/64)*(insulin2p/64)*(homa2p/64)*(leptin2p/64)*(adiponectin2p/64)*(resistin2p/64)*(mcp2p/64);
		
		System.out.println(Prlt+", === ,"+Nrlt);
		
		//REFINER OF HEALTHY
		P_result = Nrlt/(Prlt+Nrlt);
		
		//REFINER OF DISEASED
		N_result = Prlt/(Prlt+Nrlt);
		System.out.println(P_result+", === ,"+N_result);
	//	
	//	System.out.println(age+", "+bmi+", "+glucose+", "+insulin+", "+homa+", "+leptin+", "+adiponectin+", "+resistin+", "+ mcp);
		System.out.println(age2+", "+bmi2+", "+glucose2+", "+insulin2+", "+homa2+", "+leptin2+", "+adiponectin2+", "+resistin2+", "+ mcp2);
	//	System.out.println(age2p+", "+bmi2p+", "+glucose2p+", "+insulin2p+", "+homa2p+", "+leptin2p+", "+adiponectin2p+", "+resistin2p+", "+ mcp2p);
		
		
		
		if(P_result>N_result) {
			rr.positive();
		}
		else {
			rr.negative();
		}
		
	}
	
}
