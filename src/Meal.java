import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Meal implements Energy {
    private UUID id = UUID.randomUUID();
    private List<Nutriment> nutriments;
    private String name;

    public Meal(List<Nutriment> nutriments, String name) {
        this.nutriments = nutriments;
        this.name = name;
    }

    public Meal(String name) {
        this.nutriments = new ArrayList<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public UUID getId() {
        return id;
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
            if (nut.equals(n)) nut.update(nut.getWeight() - n.getWeight(), null, null, null, null, null);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return Objects.equals(id, meal.id);
    }

    @Override
    public String toString() {
        String s = this.name+"\n";
        int num = 1;

        for (Nutriment nutr :
                nutriments) {
            s += num+". Name: "+nutr.getName()+" | Company: "+nutr.getCompany()+ " | Weight: "+nutr.getWeight()+" g"+"\n";
            num++;
        }

        return s;
    }
}
