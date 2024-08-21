public class InverseString {
    public static void main(String[] args) {
        // La chaîne de caractères initiale (texte inversé du poème)
        String originalString = ".rosért nu tse liavart el euQ\n"
                + "trom as tnava rertnom ruel eD\n"
                + "egas tuf erèp el siaM .éhcac ed tniop ,tnegra’D\n"
                + ".egatnavad atroppar ne lI\n"
                + "na’l ed tuob ua’uq neib is ; tuotrap ,àled ,àçeD\n"
                + "pmahc el tnenruoter suov slif sel ,trom erèp eL\n"
                + ".essaper te essap en niam al ùO\n"
                + "ecalp ellun zessial en ; zehcêb ,relliuof ,zesuerC\n"
                + ".tûO’l tiaf arua no’uq sèd pmahc ertov zeumeR\n"
                + ".tuob à zerdneiv ne suov ,revuort aref el suoV\n"
                + "egaruoc ed uep nu siam ; tiordne’l sap sias en eJ\n"
                + ".snaded éhcac tse rosért nU\n"
                + ".stnerap son éssial tno suon euQ\n"
                + "egatiréh’l erdnev ed ,li-tid ruel ,suov-zedraG\n"
                + ".sniomét snas alrap ruel ,stnafne ses rinev tiF\n"
                + ",eniahcorp trom as tnatnes ,rueruobaL ehcir nU\n"
                + ".sniom el euqnam iuq sdnof el tse’C\n"
                + ": eniep al ed zenerp ,zelliavarT";

        // Déclaration d'une chaîne vide pour stocker le texte inversé
        String reversedString = "";

        // Boucle pour parcourir la chaîne d'origine de la fin vers le début
        for (int i = originalString.length() - 1; i >= 0; i--) {
            char currentChar = originalString.charAt(i); // Récupère le caractère à l'index actuel
            reversedString = reversedString + currentChar; // Ajoute le caractère à la chaîne inversée
        }

        // Affichage du texte inversé
        System.out.println(reversedString);
    }
}
