package com.academy.proyecto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.academy.proyecto.bo.ProductCar;


public class ProductItemProcessor implements ItemProcessor<ProductCar, ProductCar> {

    private Logger LOGGER = LoggerFactory.getLogger(ProductItemProcessor.class);

    @Override
    public ProductCar process(final ProductCar product) throws Exception {
        String price = "$" + product.getPrecio();
        
        ProductCar transformedProduct = new ProductCar();
        
        LOGGER.info("Converting ( {} ) into ( {} )", product, transformedProduct);
        return transformedProduct;
    }
}
