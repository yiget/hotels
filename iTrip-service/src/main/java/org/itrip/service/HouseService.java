package org.itrip.service;

import java.util.List;

import org.itrip.pojo.House;

public interface HouseService {
	List<House> querybyid(int id);
}
