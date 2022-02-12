import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Book[] s = new Book[5];
        s[0] = new Book("doraemon", "fuji", 50000, 3, 100);
        s[1] = new Book("conan", "canh", 40000, 6, 120);
        s[2] = new Book("naruto", "n.anh", 60000, 4, 110);
        s[3] = new Book("tony BS", "tony", 90000, 7, 90);
        s[4] = new Book("Tren duong bang", "tony", 70000, 9, 160);
        int sum1 = getSumNumber(s);
        System.out.println("thu vien co " + sum1 + " cuon sach");
        String tuKhoa = searchBook(s);
        System.out.println(tuKhoa);
    }

    public static int getSumNumber(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getNumber();
        }
        return sum;
    }
    public static int getSumWeight(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getTotalWeight();
        }
        return sum;
    }
    public static int getSumPrice(Book[] books){
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i].getTotalPrice();
        }
        return sum;
    }
    public static String searchBook(Book[] books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten cuon sach ban muon tim: " );
        String ten = scanner.nextLine();
        String k = "";
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (ten.equals(books[i].getName())) {
                index = i;
                break;
            }
        }
            if (index == -1){
            k = "cuon sach ban tim khong co trong thu vien";
            } else{
                k = "cuon sach "+books[index].getName()+" tac gia la "+books[index].getAuthor()+" co gia "+books[index].getPrice();
            }

        return k;
    }
}
