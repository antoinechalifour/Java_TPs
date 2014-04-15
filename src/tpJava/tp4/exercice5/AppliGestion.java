package tpJava.tp4.exercice5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppliGestion {
	private static int nbClients=0;
	private static List<Client> clients= new ArrayList<Client>();
	private static Scanner sc = new Scanner(System.in);
	private static String fileNameTxt = "InfosClients.txt";
	
	/* INFORMATIONS SUR LES CLIENTS */
	public static Client getClientByNo(int no){
		return clients.get(no);
	}
	
	
	public static int getClientCount(){
		return nbClients;
	}
	
	public static void listerClients() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		int i=0;
		for(Client c : clients){
			System.out.println(i + ". " + c.getNom() + " " + c.getPrenom());
			i++;
		}
	}
	
	/* AJOUTER / SUPPRIMER DES CLIENTS */
	public static void addClient(){
		System.out.println("|------------- AJOUT DE CLIENT -------------|");
		String nom = saisieString("Saisir le nom : ");
		String prenom = saisieString("Saisir le prenom : ");
		
		clients.add(new Client(nom, prenom));
		System.out.println("\t->Client ajouté");
	}
	
	public static void supClient() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		System.out.println("|------------- SUPPRESSION DE CLIENT -------------|");
		clients.remove(choisirNoClient());
		System.out.println("\t->Client supprimé");
	}
	
	/* CONSULTER / MODIFIER DES CLIENTS */
	public static void consulterClient() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		System.out.println("|------------- CONSULTATION DE CLIENT -------------|");
		Client c = choisirClient();
		System.out.println(c);
	}
	
	public static void modifierClient() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		System.out.println("|------------- MODIFICATION DE CLIENT -------------|");
		Client c = choisirClient();

		String str = saisieString("Modifier le nom ? (o/n)");
		if(str.charAt(0) == 'o'){
			String nom = saisieString("Saisir le nom : ");
			c.setNom(nom);
		}
		
		str = saisieString("Modifier le prenom ? (o/n)");
		if(str.charAt(0) == 'o'){
			String prenom = saisieString("Saisir le prenom : ");
			c.setPrenom(prenom);
		}
		System.out.println("\t->Client modifié");
	}
	
	/* CONSULTER / MODIFIER DES COMTPES */
	public static void ajouterCompte() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		System.out.println("|------------- AJOUT DE COMPTE -------------|");
		Client c = choisirClient();
		c.addCompte();
		System.out.println("\t->Compte ajouté");
	}
	
	public static void supCompte() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		System.out.println("|------------- SUPPRESSION DE COMPTE -------------|");
		Client c = choisirClient();
		c.listerComptes();
		int no = saisieInt("Saisissez un numéro de compte : ");
		c.removeCompte(no);
		System.out.println("\t->Compte supprimé");
	}
	
	public static void listerComptes() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		System.out.println("|------------- LISTE DES COMPTES -------------|");
		Client c = choisirClient();
		c.listerComptes();
	}
	
	public static void modifierComptes() throws Exception{
		if(clients.isEmpty()) throw new Exception("Aucun client n'a été ajouté.");
		
		System.out.println("|------------- MODIFICATION DES COMPTES -------------|");
		Client c = choisirClient();
		c.listerComptes();
		int no = saisieInt("Saisissez un numéro de compte : ");
		Compte compte = c.getCompte(no);
		
		int choix = saisieInt("Que voulez-vous faire ? \n\t1 - crediter\n\t2 - debiter\n\t3 - virement\n Choix :");
		switch(choix){
		case 1:
			float f1 = saisieFloat("Quelle est la somme a crediter ?");
			compte.crediter(f1);
			System.out.println("\t->Compte credité");
			break;
		case 2:
			float f2 = saisieFloat("Quelle est la somme a debiter ?");
			compte.debiter(f2);
			System.out.println("\t->Compte débité");
			break;
		case 3:
			c.listerComptes();
			no = saisieInt("Choisissez le compte a debiter : ");
			float f3 = saisieFloat("Quelle est la somme a virer ? ");
			compte.virement(f3, c.getCompte(no));
			System.out.println("\t->Comptes virés");
			break;
		}
		
	}
	
	/* AUTRES METHODES */
	public static void writeTxtfile() throws IOException{
		File f = new File(fileNameTxt);
		
		if(!f.exists()){
			f.createNewFile();
			System.out.println("Fichier créé");
		}
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Client p : clients){
			bw.write("|---------- " + p.getNom() + " " + p.getPrenom() + " ----------");
			bw.newLine();
			for(int i=0 ; i<p.getNbComptes() ; i++){
				bw.write(i + ". " + p.getCompte(i));
				bw.newLine();
			}
			bw.newLine();
		}
		
		bw.close();
	}
	/* METHODES PRIVEES (SAISIE,...) */
	private static String saisieString(String msg){
		System.out.println(msg);
		String tmp = sc.nextLine();
		
		return tmp;
	}
	
	private static int saisieInt(String msg){
		System.out.println(msg);
		return saisieInt();
	}
	
	private static int saisieInt(){
		String noStr = sc.nextLine();
		int no=-1;
		no = Integer.parseInt(noStr);
		
		return no;
	}
	
	private static float saisieFloat(String msg){
		System.out.println(msg);
		
		return saisieFloat();
	}
	private static float saisieFloat(){
		String noStr = sc.nextLine();
		float f=-1;
		f = Float.parseFloat(noStr);
		
		return f;
	}
	
	private static Client choisirClient() throws Exception{
		listerClients();
		int no = saisieInt("Saisir le numéro client : ");
		
		return getClientByNo(no);
	}
	
	private static int choisirNoClient() throws Exception{
		listerClients();
		int no = saisieInt("Saisir le numéro client : ");
		
		return no;
	}
	
	
	/* PROGRAMME PRINCIPAL */
	public static void main(String args[]){
		System.out.println("APPLI DE GESTION DE CLIENTS / COMPTES");
		int choix=1;
		while(choix!=10){
			System.out.println("1 - Consulter les informations d'un client");
			System.out.println("2 - Modifier les informations d'un client");
			System.out.println("3 - Ajouter un client");
			System.out.println("4 - Supprimer un client");
			System.out.println("5 - Consulter un compte");
			System.out.println("6 - Modifier un compte");
			System.out.println("7 - Ajouter un compte");
			System.out.println("8 - Supprimer un compte");
			System.out.println("9 - Sauvegarder les données");
			System.out.println("10 - Quitter");
			choix = saisieInt("Votre choix ? ");
			
			try{
				switch(choix){
				case 1 :
					consulterClient();
					break;
				case 2:
					modifierClient();
					break;
				case 3:
					addClient();
					break;
				case 4:
					supClient();
					break;
				case 5:
					listerComptes();
					break;
				case 6:
					modifierComptes();
					break;
				case 7:
					ajouterCompte();
					break;
				case 8:
					supCompte();
					break;
				case 9:
					writeTxtfile();
				}
			} catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
