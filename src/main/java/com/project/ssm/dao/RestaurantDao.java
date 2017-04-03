package com.project.ssm.dao;

import com.project.ssm.entity.Restaurant;

public interface RestaurantDao {
	/**
	 * @param resId
	 * @return
	 */
	Restaurant queryById(long resId);
	
	/**
	 * @param resName
	 * @return
	 */
	Restaurant queryByName(long resName);
	
	/**
	 * it means that when this restaurant attend into one activity, the attendVoteNum will be updated.
	 * @param resId
	 * @return
	 */
	int attendVote(long resId);
	
	/**
	 * when a member rate this restaurant, the overall rate will be updated. 
	 * @param resId
	 * @param oneRate
	 * @return
	 */
	int UpdateRate(long resId, Double oneRate);
	
	/**
	 * Get the all information of all restaurant.
	 * @return
	 */
	Restaurant listAll();
}
