
import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//Exercice 1.6
//     float valeura;
//     float valeurb;
//     float valeurc;
//     Scanner in = new Scanner(System.in);
//     System.out.println("Saisir la valeur de a et de b ");
//     valeura = in.nextFloat();
//     valeurb = in.nextFloat();
//     System.out.println("la valeur de a est : "+valeura+" la valeur de b est : " + valeurb);
//     valeurc = valeura;
//     valeura = valeurb;
//     valeurb = valeurc;
//     System.out.println("la valeur de a=b et b=a : a " +valeura + " de b est : " + valeurb);
//Exercice 1.7
//        float valeura=0;
//        float valeurb=0;
//        float valeurc=0;
//        float valeurd=0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Saisir la valeur de a et de b ");
//        valeura = in.nextFloat();
//        valeurb = in.nextFloat();
//        valeurc = in.nextFloat();
//        System.out.println("la valeur de a est : "+valeura+" la valeur de b est : " + valeurb +" la valeur de c est : " + valeurc);
//        valeurd = valeura;
//        valeura = valeurb;
//        valeurb = valeurc;
//        valeurc = valeurd;
//        System.out.println("la valeur a=b b=c c=a est a : "+ valeura +" b : " + valeurb +"  C : " + valeurc);
//exercice 2.1
        //double prixHT;
        //double prixTTC;
        //double tVa = 1.2;
        //double vTva;
        //Scanner tva = new Scanner(System.in);
        //System.out.println("Calcule de la TVA sur produit");
        //prixHT = tva.nextDouble();
        //prixTTC = (prixHT * tVa);
        //vTva = (prixTTC - prixHT);
        //System.out.println("Prix HT: " + prixHT + "Valeur de TVA: " + vTva + " Prix TTC: " + prixTTC);
        //System.out.println("Valeur de TVA "+ vTva);
// exercice 2.2
        //String nom;
        //String prenom;
        //Scanner np = new Scanner(System.in);
        //System.out.println("Quelle est votre prénom ? ");
        //prenom = np.nextLine();
        //System.out.println("Quelle est votre nom ? ");
        //nom = np.nextLine();
        //System.out.println("Bonjour " + prenom + " votre nom est " + nom);
//exercice 2.3
        //int va, vb;
        //int resultat;
        //Scanner input = new Scanner(System.in);
        //System.out.println("somme de deux variable entier negative ou null ou positive ");
        //va = input.nextInt();
        //vb = input.nextInt();
        //resultat = va + vb;
        //if (resultat == 0) {
        //    System.out.println(" le resultat est nul");
        //} else
        //    if (resultat < 0) {System.out.println(" le resultat est négatif");
        //} else {
        //        System.out.println(" le resultat est positif ");
        //    }
        //    System.out.println(":" + resultat);
// exercice 3.1
        //int resultat;
        //Scanner sc = new Scanner(System.in);
        //do {
        //    System.out.println("tenter de trouver le n° entre 1 et 100 : ");
        //    resultat = sc.nextInt();
        //    if (resultat < 10) {
        //        System.out.println("Plus grand");
        //    } else if (resultat > 20) {
        //        System.out.println("Plus petit");
        //    } else {
        //        System.out.println("bien joué");
        //    }}
        //    while (resultat < 10 || resultat > 20) ;
//exercice 3.2
        //int resultat;
        //int resultat2=1;
        //System.out.println("Entrez un nombre pour calculer sa factorielle");
        //Scanner sc = new Scanner(System.in);
        //resultat = sc.nextInt();
        //if (resultat ==1 || resultat ==0) {
        //    resultat = 1;
        //}else {
        //    for (int i = 2; i <= resultat; i++) {
        //       resultat2 = resultat2 * i;
        //          }
        //    }
        //}
        //System.out.println("la factorielle de "+resultat +" est "+resultat2);
//exercice Pomme de terre
//        int tour=0;
//        int panier=3;
//        int patate;
//        int savpatate;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Combien de pomme de terre voulez vous éplucher");
//        patate= sc.nextInt();
//        savpatate = patate;
//        while(patate>3) {
//            patate = patate - panier;
//            tour = tour ++;
//        }
//        if(patate>0){tour=tour++;
//        }
//        System.out.println("il vous faudra "+tour +" voyage pour éplucher vos "+savpatate+" pomme de terre");
//exercice 4
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Veuillez entrer un booléen (true/false): ");
//        boolean booleen = scanner.nextBoolean();
//        System.out.println("Vous avez entré le booléen: " + booleen);
//
//        System.out.print("Veuillez entrer un entier: ");
//        int entier = scanner.nextInt();
//        System.out.println("Vous avez entré l'entier: " + entier);
//
//        // Lecture d'un nombre décimal
//        System.out.print("Veuillez entrer un nombre décimal: ");
//        double decimal = scanner.nextDouble();
//        System.out.println("Vous avez entré le nombre décimal: " + decimal);
//
//        // Lecture d'une chaîne de caractères
//        System.out.print("Veuillez entrer une chaîne de caractères: ");
//        String chaine = scanner.next();
//        System.out.println("Vous avez entré la chaîne: " + chaine);
//
//        // Lecture d'un caractère
//        System.out.print("Veuillez entrer un caractère: ");
//        char caractere = scanner.next().charAt(0);
//        System.out.println("Vous avez entré le caractère: " + caractere);
//
//        // Fermeture du scanner
//        scanner.close();
//
//        // Exemple de sortie formatée
//        System.out.printf("Voici vos entrées formatées: Entier = %d, Décimal = %.2f, " +
//                        "Chaîne = %s, Caractère = %c, Booléen = %b%n",
//                entier, decimal, chaine, caractere, booleen);
//exercice01 While

