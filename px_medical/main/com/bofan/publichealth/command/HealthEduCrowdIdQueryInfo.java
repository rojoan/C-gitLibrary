package com.bofan.publichealth.command;

import com.bofan.basesystem.common.command.BaseCommandInfo;
import com.bofan.infoql.QueryInfo;
import com.bofan.infoql.QueryOperator;
import com.bofan.infoql.QueryParam;

/**
 * 健康教育--资料发放/接受教育对象信息查询参数
 * @Description 
 * @author xlf
 * 2017-10-26
 */
@QueryInfo(select = "het.crowdType", from = "com.bofan.publichealth.valueobject.HealthEduCrowd het", orderBy = "het.eduCrowdId asc")
public class HealthEduCrowdIdQueryInfo extends BaseCommandInfo {

    /**
     * 
     */
    private static final long serialVersionUID = 9065496992044630401L;

    @QueryParam(fieldName = "het.healthEducationId", op = QueryOperator.EQU)
    private Long healthEducationId;

    /**
     * @return the healthEducationId
     */
    public Long getHealthEducationId() {
        return healthEducationId;
    }

    /**
     * @param healthEducationId the healthEducationId to set
     */
    public void setHealthEducationId(Long healthEducationId) {
        this.healthEducationId = healthEducationId;
    }

}
