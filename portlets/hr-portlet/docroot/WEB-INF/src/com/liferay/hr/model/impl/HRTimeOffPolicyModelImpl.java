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

package com.liferay.hr.model.impl;

import com.liferay.hr.model.HRTimeOffPolicy;
import com.liferay.hr.model.HRTimeOffPolicyModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the HRTimeOffPolicy service. Represents a row in the &quot;HRTimeOffPolicy&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.hr.model.HRTimeOffPolicyModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HRTimeOffPolicyImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRTimeOffPolicyImpl
 * @see com.liferay.hr.model.HRTimeOffPolicy
 * @see com.liferay.hr.model.HRTimeOffPolicyModel
 * @generated
 */
public class HRTimeOffPolicyModelImpl extends BaseModelImpl<HRTimeOffPolicy>
	implements HRTimeOffPolicyModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a h r time off policy model instance should use the {@link com.liferay.hr.model.HRTimeOffPolicy} interface instead.
	 */
	public static final String TABLE_NAME = "HRTimeOffPolicy";
	public static final Object[][] TABLE_COLUMNS = {
			{ "hrTimeOffPolicyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "hrTimeOffTypeId", Types.BIGINT },
			{ "hrUserId", Types.BIGINT },
			{ "accrueHRTimeOffFrequencyTypeId", Types.BIGINT },
			{ "resetHRTimeOffFrequencyTypeId", Types.BIGINT },
			{ "effectiveDate", Types.TIMESTAMP },
			{ "inactive", Types.BOOLEAN },
			{ "hoursAllowed", Types.DOUBLE },
			{ "hoursBaseAmount", Types.DOUBLE },
			{ "hoursToAccrue", Types.DOUBLE },
			{ "carryOverHoursAllowed", Types.DOUBLE }
		};
	public static final String TABLE_SQL_CREATE = "create table HRTimeOffPolicy (hrTimeOffPolicyId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,hrTimeOffTypeId LONG,hrUserId LONG,accrueHRTimeOffFrequencyTypeId LONG,resetHRTimeOffFrequencyTypeId LONG,effectiveDate DATE null,inactive BOOLEAN,hoursAllowed DOUBLE,hoursBaseAmount DOUBLE,hoursToAccrue DOUBLE,carryOverHoursAllowed DOUBLE)";
	public static final String TABLE_SQL_DROP = "drop table HRTimeOffPolicy";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.hr.model.HRTimeOffPolicy"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.hr.model.HRTimeOffPolicy"),
			true);

	public Class<?> getModelClass() {
		return HRTimeOffPolicy.class;
	}

	public String getModelClassName() {
		return HRTimeOffPolicy.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.hr.model.HRTimeOffPolicy"));

	public HRTimeOffPolicyModelImpl() {
	}

	public long getPrimaryKey() {
		return _hrTimeOffPolicyId;
	}

	public void setPrimaryKey(long primaryKey) {
		setHrTimeOffPolicyId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_hrTimeOffPolicyId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getHrTimeOffPolicyId() {
		return _hrTimeOffPolicyId;
	}

	public void setHrTimeOffPolicyId(long hrTimeOffPolicyId) {
		_hrTimeOffPolicyId = hrTimeOffPolicyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getHrTimeOffTypeId() {
		return _hrTimeOffTypeId;
	}

	public void setHrTimeOffTypeId(long hrTimeOffTypeId) {
		_hrTimeOffTypeId = hrTimeOffTypeId;
	}

	public long getHrUserId() {
		return _hrUserId;
	}

	public void setHrUserId(long hrUserId) {
		_hrUserId = hrUserId;
	}

	public String getHrUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getHrUserId(), "uuid", _hrUserUuid);
	}

	public void setHrUserUuid(String hrUserUuid) {
		_hrUserUuid = hrUserUuid;
	}

	public long getAccrueHRTimeOffFrequencyTypeId() {
		return _accrueHRTimeOffFrequencyTypeId;
	}

	public void setAccrueHRTimeOffFrequencyTypeId(
		long accrueHRTimeOffFrequencyTypeId) {
		_accrueHRTimeOffFrequencyTypeId = accrueHRTimeOffFrequencyTypeId;
	}

	public long getResetHRTimeOffFrequencyTypeId() {
		return _resetHRTimeOffFrequencyTypeId;
	}

	public void setResetHRTimeOffFrequencyTypeId(
		long resetHRTimeOffFrequencyTypeId) {
		_resetHRTimeOffFrequencyTypeId = resetHRTimeOffFrequencyTypeId;
	}

	public Date getEffectiveDate() {
		return _effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		_effectiveDate = effectiveDate;
	}

	public boolean getInactive() {
		return _inactive;
	}

	public boolean isInactive() {
		return _inactive;
	}

	public void setInactive(boolean inactive) {
		_inactive = inactive;
	}

	public double getHoursAllowed() {
		return _hoursAllowed;
	}

	public void setHoursAllowed(double hoursAllowed) {
		_hoursAllowed = hoursAllowed;
	}

	public double getHoursBaseAmount() {
		return _hoursBaseAmount;
	}

	public void setHoursBaseAmount(double hoursBaseAmount) {
		_hoursBaseAmount = hoursBaseAmount;
	}

	public double getHoursToAccrue() {
		return _hoursToAccrue;
	}

	public void setHoursToAccrue(double hoursToAccrue) {
		_hoursToAccrue = hoursToAccrue;
	}

	public double getCarryOverHoursAllowed() {
		return _carryOverHoursAllowed;
	}

	public void setCarryOverHoursAllowed(double carryOverHoursAllowed) {
		_carryOverHoursAllowed = carryOverHoursAllowed;
	}

	@Override
	public HRTimeOffPolicy toEscapedModel() {
		if (isEscapedModel()) {
			return (HRTimeOffPolicy)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (HRTimeOffPolicy)Proxy.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					HRTimeOffPolicy.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		HRTimeOffPolicyImpl hrTimeOffPolicyImpl = new HRTimeOffPolicyImpl();

		hrTimeOffPolicyImpl.setHrTimeOffPolicyId(getHrTimeOffPolicyId());
		hrTimeOffPolicyImpl.setGroupId(getGroupId());
		hrTimeOffPolicyImpl.setCompanyId(getCompanyId());
		hrTimeOffPolicyImpl.setUserId(getUserId());
		hrTimeOffPolicyImpl.setUserName(getUserName());
		hrTimeOffPolicyImpl.setCreateDate(getCreateDate());
		hrTimeOffPolicyImpl.setModifiedDate(getModifiedDate());
		hrTimeOffPolicyImpl.setHrTimeOffTypeId(getHrTimeOffTypeId());
		hrTimeOffPolicyImpl.setHrUserId(getHrUserId());
		hrTimeOffPolicyImpl.setAccrueHRTimeOffFrequencyTypeId(getAccrueHRTimeOffFrequencyTypeId());
		hrTimeOffPolicyImpl.setResetHRTimeOffFrequencyTypeId(getResetHRTimeOffFrequencyTypeId());
		hrTimeOffPolicyImpl.setEffectiveDate(getEffectiveDate());
		hrTimeOffPolicyImpl.setInactive(getInactive());
		hrTimeOffPolicyImpl.setHoursAllowed(getHoursAllowed());
		hrTimeOffPolicyImpl.setHoursBaseAmount(getHoursBaseAmount());
		hrTimeOffPolicyImpl.setHoursToAccrue(getHoursToAccrue());
		hrTimeOffPolicyImpl.setCarryOverHoursAllowed(getCarryOverHoursAllowed());

		hrTimeOffPolicyImpl.resetOriginalValues();

		return hrTimeOffPolicyImpl;
	}

	public int compareTo(HRTimeOffPolicy hrTimeOffPolicy) {
		long primaryKey = hrTimeOffPolicy.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		HRTimeOffPolicy hrTimeOffPolicy = null;

		try {
			hrTimeOffPolicy = (HRTimeOffPolicy)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = hrTimeOffPolicy.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(35);

		sb.append("{hrTimeOffPolicyId=");
		sb.append(getHrTimeOffPolicyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", hrTimeOffTypeId=");
		sb.append(getHrTimeOffTypeId());
		sb.append(", hrUserId=");
		sb.append(getHrUserId());
		sb.append(", accrueHRTimeOffFrequencyTypeId=");
		sb.append(getAccrueHRTimeOffFrequencyTypeId());
		sb.append(", resetHRTimeOffFrequencyTypeId=");
		sb.append(getResetHRTimeOffFrequencyTypeId());
		sb.append(", effectiveDate=");
		sb.append(getEffectiveDate());
		sb.append(", inactive=");
		sb.append(getInactive());
		sb.append(", hoursAllowed=");
		sb.append(getHoursAllowed());
		sb.append(", hoursBaseAmount=");
		sb.append(getHoursBaseAmount());
		sb.append(", hoursToAccrue=");
		sb.append(getHoursToAccrue());
		sb.append(", carryOverHoursAllowed=");
		sb.append(getCarryOverHoursAllowed());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(55);

		sb.append("<model><model-name>");
		sb.append("com.liferay.hr.model.HRTimeOffPolicy");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>hrTimeOffPolicyId</column-name><column-value><![CDATA[");
		sb.append(getHrTimeOffPolicyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrTimeOffTypeId</column-name><column-value><![CDATA[");
		sb.append(getHrTimeOffTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hrUserId</column-name><column-value><![CDATA[");
		sb.append(getHrUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>accrueHRTimeOffFrequencyTypeId</column-name><column-value><![CDATA[");
		sb.append(getAccrueHRTimeOffFrequencyTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>resetHRTimeOffFrequencyTypeId</column-name><column-value><![CDATA[");
		sb.append(getResetHRTimeOffFrequencyTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>inactive</column-name><column-value><![CDATA[");
		sb.append(getInactive());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoursAllowed</column-name><column-value><![CDATA[");
		sb.append(getHoursAllowed());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoursBaseAmount</column-name><column-value><![CDATA[");
		sb.append(getHoursBaseAmount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>hoursToAccrue</column-name><column-value><![CDATA[");
		sb.append(getHoursToAccrue());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>carryOverHoursAllowed</column-name><column-value><![CDATA[");
		sb.append(getCarryOverHoursAllowed());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = HRTimeOffPolicy.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			HRTimeOffPolicy.class
		};
	private long _hrTimeOffPolicyId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _hrTimeOffTypeId;
	private long _hrUserId;
	private String _hrUserUuid;
	private long _accrueHRTimeOffFrequencyTypeId;
	private long _resetHRTimeOffFrequencyTypeId;
	private Date _effectiveDate;
	private boolean _inactive;
	private double _hoursAllowed;
	private double _hoursBaseAmount;
	private double _hoursToAccrue;
	private double _carryOverHoursAllowed;
	private transient ExpandoBridge _expandoBridge;
	private HRTimeOffPolicy _escapedModelProxy;
}