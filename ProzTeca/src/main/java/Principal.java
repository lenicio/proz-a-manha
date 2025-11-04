public class Principal {
    public static void main(String[] args) {
        Livro livro = new Livro(
                "Harry Potter", "Rocco", "01/01/2000",
                10, 249, "JK"
        );

        Dvd dvd = new Dvd(
                "Percy Jackson", "10/10/2010", 12, 149, true
        );


        System.out.println(dvd);

    }
}
