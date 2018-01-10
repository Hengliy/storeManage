package daoimpl;

public class StaffDaoImpl {
//
//    private Session session = null;
//    private Transaction transaction = null;
//    private Configuration configuration = null;
//    private SessionFactory sessionFactory = null;
//
//    public StaffDaoImpl() {
//        //实例化session
//        //实例化Configuration，这行代码默认加载hibernate.cfg.xml文件
//        System.out.print("################");
//        configuration = new Configuration().configure();
//        //以Configuration创建SessionFactory
//        System.out.print("++++++++++++++++++");
//        sessionFactory = configuration.buildSessionFactory();
//        System.out.print("$$$$$$$$$$$$$$$$$$$");
//    }
//
//    public List<StaffEntity> getAllStaff()
//    {
//        List<StaffEntity>  list=null;
//        try{
//
//            session =sessionFactory.openSession();
//            transaction=session.beginTransaction();
//
//            String hql="from StaffEntity ";
//            list = session.createQuery(hql).list();
//
//            transaction.commit();
//
//        }catch (HibernateException e) {
//            transaction.rollback();
//            e.printStackTrace();
//        }finally {
//            if(session!=null){
//                session.close();
//            }
//        }
//        return list;
//    }
}
