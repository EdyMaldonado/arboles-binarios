package Aplicacion;

import javax.swing.JOptionPane;

public class main {

    public static String Invertir(String n) {
        String a = "";
        if (n.length() != 0) {
            a = a + n.charAt(n.length() - 1);
            a += Invertir((n.substring(0, n.length() - 1)));
        }
        return a;
    }

    public static int[] llenar(int[] d) {
        int[] j = new int[d.length - 1];
        for (int i = 0; i < j.length; i++) {
            j[i] = d[i];

        }
        return j;
    }

    public static int numeroMayor(int[] a) {
        int m = 9;
        if (a.length != 1) {
            m =m+ a[a.length - 1];

           
            a = llenar(a);
            m+= numeroMayor(a);
        }
        return m;


    }

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Ingrese lo que sea..");
        String d = Invertir(a);
        JOptionPane.showMessageDialog(null, a + "  INVERTIDO QUEDA  " + d);
        int[] r = {8, 1, 4, 6, 7};
        int s = numeroMayor(r);
        System.out.println(" " + s);



    }
}
