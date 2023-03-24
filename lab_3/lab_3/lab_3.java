package lab_3;

public class lab_3 {
    // public static void task_1() {
    //     Punkt p = new Punkt(1,3);
    //     Punkt p2 = new Punkt(1,3);
    //     System.out.println(Punkt.E_Y);
    //     System.out.println(p==(p2));
    // }

    // public static void task_2_1() {
    //     try {
    //         Punkt p1 = Punkt.E_X;
    //         System.out.println(p1);
    //         Transformacja tr = new Translacja(5, 6);
    //         System.out.println(tr);
    //         Punkt p2 = tr.transformuj(p1);
    //         System.out.println(p2);
    //         Transformacja trr = tr.getTransformacjaOdwrotna();
    //         System.out.println(trr);
    //         Punkt p3 = trr.transformuj(p2);
    //         System.out.println(p3);
           
    //         } catch (BrakTransformacjiOdwrotnejException ex)
    //         {
    //             ex.printStackTrace();
    //         }
    //             System.out.println();
    //     }


    // public static void task_2_2() {
    //     try
    //     {
    //         Punkt p1 = new Punkt(2, 2);
    //         System.out.println(p1);
    //         Transformacja tr2 = new Skalowanie(5, 4);
    //         System.out.println(tr2);
    //         Punkt p2 = tr2.transformuj(p1);
    //         System.out.println(p2);
    //         Transformacja trr2 = tr2.getTransformacjaOdwrotna();
    //         System.out.println(trr2);
    //         Punkt p3 = trr2.transformuj(p2);
    //         System.out.println(p3);
    //     }
    //     catch(BrakTransformacjiOdwrotnejException ex)
    //     {
    //     ex.printStackTrace();
    //     }
    //     System.out.println();
       
    // }
    // public static void task_2_3() {
    //     try
    //         {
    //         Punkt p1 = new Punkt(2, 2);
    //         Transformacja tr2 = new Skalowanie(5, 0);
    //         System.out.println(tr2);
    //         System.out.println(p1);
    //         Punkt p2 = tr2.transformuj(p1);
    //         System.out.println(p2);
    //         Transformacja trr2 = tr2.getTransformacjaOdwrotna();
    //         System.out.println(trr2);
    //         Punkt p3 = trr2.transformuj(p2);
    //         System.out.println(p3);
    //         }
    //         catch(BrakTransformacjiOdwrotnejException ex)
    //         {
    //             ex.printStackTrace();
    //         }
    //         System.out.println();
    // }  

    // public static void task_3_1() {
    //     try {
    //         Punkt p1 = Punkt.E_X;
    //         System.out.println(p1);
    //         Transformacja tr = new Obrot(90);
    //         System.out.println(tr);
    //         Punkt p2 = tr.transformuj(p1);
    //         System.out.println(p2);
    //         Transformacja trr = tr.getTransformacjaOdwrotna();
    //         System.out.println(trr);
    //         Punkt p3 = trr.transformuj(p2);
    //         System.out.println(p3);
           
    //         } catch (BrakTransformacjiOdwrotnejException ex)
    //         {
    //             ex.printStackTrace();
    //         }
    //             System.out.println();
    //     }

    //     public static void task_3_2() {
    //         try
    //         {
    //             Punkt p1 = new Punkt(2, 2);
    //             System.out.println(p1);
    //             Transformacja tr2 = new Obrot(45);
    //             System.out.println(tr2);
    //             Punkt p2 = tr2.transformuj(p1);
    //             System.out.println(p2);
    //             Transformacja trr2 = tr2.getTransformacjaOdwrotna();
    //             System.out.println(trr2);
    //             Punkt p3 = trr2.transformuj(p2);
    //             System.out.println(p3);
    //         }
    //         catch(BrakTransformacjiOdwrotnejException ex)
    //         {
    //         ex.printStackTrace();
    //         }
    //         System.out.println();
           
    //     }
    //     public static void task_3_3() {
    //         try
    //             {
    //             Punkt p1 = new Punkt(2, 2);
    //             Transformacja tr2 = new Obrot(23);
    //             System.out.println(tr2);
    //             System.out.println(p1);
    //             Punkt p2 = tr2.transformuj(p1);
    //             System.out.println(p2);
    //             Transformacja trr2 = tr2.getTransformacjaOdwrotna();
    //             System.out.println(trr2);
    //             Punkt p3 = trr2.transformuj(p2);
    //             System.out.println(p3);
    //             }
    //             catch(BrakTransformacjiOdwrotnejException ex)
    //             {
    //                 ex.printStackTrace();
    //             }
    //             System.out.println();
    //     }  

    //     public static void task_4_1() {
                
    //                 Punkt p1 = new Punkt(2, 3);
    //                 Transformacja tr2 = new Obrot(30);
    //                 Transformacja tr3 = new Obrot(90);
    //                 Transformacja tr4 = new Skalowanie(3, 5);
    //                 Transformacja tr5 = new Skalowanie(5, 2);
    //                 Transformacja tr6 = new Translacja(3, 5);
    //                 Transformacja tr7 = new Obrot(30);
    //                 Transformacja[] arr = {tr2, tr3, tr4, tr5, tr6, tr7};
    //                 ZlozenieTransformacji t = new ZlozenieTransformacji(arr);
    //                 p1 = t.transformuj(p1);
    //                 ZlozenieTransformacji t2 = t.getTransformacjaOdwrotna();
    //                 Punkt p2 = t2.transformuj(p1);
    //                 System.out.println(p2);
    //                 System.out.println(p1);

    //                 // Punkt p2 = tr2.transformuj(p1);
    //                 // System.out.println(p2);
    //                 // Transformacja trr2 = tr2.getTransformacjaOdwrotna();
    //                 // System.out.println(trr2);
    //                 // Punkt p3 = trr2.transformuj(p2);
    //                 // System.out.println(p3);
                    
                    
    //                 System.out.println();
    //     }
        public static void task_5_1() {
            Punkt srodek = new Punkt(1,2);
            Uklad uklad = Uklad.getInstance();
            uklad.setCenter(srodek);
            uklad.setT1(new Translacja(-srodek.GetX(), -srodek.GetY()));
            uklad.setT2(new Translacja(srodek.GetX(), srodek.GetY()));
            Punkt a = new Punkt(3, 5);
            
            Skalowanie skal = new Skalowanie(3, 5);

            Translacja trans = new Translacja(3, 4);
            Obrot obrot = Obrot(2);
            Obrot obrotOdwrotny = obrot.getTransformacjaOdwrotna();
            try {
                // a = skal.transformuj(a);
                // a = obrot.transformuj(a);
                // a = trans.transformuj(a);
                // a = skal.transformuj(a);
                try {
                    a = obrot.transformuj(a);
                    a = obrotOdwrotny.transformuj(a);
                    // Transformacja skalOdwrot = skal.getTransformacjaOdwrotna(); 
                    // a = skalOdwrot.transformuj(a);
                // Obrot obrot = new Obrot(1);
                } catch (BrakTransformacjiOdwrotnejException e) {
                    e.printStackTrace();
                }

            } catch(BrakUkladuExc e) {
                e.printStackTrace();
            }
            System.out.println(a);
        }
    public static void main(String[] args) {
        // task_1();
        // task_2_1();
        // task_2_2();
        // task_2_3();

        // task_3_1();
        // task_3_2();
        // task_3_3();

        task_5_1();

        // Scanner inputScanner = new Scanner(System.in);
        // String imie = inputScanner.nextLine();
        // System.out.println("imie: " + imie +'\n');
    }
}
