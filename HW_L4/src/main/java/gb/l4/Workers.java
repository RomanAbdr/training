package gb.l4;

public class Workers {
    public String fname;
    public String post;
    public String email;
    public String tnumber;
    public String pay;
    public int age;
    Workers (String fname, String post, String email, String tnumber, String pay, int age){
        this.fname = fname;
        this.post = post;
        this.email = email;
        this.tnumber = tnumber;
        this.pay = pay;
        this.age = age;
    }
    void voice (){
        System.out.printf("ФИО: %s;", fname);
        System.out.println();
        System.out.printf("Должность: %s;", post);
        System.out.println();
        System.out.printf("email: %s;", email);
        System.out.println();
        System.out.printf("Телефонный номер: %s;", tnumber);
        System.out.println();
        System.out.printf("Зарплата: %s;", pay);
        System.out.println();
        System.out.printf("Возраст: %s;", age);
        System.out.println();
        System.out.println("===================================");
    }

}
