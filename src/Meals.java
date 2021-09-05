import java.util.ArrayList;
import java.util.List;

public class Meals {
    private List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public Meals() {
        this.meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m) {
        if (!meals.contains(m)) {
            meals.add(m);
            return true;
        }
        return false;
    }

    public void remove(Meal m) {
        meals.remove(m);
    }

    public List<Meal> search(String s) {
        List<Meal> returnList = new ArrayList<>();

        for (Meal meal :
                meals) {
            if (meal.getName().contains(s)) returnList.add(meal);
        }

        return returnList;
    }

    public List<Meal> search(List<Nutriment> nutriment) {
        List<Meal> returnList = new ArrayList<>();

        boolean haveNutriment = true;

        for (Meal meal :
                meals) {

            haveNutriment = true;

            for (Nutriment nutr :
                    meal.getNutriments()) {
                if (!nutriment.contains(nutr)) haveNutriment = false;
            }

            if (haveNutriment) returnList.add(meal);
        }

        return returnList;
    }

    public List<Meal> search(double kcal) {
        List<Meal> returnList = new ArrayList<>();

        for (Meal meal :
                meals) {
            if (meal.getKcal() < kcal) returnList.add(meal);
        }

        return returnList;
    }

    public List<Meal> search(List<Nutriment> nutriment, double kcal) {
        List<Meal> firstList = new ArrayList<>();

        boolean haveNutriment = true;

        for (Meal meal :
                meals) {

            haveNutriment = true;

            for (Nutriment nutr :
                    meal.getNutriments()) {
                if (!nutriment.contains(nutr)) haveNutriment = false;
            }

            if (haveNutriment) firstList.add(meal);
        }

        List<Meal> returnList = new ArrayList<>();

        for (Meal meal :
                firstList) {
            if (meal.getKcal() < kcal) returnList.add(meal);
        }

        return returnList;
    }

    @Override
    public String toString() {
        String s = "";

        for (Meal meal :
                meals) {
            s += "[" + meal.getId() + "] | Name: " + meal.getName() + "\n";
        }

        return s;
    }


}
