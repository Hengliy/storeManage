package daoimpl;

import dao.ProductorDao;
import entity.ProductorEntity;
import hibernate.BaseDaoImpl;

import java.util.List;

public class ProductorDaoImpl extends BaseDaoImpl implements ProductorDao{
    @Override
    public List<ProductorEntity> getAllProductor() {
        return (List<ProductorEntity>) getAllData("productor",ProductorEntity.class);
    }

    @Override
    public Boolean insertProductor(ProductorEntity productorEntity) {
            return insertByID(productorEntity);
    }
}
