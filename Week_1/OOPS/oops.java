interface LibraryUser {
    void registerAccount();
    void requestBook();
}

//Kid User
class KidUser implements LibraryUser {
    int age;
    String bookType;
    public void registerAccount() {
        if (age < 12) {
            System.out.println("Successfully registered under a Kids Account");
        } else {
            System.out.println("Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book Issued successfully,return within 10 days");
        } else {
            System.out.println("Only kids books allowed");
        }
    }
}

//Adult User
class AdultUser implements LibraryUser {
    int age;
    String bookType;
    public void registerAccount() {
        if (age > 12) {
            System.out.println("Successfully registered under an Adult Account");
        } else {
            System.out.println("Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book Issued successfully,return within 7 days");
        } else {
            System.out.println("Only adult Fiction books allowed");
        }
    }
}

//Library
public class Main {
    public static void main(String[] args) {
        KidUser kid = new KidUser();
        kid.age = 10;
        kid.registerAccount();
        kid.age = 18;
        kid.registerAccount();
        kid.bookType = "Kids";
        kid.requestBook();
        kid.bookType = "Fiction";
        kid.requestBook();
        System.out.println();

        // Adult User Test
        AdultUser adult = new AdultUser();
        adult.age = 5;
        adult.registerAccount();
        adult.age = 23;
        adult.registerAccount();
        adult.bookType = "Kids";
        adult.requestBook();
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}
