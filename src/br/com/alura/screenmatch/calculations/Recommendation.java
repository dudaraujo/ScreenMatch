package br.com.alura.screenmatch.calculations;

public class Recommendation {

    public void Filters(Sortable sortable) {
        if(sortable.getClassification() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (sortable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque em sua lista para assisitir mais tarde!");
        }
    }
}
