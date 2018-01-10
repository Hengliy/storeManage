package dao;

import entity.ProductorEntity;
import entity.StaffEntity;

import java.util.List;

public interface StaffDao {

    public List<StaffEntity> getAllStaff();

    public Boolean insertStaff(StaffEntity staffEntity);
}
