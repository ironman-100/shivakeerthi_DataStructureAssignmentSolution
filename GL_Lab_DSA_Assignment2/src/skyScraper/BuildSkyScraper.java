package skyScraper;

import java.util.Scanner;
import java.util.Stack;

public class BuildSkyScraper {

	Scanner scanner = new Scanner(System.in);
	int totalNoOfFloors;
	int[] deliveredFloorSize;

	public void getDesignSpecs() {

		System.out.println("Enter the total number of floors in the building");
		totalNoOfFloors = scanner.nextInt();
		deliveredFloorSize = new int[totalNoOfFloors];

		for (int i = 1; i <= totalNoOfFloors; i++) {
			System.out.println("Enter the floor size given on day " + (i));
			deliveredFloorSize[i-1] = scanner.nextInt();
		}
		scanner.close();
	}
	
	public void buildSkyScraper(){
		
		Stack<Integer> building = new Stack<Integer>();
		int[] tempFloor = new int[totalNoOfFloors];
		
		for (int i = 0; i < deliveredFloorSize.length; i++) {
			System.out.println();
			System.out.println("Day: " + (i+1));
			if(deliveredFloorSize[i]==totalNoOfFloors) {
				tempFloor[deliveredFloorSize[i]-1] = deliveredFloorSize[i];
				for(int j=deliveredFloorSize[i]-1; j>=0;j--) {
					if(tempFloor[j]>0) {
						building.add(tempFloor[j]);
						System.out.print(tempFloor[j] + " ");
					}else {
						totalNoOfFloors = building.peek()-1;
						break;
					}
						
				}
			}else {
				tempFloor[deliveredFloorSize[i]-1] = deliveredFloorSize[i];
			}
			
		}
	}
	
		
}
