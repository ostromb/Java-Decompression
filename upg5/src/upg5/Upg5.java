package upg5;
import java.util.Scanner;
import java.util.*; 
import java.util.ArrayList;
public class Upg5 {


	 public static class City implements Comparable<City> {
		private String city;
		private double temp;

		
		

		

		public int compareTo(City o) {
			this.city.compareTo(o.city);
			int result = (int) (this.temp*10 - o.temp*10);
			if (result==0) {
				return this.city.compareTo(o.city);
			}
			else {
				return result;
			}
		}
		
		public City(String acity, double acitytemp) {
			// TODO Auto-generated constructor stub
			this.city = acity;
			this.temp = acitytemp;
		}		
		
		public double getTemp() { return temp; } 
	    public String getCity()   {  return city; } 
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<City> list = new ArrayList<City>();
		Scanner obj = new Scanner(System.in);
		int months = obj.nextInt();
		int cities = obj.nextInt();
		String abra = obj.nextLine(); // Krävs för att gå till nästa rad
		String[] monthlist = new String[months];
		
		for(int i = 0;i<months;i++) {
			monthlist[i] = obj.nextLine();
		}
		String[][] citieslist = new String[cities][months+1];
		for(int i = 0;i<cities;i++) {
			String city_unform = obj.nextLine();
			String[] city_form = city_unform.split(" "); 
			citieslist[i] = city_form;
			
		}
		String monthchosen = obj.nextLine();
		int a = 0;
		boolean b = true;
		while(b==true) {
			if (monthlist[a].compareTo(monthchosen)==0) {
				b = false;
			}
			a=a+1;		
		}
				
		for(int i=0;i<cities;i++) {
			double citytemp = Double.parseDouble(citieslist[i][a]);
			list.add(new City(citieslist[i][0],citytemp));
			
		}
		Collections.sort(list);
		for (City city: list) { 
			System.out.println(city.getCity()+" "+city.getTemp());
            
        }

	}
		
		

		

	}


