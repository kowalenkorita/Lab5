import java.util.InputMismatchException;
import java.util.Scanner;

public class City {
    public static Scanner ob = new Scanner(System.in);
    public String city;
    public info info;

    public City() {
        System.out.println("Введите название города");
        setCity (ob.next());
        info = new info();
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city)  {
        this.city=city;
    }
    public class info {
        int pr,st,sq;
        public info() {
            System.out.println("Количество проспектов в городе:");
            try {
                setPr(ob.nextInt());
            }
            catch (InputMismatchException e) {
                System.out.println("Количество проспектов надо написать числом");
            }
            System.out.println("Количество улиц в городе:");
            try {
                setSt(ob.nextInt());
            }
            catch (InputMismatchException e) {
                System.out.println("Количество улиц надо написать числом");
            }
            System.out.println("Количество площадей в городе:");
            try {
                setSq(ob.nextInt());
            }
            catch (InputMismatchException e) {
                System.out.println("Количество площадей надо написать числом");
            }
        }
        public int getPr() {
            return pr;
        }
        public void setPr(int pr) {
            this.pr=pr;
        }
        public int getSt() {
            return st;
        }
        public void setSt(int st) {
            this.st=st;
        }
        public int getSq() {
            return sq;
        }
        public void setSq(int sq) {
            this.sq=sq;
        }
        public void print() {
            System.out.print("В городе "+getCity()+" "+getPr()+" проспектов,"+getSt()+" улиц и "+getSq()+" площадей");
        }
    }
}