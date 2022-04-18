import java.util.ArrayList;
import java.util.Scanner;

import Ig.modelIG;

public class Instagram{
    public static void main(String[] args) {
       
        modelIG[] post = new modelIG[3];
        post[0] = new modelIG();
        post[0].profile = "(>.<)";
        post[0].Username = "@Rendi";
        post[0].lokasi= "Bukit Tinggi";
        post[0].postingan = "foto 1";
        post[0].like =0;

        ArrayList Isikomen = new ArrayList<>();
        post[0].komentar= Isikomen; 
        post[0].Caption="Happy Weekend";


        post[1] = new modelIG();
        post[1].profile = "(^_^)";
        post[1].Username = "@Dinda_Putri";
        post[1].lokasi= "Bali";
        post[1].postingan = "foto 2";
        post[1].like =0;

        ArrayList Isikomen2 = new ArrayList<>();
        post[1].komentar= Isikomen2; 
        post[1].Caption="Jangan lupa bersyukur dan selalu tebar kebaikan :)";



        post[2] = new modelIG();
        post[2].profile = "(-_-)";
        post[2].Username = "@Jessica_cans";
        post[2].lokasi= "Singapore";
        post[2].postingan = "foto 3";
        post[2].like =0;

        ArrayList Isikomen3 = new ArrayList<>();
        post[2].komentar= Isikomen3; 
        post[2].Caption="Semangat Pagi :)";



        System.out.println("INSTAGRAM");
        System.out.println("----------------------------------");
        System.out.println("\nPostingan 1");
        post[0].postKonten();
        System.out.println("\nPostingan 2");
        post[1].postKonten();
        System.out.println("\nPostingan 3");
        post[2].postKonten();


        Scanner inputdata = new Scanner(System.in);
        char pilihPost = 0;
        do {
            System.out.println("Pilih Postingan (1, 2, 3): ");
            pilihPost = inputdata.next().charAt(0);
            switch (pilihPost) {
                case '1' ->{
                    post[0].postingan();
                    char pilihperintah = 0;
                    do{
                        System.out.println("Pilih perintah (0-5): ");
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[0].LikePostingan(1);
                                post[0].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[0].IsiKomentar(komentar);
                                post[0].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);
                           
                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("All Comments: ");
                                post[0].ShowComment();
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                case '2' ->{
                    post[1].postingan();
                    char pilihperintah = 0;
                    do{
                        System.out.println("Pilih perintah (0-5): ");
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[1].LikePostingan(1);
                                post[1].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[1].IsiKomentar(komentar);
                                post[1].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);
                           
                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("All Comments: ");
                                post[1].ShowComment();
                            }
                            default ->{

                            }
                        }
                    }while (pilihperintah !='0');
                }
                case '3' ->{
                    post[2].postingan();
                    char pilihperintah = 0;
                    do{
                        System.out.println("Pilih perintah (0-5): ");
                        pilihperintah = inputdata.next().charAt(0);
                        switch (pilihperintah){
                            case '1' -> {
                                post[2].LikePostingan(1);
                                post[2].postingan();
                            }

                            case '2'->{
                                System.out.println("Tambahkan Komentar : ");
                                Scanner inputkomen = new Scanner(System.in);
                                String komentar = inputkomen.nextLine();
                                post[2].IsiKomentar(komentar);
                                post[2].postingan();
                            }
                            case '3'->{
                                System.out.println("Share to : ");
                                Scanner inputteman = new Scanner(System.in);
                                String namaTeman = inputteman.nextLine();

                                System.out.println("Dikirim ke: "+namaTeman);
                           
                            }
                            case '4' ->{
                                System.out.println("Postingan disimpan");
                            }
                            case '5'->{
                                System.out.println("All Comments: ");
                                post[2].ShowComment();
                            }
                            default ->{
                            }
                        }
                    }while (pilihperintah !='0');
                }
            }
        }while (pilihPost != '0');






    }

}
