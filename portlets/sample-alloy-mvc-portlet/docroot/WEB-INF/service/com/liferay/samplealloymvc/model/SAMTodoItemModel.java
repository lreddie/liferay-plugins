/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.samplealloymvc.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the SAMTodoItem service. Represents a row in the &quot;SAM_SAMTodoItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.samplealloymvc.model.impl.SAMTodoItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.samplealloymvc.model.impl.SAMTodoItemImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SAMTodoItem
 * @see com.liferay.samplealloymvc.model.impl.SAMTodoItemImpl
 * @see com.liferay.samplealloymvc.model.impl.SAMTodoItemModelImpl
 * @generated
 */
@ProviderType
public interface SAMTodoItemModel extends AuditedModel, BaseModel<SAMTodoItem>,
	ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a s a m todo item model instance should use the {@link SAMTodoItem} interface instead.
	 */

	/**
	 * Returns the primary key of this s a m todo item.
	 *
	 * @return the primary key of this s a m todo item
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this s a m todo item.
	 *
	 * @param primaryKey the primary key of this s a m todo item
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sam todo item ID of this s a m todo item.
	 *
	 * @return the sam todo item ID of this s a m todo item
	 */
	public long getSamTodoItemId();

	/**
	 * Sets the sam todo item ID of this s a m todo item.
	 *
	 * @param samTodoItemId the sam todo item ID of this s a m todo item
	 */
	public void setSamTodoItemId(long samTodoItemId);

	/**
	 * Returns the company ID of this s a m todo item.
	 *
	 * @return the company ID of this s a m todo item
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this s a m todo item.
	 *
	 * @param companyId the company ID of this s a m todo item
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this s a m todo item.
	 *
	 * @return the user ID of this s a m todo item
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this s a m todo item.
	 *
	 * @param userId the user ID of this s a m todo item
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this s a m todo item.
	 *
	 * @return the user uuid of this s a m todo item
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this s a m todo item.
	 *
	 * @param userUuid the user uuid of this s a m todo item
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this s a m todo item.
	 *
	 * @return the user name of this s a m todo item
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this s a m todo item.
	 *
	 * @param userName the user name of this s a m todo item
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this s a m todo item.
	 *
	 * @return the create date of this s a m todo item
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this s a m todo item.
	 *
	 * @param createDate the create date of this s a m todo item
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this s a m todo item.
	 *
	 * @return the modified date of this s a m todo item
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this s a m todo item.
	 *
	 * @param modifiedDate the modified date of this s a m todo item
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the sam todo list ID of this s a m todo item.
	 *
	 * @return the sam todo list ID of this s a m todo item
	 */
	public long getSamTodoListId();

	/**
	 * Sets the sam todo list ID of this s a m todo item.
	 *
	 * @param samTodoListId the sam todo list ID of this s a m todo item
	 */
	public void setSamTodoListId(long samTodoListId);

	/**
	 * Returns the description of this s a m todo item.
	 *
	 * @return the description of this s a m todo item
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this s a m todo item.
	 *
	 * @param description the description of this s a m todo item
	 */
	public void setDescription(String description);

	/**
	 * Returns the priority of this s a m todo item.
	 *
	 * @return the priority of this s a m todo item
	 */
	public int getPriority();

	/**
	 * Sets the priority of this s a m todo item.
	 *
	 * @param priority the priority of this s a m todo item
	 */
	public void setPriority(int priority);

	/**
	 * Returns the status of this s a m todo item.
	 *
	 * @return the status of this s a m todo item
	 */
	public int getStatus();

	/**
	 * Sets the status of this s a m todo item.
	 *
	 * @param status the status of this s a m todo item
	 */
	public void setStatus(int status);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(SAMTodoItem samTodoItem);

	@Override
	public int hashCode();

	@Override
	public CacheModel<SAMTodoItem> toCacheModel();

	@Override
	public SAMTodoItem toEscapedModel();

	@Override
	public SAMTodoItem toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}