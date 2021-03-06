/*Copyright (c) 2015-2016 gmail.com All Rights Reserved.
 This software is the confidential and proprietary information of gmail.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with gmail.com*/

package com.test_mobi_18thnov.testproc.service;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wavemaker.runtime.data.expression.QueryFilter;
import com.wavemaker.runtime.data.exception.EntityNotFoundException;

import com.test_mobi_18thnov.testproc.*;

/**
 * Service object for domain model class Table4.
 * @see com.test_mobi_18thnov.testproc.Table4
 */

public interface Table4Service {
   /**
	 * Creates a new table4.
	 * 
	 * @param created
	 *            The information of the created table4.
	 * @return The created table4.
	 */
	public Table4 create(Table4 created);

	/**
	 * Deletes a table4.
	 * 
	 * @param table4Id
	 *            The id of the deleted table4.
	 * @return The deleted table4.
	 * @throws EntityNotFoundException
	 *             if no table4 is found with the given id.
	 */
	public Table4 delete(Integer table4Id) throws EntityNotFoundException;

	/**
	 * Finds all table4s.
	 * 
	 * @return A list of table4s.
	 */
	public Page<Table4> findAll(QueryFilter[] queryFilters, Pageable pageable);
	
	public Page<Table4> findAll(Pageable pageable);
	
	/**
	 * Finds table4 by id.
	 * 
	 * @param id
	 *            The id of the wanted table4.
	 * @return The found table4. If no table4 is found, this method returns
	 *         null.
	 */
	public Table4 findById(Integer id) throws EntityNotFoundException;
	/**
	 * Updates the information of a table4.
	 * 
	 * @param updated
	 *            The information of the updated table4.
	 * @return The updated table4.
	 * @throws EntityNotFoundException
	 *             if no table4 is found with given id.
	 */
	public Table4 update(Table4 updated) throws EntityNotFoundException;

	/**
	 * Retrieve the total count of the table4s in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the table4.
	 */

	public long countAll();


    public Page<Table4> findAssociatedValues(Object value, String entityName, String key,  Pageable pageable);


}

