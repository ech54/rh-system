package ech.microservice.k8s.product.models;

public class Product implements CatalogItem {
    private String name;
    private ProductType type;
    private String reference;
    private String description;
    private Supplier supplier;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", reference='" + reference + '\'' +
                ", description='" + description + '\'' +
                ", supplier=" + supplier +
                '}';
    }

    public String getName() {
        return name;
    }

    @Override
    public String getCatalog() {
        return CatalogItemType.PRODUCT.name();
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
