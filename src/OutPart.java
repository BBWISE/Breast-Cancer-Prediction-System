import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;

@SuppressWarnings("serial")
public class OutPart extends JFrame {
	
	public static JButton tutorialButton;
	public static JButton predictionButton;
	public static JButton predictButton;
	
	public static JTextField age;
	public static JTextField BMI;
	public static JTextField Glucose;
	public static JTextField Insulin;
	public static JTextField HOMA;
	public static JTextField Leptin;
	public static JTextField Adiponectin;
	public static JTextField Resistin;
	public static JTextField MCP;
	
	static CardLayout mainCard = new CardLayout();
	
	
	public static JPanel mainPageCenter = new JPanel(mainCard);
	
	static Handler handle = new Handler();
	
	public void firstPage() {
		
		JPanel mainPage = new JPanel(new BorderLayout());
			mainPage.setBackground(new Color(163,214,255));
			
			
			JPanel mainPageRight = new JPanel(new GridLayout(10,1,4,4));
				mainPageRight.setBackground(new Color(163,214,255));
				mainPageRight.setBorder(LineBorder.createBlackLineBorder());
				
				mainPageRight.add(new JLabel("image"));
					
					JPanel mpr1 = new JPanel(new GridLayout(2,1,4,4));
					mpr1.setBackground(new Color(163,214,255));
					JLabel MPR1 = new JLabel(" P ");
					MPR1.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR1.setForeground(Color.RED);
					mpr1.add(MPR1);
					JLabel MPRR1 = new JLabel(" R ");
					MPRR1.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR1.setForeground(Color.RED);
					mpr1.add(MPRR1);
				mainPageRight.add(mpr1);
					JPanel mpr2 = new JPanel(new GridLayout(2,1,4,4));
					mpr2.setBackground(new Color(163,214,255));
					JLabel MPR2 = new JLabel(" E ");
					MPR2.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR2.setForeground(Color.RED);
					mpr2.add(MPR2);
					JLabel MPRR2 = new JLabel(" D ");
					MPRR2.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR2.setForeground(Color.RED);
					mpr2.add(MPRR2);
				mainPageRight.add(mpr2);
					JPanel mpr3 = new JPanel(new GridLayout(2,1,4,4));
					mpr3.setBackground(new Color(163,214,255));
					JLabel MPR3 = new JLabel(" I ");
					MPR3.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR3.setForeground(Color.RED);
					mpr3.add(MPR3);
					JLabel MPRR3 = new JLabel(" C ");
					MPRR3.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR3.setForeground(Color.RED);
					mpr3.add(MPRR3);
				mainPageRight.add(mpr3);
					JPanel mpr4 = new JPanel(new GridLayout(2,1,4,4));
					mpr4.setBackground(new Color(163,214,255));
					JLabel MPR4 = new JLabel(" T ");
					MPR4.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR4.setForeground(Color.RED);
					mpr4.add(MPR4);
					JLabel MPRR4 = new JLabel(" I ");
					MPRR4.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR4.setForeground(Color.RED);
					mpr4.add(MPRR4);
				mainPageRight.add(mpr4);
					JPanel mpr5 = new JPanel(new GridLayout(2,1,4,4));
					mpr5.setBackground(new Color(163,214,255));
					JLabel MPR5 = new JLabel(" O ");
					MPR5.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR5.setForeground(Color.RED);
					mpr5.add(MPR5);
					JLabel MPRR5 = new JLabel(" N ");
					MPRR5.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR5.setForeground(Color.RED);
					mpr5.add(MPRR5);
				mainPageRight.add(mpr5);
				mainPageRight.add(new JLabel(" "));
					JPanel mpr6 = new JPanel(new GridLayout(2,1,4,4));
					mpr6.setBackground(new Color(163,214,255));
					JLabel MPR6 = new JLabel(" S ");
					MPR6.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR6.setForeground(Color.RED);
					mpr6.add(MPR6);
					JLabel MPRR6 = new JLabel(" Y ");
					MPRR6.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR6.setForeground(Color.RED);
					mpr6.add(MPRR6);
				mainPageRight.add(mpr6);
					JPanel mpr7 = new JPanel(new GridLayout(2,1,4,4));
					mpr7.setBackground(new Color(163,214,255));
					JLabel MPR7 = new JLabel(" S ");
					MPR7.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR7.setForeground(Color.RED);
					mpr7.add(MPR7);
					JLabel MPRR7 = new JLabel(" T ");
					MPRR7.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR7.setForeground(Color.RED);
					mpr7.add(MPRR7);
				mainPageRight.add(mpr7);
					JPanel mpr8 = new JPanel(new GridLayout(2,1,4,4));
					mpr8.setBackground(new Color(163,214,255));
					JLabel MPR8 = new JLabel(" E ");
					MPR8.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPR8.setForeground(Color.RED);
					mpr8.add(MPR8);
					JLabel MPRR8 = new JLabel(" M ");
					MPRR8.setFont(new Font("Britannic Bold",Font.BOLD,33));
					MPRR8.setForeground(Color.RED);
					mpr8.add(MPRR8);
				mainPageRight.add(mpr8);
				
			JPanel mainPageLeft = new JPanel(new GridLayout(8,1,4,4));
				mainPageLeft.setBackground(new Color(163,214,255));
				mainPageLeft.setBorder(LineBorder.createBlackLineBorder());
				
				mainPageLeft.add(new JLabel("Image ..."));
				
					JPanel mpl1 = new JPanel(new GridLayout(2,1,4,4));
						mpl1.setBackground(new Color(163,214,255));
						JLabel MPL1 = new JLabel(" B ");
						MPL1.setFont(new Font("Britannic Bold",Font.BOLD,41));
						MPL1.setForeground(Color.RED);
						mpl1.add(MPL1);
						JLabel MPLL1 = new JLabel(" R ");
						MPLL1.setFont(new Font("Britannic Bold",Font.BOLD,41));
						MPLL1.setForeground(Color.RED);
						mpl1.add(MPLL1);
				mainPageLeft.add(mpl1);
					JPanel mpl2 = new JPanel(new GridLayout(2,1,4,4));
					mpl2.setBackground(new Color(163,214,255));
					JLabel MPL2 = new JLabel(" E ");
					MPL2.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPL2.setForeground(Color.RED);
					mpl2.add(MPL2);
					JLabel MPLL2 = new JLabel(" A ");
					MPLL2.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPLL2.setForeground(Color.RED);
					mpl2.add(MPLL2);
				mainPageLeft.add(mpl2);
					JPanel mpl3 = new JPanel(new GridLayout(2,1,4,4));
					mpl3.setBackground(new Color(163,214,255));
					JLabel MPL3 = new JLabel(" S ");
					MPL3.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPL3.setForeground(Color.RED);
					mpl3.add(MPL3);
					JLabel MPLL3 = new JLabel(" T ");
					MPLL3.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPLL3.setForeground(Color.RED);
					mpl3.add(MPLL3);
				mainPageLeft.add(mpl3);
				mainPageLeft.add(new JLabel(" "));
					JPanel mpl4 = new JPanel(new GridLayout(2,1,4,4));
					mpl4.setBackground(new Color(163,214,255));
					JLabel MPL4 = new JLabel(" C ");
					MPL4.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPL4.setForeground(Color.RED);
					mpl4.add(MPL4);
					JLabel MPLL4 = new JLabel(" A ");
					MPLL4.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPLL4.setForeground(Color.RED);
					mpl4.add(MPLL4);
				mainPageLeft.add(mpl4);
					JPanel mpl5 = new JPanel(new GridLayout(2,1,4,4));
					mpl5.setBackground(new Color(163,214,255));
					JLabel MPL5 = new JLabel(" N ");
					MPL5.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPL5.setForeground(Color.RED);
					mpl5.add(MPL5);
					JLabel MPLL5 = new JLabel(" C ");
					MPLL5.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPLL5.setForeground(Color.RED);
					mpl5.add(MPLL5);
				mainPageLeft.add(mpl5);
					JPanel mpl6 = new JPanel(new GridLayout(2,1,4,4));
					mpl6.setBackground(new Color(163,214,255));
					JLabel MPL6 = new JLabel(" E ");
					MPL6.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPL6.setForeground(Color.RED);
					mpl6.add(MPL6);
					JLabel MPLL6 = new JLabel(" R ");
					MPLL6.setFont(new Font("Britannic Bold",Font.BOLD,41));
					MPLL6.setForeground(Color.RED);
					mpl6.add(MPLL6);
				mainPageLeft.add(mpl6);
				
			JPanel mainPageTop = new JPanel();
				mainPageTop.setBackground(new Color(244,67,206));
				
				JLabel MPLL = new JLabel("BREAST CANCER PREDICTION SYSTEM ");
				MPLL.setFont(new Font("Time New Romans",Font.BOLD,59));
				MPLL.setForeground(Color.WHITE);
				
				mainPageTop.add(MPLL);
		JPanel west = new JPanel(new BorderLayout());
		west.setBackground(Color.white);
		JPanel center2 = new JPanel(new GridLayout(20,1));
		center2.setBackground(Color.white);
		
		center2.add(new JLabel(" "));
		center2.add(new JLabel(" "));
		center2.add(new JLabel(" "));
		center2.add(tutorialButton = new JButton("Tutorial"));
			tutorialButton.addActionListener(handle);
			tutorialButton.setFont(new Font("Time New Romans", Font.BOLD,14));
		//	tutorialButton.setBackground(new Color(163,214,255));
		center2.add(new JLabel(" "));
		
		center2.add(predictionButton = new JButton("Prediction"));
			predictionButton.addActionListener(handle);
			predictionButton.setFont(new Font("Time New Romans",Font.BOLD,14));
		//	predictionButton.setBackground(Color.RED);
		for(int i=0;i<=12;i++) {
			center2.add(new JLabel(" "));
		}
		
		
		west.add(center2, BorderLayout.CENTER);
		west.add(new JLabel("    "), BorderLayout.WEST);
		west.add(new JLabel("    "), BorderLayout.EAST);
		
			
	//	mainPage.add(mainPageLeft, BorderLayout.WEST);
	//	mainPage.add(mainPageRight, BorderLayout.EAST);
		mainPage.add(mainPageTop, BorderLayout.NORTH);
		mainPage.add(west, BorderLayout.WEST);
		
		// CENTER
			firstPageCenter();
		mainPageCenter.setBorder(LineBorder.createBlackLineBorder());
		mainPage.add(mainPageCenter, BorderLayout.CENTER);
		
		add(mainPage);
	}
	
