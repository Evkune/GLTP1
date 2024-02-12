package tp_git;
import java.util.ArrayList;
import java.util.List;
public class System_hospitalier {
    private List<Requête> listRequetes;
    public System_hospitalier(List<Requête> listRequetes) {
        super();
        this.listRequetes = listRequetes;
    }
    public System_hospitalier() {
        super();
        listRequetes = new ArrayList<>();
    }
    public List<Requête> getListRequetes() {
        return listRequetes;
    }
    public void setListRequetes(List<Requête> listRequetes) {
        this.listRequetes = listRequetes;
    }
    public void recevoirRequete(Requête requete) {
        listRequetes.add(requete);
        String analyse = analyserRequete(requete);
        String comparaisonDonnees = comparerDonnes();
        System.out.println(analyse);
        System.out.println(comparaisonDonnees);
    }
    // Analyse la requête reçue pour identifier le type de demande et les informations pertinentes
    private String analyserRequete(Requête requête) {
        // Ici, vous pouvez ajouter du code ou des explications sur la manière dont les requêtes sont analysées.
        // Par exemple, extraction des symptômes, détermination du degré d'urgence, etc.
        return "Requête analysée : [détails de l'analyse]";
    }
    // Compare les données de la requête avec les données historiques pour trouver des correspondances ou des schémas
    private String comparerDonnes() {
        // Ici, vous pouvez ajouter du code ou des explications sur la façon dont les données sont comparées.
        // Par exemple, utilisation d'algorithmes de clustering pour trouver des cas similaires, etc.
        return "Cluster trouvé : [détails du cluster]";
    }
}