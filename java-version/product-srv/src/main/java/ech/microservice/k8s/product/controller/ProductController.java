package ech.microservice.k8s.product.controller;

import ech.microservice.k8s.product.models.CatalogItem;
import ech.microservice.k8s.product.models.CatalogItemType;
import ech.microservice.k8s.product.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private CatalogService service;

    @GetMapping("/products")
    public List<? extends CatalogItem> all() {
        return this.service.getAll(CatalogItemType.PRODUCT);
    }

}
