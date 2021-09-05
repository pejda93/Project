public abstract class Nutriment extends Grocery {
    private Double weight;
    private Double kcal;
    private Double proteins;
    private Double carbohydrates;
    private Double fats;
    private Double fiber;


    public Nutriment(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public void update(Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        if (weight != null) {
            this.weight = weight;
        }
        if (kcal != null) {
            this.kcal = kcal;
        }
        if (proteins != null) {
            this.proteins = proteins;
        }
        if (carbohydrates != null) {
            this.carbohydrates = carbohydrates;
        }
        if (fats != null) {
            this.fats = fats;
        }
        if (fiber != null) {
            this.fiber = fiber;
        }
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public Double getKcal() {
        return kcal / 100 * weight;
    }

    public Double getTotalProteins() {
        return proteins / 100 * weight;
    }

    public Double getProteins() {
        return proteins;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public Double getFats() {
        return fats;
    }

    public Double getFiber() {
        return fiber;
    }

    @Override
    public String toString() {
        return "Company: " + getCompany() + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: " + weight + "\n" +
                "Kcal: " + getKcal() + "\n" +
                "Proteins: " + proteins / weight * 100 + " %" + "\n" +
                "Carbohydrates: " + carbohydrates / weight * 100 + " %" + "\n" +
                "Fats: " + fats / weight * 100 + " %" + "\n" +
                "Fiber: " + fiber / weight * 100 + " %"+ "\n\n"
                ;
    }

    public String totalNutrientTable() {
        return
                "Weight: " + weight + "\n" +
                        "Kcal: " + getKcal() + "\n" +
                        "Proteins: " + proteins / 100 * weight + " g" + "\n" +
                        "Carbohydrates: " + carbohydrates / 100 * weight + " g" + "\n" +
                        "Fats: " + fats / 100 * weight + " g" + "\n" +
                        "Fiber: " + fiber / 100 * weight + " g"+ "\n\n"
                ;
    }
}
