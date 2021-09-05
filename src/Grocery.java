import java.util.Objects;
import java.util.UUID;

public abstract class Grocery implements Energy {
    private String company;
    private String name;
    private UUID id = UUID.randomUUID();

    public Grocery(String name) {
        this.company = "Unknown company";
        this.name = name;
    }

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId(){
        return id;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grocery grocery = (Grocery) o;
        return company.equals(grocery.company) && name.equals(grocery.name);
    }

}
