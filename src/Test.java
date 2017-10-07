import java.util.List;

import com.GEMS.dao.UserDAO;
import com.GEMS.entity.User;

public class Test {

	public static void main(String[] args) {
		UserDAO userDAO = new UserDAO();
		List list = userDAO.findByType(0);
		User user;
		for (Object object : list) {
			user=(User)object;
			System.out.println(user.getAccountNum()+","+user.getName()+","+user.getType());
		}
	}

}
