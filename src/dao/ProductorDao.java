package dao;

import entity.ProductorEntity;

import java.util.List;

public interface ProductorDao {

    public List<ProductorEntity> getAllProductor();
    public Boolean insertProductor(ProductorEntity productorEntity);
}
