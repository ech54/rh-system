package ech.microservice.k8s.product.models;

public class CatalogItemBuilder {

    private CatalogItemType type;
    private String name;

    public static CatalogItemBuilder of(final CatalogItemType type, final String name) {
        final CatalogItemBuilder builder = new CatalogItemBuilder();
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
