package services;

import dao.TypeDao;
import dao.UserDao;
import model.TypeModel;
import model.UserModel;

import java.util.List;

public class TypeService {

    static TypeDao typeDao = new TypeDao();




    public List<TypeModel> getTypes() {
        List<TypeModel> types = typeDao.geTypes();
        return types;

    }


}
