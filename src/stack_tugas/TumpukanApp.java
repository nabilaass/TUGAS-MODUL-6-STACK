//NABILA ASSHAFA PUTRI 20090105
package stack_tugas;

public class TumpukanApp {
    public static void main (String [] args){
    Tumpukan tumpukan=new Tumpukan(10);
    tumpukan.push(50); //push untuk menginput nilai
    tumpukan.baca();
    System.out.println();
    tumpukan.push(100);
    tumpukan.baca();
    //1)Sistem akan melakukan POP data, data yang berada paling depan/atas jadi nilai tsb akan dihapus");
    //data setelah di pop/dihapus :");
    tumpukan.pop();
    System.out.println();
    tumpukan.baca();
    System.out.println();
    //2)Selanjutnya sistem akan melakukan PUSH data yg artinya akan menginput nilai pada data stack");
    //data pada stack setelah dipush/diinput nilai kembali :");
    tumpukan.push(60);
    tumpukan.baca();
    System.out.println();
    tumpukan.push(80);
    tumpukan.baca();
    //3)Sistem akan melakukan POP data, data yang berada paling depan/atas jadi nilai tsb akan dihapus");
    //data setelah di pop/dihapus :");
    tumpukan.pop();
    System.out.println();
    tumpukan.baca();
    System.out.println();
    //4)Sistem akan menggunakan method PEEK, digunakan untuk melihat data yg berada diposisi paling atas
    tumpukan.peek();
    long nilai1=tumpukan.peek();
    System.out.println("nilai top = "+nilai1);
}    
}