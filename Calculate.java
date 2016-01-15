public class Calculate{

	public static void main (String [] arg) {
		
		System.out.println("calculate...");
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[1]);
		double summ = first + second;
		System.out.println ("sum "+summ);
		
		System.out.println("calculate...");
		double third = Double.valueOf(arg[2]);
		double forth = Double.valueOf(arg[3]);
		double raz = third - forth;
		System.out.println ("raz "+raz);
		
		System.out.println("calculate...");
		double fith = Double.valueOf(arg[4]);
		double sixth = Double.valueOf(arg[5]);
		double pro = fith*sixth;
		System.out.println ("pro "+pro);
		
		System.out.println("calculate...");
		double seventh = Double.valueOf(arg[6]);
		double eighth = Double.valueOf(arg[7]);
		double chastnoe = seventh/eighth;
		System.out.println ("chastnoe "+chastnoe);
		
		System.out.println("calculate...");
		double a1 = Double.valueOf(arg[8]);
		double a2 = Double.valueOf(arg[9]);
		double stepen1 = Math.pow ( a1 , a2 );
		System.out.println ("stepen' "+stepen1);
		
		System.out.println("calculate...");
		double stepen2 = Math.pow ( a2 , a1 );
		System.out.println ("stepen' "+stepen2);
	}

}