	public void firstPageCenter(){
		JPanel center = new JPanel(new GridLayout(1,1));
			center.setBackground(Color.white);
			
			JScrollPane sp = new JScrollPane();
			
			
			
			
		//	center;
			
			
			
			
			
			center.add(sp);
		mainPageCenter.add(center, "Main Menu");
		mainCard.show(mainPageCenter, "Main Menu");
		
	}
	
	public void predictionPage() {
		JPanel center = new JPanel(new BorderLayout());
			center.setBackground(Color.white);
			
			JPanel center2 = new JPanel(new GridLayout(15,4));
				
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel("                                                    Age "));
				
				center2.add(age = new JTextField());
				center2.add(new JLabel("                                                    BMI "));
				center2.add(BMI = new JTextField());
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel("                                                    Glucose "));
				center2.add(Glucose = new JTextField());
				center2.add(new JLabel("                                                    Insulin "));
				center2.add(Insulin = new JTextField());
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel("                                                    HOMA "));
				center2.add(HOMA = new JTextField());
				center2.add(new JLabel("                                                    Leptin "));
				center2.add(Leptin = new JTextField());
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel("                                                    Adiponectin "));
				center2.add(Adiponectin = new JTextField());
				center2.add(new JLabel("                                                    Resistin "));
				center2.add(Resistin = new JTextField());
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel("                                                    MCP.1 "));
				center2.add(MCP = new JTextField());
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				center2.add(new JLabel(" "));
				
			JPanel btt = new JPanel(new FlowLayout(FlowLayout.LEFT));
			//	btt.setBackground(Color.white);
				
				btt.add(predictButton = new JButton("Predict"));
				predictButton.addActionListener(handle);
				predictButton.setBackground(Color.PINK);
			//	predictButton.setFont(new Font("Calibril",Font.PLAIN,16));
				
			center2.add(btt);
			for(int i=0;i<=12;i++) {
				center2.add(new JLabel(" "));
			}
			
			age.setFont(new Font("Calibril", Font.PLAIN,15));
			BMI.setFont(new Font("Calibril", Font.PLAIN,15));
			Glucose.setFont(new Font("Calibril", Font.PLAIN,15));
			Insulin.setFont(new Font("Calibril", Font.PLAIN,15));
			HOMA.setFont(new Font("Calibril", Font.PLAIN,15));
			Leptin.setFont(new Font("Calibril", Font.PLAIN,15));
			Adiponectin.setFont(new Font("Calibril", Font.PLAIN,15));
			Resistin.setFont(new Font("Calibril", Font.PLAIN,15));
			MCP.setFont(new Font("Calibril", Font.PLAIN,15));
			
			center.add(new JLabel("  "), BorderLayout.WEST);
			center.add(new JLabel("    "), BorderLayout.EAST);
			center.add(center2, BorderLayout.CENTER);
			
		mainPageCenter.add(center, "Prediction Page");
		mainCard.show(mainPageCenter, "Prediction Page");
	}

	public static void main(String[] args) {
		
		OutPart Start = new OutPart();
		
		Start.firstPage();
		Start.setTitle("Breast Cancer Prediction System");
		Start.setSize(1380,770);
		Start.setLocationRelativeTo(null);
		Start.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Start.setResizable(true);
		Start.setVisible(true);

	}

}
