package formation.gtm.democdi.dao;

import javax.annotation.PostConstruct;

/**
 * Implementation de l'interface IClientDao
 * @author Stagiaire
 *
 */
public class JdbcClientDao implements IClientDao {


	public String insertClient() {
		// TODO Auto-generated method stub
		return "Creation client en base de donnees avec Jdbc";
	}
	
	/**
	 * Methode avec annotation @PostConstruct
	 * Annotation Javax pour declencher une methode apres l'instantiation du bean
	 */
	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Apres creation Dao");
	}

}
