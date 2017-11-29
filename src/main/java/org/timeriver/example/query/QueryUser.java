/**
* UserDO entity encapsulation table BbsTopic record.
* @author Eclipse Tools Generate.
* @Time 2017-07-06 11:34:39
* Copyright by LuYuanliang.
*/

package org.timeriver.example.query;

import java.util.Date;

public class QueryUser {

	private Integer id = null;
	private String name = null;
	private Date createTime = null;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "UserDO{" +
				"id=" + id +
				", name='" + name + '\'' +
				", createTime=" + createTime +
				'}';
	}
}


