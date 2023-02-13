package ech.microservice.k8s.product.models;

public class Supplier {
    private String name;

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
