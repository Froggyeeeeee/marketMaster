package com.MarketMaster.model;

import java.util.List;

public interface IHouseService {
	public House insert(House bean);
	public House selectedById(Integer houseid);
	public List<House> selectAll();
	public House update(Integer houseid, String housename);
	public boolean deleteById(Integer houseid);
}