//        int resulta=0;
//        int compteur =1;
//        int valeur_saisi;
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Veuillez entrer le nombre TGCM");
//        valeur_saisi = sc.nextInt();
//        while(compteur <= valeur_saisi){
//            resulta = compteur + resulta;
//            compteur = compteur +1;
//        }
//        System.out.println(" entier "+resulta);

//exerciceJava01 repeter

//        int resultat=0;
//        int valeur_saisi;
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("Veuillez entrer le nombre TGCM");
//        valeur_saisi = sc.nextInt();
//        for(int compteur=0;compteur<=valeur_saisi;compteur++){
//        resultat+=compteur;
//        }
//        System.out.println(" TGCM "+resultat);

        //exercice répéter

//        int resultat = 0;
//        int valeur_saisi;
//        int compteur=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Veuillez entrer le nombre TGCM");
//        valeur_saisi = sc.nextInt();
//        do {
//            resultat += compteur;
//            compteur ++;
//        } while (compteur <= valeur_saisi);
//
//        System.out.println(" TGCM " + resultat);
//exerciceJava02While
//
//        int resultat=1;
//        int compteur;
//        int valeur_saisi;
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("choisissez un nombre pour calculer sa factoriel ");
//        valeur_saisi = sc.nextInt();
//        compteur = valeur_saisi;
//        if (valeur_saisi==0 ||valeur_saisi==1) {
//            System.out.println("Factoriel de "+valeur_saisi+" et le nombre "+resultat );
//        }else while(compteur >1 ){
//            resultat *= compteur;
//            compteur --;
//        }
//        System.out.println(" entier "+resultat);
//}
//        int variablea;
//        int variableb;
//        int variablec;
//        double variabldelta;
//        double variablresultat;
//        double resultat;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Valeur de A ");
//        variablea = input.nextInt();
//        System.out.println("Valeur de B ");
//        variableb = input.nextInt();
//        System.out.println("Valeur de C ");
//        variablec = input.nextInt();
//        variabldelta = (variableb * variableb) - (4 * variablea * variablec);
//        if (variabldelta < 0) System.out.println("il n'y a pas de solution");
//        else if (variabldelta == 0) {
//            resultat = ((double) -variableb / (2 * variablea));
//            System.out.println("il y a une solution double pour cette équation " + resultat);
//
//        } else
//        {System.out.println("il y a 2 solutions pour cette équation " + (-variableb + (Math.sqrt(variabldelta) / 2 * variablea)) +" et "+ (-variableb - (Math.sqrt(variabldelta) / 2 * variablea)));
//        }
//        int variablea;
//        int variableb;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("calcule puissance de base ");
//        variablea = sc.nextInt();
//        System.out.println("Denominateur ");
//        variableb = sc.nextInt();
//    System.out.println("Puisance de "+variablea + " est " + (Math.pow(variablea,variableb)));

// Exercice 5
//        Scanner sc = new Scanner(System.in);
//        int[] myArray = {-10, -5, 0, 10, 15, 20, 25, 30, 40, 50};
//        int indiceBas = 0;
//        int indiceHaut = myArray.length - 1;
//        int indiceMilieu = (indiceBas + indiceHaut) / 2;
//        boolean flag = false;
//        int valeurrecherche;
//
//        System.out.println("recherche valeur dans tableau :");
//        valeurrecherche = sc.nextInt();
//        if (valeurrecherche < myArray[0] || valeurrecherche > myArray[9]) {
//            System.out.println("La valeur n'est pas dans le tableau");
//        }
//        while (!flag && indiceBas <= indiceHaut) {
//            if (valeurrecherche < myArray[indiceMilieu]) {
//                indiceHaut = --indiceMilieu;
//            } else if (valeurrecherche > myArray[indiceMilieu]) {
//                indiceBas = ++indiceMilieu;
//            } else
//            {
//                flag=true;
//            }
//            indiceMilieu = (indiceBas + indiceHaut) / 2;
//        }
//        if (flag) {
//            System.out.println("la valeur est dans le tableau");}
//        else System.out.println("la valeur nest pas dans le tableau");
// Exercice 6
    Scanner sc = new Scanner(System.in);
    int resultat=1;
    int valeur;
        System.out.println("factoriel :");
        valeur = sc.nextInt();
    for (int i = 1; i <= valeur; i++) {resultat*=i;}
    int[] tabentier=new int[11];
    int[] tabmatrix=new int[2];
    int indicecolonne;
    int x;



    }

    }

