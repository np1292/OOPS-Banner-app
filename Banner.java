class Banner {
    void show() {
        System.out.println("************************");
        System.out.println("*     OOPS BANNER      *");
        System.out.println("************************");
    }
}

public class Main {
    public static void main(String[] args) {
        Banner obj = new Banner();
        obj.show();
    }
}
