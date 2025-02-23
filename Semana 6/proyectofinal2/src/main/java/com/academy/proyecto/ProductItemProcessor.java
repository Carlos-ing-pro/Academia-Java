package com.academy.proyecto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.academy.proyecto.bo.InventarioPc;


public class ProductItemProcessor implements ItemProcessor<InventarioPc, InventarioPc> {

    private Logger LOGGER = LoggerFactory.getLogger(ProductItemProcessor.class);

    @Override
    public InventarioPc process(final InventarioPc product) throws Exception {
        
        
        InventarioPc transformedProduct = new InventarioPc();
        
        LOGGER.info("Converting ( {} ) into ( {} )", product, transformedProduct);
        return transformedProduct;
    }
}
