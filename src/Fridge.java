import java.util.ArrayList;
import java.util.List;

public class Fridge {
    private List<Nutriment> nutriments;

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public Fridge() {
        this.nutriments = new ArrayList<>();
    }

    public void add(Nutriment n) {
        if (!nutriments.contains(n)) nutriments.add(n);
        else {
            for (Nutriment nut :
                    nutriments) {
                if (nut.equals(n)) nut.update(nut.getWeight() + n.getWeight(), null, null, null, null, null);
            }
        }
    }

    public void remove(Nutriment n) {
        if (nutriments.contains(n)) nutriments.remove(n);
    }

    public void remove(Nutriment n, double weight) {
        for (Nutriment nut :
                nutriments) {
            if (nut.equals(n)) nut.update(nut.getWeight() - weight, null, null, null, null, null);
        }
    }

    public Double getKcal() {
        Double sumOfKcal = 0.0;

        for (Nutriment nut :
                nutriments) {
            sumOfKcal += nut.getKcal();
        }

        return sumOfKcal;

    }

    public Double getProteins(){
        Double sumOfProteins = 0.0;

        for (Nutriment nut :
                nutriments) {
            sumOfProteins += nut.getProteins();
        }

        return sumOfProteins;
    }

    public Double getCarbohydrates(){
        Double sumOfCarbohydrates = 0.0;

        for (Nutriment nut :
                nutriments) {
            sumOfCarbohydrates += nut.getCarbohydrates();
        }

        return sumOfCarbohydrates;
    }

    public Double getFats(){
        Double sumOfFats = 0.0;

        for (Nutriment nut :
                nutriments) {
            sumOfFats += nut.getFats();
        }

        return sumOfFats;
    }

    public Double getFiber(){
        Double sumOfFiber = 0.0;

        for (Nutriment nut :
                nutriments) {
            sumOfFiber += nut.getFiber();
        }

        return sumOfFiber;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    @Override
    public String toString() {
        String s = "";
        int num = 1;

        for (Nutriment nutr :
                nutriments) {
            s += num+". Name: "+nutr.getName()+" | Company: "+nutr.getCompany()+ " | Weight: "+nutr.getWeight()+" g"+"\n";
            num++;
        }

        return s;
    }


}
