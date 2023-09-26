import java.io.*;
import java.util.*;


enum ProgLanguage {

//     public static final ProgLanguage C;
//   public static final ProgLanguage CPP;
//   public static final ProgLanguage JAVA;
//   public static final ProgLanguage Python;
//   public static ProgLanguage[] values();
//   public static ProgLanguage valueOf(java.lang.String);

    C,CPP,JAVA,Python;
}


class EnumDemo {

    public static void main(String[] args) {

        System.out.println(ProgLanguage.C);
        System.out.println(ProgLanguage.JAVA);
    }
}
