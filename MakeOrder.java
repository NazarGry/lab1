package test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Scanner numb = new Scanner(System.in);
		System.out.print("Enter work hours: ");
		Date d  = new Date();
		int hours;
		hours = numb.nextInt();
		System.out.println("It takes me: ");
		if(hours >= d.getDays()*d.getFreehours()) {/*���� �������, � �����*/
			double weeksandremaineddouble = (double)hours / ((double)d.getDays()*(double)d.getFreehours());
			int fullweeks = (int) weeksandremaineddouble;
						System.out.println(fullweeks + "week(s)"); //����� �-��� �����
			fullweeks = fullweeks * 100;
			weeksandremaineddouble = weeksandremaineddouble * 100.00;
			int weeksandremained = (int)weeksandremaineddouble;
				int onehour = 100 / d.getDays() / d.getFreehours(); // 		= 5/100
				
				if(weeksandremained-fullweeks >= onehour) { //���������� �� ������ - ����� ������ ��� �����
					int hoursremain = (weeksandremained-fullweeks) / onehour;
						if(hoursremain >= d.getFreehours()) { //���� ����� ��� 		5>4
							int fulldays = hoursremain / d.getFreehours() ;	//	5/4
										System.out.println(fulldays + "day(s)"); //����� �-��� ���
							fulldays = fulldays *100;
							double daysandremaineddouble = (double)hoursremain / (double)d.getFreehours() * 100.00;
							int daysandremained = (int)daysandremaineddouble;
								
							onehour = 100 / d.getFreehours();
								if(daysandremained-fulldays >= onehour) {//���� �������� ������
									double hourremainedouble = ((double)daysandremained - (double)fulldays) / (double)onehour;
									int hourremaine = (int) hourremainedouble;
									System.out.println(hourremaine + "hour(s)"); //������
								}
							}
						else { //���� �� ����� ���
							System.out.print(hours - d.getDays()*d.getFreehours()); //�-��� �����
							System.out.print("hour(s)"); //�-��� �����
						}
						}
					
				}
			
			
		/*	#2 - !! ���� ����� ����� */ if(hours < d.getDays()*d.getFreehours()) {
			
			if(hours >= d.getFreehours()) { //���������� �� � ���� �� ���� ���� �/��� ������
					double fulldaysdouble = (double)hours / (double)d.getFreehours() ;	//	18/4 = 4.5
					int fulldays = (int)fulldaysdouble;	//	4
					System.out.println(fulldays + "day(s)"); //����� �-��� ���
					double hourremaindouble = fulldaysdouble - (double)fulldays;
					if(hourremaindouble>0.0) {//���� �� � ������
						hourremaindouble = hourremaindouble * 100;
						int hourremain = (int)hourremaindouble;
						double onehourdouble = 1.0 / (double)d.getFreehours();
						onehourdouble = onehourdouble * 100.0;
						int onehour = (int)onehourdouble;
						System.out.println(hourremain / onehour + "hours(s)");
						}
					}
					
			if(hours < d.getDays()) {
				System.out.println(hours + "hour(s)");
			}

		}
		
		}
		
	}
