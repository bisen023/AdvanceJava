package in.com.rays.bean;

import java.util.Iterator;
import java.util.List;

public class TestMarksheet {

	public static void main(String[] args) throws Exception {

		 testAdd();
		// testUpdate();
		// testDelete();
		// testReadAll();
		// testFindByPk();
		//testSearch();

	}



	private static void testSearch() throws Exception {

		MarksheetModel model = new MarksheetModel();

		MarksheetBean bean = new MarksheetBean();
		bean.setName("s");
		bean.setRollNO(101);
		List list = model.search(bean, 1, 5);

		Iterator it = list.iterator();

		while (it.hasNext()) {

			 bean = (MarksheetBean) it.next();

			System.out.print("\t" + bean.getId());
			System.out.print("\t" + bean.getRollNO());
			System.out.print("\t" + bean.getName());
			System.out.print("\t" + bean.getPhy());
			System.out.print("\t" + bean.getChem());
			System.out.println(bean.getMaths());

		}

	}

	private static void testFindByPk() throws Exception {
		MarksheetModel model = new MarksheetModel();
		MarksheetBean bean = model.findByPk(1);

		if (bean != null) {

			System.out.println(bean.getId());
			System.out.println(bean.getRollNO());
			System.out.println(bean.getName());
			System.out.println(bean.getPhy());
			System.out.println(bean.getChem());
			System.out.println(bean.getMaths());

		} else {
			System.out.println("Id does not exits....!!!");

		}

	}

	private static void testReadAll() throws Exception {

		MarksheetModel model = new MarksheetModel();
		model.readAll();

	}

	private static void testDelete() throws Exception {
		MarksheetModel model = new MarksheetModel();
		model.delete(2);

	}

	private static void testUpdate() throws Exception {

		MarksheetBean bean = new MarksheetBean();

		bean.setRollNO(110);
		bean.setName("cccc");
		bean.setPhy(26);
		bean.setChem(27);
		bean.setMaths(25);
		bean.setId(9);

		MarksheetModel model = new MarksheetModel();

		model.update(bean);

	}

	private static void testAdd() throws Exception {

		
		
		MarksheetBean bean = new MarksheetBean();

		bean.setId(7);
		bean.setRollNO(110);
		bean.setName("prem");
		bean.setPhy(89);
		bean.setChem(99);
		bean.setMaths(31);

		MarksheetModel model1 = new MarksheetModel();

		model1.add(bean);

	}




}