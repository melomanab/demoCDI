package formation.gtm.democdi.service;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import formation.gtm.democdi.dao.IClientDao;

public class ClientService {

	/**
	 * Annotation CDI pour standardiser l'injection d'un beans
	 */
	@Inject
	IClientDao dao; // Interface comme propriete: couplage faible

	/**
	 * Methode métier qui solicite la couche applicative dao pour inserer un client en BDD
	 * @return
	 */
	public String creerClient() {
		return "Service: " + dao.insertClient();
	}

	/**
	 * Methode avec annotation @PostConstruct
	 * Annotation Javax pour d�clencher une m�thode apr�s l'instantiation du bean
	 */
	@PostConstruct
	public void logApresConstruction() {
		System.out.println("Apres creation service");
	}
}
