package pa8;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;

public class EMFactory {

	private static EntityManagerFactory singleton = null;

	private EMFactory() {
		singleton = Persistence.createEntityManagerFactory("default");
	}

	public static javax.persistence.EntityManagerFactory getInstance() {
		return singleton;
	}

	public EntityManagerFactory getEntityManagerFactory() {
		if(singleton == null) {
			singleton = Persistence.createEntityManagerFactory("default");
		}
		return singleton;
	}

	public void closeEmf() {
		if (singleton.isOpen() || singleton != null) {
			singleton.close();
		}
		singleton = null;
	}
}
