package com.jfinal.qyweixin.demo.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseOauthorize<M extends BaseOauthorize<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setAgentId(java.lang.String agentId) {
		set("agent_id", agentId);
	}

	public java.lang.String getAgentId() {
		return get("agent_id");
	}

	public void setDomain(java.lang.String domain) {
		set("domain", domain);
	}

	public java.lang.String getDomain() {
		return get("domain");
	}

	public void setState(java.lang.String state) {
		set("state", state);
	}

	public java.lang.String getState() {
		return get("state");
	}

	public void setSnsapiBase(java.lang.Integer snsapiBase) {
		set("snsapi_base", snsapiBase);
	}

	public java.lang.Integer getSnsapiBase() {
		return get("snsapi_base");
	}

	public void setSubscribeUrl(java.lang.String subscribeUrl) {
		set("subscribe_url", subscribeUrl);
	}

	public java.lang.String getSubscribeUrl() {
		return get("subscribe_url");
	}

	public void setRedirectUri(java.lang.String redirectUri) {
		set("redirect_uri", redirectUri);
	}

	public java.lang.String getRedirectUri() {
		return get("redirect_uri");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

}
