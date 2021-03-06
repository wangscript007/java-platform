package com.whenling.centralize.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whenling.centralize.model.Menu;
import com.whenling.centralize.repo.MenuRepository;
import com.whenling.module.domain.service.TreeService;

/**
 * 菜单服务
 * 
 * @作者 孔祥溪
 * @博客 http://ken.whenling.com
 * @创建时间 2016年3月1日 下午4:29:38
 */
@Service
public class MenuService extends TreeService<Menu, Long> {

	@Autowired
	private MenuRepository menuRepository;

	public Menu findByCode(String code) {
		return menuRepository.findByCode(code);
	}
}
