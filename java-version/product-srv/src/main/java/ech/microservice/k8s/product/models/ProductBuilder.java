package ech.microservice.k8s.product.models;

public class ProductBuilder {

    private CatalogItemType type;
    private String name;

    public static ProductBuilder of(final CatalogItemType type, final String name) {
        final ProductBuilder builder = new ProductBuilder();
        builder.name = name;
        builder.type = type;
        return builder;
    }

    public CatalogItem build() {
        if (type.equals(CatalogItemType.PRODUCT)) {
            var item = new Product();
            item.setName(this.name);
            return item;
        }
        return null;
    }
    
}
