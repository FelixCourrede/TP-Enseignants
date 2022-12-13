package champollion;

public class ServicePrevu {
	int heureTD;
	int heureTP;
	int heureCM;
	UE cours;

	public ServicePrevu( int a, int b, int c, UE d){
		heureTD=a;
		heureTP=b;
		heureCM=c;
		cours=d;
	}
	public int getTD(){return(heureTD);}
	public int getTP(){return(heureTP);}
	public int getCM(){return(heureCM);}
	public UE getUE(){return(cours);}
}
