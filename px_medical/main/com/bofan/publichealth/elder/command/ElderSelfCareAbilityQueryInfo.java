package com.bofan.publichealth.elder.command;

import com.bofan.basesystem.common.command.BaseCommandInfo;
import com.bofan.infoql.QueryInfo;
import com.bofan.infoql.QueryOperator;
import com.bofan.infoql.QueryParam;

/**
 * @Description: 老年人自理能力评估主表
 * @author lqw
 */
@QueryInfo(from = "com.bofan.publichealth.elder.valueobject.ElderSelfCareAbility o ", orderBy = "o.elderSelfCareAbilityId desc")
public class ElderSelfCareAbilityQueryInfo  extends BaseCommandInfo {

    private static final long serialVersionUID = -7776152868811303401L;

    /** 个人基本信息ID personal_detail（个人基本信息） 主键ID */
    @QueryParam(fieldName = "o.personDetailId", op = QueryOperator.EQU)
	private Long personDetailId;

	/** default constructor */
    public ElderSelfCareAbilityQueryInfo() {
    }

    /**
     * @param personDetailId
     */
    public ElderSelfCareAbilityQueryInfo(Long personDetailId) {
        this.personDetailId = personDetailId;
    }

    /**
     * @return personDetailId
     */
    public Long getPersonDetailId() {
        return personDetailId;
    }

    /**
     * @param personDetailId 要设置的 personDetailId
     */
    public void setPersonDetailId(Long personDetailId) {
        this.personDetailId = personDetailId;
    }

}