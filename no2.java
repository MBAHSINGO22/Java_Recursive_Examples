public class no2 {
    public static void main(String[] args) {
        upAndDown(0);
    }
    public static void upAndDown (int n) 
	{
		System.out.print ("\nLevel: " +  n);
		if (n < 4)
			upAndDown (n+1);
		System.out.print ("\nLEVEL: " + n);
	}

}