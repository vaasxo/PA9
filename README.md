# PA9 - Deleanu Radu - 2B1

Pentru partea compulsory, am folosit tool-urile IntelliJ pentru a folosi JPA-ul Hibernate, care a creat persistence.xml si pom.xml necesar pentru a lucra cu baza de date Oracle.
Am creat entitati pentru toate tabelele folosite in laboratorul precedent. In clasa singleton EntityManagerFactory, am scris functiile necesare pentru gestionarea ManagerFactory-ului.
Pentru repository, am ales sa folosesc clasa Movies. Am definit o interfata (MovieRepository) si o implementare (MovieRepositoryImpl) in care am folosit si un NamedQuery pe care
l-am pus initial in entity-ul corespunzator.
