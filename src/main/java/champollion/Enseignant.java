package champollion;
import java.util.ArrayList;

public class Enseignant extends Personne {
    ArrayList<intervention> Cours= new ArrayList<intervention>();
    ArrayList<ServicePrevu> Services = new ArrayList<ServicePrevu>();

    public Enseignant(String nom, String email) {
        super(nom, email);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant en "heures équivalent TD" Pour le calcul : 1 heure
     * de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure de TP vaut 0,75h
     * "équivalent TD"
     *
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevues() {
        int T=0;
        for(int k=0; k<Services.size();k++){
            T+=Services.get(k).getTD();
            T+=Services.get(k).getCM()*1.5;
            T+=Services.get(k).getTP()*0.75;
        }
        return(T);
    }

    /**
     * Calcule le nombre total d'heures prévues pour cet enseignant dans l'UE spécifiée en "heures équivalent TD" Pour
     * le calcul : 1 heure de cours magistral vaut 1,5 h "équivalent TD" 1 heure de TD vaut 1h "équivalent TD" 1 heure
     * de TP vaut 0,75h "équivalent TD"
     *
     * @param ue l'UE concernée
     * @return le nombre total d'heures "équivalent TD" prévues pour cet enseignant, arrondi à l'entier le plus proche
     *
     */
    public int heuresPrevuesPourUE(UE ue) {
        int T=0;
        UE sRef=ue;
        for( int k=0; k<Services.size(); k++){
            if(Services.get(k).getUE()==sRef){
                T+=Services.get(k).getTD();
                T+=Services.get(k).getCM()*1.5;
                T+=Services.get(k).getTP()*0.75;
            }
        }
        return(T);
    }

    /**
     * Ajoute un enseignement au service prévu pour cet enseignant
     *
     * @param ue l'UE concernée
     * @param volumeCM le volume d'heures de cours magitral
     * @param volumeTD le volume d'heures de TD
     * @param volumeTP le volume d'heures de TP
     */
    public void ajouteEnseignement(UE ue, int volumeCM, int volumeTD, int volumeTP) {
        ServicePrevu S = new ServicePrevu(volumeTD, volumeTP, volumeCM, ue);
        Services.add(S);
    }

}
