package learn.cycle;

import java.util.Scanner;

import learn.cycle.componentspecification.WheelSpecification;
import learn.cycle.conversion.WheelConversion;

public class CycleCostCalculationEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(" Welcome Cycle Bazar");
      System.out.println("Kindly Provide Following Specification to get you good cycle"
      		+ "and its cost");
      System.out.println("Wheel Specification");
      System.out.println("Spokes -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. Single Rider"+","+"2. Double Rider");
      Scanner sc=new Scanner(System.in);
      int spokeOptionSelected=sc.nextInt();
      System.out.println("Tube -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. WithTube"+","+"2. TubeLess");
      int tubeOptionSelected=sc.nextInt();
      System.out.println("Tyre -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. Branded"+","+"2. Non-Branded");
      int tyreOptionSelected=sc.nextInt();
      System.out.println("Rim -> Select 1 or 2");
      System.out.println("Option Available Are :");
      System.out.println("1. WithTube"+","+"2. TubeLess");
      int rimOptionSelected=sc.nextInt();
      WheelConversion wc=new WheelConversion();
      wc.setRimSelected(rimOptionSelected);
      wc.setSpokeSelected(spokeOptionSelected);
      wc.setTubeSelected(tubeOptionSelected);
      wc.setTyreSelected(tyreOptionSelected);
      
      
	}

	

	
	
	}


