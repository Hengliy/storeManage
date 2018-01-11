package daoimpl;

import dao.StaffDao;
import entity.StaffEntity;
import hibernate.BaseDaoImpl;

import java.util.List;

public class StaffDaoImpl extends BaseDaoImpl implements StaffDao {

    @Override
    public List<StaffEntity> getAllStaff() {
        return (List<StaffEntity>) getAllData("staff",StaffEntity.class);
    }

    @Override
    public Boolean insertStaff(StaffEntity staffEntity) {
        return insertByID(staffEntity);
    }
}
