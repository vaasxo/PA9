package pa8;

import javax.persistence.Persistence;

public class EntityManagerFactory {

	private static final EntityManagerFactory singleton = new EntityManagerFactory();

	private javax.persistence.EntityManagerFactory emf;

	private EntityManagerFactory() {}

	public static EntityManagerFactory getInstance() {
		return singleton;
	}


	public EntityManagerFactory getEntityManagerFactory() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("default");
		}
		return (EntityManagerFactory) emf;
	}

	public void closeEmf() {
		if (emf.isOpen() || emf != null) {
			emf.close();
		}
		emf = null;
	}
}
