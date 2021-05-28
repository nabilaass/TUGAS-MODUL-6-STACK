//NABILA ASSHAFA PUTRI 20090105
package stack_latihan;

public class TumpukanApp {
    public static void main (String [] args){
        
    Tumpukan tumpukan=new Tumpukan(10);
    System.out.println("MEMASUKKAN DATA KE STACK : ");
    tumpukan.push(45); //push untuk menginput nilai
    tumpukan.baca();
    tumpukan.push(56); //push nilai
    tumpukan.baca();
    tumpukan.push(67); //push nilai
    tumpukan.baca();
    long nilai1=tumpukan.pop(); //pop guna menghapus data array paling atas pada stack
    System.out.println();
    System.out.println("1)Sistem akan melakukan POP data, data yang berada paling depan/atas yaitu = "+nilai1+" jadi nilai tsb akan dihapus");
    System.out.println("   data setelah di pop/dihapus :");
    tumpukan.baca();
    System.out.println();
    System.out.println("2)Selanjutnya sistem akan melakukan PUSH data yg artinya akan menginput nilai pada data stack");
    System.out.println("   data pada stack setelah dipush/diinput nilai kembali :");
    tumpukan.push(83);
    tumpukan.baca();
    tumpukan.push(27);
    tumpukan.baca();
    long nilai2 = tumpukan.pop();
    System.out.println();
    System.out.println("3)Stack akan melakukan method POP kembali, maka data yang berada paling depan/atas yaitu = "+nilai2+" jadi nilai tsb akan dihapus");
    System.out.println("   data pada stack setelah dipop/dihapus :");
    tumpukan.baca();
    long nilai3 = tumpukan.pop();
    System.out.println();
    System.out.println("4)Stack akan di pop kembali, data teratas yaitu nilai = "+nilai3+ " maka nilai tsb akan dihapus");
    System.out.println("   data pada stack setelah melakukan method POP & PUSH :");
    tumpukan.baca();
}    
}
