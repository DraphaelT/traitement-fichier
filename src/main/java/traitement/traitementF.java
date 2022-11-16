package traitement;

import fr.diginamic.*;
import java.io.BufferedReader;
//import src.main.resources.open-food-facts;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class traitementF {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Path path = Paths.get("open-food-facts.csv");
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream("open-food-facts.csv");
		
		
		InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
		BufferedReader reader = new BufferedReader(streamReader);
		
		for (String line; (line = reader.readLine()) != null;) {			
			
			String[] tri = line.split("\\|",-1);
			for(String i : tri) {
				//i.replaceAll(" ", "");
				System.out.println(i);
				
			}
		}
	}
	/**
	 * Creation de la Osature de la Base Open Food Fact
	 */
	public void creationBase() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliotheque");
		EntityManager emprunt = entityManagerFactory.createEntityManager();
		
		Additif add = new Additif();
		
		Produit produit = new Produit();
		
		
		emprunt.close();
		entityManagerFactory.close();
	}

}
