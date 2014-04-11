package tpJava.tp4.exercice3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class Secu{
	public HashSet<Personne>liste;
	private String fileNameSer="pers.ser";
	private String fileNameTxt="pers.txt";
	
	public Secu() {
		liste = new HashSet<Personne>();
	}
	
	public void addPersonne(Personne p){
		liste.add(p);
	}

	public void serializeAll() throws IOException{
		FileOutputStream fos = new FileOutputStream(fileNameSer);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(liste);
		
		oos.close();
	}
	
	@SuppressWarnings("unchecked")
	public HashSet<Personne> unSerializeAll() throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileNameSer);
		ObjectInputStream ois = new ObjectInputStream(fis);
		HashSet<Personne> li = (HashSet<Personne>) ois.readObject();
		
		ois.close();
		
		return li;
	}
	
	public void writeTxtfile() throws IOException{
		File f = new File(fileNameTxt);
		
		if(!f.exists()){
			f.createNewFile();
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("|\tNom\t|\tPrenom\t|\tSecu\t|\n");
		
		for(Personne p : liste){
			bw.write("|\t"+p.getNom()+"\t|\t"+p.getPrenom()+"\t|\t"+p.getNoSecu()+"\t|\n");
		}
		
		bw.close();
	}
	
	public static void main(String args[]){
		Personne p1 = new Personne("Pere", "Jean", Genre.Masculin, 1);
		Personne p2 = new Personne("Pere", "Jean2", Genre.Masculin, 1);
		Personne p3 = new Personne("Fille", "Jeanne", Genre.Feminin, 2);
		Personne p4 = new Personne("Fille", "Marie", Genre.Feminin, 3);
		try {
			Personne p5 = p4.clone();
			p5.addEnfant(p2);
			p1.addEnfant(p3);
			p1.addEnfant(p4);
			
			Secu s = new Secu();
			s.addPersonne(p1);
			s.addPersonne(p5);
			s.addPersonne(p4);
			
			s.serializeAll();
			HashSet<Personne> t = s.unSerializeAll();
			for(Personne p : t){
				System.out.println(p);
			}
			s.writeTxtfile();
			
		} catch (CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
