package com.practise.meetingroom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingroomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeetingroomExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMeetingroomIdIsNull() {
            addCriterion("meetingroom_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdIsNotNull() {
            addCriterion("meetingroom_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdEqualTo(Integer value) {
            addCriterion("meetingroom_id =", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotEqualTo(Integer value) {
            addCriterion("meetingroom_id <>", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdGreaterThan(Integer value) {
            addCriterion("meetingroom_id >", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meetingroom_id >=", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdLessThan(Integer value) {
            addCriterion("meetingroom_id <", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdLessThanOrEqualTo(Integer value) {
            addCriterion("meetingroom_id <=", value, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdIn(List<Integer> values) {
            addCriterion("meetingroom_id in", values, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotIn(List<Integer> values) {
            addCriterion("meetingroom_id not in", values, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdBetween(Integer value1, Integer value2) {
            addCriterion("meetingroom_id between", value1, value2, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andMeetingroomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meetingroom_id not between", value1, value2, "meetingroomId");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameIsNull() {
            addCriterion("meetingroom_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameIsNotNull() {
            addCriterion("meetingroom_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameEqualTo(String value) {
            addCriterion("meetingroom_name =", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotEqualTo(String value) {
            addCriterion("meetingroom_name <>", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameGreaterThan(String value) {
            addCriterion("meetingroom_name >", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameGreaterThanOrEqualTo(String value) {
            addCriterion("meetingroom_name >=", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameLessThan(String value) {
            addCriterion("meetingroom_name <", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameLessThanOrEqualTo(String value) {
            addCriterion("meetingroom_name <=", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameLike(String value) {
            addCriterion("meetingroom_name like", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotLike(String value) {
            addCriterion("meetingroom_name not like", value, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameIn(List<String> values) {
            addCriterion("meetingroom_name in", values, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotIn(List<String> values) {
            addCriterion("meetingroom_name not in", values, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameBetween(String value1, String value2) {
            addCriterion("meetingroom_name between", value1, value2, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andMeetingroomNameNotBetween(String value1, String value2) {
            addCriterion("meetingroom_name not between", value1, value2, "meetingroomName");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeIsNull() {
            addCriterion("assignmentTime is null");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeIsNotNull() {
            addCriterion("assignmentTime is not null");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeEqualTo(String value) {
            addCriterion("assignmentTime =", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotEqualTo(String value) {
            addCriterion("assignmentTime <>", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeGreaterThan(String value) {
            addCriterion("assignmentTime >", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeGreaterThanOrEqualTo(String value) {
            addCriterion("assignmentTime >=", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeLessThan(String value) {
            addCriterion("assignmentTime <", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeLessThanOrEqualTo(String value) {
            addCriterion("assignmentTime <=", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeLike(String value) {
            addCriterion("assignmentTime like", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotLike(String value) {
            addCriterion("assignmentTime not like", value, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeIn(List<String> values) {
            addCriterion("assignmentTime in", values, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotIn(List<String> values) {
            addCriterion("assignmentTime not in", values, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeBetween(String value1, String value2) {
            addCriterion("assignmentTime between", value1, value2, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andAssignmenttimeNotBetween(String value1, String value2) {
            addCriterion("assignmentTime not between", value1, value2, "assignmenttime");
            return (Criteria) this;
        }

        public Criteria andNumMinIsNull() {
            addCriterion("num_min is null");
            return (Criteria) this;
        }

        public Criteria andNumMinIsNotNull() {
            addCriterion("num_min is not null");
            return (Criteria) this;
        }

        public Criteria andNumMinEqualTo(Integer value) {
            addCriterion("num_min =", value, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinNotEqualTo(Integer value) {
            addCriterion("num_min <>", value, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinGreaterThan(Integer value) {
            addCriterion("num_min >", value, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_min >=", value, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinLessThan(Integer value) {
            addCriterion("num_min <", value, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinLessThanOrEqualTo(Integer value) {
            addCriterion("num_min <=", value, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinIn(List<Integer> values) {
            addCriterion("num_min in", values, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinNotIn(List<Integer> values) {
            addCriterion("num_min not in", values, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinBetween(Integer value1, Integer value2) {
            addCriterion("num_min between", value1, value2, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMinNotBetween(Integer value1, Integer value2) {
            addCriterion("num_min not between", value1, value2, "numMin");
            return (Criteria) this;
        }

        public Criteria andNumMaxIsNull() {
            addCriterion("num_max is null");
            return (Criteria) this;
        }

        public Criteria andNumMaxIsNotNull() {
            addCriterion("num_max is not null");
            return (Criteria) this;
        }

        public Criteria andNumMaxEqualTo(Integer value) {
            addCriterion("num_max =", value, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxNotEqualTo(Integer value) {
            addCriterion("num_max <>", value, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxGreaterThan(Integer value) {
            addCriterion("num_max >", value, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_max >=", value, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxLessThan(Integer value) {
            addCriterion("num_max <", value, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxLessThanOrEqualTo(Integer value) {
            addCriterion("num_max <=", value, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxIn(List<Integer> values) {
            addCriterion("num_max in", values, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxNotIn(List<Integer> values) {
            addCriterion("num_max not in", values, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxBetween(Integer value1, Integer value2) {
            addCriterion("num_max between", value1, value2, "numMax");
            return (Criteria) this;
        }

        public Criteria andNumMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("num_max not between", value1, value2, "numMax");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIsNull() {
            addCriterion("meeting_Type is null");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIsNotNull() {
            addCriterion("meeting_Type is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeEqualTo(Boolean value) {
            addCriterion("meeting_Type =", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotEqualTo(Boolean value) {
            addCriterion("meeting_Type <>", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeGreaterThan(Boolean value) {
            addCriterion("meeting_Type >", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("meeting_Type >=", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLessThan(Boolean value) {
            addCriterion("meeting_Type <", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("meeting_Type <=", value, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeIn(List<Boolean> values) {
            addCriterion("meeting_Type in", values, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotIn(List<Boolean> values) {
            addCriterion("meeting_Type not in", values, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("meeting_Type between", value1, value2, "meetingType");
            return (Criteria) this;
        }

        public Criteria andMeetingTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("meeting_Type not between", value1, value2, "meetingType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}