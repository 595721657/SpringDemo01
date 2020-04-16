package aops.service.impl;

import aops.dao.UserDao;
import aops.pojo.User;
import aops.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao ud;
    
	public UserDao getUd() {
		return ud;
	}

	public void setUd(UserDao ud) {
		this.ud = ud;
	}

	@Override
	public void saveUser(User user) {
         ud.saveUser(user);
	}

}
