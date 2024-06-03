
package SubProgram;
//step 1
import java.io.*;

public class SubProgram_Latihan1 {
    public static int totalSPP; //var global (dibaca di berbagai block)
    public static void main(String[] args) /*step2*/ /*throws IOException*/ {
        //step 3, decalre buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        
        /* membuat program utk 
        menghitung SPP mahasiswa berdasarkan 
        jumlah semester yang ditempuh*/
        
        //step 2
        try {
            //logic program true
            do {
                //declare variable
                String nim, nama;
                int jml_sem;
            
                //Menu dengan Switch-Case
                System.out.println("-----------------");
                System.out.println("1. Input Data");
                System.out.println("2. Output Data");
                System.out.println("3. Logout");
                System.out.println("-----------------");
                System.out.print("Pilih Menu: ");
                //input w/ buufferedreader
                int menu = Integer.parseInt(br.readLine());
                switch(menu){
                    case 1: //menu 1
                        System.out.print("Isi NIM: ");
                        //input br type String
                        nim = br.readLine();
                        System.out.print("Isi Nama: ");
                        nama = br.readLine();
                        System.out.print("Isi Semester yang Sudah Ditempuh: ");
                        jml_sem = Integer.parseInt(br.readLine());
                        
                        //cara call function
                        total_SPP(jml_sem);
                        /*print jika didalam fungsi tidak ada print*/
                        System.out.println("Total SPP: " 
                            + total_SPP(jml_sem)
                            + " Juta rupiah");
                        break; //programm break
                    case 2: //menu 2
//                        System.out.println("NIM: " 
//                                + nim);
//                        System.out.println("Nama: " 
//                                + nama);
//                        System.out.println("Jumlah Semester: " 
//                                + jml_sem);
                        break;
                    default: //else
                        System.exit(0); //keluar dari program
                }
            } while (true);
            
            
        } catch (Exception e) { 
            //jika da yang salah akan catch
            System.out.println("Error:" + e.getMessage());
            
        }
        System.out.println("");
    }
    
    //Function
    static public int total_SPP(int sem){ //int sem --> parameter
        //ex: 4 sem * 15,000,000 = 60,000,000
        totalSPP = sem * 15;
        //return value = total SPP
        return totalSPP;
    
    }
    
    //Procedure
   static  public void cekData(){
        
    }
}
