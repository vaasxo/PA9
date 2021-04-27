package pa9;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class EMFactory {

	private static EntityManagerFactory singleton = null;

	private EMFactory() {
		singleton = Persistence.createEntityManagerFactory("default");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		if(singleton == null) {
			singleton = Persistence.createEntityManagerFactory("default");
		}
		return singleton;
	}
}
