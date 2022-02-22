package dsa;

public class TowerOfHanoi {
	
	
	void Towerofhanoi(int n , char from_rod, char to_rod, char aux_rod) {
		if(n==1) {
			System.out.println("Move 1 disk from rod " + from_rod + " to rod " +  to_rod );
			return;
		}
		
		Towerofhanoi( n-1, from_rod ,aux_rod, to_rod);
		System.out.println("Move disk from " + n +" from rod "  +from_rod + " to rod " + to_rod);
		Towerofhanoi(n-1, aux_rod, to_rod,from_rod );
		
	}
	

	public static void main(String args[]) {
		
		TowerOfHanoi obj = new TowerOfHanoi();
		int n=3;
		obj.Towerofhanoi(n, 'A','B' , 'C');
		double a = Math.pow(n, 2)+1;
		System.out.println("total no.of steps are:- " +a);
		
	}
}
