   public class App {
        public static void main(String[]  args){
            byte variable = 127;
            double variable1 = variable;
            int variable3 = (int) variable1;
            boolean compare = 12 ==15;

                    // exo 1
        System.out.println("-----------EXO 1----------");
            System.out.println("Taille de byte:"+ Byte.BYTES + " octets");
            System.out.println("Taille de double:"+ Double.BYTES + " octets");
            System.out.println("Taille de int:"+ Integer.BYTES + " octets");
            System.out.println("Taille de long:"+ Long.BYTES + " octets");
            // System.out.println("Taille de boolean:"+ Boolean.BYTES + " octets");
           
                // exo 2
        System.out.println("----------EXO 2--------------");
                String str1 = "Salut";
                String str2 = "SALUT";
                String str3 = str1 + " "+ str2;
                boolean strCompar = str1 == str2;
                boolean strCompar1 =  str1.equals(str2) ;
                System.out.println(str3);
                System.out.println(strCompar);
                System.out.println(strCompar1);


        System.out.println("----------------EXO 3------------------");

                //  exo 3

                int a = 2;
                int b = a-55;
                int c = a*10+b;

                boolean compars = a>b && b<c;
                System.out.println(compars);

        System.out.println("----------------EXO 4------------------");

                    int intVar = 22;
                    System.out.println( "intVar: "+ intVar);
                    double doubleVar = intVar;
                    System.out.println( "doubleVar: " +doubleVar);
                    short shortVar = (short) doubleVar;
                    System.out.println( "shortVar: " +shortVar);


        System.out.println("----------------EXO 5------------------");

            int x = 1;
            double y = 3.14f;

            int z = (int) y;
            System.out.println( "z =  "+z );

            boolean verif = x>z;
            System.out.println( "X est supérieur à z: " + verif);





            // Structure de controles
            System.out.println("----------------Structure de controles------------------");
                System.out.println("----------EXO1-------");

                int num = 8;
                String parite = num % 2 == 0 ? "pair": "Impair";
                        System.out.println(num+ " est "+parite);



                System.out.println("---------EXO2-------");
                int num1 = 1;
                int num2 = 2;
                int num3 = 3;

                int plusGrand = num1;

                if(num2 > num1){
                        plusGrand = num2;
                }else if (num3 > num2){
                        plusGrand = num3;
                }else{
                        plusGrand = num1;
                }

                System.out.println("Le plus grand est: "+ plusGrand);


        System.out.println("---------EXO3-------");

        int age = 18;
        String categorie;

        if(age >= 65){
                categorie="Sénior";
        } else if( age >=20){
                categorie="Adulte";
        }else if (age >=13){
                categorie="Adolescent";
        } else {
                categorie="Enfant";
        }

        System.out.println(categorie);



        System.out.println("---------EXO4-------");

        int note = 30;

        String result = note >= 50 ? "Réussi !": "Echoué";
        System.out.println(result);



        System.out.println("---------EXO5-------");

        int montant = 500;
        


        if(montant < 100){
                montant = montant;
        } else if (montant<=500){
                
                montant = montant - montant*10/100;
        } else{
                 
                montant = montant -  montant*20/100;
        }

        System.out.println(montant);

        

                  // Boocles

                  //
        System.out.println("---------EXO1-------");


        
        for(int i =0; i<=20; i++){
                if(i%2!=0){
                 continue;
                }
                System.out.println(i);
        }

        System.out.println("---------EXO2-------");
        int i = 1;
        int sum = 0;
        while( i <= 10){
                sum +=i;
                i++;
        }

        System.out.println("La somme des entiers de 1 à 10 est : "+ sum);


        System.out.println("---------EXO3-------");
       


        System.out.println("---------EXO4-------");

        int[] orderIDs = {34, 45, 23, 27, 15};
        int total = 0;
        for (int id : orderIDs) {
            total++;
        }
        System.out.println("Total: " + total);




       








 


             
















        }
   }