package com.bofan.publichealth.command;

import com.bofan.basesystem.common.command.BaseCommandInfo;
import com.bofan.infoql.QueryInfo;
import com.bofan.infoql.QueryOperator;
import com.bofan.infoql.QueryParam;

/**
 * 居民健康体检异常信息查询参数
 * @Description 
 * @author xlf
 * 2017-10-26
 */
@QueryInfo(select="ha.healthAbnormalContent", from = "com.bofan.publichealth.valueobject.ExamHealthAssess ha", orderBy = "ha.healthAssessId asc")
public class ExamHealthAssessStrQueryInfo extends BaseCommandInfo {

    /**
     * 
     */
    private static final long serialVersionUID = 9065496992044630401L;

    @QueryParam(fieldName = "ha.examPersonId", op = QueryOperator.EQU)
    private Long examPersonId;

    @QueryParam(fieldName = "ha.personDetailId", op = QueryOperator.EQU)
    private Long personDetailId;

    /**
     * @return the examPersonId
     */
    public Long getExamPersonId() {
        return examPersonId;
    }

    /**
     * @param examPersonId the examPersonId to set
     */
    public void setExamPersonId(Long examPersonId) {
        this.examPersonId = examPersonId;
    }

    /**
     * @return the personDetailId
     */
    public Long getPersonDetailId() {
        return personDetailId;
    }

    /**
     * @param personDetailId the personDetailId to set
     */
    public void setPersonDetailId(Long personDetailId) {
        this.personDetailId = personDetailId;
    }
    
    
}