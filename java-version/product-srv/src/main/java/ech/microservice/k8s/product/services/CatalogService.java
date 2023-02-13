package ech.microservice.k8s.product.services;

import ech.microservice.k8s.product.models.CatalogItem;
import ech.microservice.k8s.product.models.CatalogItemBuilder;
import ech.microservice.k8s.product.models.CatalogItemType;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CatalogService {

    private Map<String, List<CatalogItem>> catalogs = new HashMap<>();

    @PostConstruct
    private void init() {
        this.catalogs.put(CatalogItemType.PRODUCT.name(),
                List.of(CatalogItemBuilder.of(CatalogItemType.PRODUCT, "Jeans").build(),
                        CatalogItemBuilder.of(CatalogItemType.PRODUCT, "Pull").build()));
    }

    public List <CatalogItem> getAll(final CatalogItemType itemType) {
        return this.catalogs.getOrDefault(itemType.name(), Collections.emptyList());
    }

}
