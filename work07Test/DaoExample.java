package work07Test;

public class DaoExample {

	public static void dbWork(DataAccesObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		dbWork(new OravleDao());
		dbWork(new MySqlDao());

	}

}
