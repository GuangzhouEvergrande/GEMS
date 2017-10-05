package com.userTest;

import java.util.List;

import com.dao.PersonalUserDAO;
import com.dao.UserDAO;
import com.entity.PersonalUser;
import com.entity.User;
import com.service.SigninService;

import sun.util.logging.resources.logging;

public class UserTest {

	public static void main(String[] args) {
		PersonalUserDAO personalUserDAO=new PersonalUserDAO();
		List list=personalUserDAO.findAll();
		PersonalUser personalUser;
		for (Object object : list) {
			personalUser=(PersonalUser)object;
			System.out.println(personalUser.getCertificate()+","+personalUser.getIdNum()+","+personalUser.getMajor());
		}
	}

}
