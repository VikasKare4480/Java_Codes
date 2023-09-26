
enum LineUp {

    Rihit,
    Gill,
    Virat, 
    KLRahul,
    Ishan;

    private LineUp() {

        System.out.println("In LineUp constructor");
    }
}

class Demo {
    public static void main(String[] args) {

        LineUp player = LineUp.Rihit;

        switch(player) {

            case Rihit : System.out.println("Rohit"); break;

            case Virat : System.out.println("Virat"); break;

            case Gill : System.out.println("Gill");break;

            case KLRahul : System.out.println("KLRahul");
        }
    }
}


