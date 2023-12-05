package corejavaConcepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetSystemDateAndTime {
	public static void main(String[] args) {
		
		Date currentDateAndTime = new Date();
		System.out.println(currentDateAndTime); 	//	Wed Nov 22 07:02:58 MST 2023

		
		//Convert currentDateAndTime to your own format [yyyyMMMdd_HHmmss] 2023Nov22_063551
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(currentDateAndTime);
		System.out.println(timeStamp);//	2023Nov22_070258
		
		

	}
}
