package br.edu.ifpr.irati.ads.TAD;

public class AppBaralho {

    public static Baralho criarBaralhoConvencional(){

        Naipe espadas = new Naipe("Espadas");
        Naipe paus = new Naipe("Paus");
        Naipe copas = new Naipe("Copas");
        Naipe ouros = new Naipe("Ouros");

        Baralho baralho = new Baralho(52);

        Naipe[] naipes = {espadas, paus, copas, ouros};
        char[] simbolos = {'A','2','3','4','5','6','7','8','9','*','J','Q','K'};
        for (Naipe n: naipes){
            for (int i = 1; i <= 13; i++){
                try {
                    baralho.add(new Carta(simbolos[i-1],i,n));
                } catch (OverflowException e) {
                    System.exit(1);
                }
            }
        }
        return baralho;
    }


    public static void main(String[] args)
            throws OverflowException, NotFoundException {

        Naipe copas = new Naipe("Copas");
        Carta c1 = new Carta('J',11,copas);
        Carta c2 = new Carta('4', 4, copas);
        Carta c3 = new Carta('7',7,copas);
        Baralho baralho = new Baralho();
        baralho.add(c1);
        baralho.add(c2);
        baralho.add(c3);
        System.out.println(baralho);
        System.out.println("\n\n\n");
        System.out.println(AppBaralho.criarBaralhoConvencional());

        Baralho baralho1 = AppBaralho.criarBaralhoConvencional();
        baralho1.remove(c1);
        System.out.println(baralho1);
        System.out.println(baralho1.size());
    }

}
