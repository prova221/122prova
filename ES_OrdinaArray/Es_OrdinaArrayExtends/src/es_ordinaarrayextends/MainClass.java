/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_ordinaarrayextends;

/**
 *
 * @author Nurul
 */
public class MainClass {
    
    private static int[] vet;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Prova GIT
        vet = new int[100];
        caricaArray(vet);
        System.out.println("");
        System.out.println("NON ORDINATO");
        System.out.println(arrayToString(vet));

        OrdinaArray t1 = new OrdinaArray(vet);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) 
        {
            System.out.println("Errore");
        }
    }

    /**
     * Metodo per caricare numeri random in un vettore
     * @param vet Vettore da riempire
     */
    public static void caricaArray(int[] vet)
    {
        for(int i = 0; i < 100; i++)
            vet[i] = (int) (Math.random()*101);
    }

    /**
     * Metodo per la visualizzazione degli elementi del vettore
     * @param vet Vettore da visualizzare
     * @return String contenente gli elementi da visualizzare
     */
    public static String arrayToString (int[] vet)
    {
        String s = "";
        for(int i = 0; i < 100; i++)
            s += vet[i] + " ";
        return s;
    }
}
