/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.calendar.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

/**
 * The base model interface for the CalendarEvent service. Represents a row in the &quot;CalendarEvent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.calendar.model.impl.CalendarEventModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.calendar.model.impl.CalendarEventImpl}.
 * </p>
 *
 * @author Eduardo Lundgren
 * @see CalendarEvent
 * @see com.liferay.calendar.model.impl.CalendarEventImpl
 * @see com.liferay.calendar.model.impl.CalendarEventModelImpl
 * @generated
 */
public interface CalendarEventModel extends BaseModel<CalendarEvent>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a calendar event model instance should use the {@link CalendarEvent} interface instead.
	 */

	/**
	 * Gets the primary key of this calendar event.
	 *
	 * @return the primary key of this calendar event
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this calendar event
	 *
	 * @param pk the primary key of this calendar event
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the uuid of this calendar event.
	 *
	 * @return the uuid of this calendar event
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this calendar event.
	 *
	 * @param uuid the uuid of this calendar event
	 */
	public void setUuid(String uuid);

	/**
	 * Gets the calendar event ID of this calendar event.
	 *
	 * @return the calendar event ID of this calendar event
	 */
	public long getCalendarEventId();

	/**
	 * Sets the calendar event ID of this calendar event.
	 *
	 * @param calendarEventId the calendar event ID of this calendar event
	 */
	public void setCalendarEventId(long calendarEventId);

	/**
	 * Gets the group ID of this calendar event.
	 *
	 * @return the group ID of this calendar event
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this calendar event.
	 *
	 * @param groupId the group ID of this calendar event
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this calendar event.
	 *
	 * @return the company ID of this calendar event
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this calendar event.
	 *
	 * @param companyId the company ID of this calendar event
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this calendar event.
	 *
	 * @return the user ID of this calendar event
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this calendar event.
	 *
	 * @param userId the user ID of this calendar event
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this calendar event.
	 *
	 * @return the user uuid of this calendar event
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this calendar event.
	 *
	 * @param userUuid the user uuid of this calendar event
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this calendar event.
	 *
	 * @return the user name of this calendar event
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this calendar event.
	 *
	 * @param userName the user name of this calendar event
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this calendar event.
	 *
	 * @return the create date of this calendar event
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this calendar event.
	 *
	 * @param createDate the create date of this calendar event
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this calendar event.
	 *
	 * @return the modified date of this calendar event
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this calendar event.
	 *
	 * @param modifiedDate the modified date of this calendar event
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the title of this calendar event.
	 *
	 * @return the title of this calendar event
	 */
	public String getTitle();

	/**
	 * Gets the localized title of this calendar event. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized title for
	 * @return the localized title of this calendar event
	 */
	public String getTitle(Locale locale);

	/**
	 * Gets the localized title of this calendar event, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this calendar event. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getTitle(Locale locale, boolean useDefault);

	/**
	 * Gets the localized title of this calendar event. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @return the localized title of this calendar event
	 */
	public String getTitle(String languageId);

	/**
	 * Gets the localized title of this calendar event, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized title for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized title of this calendar event
	 */
	public String getTitle(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized title of this calendar event.
	 *
	 * @return the locales and localized title
	 */
	public Map<Locale, String> getTitleMap();

	/**
	 * Sets the title of this calendar event.
	 *
	 * @param title the title of this calendar event
	 */
	public void setTitle(String title);

	/**
	 * Sets the localized title of this calendar event.
	 *
	 * @param title the localized title of this calendar event
	 * @param locale the locale to set the localized title for
	 */
	public void setTitle(String title, Locale locale);

	public void setTitle(String title, Locale locale, Locale defaultLocale);

	/**
	 * Sets the localized titles of this calendar event from the map of locales and localized titles.
	 *
	 * @param titleMap the locales and localized titles of this calendar event
	 */
	public void setTitleMap(Map<Locale, String> titleMap);

	public void setTitleMap(Map<Locale, String> titleMap, Locale defaultLocale);

	/**
	 * Gets the description of this calendar event.
	 *
	 * @return the description of this calendar event
	 */
	public String getDescription();

	/**
	 * Gets the localized description of this calendar event. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale to get the localized description for
	 * @return the localized description of this calendar event
	 */
	public String getDescription(Locale locale);

	/**
	 * Gets the localized description of this calendar event, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this calendar event. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Gets the localized description of this calendar event. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @return the localized description of this calendar event
	 */
	public String getDescription(String languageId);

	/**
	 * Gets the localized description of this calendar event, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the id of the language to get the localized description for
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this calendar event
	 */
	public String getDescription(String languageId, boolean useDefault);

	/**
	 * Gets a map of the locales and localized description of this calendar event.
	 *
	 * @return the locales and localized description
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this calendar event.
	 *
	 * @param description the description of this calendar event
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this calendar event.
	 *
	 * @param description the localized description of this calendar event
	 * @param locale the locale to set the localized description for
	 */
	public void setDescription(String description, Locale locale);

	public void setDescription(String description, Locale locale,
		Locale defaultLocale);

	/**
	 * Sets the localized descriptions of this calendar event from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this calendar event
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	public void setDescriptionMap(Map<Locale, String> descriptionMap,
		Locale defaultLocale);

	/**
	 * Gets the location of this calendar event.
	 *
	 * @return the location of this calendar event
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this calendar event.
	 *
	 * @param location the location of this calendar event
	 */
	public void setLocation(String location);

	/**
	 * Gets the start date of this calendar event.
	 *
	 * @return the start date of this calendar event
	 */
	public Date getStartDate();

	/**
	 * Sets the start date of this calendar event.
	 *
	 * @param startDate the start date of this calendar event
	 */
	public void setStartDate(Date startDate);

	/**
	 * Gets the end date of this calendar event.
	 *
	 * @return the end date of this calendar event
	 */
	public Date getEndDate();

	/**
	 * Sets the end date of this calendar event.
	 *
	 * @param endDate the end date of this calendar event
	 */
	public void setEndDate(Date endDate);

	/**
	 * Gets the duration hour of this calendar event.
	 *
	 * @return the duration hour of this calendar event
	 */
	public int getDurationHour();

	/**
	 * Sets the duration hour of this calendar event.
	 *
	 * @param durationHour the duration hour of this calendar event
	 */
	public void setDurationHour(int durationHour);

	/**
	 * Gets the duration minute of this calendar event.
	 *
	 * @return the duration minute of this calendar event
	 */
	public int getDurationMinute();

	/**
	 * Sets the duration minute of this calendar event.
	 *
	 * @param durationMinute the duration minute of this calendar event
	 */
	public void setDurationMinute(int durationMinute);

	/**
	 * Gets the all day of this calendar event.
	 *
	 * @return the all day of this calendar event
	 */
	public boolean getAllDay();

	/**
	 * Determines if this calendar event is all day.
	 *
	 * @return <code>true</code> if this calendar event is all day; <code>false</code> otherwise
	 */
	public boolean isAllDay();

	/**
	 * Sets whether this calendar event is all day.
	 *
	 * @param allDay the all day of this calendar event
	 */
	public void setAllDay(boolean allDay);

	/**
	 * Gets the recurrence of this calendar event.
	 *
	 * @return the recurrence of this calendar event
	 */
	@AutoEscape
	public String getRecurrence();

	/**
	 * Sets the recurrence of this calendar event.
	 *
	 * @param recurrence the recurrence of this calendar event
	 */
	public void setRecurrence(String recurrence);

	/**
	 * Gets the type of this calendar event.
	 *
	 * @return the type of this calendar event
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this calendar event.
	 *
	 * @param type the type of this calendar event
	 */
	public void setType(String type);

	/**
	 * Gets the remind by of this calendar event.
	 *
	 * @return the remind by of this calendar event
	 */
	public int getRemindBy();

	/**
	 * Sets the remind by of this calendar event.
	 *
	 * @param remindBy the remind by of this calendar event
	 */
	public void setRemindBy(int remindBy);

	/**
	 * Gets the first reminder of this calendar event.
	 *
	 * @return the first reminder of this calendar event
	 */
	public int getFirstReminder();

	/**
	 * Sets the first reminder of this calendar event.
	 *
	 * @param firstReminder the first reminder of this calendar event
	 */
	public void setFirstReminder(int firstReminder);

	/**
	 * Gets the second reminder of this calendar event.
	 *
	 * @return the second reminder of this calendar event
	 */
	public int getSecondReminder();

	/**
	 * Sets the second reminder of this calendar event.
	 *
	 * @param secondReminder the second reminder of this calendar event
	 */
	public void setSecondReminder(int secondReminder);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(CalendarEvent calendarEvent);

	public int hashCode();

	public CalendarEvent toEscapedModel();

	public String toString();

	public String toXmlString();
}