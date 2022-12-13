package champollion;
    import java.util.Date;
public class intervention {
    protected UE cours;
    protected TypeIntervention Type;
    protected int duree;
    protected Date debut;
    protected boolean annule=false;
    public intervention(UE b, TypeIntervention c){
        cours=b;
        Type=c;
    }
    public String getUE(){return(cours.getIntitule());}
    public TypeIntervention getType(){return(Type);}
    public int getduree(){return(duree);}
}
