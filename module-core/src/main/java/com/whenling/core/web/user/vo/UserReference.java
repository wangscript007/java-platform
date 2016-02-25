package com.whenling.core.web.user.vo;

import com.whenling.core.web.menu.vo.MenuNode;

public class UserReference {

	private MenuNode[] menus;

	private UserVo user;

	public MenuNode[] getMenus() {
		return menus;
	}

	public void setMenus(MenuNode[] menus) {
		this.menus = menus;
	}

	public UserVo getUser() {
		return user;
	}

	public void setUser(UserVo user) {
		this.user = user;
	}

}
