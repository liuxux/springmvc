package com.practise.meetingroom.model;

import java.util.ArrayList;
import java.util.List;

public class TimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeExample() {
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

        public Criteria andTimeIdIsNull() {
            addCriterion("time_id is null");
            return (Criteria) this;
        }

        public Criteria andTimeIdIsNotNull() {
            addCriterion("time_id is not null");
            return (Criteria) this;
        }

        public Criteria andTimeIdEqualTo(Integer value) {
            addCriterion("time_id =", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotEqualTo(Integer value) {
            addCriterion("time_id <>", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThan(Integer value) {
            addCriterion("time_id >", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_id >=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThan(Integer value) {
            addCriterion("time_id <", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdLessThanOrEqualTo(Integer value) {
            addCriterion("time_id <=", value, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdIn(List<Integer> values) {
            addCriterion("time_id in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotIn(List<Integer> values) {
            addCriterion("time_id not in", values, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdBetween(Integer value1, Integer value2) {
            addCriterion("time_id between", value1, value2, "timeId");
            return (Criteria) this;
        }

        public Criteria andTimeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("time_id not between", value1, value2, "timeId");
            return (Criteria) this;
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

        public Criteria andTopicnameIsNull() {
            addCriterion("topicName is null");
            return (Criteria) this;
        }

        public Criteria andTopicnameIsNotNull() {
            addCriterion("topicName is not null");
            return (Criteria) this;
        }

        public Criteria andTopicnameEqualTo(String value) {
            addCriterion("topicName =", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotEqualTo(String value) {
            addCriterion("topicName <>", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThan(String value) {
            addCriterion("topicName >", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameGreaterThanOrEqualTo(String value) {
            addCriterion("topicName >=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThan(String value) {
            addCriterion("topicName <", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLessThanOrEqualTo(String value) {
            addCriterion("topicName <=", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameLike(String value) {
            addCriterion("topicName like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotLike(String value) {
            addCriterion("topicName not like", value, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameIn(List<String> values) {
            addCriterion("topicName in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotIn(List<String> values) {
            addCriterion("topicName not in", values, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameBetween(String value1, String value2) {
            addCriterion("topicName between", value1, value2, "topicname");
            return (Criteria) this;
        }

        public Criteria andTopicnameNotBetween(String value1, String value2) {
            addCriterion("topicName not between", value1, value2, "topicname");
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

        public Criteria andTime1IsNull() {
            addCriterion("time1 is null");
            return (Criteria) this;
        }

        public Criteria andTime1IsNotNull() {
            addCriterion("time1 is not null");
            return (Criteria) this;
        }

        public Criteria andTime1EqualTo(Boolean value) {
            addCriterion("time1 =", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotEqualTo(Boolean value) {
            addCriterion("time1 <>", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThan(Boolean value) {
            addCriterion("time1 >", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time1 >=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThan(Boolean value) {
            addCriterion("time1 <", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1LessThanOrEqualTo(Boolean value) {
            addCriterion("time1 <=", value, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1In(List<Boolean> values) {
            addCriterion("time1 in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotIn(List<Boolean> values) {
            addCriterion("time1 not in", values, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1Between(Boolean value1, Boolean value2) {
            addCriterion("time1 between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time1 not between", value1, value2, "time1");
            return (Criteria) this;
        }

        public Criteria andTime2IsNull() {
            addCriterion("time2 is null");
            return (Criteria) this;
        }

        public Criteria andTime2IsNotNull() {
            addCriterion("time2 is not null");
            return (Criteria) this;
        }

        public Criteria andTime2EqualTo(Boolean value) {
            addCriterion("time2 =", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotEqualTo(Boolean value) {
            addCriterion("time2 <>", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThan(Boolean value) {
            addCriterion("time2 >", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time2 >=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThan(Boolean value) {
            addCriterion("time2 <", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2LessThanOrEqualTo(Boolean value) {
            addCriterion("time2 <=", value, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2In(List<Boolean> values) {
            addCriterion("time2 in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotIn(List<Boolean> values) {
            addCriterion("time2 not in", values, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2Between(Boolean value1, Boolean value2) {
            addCriterion("time2 between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time2 not between", value1, value2, "time2");
            return (Criteria) this;
        }

        public Criteria andTime3IsNull() {
            addCriterion("time3 is null");
            return (Criteria) this;
        }

        public Criteria andTime3IsNotNull() {
            addCriterion("time3 is not null");
            return (Criteria) this;
        }

        public Criteria andTime3EqualTo(Boolean value) {
            addCriterion("time3 =", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotEqualTo(Boolean value) {
            addCriterion("time3 <>", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThan(Boolean value) {
            addCriterion("time3 >", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time3 >=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThan(Boolean value) {
            addCriterion("time3 <", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3LessThanOrEqualTo(Boolean value) {
            addCriterion("time3 <=", value, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3In(List<Boolean> values) {
            addCriterion("time3 in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotIn(List<Boolean> values) {
            addCriterion("time3 not in", values, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3Between(Boolean value1, Boolean value2) {
            addCriterion("time3 between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time3 not between", value1, value2, "time3");
            return (Criteria) this;
        }

        public Criteria andTime4IsNull() {
            addCriterion("time4 is null");
            return (Criteria) this;
        }

        public Criteria andTime4IsNotNull() {
            addCriterion("time4 is not null");
            return (Criteria) this;
        }

        public Criteria andTime4EqualTo(Boolean value) {
            addCriterion("time4 =", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotEqualTo(Boolean value) {
            addCriterion("time4 <>", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThan(Boolean value) {
            addCriterion("time4 >", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time4 >=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThan(Boolean value) {
            addCriterion("time4 <", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4LessThanOrEqualTo(Boolean value) {
            addCriterion("time4 <=", value, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4In(List<Boolean> values) {
            addCriterion("time4 in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotIn(List<Boolean> values) {
            addCriterion("time4 not in", values, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4Between(Boolean value1, Boolean value2) {
            addCriterion("time4 between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andTime4NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time4 not between", value1, value2, "time4");
            return (Criteria) this;
        }

        public Criteria andTime5IsNull() {
            addCriterion("time5 is null");
            return (Criteria) this;
        }

        public Criteria andTime5IsNotNull() {
            addCriterion("time5 is not null");
            return (Criteria) this;
        }

        public Criteria andTime5EqualTo(Boolean value) {
            addCriterion("time5 =", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5NotEqualTo(Boolean value) {
            addCriterion("time5 <>", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5GreaterThan(Boolean value) {
            addCriterion("time5 >", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time5 >=", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5LessThan(Boolean value) {
            addCriterion("time5 <", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5LessThanOrEqualTo(Boolean value) {
            addCriterion("time5 <=", value, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5In(List<Boolean> values) {
            addCriterion("time5 in", values, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5NotIn(List<Boolean> values) {
            addCriterion("time5 not in", values, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5Between(Boolean value1, Boolean value2) {
            addCriterion("time5 between", value1, value2, "time5");
            return (Criteria) this;
        }

        public Criteria andTime5NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time5 not between", value1, value2, "time5");
            return (Criteria) this;
        }

        public Criteria andTime6IsNull() {
            addCriterion("time6 is null");
            return (Criteria) this;
        }

        public Criteria andTime6IsNotNull() {
            addCriterion("time6 is not null");
            return (Criteria) this;
        }

        public Criteria andTime6EqualTo(Boolean value) {
            addCriterion("time6 =", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6NotEqualTo(Boolean value) {
            addCriterion("time6 <>", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6GreaterThan(Boolean value) {
            addCriterion("time6 >", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time6 >=", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6LessThan(Boolean value) {
            addCriterion("time6 <", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6LessThanOrEqualTo(Boolean value) {
            addCriterion("time6 <=", value, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6In(List<Boolean> values) {
            addCriterion("time6 in", values, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6NotIn(List<Boolean> values) {
            addCriterion("time6 not in", values, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6Between(Boolean value1, Boolean value2) {
            addCriterion("time6 between", value1, value2, "time6");
            return (Criteria) this;
        }

        public Criteria andTime6NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time6 not between", value1, value2, "time6");
            return (Criteria) this;
        }

        public Criteria andTime7IsNull() {
            addCriterion("time7 is null");
            return (Criteria) this;
        }

        public Criteria andTime7IsNotNull() {
            addCriterion("time7 is not null");
            return (Criteria) this;
        }

        public Criteria andTime7EqualTo(Boolean value) {
            addCriterion("time7 =", value, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7NotEqualTo(Boolean value) {
            addCriterion("time7 <>", value, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7GreaterThan(Boolean value) {
            addCriterion("time7 >", value, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time7 >=", value, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7LessThan(Boolean value) {
            addCriterion("time7 <", value, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7LessThanOrEqualTo(Boolean value) {
            addCriterion("time7 <=", value, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7In(List<Boolean> values) {
            addCriterion("time7 in", values, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7NotIn(List<Boolean> values) {
            addCriterion("time7 not in", values, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7Between(Boolean value1, Boolean value2) {
            addCriterion("time7 between", value1, value2, "time7");
            return (Criteria) this;
        }

        public Criteria andTime7NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time7 not between", value1, value2, "time7");
            return (Criteria) this;
        }

        public Criteria andTime8IsNull() {
            addCriterion("time8 is null");
            return (Criteria) this;
        }

        public Criteria andTime8IsNotNull() {
            addCriterion("time8 is not null");
            return (Criteria) this;
        }

        public Criteria andTime8EqualTo(Boolean value) {
            addCriterion("time8 =", value, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8NotEqualTo(Boolean value) {
            addCriterion("time8 <>", value, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8GreaterThan(Boolean value) {
            addCriterion("time8 >", value, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time8 >=", value, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8LessThan(Boolean value) {
            addCriterion("time8 <", value, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8LessThanOrEqualTo(Boolean value) {
            addCriterion("time8 <=", value, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8In(List<Boolean> values) {
            addCriterion("time8 in", values, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8NotIn(List<Boolean> values) {
            addCriterion("time8 not in", values, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8Between(Boolean value1, Boolean value2) {
            addCriterion("time8 between", value1, value2, "time8");
            return (Criteria) this;
        }

        public Criteria andTime8NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time8 not between", value1, value2, "time8");
            return (Criteria) this;
        }

        public Criteria andTime9IsNull() {
            addCriterion("time9 is null");
            return (Criteria) this;
        }

        public Criteria andTime9IsNotNull() {
            addCriterion("time9 is not null");
            return (Criteria) this;
        }

        public Criteria andTime9EqualTo(Boolean value) {
            addCriterion("time9 =", value, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9NotEqualTo(Boolean value) {
            addCriterion("time9 <>", value, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9GreaterThan(Boolean value) {
            addCriterion("time9 >", value, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time9 >=", value, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9LessThan(Boolean value) {
            addCriterion("time9 <", value, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9LessThanOrEqualTo(Boolean value) {
            addCriterion("time9 <=", value, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9In(List<Boolean> values) {
            addCriterion("time9 in", values, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9NotIn(List<Boolean> values) {
            addCriterion("time9 not in", values, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9Between(Boolean value1, Boolean value2) {
            addCriterion("time9 between", value1, value2, "time9");
            return (Criteria) this;
        }

        public Criteria andTime9NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time9 not between", value1, value2, "time9");
            return (Criteria) this;
        }

        public Criteria andTime10IsNull() {
            addCriterion("time10 is null");
            return (Criteria) this;
        }

        public Criteria andTime10IsNotNull() {
            addCriterion("time10 is not null");
            return (Criteria) this;
        }

        public Criteria andTime10EqualTo(Boolean value) {
            addCriterion("time10 =", value, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10NotEqualTo(Boolean value) {
            addCriterion("time10 <>", value, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10GreaterThan(Boolean value) {
            addCriterion("time10 >", value, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time10 >=", value, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10LessThan(Boolean value) {
            addCriterion("time10 <", value, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10LessThanOrEqualTo(Boolean value) {
            addCriterion("time10 <=", value, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10In(List<Boolean> values) {
            addCriterion("time10 in", values, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10NotIn(List<Boolean> values) {
            addCriterion("time10 not in", values, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10Between(Boolean value1, Boolean value2) {
            addCriterion("time10 between", value1, value2, "time10");
            return (Criteria) this;
        }

        public Criteria andTime10NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time10 not between", value1, value2, "time10");
            return (Criteria) this;
        }

        public Criteria andTime11IsNull() {
            addCriterion("time11 is null");
            return (Criteria) this;
        }

        public Criteria andTime11IsNotNull() {
            addCriterion("time11 is not null");
            return (Criteria) this;
        }

        public Criteria andTime11EqualTo(Boolean value) {
            addCriterion("time11 =", value, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11NotEqualTo(Boolean value) {
            addCriterion("time11 <>", value, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11GreaterThan(Boolean value) {
            addCriterion("time11 >", value, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time11 >=", value, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11LessThan(Boolean value) {
            addCriterion("time11 <", value, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11LessThanOrEqualTo(Boolean value) {
            addCriterion("time11 <=", value, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11In(List<Boolean> values) {
            addCriterion("time11 in", values, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11NotIn(List<Boolean> values) {
            addCriterion("time11 not in", values, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11Between(Boolean value1, Boolean value2) {
            addCriterion("time11 between", value1, value2, "time11");
            return (Criteria) this;
        }

        public Criteria andTime11NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time11 not between", value1, value2, "time11");
            return (Criteria) this;
        }

        public Criteria andTime12IsNull() {
            addCriterion("time12 is null");
            return (Criteria) this;
        }

        public Criteria andTime12IsNotNull() {
            addCriterion("time12 is not null");
            return (Criteria) this;
        }

        public Criteria andTime12EqualTo(Boolean value) {
            addCriterion("time12 =", value, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12NotEqualTo(Boolean value) {
            addCriterion("time12 <>", value, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12GreaterThan(Boolean value) {
            addCriterion("time12 >", value, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time12 >=", value, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12LessThan(Boolean value) {
            addCriterion("time12 <", value, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12LessThanOrEqualTo(Boolean value) {
            addCriterion("time12 <=", value, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12In(List<Boolean> values) {
            addCriterion("time12 in", values, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12NotIn(List<Boolean> values) {
            addCriterion("time12 not in", values, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12Between(Boolean value1, Boolean value2) {
            addCriterion("time12 between", value1, value2, "time12");
            return (Criteria) this;
        }

        public Criteria andTime12NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time12 not between", value1, value2, "time12");
            return (Criteria) this;
        }

        public Criteria andTime13IsNull() {
            addCriterion("time13 is null");
            return (Criteria) this;
        }

        public Criteria andTime13IsNotNull() {
            addCriterion("time13 is not null");
            return (Criteria) this;
        }

        public Criteria andTime13EqualTo(Boolean value) {
            addCriterion("time13 =", value, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13NotEqualTo(Boolean value) {
            addCriterion("time13 <>", value, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13GreaterThan(Boolean value) {
            addCriterion("time13 >", value, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time13 >=", value, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13LessThan(Boolean value) {
            addCriterion("time13 <", value, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13LessThanOrEqualTo(Boolean value) {
            addCriterion("time13 <=", value, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13In(List<Boolean> values) {
            addCriterion("time13 in", values, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13NotIn(List<Boolean> values) {
            addCriterion("time13 not in", values, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13Between(Boolean value1, Boolean value2) {
            addCriterion("time13 between", value1, value2, "time13");
            return (Criteria) this;
        }

        public Criteria andTime13NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time13 not between", value1, value2, "time13");
            return (Criteria) this;
        }

        public Criteria andTime14IsNull() {
            addCriterion("time14 is null");
            return (Criteria) this;
        }

        public Criteria andTime14IsNotNull() {
            addCriterion("time14 is not null");
            return (Criteria) this;
        }

        public Criteria andTime14EqualTo(Boolean value) {
            addCriterion("time14 =", value, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14NotEqualTo(Boolean value) {
            addCriterion("time14 <>", value, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14GreaterThan(Boolean value) {
            addCriterion("time14 >", value, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time14 >=", value, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14LessThan(Boolean value) {
            addCriterion("time14 <", value, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14LessThanOrEqualTo(Boolean value) {
            addCriterion("time14 <=", value, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14In(List<Boolean> values) {
            addCriterion("time14 in", values, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14NotIn(List<Boolean> values) {
            addCriterion("time14 not in", values, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14Between(Boolean value1, Boolean value2) {
            addCriterion("time14 between", value1, value2, "time14");
            return (Criteria) this;
        }

        public Criteria andTime14NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time14 not between", value1, value2, "time14");
            return (Criteria) this;
        }

        public Criteria andTime15IsNull() {
            addCriterion("time15 is null");
            return (Criteria) this;
        }

        public Criteria andTime15IsNotNull() {
            addCriterion("time15 is not null");
            return (Criteria) this;
        }

        public Criteria andTime15EqualTo(Boolean value) {
            addCriterion("time15 =", value, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15NotEqualTo(Boolean value) {
            addCriterion("time15 <>", value, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15GreaterThan(Boolean value) {
            addCriterion("time15 >", value, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time15 >=", value, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15LessThan(Boolean value) {
            addCriterion("time15 <", value, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15LessThanOrEqualTo(Boolean value) {
            addCriterion("time15 <=", value, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15In(List<Boolean> values) {
            addCriterion("time15 in", values, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15NotIn(List<Boolean> values) {
            addCriterion("time15 not in", values, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15Between(Boolean value1, Boolean value2) {
            addCriterion("time15 between", value1, value2, "time15");
            return (Criteria) this;
        }

        public Criteria andTime15NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time15 not between", value1, value2, "time15");
            return (Criteria) this;
        }

        public Criteria andTime16IsNull() {
            addCriterion("time16 is null");
            return (Criteria) this;
        }

        public Criteria andTime16IsNotNull() {
            addCriterion("time16 is not null");
            return (Criteria) this;
        }

        public Criteria andTime16EqualTo(Boolean value) {
            addCriterion("time16 =", value, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16NotEqualTo(Boolean value) {
            addCriterion("time16 <>", value, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16GreaterThan(Boolean value) {
            addCriterion("time16 >", value, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time16 >=", value, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16LessThan(Boolean value) {
            addCriterion("time16 <", value, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16LessThanOrEqualTo(Boolean value) {
            addCriterion("time16 <=", value, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16In(List<Boolean> values) {
            addCriterion("time16 in", values, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16NotIn(List<Boolean> values) {
            addCriterion("time16 not in", values, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16Between(Boolean value1, Boolean value2) {
            addCriterion("time16 between", value1, value2, "time16");
            return (Criteria) this;
        }

        public Criteria andTime16NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time16 not between", value1, value2, "time16");
            return (Criteria) this;
        }

        public Criteria andTime17IsNull() {
            addCriterion("time17 is null");
            return (Criteria) this;
        }

        public Criteria andTime17IsNotNull() {
            addCriterion("time17 is not null");
            return (Criteria) this;
        }

        public Criteria andTime17EqualTo(Boolean value) {
            addCriterion("time17 =", value, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17NotEqualTo(Boolean value) {
            addCriterion("time17 <>", value, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17GreaterThan(Boolean value) {
            addCriterion("time17 >", value, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time17 >=", value, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17LessThan(Boolean value) {
            addCriterion("time17 <", value, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17LessThanOrEqualTo(Boolean value) {
            addCriterion("time17 <=", value, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17In(List<Boolean> values) {
            addCriterion("time17 in", values, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17NotIn(List<Boolean> values) {
            addCriterion("time17 not in", values, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17Between(Boolean value1, Boolean value2) {
            addCriterion("time17 between", value1, value2, "time17");
            return (Criteria) this;
        }

        public Criteria andTime17NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time17 not between", value1, value2, "time17");
            return (Criteria) this;
        }

        public Criteria andTime18IsNull() {
            addCriterion("time18 is null");
            return (Criteria) this;
        }

        public Criteria andTime18IsNotNull() {
            addCriterion("time18 is not null");
            return (Criteria) this;
        }

        public Criteria andTime18EqualTo(Boolean value) {
            addCriterion("time18 =", value, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18NotEqualTo(Boolean value) {
            addCriterion("time18 <>", value, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18GreaterThan(Boolean value) {
            addCriterion("time18 >", value, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time18 >=", value, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18LessThan(Boolean value) {
            addCriterion("time18 <", value, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18LessThanOrEqualTo(Boolean value) {
            addCriterion("time18 <=", value, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18In(List<Boolean> values) {
            addCriterion("time18 in", values, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18NotIn(List<Boolean> values) {
            addCriterion("time18 not in", values, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18Between(Boolean value1, Boolean value2) {
            addCriterion("time18 between", value1, value2, "time18");
            return (Criteria) this;
        }

        public Criteria andTime18NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time18 not between", value1, value2, "time18");
            return (Criteria) this;
        }

        public Criteria andTime19IsNull() {
            addCriterion("time19 is null");
            return (Criteria) this;
        }

        public Criteria andTime19IsNotNull() {
            addCriterion("time19 is not null");
            return (Criteria) this;
        }

        public Criteria andTime19EqualTo(Boolean value) {
            addCriterion("time19 =", value, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19NotEqualTo(Boolean value) {
            addCriterion("time19 <>", value, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19GreaterThan(Boolean value) {
            addCriterion("time19 >", value, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time19 >=", value, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19LessThan(Boolean value) {
            addCriterion("time19 <", value, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19LessThanOrEqualTo(Boolean value) {
            addCriterion("time19 <=", value, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19In(List<Boolean> values) {
            addCriterion("time19 in", values, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19NotIn(List<Boolean> values) {
            addCriterion("time19 not in", values, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19Between(Boolean value1, Boolean value2) {
            addCriterion("time19 between", value1, value2, "time19");
            return (Criteria) this;
        }

        public Criteria andTime19NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time19 not between", value1, value2, "time19");
            return (Criteria) this;
        }

        public Criteria andTime20IsNull() {
            addCriterion("time20 is null");
            return (Criteria) this;
        }

        public Criteria andTime20IsNotNull() {
            addCriterion("time20 is not null");
            return (Criteria) this;
        }

        public Criteria andTime20EqualTo(Boolean value) {
            addCriterion("time20 =", value, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20NotEqualTo(Boolean value) {
            addCriterion("time20 <>", value, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20GreaterThan(Boolean value) {
            addCriterion("time20 >", value, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time20 >=", value, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20LessThan(Boolean value) {
            addCriterion("time20 <", value, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20LessThanOrEqualTo(Boolean value) {
            addCriterion("time20 <=", value, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20In(List<Boolean> values) {
            addCriterion("time20 in", values, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20NotIn(List<Boolean> values) {
            addCriterion("time20 not in", values, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20Between(Boolean value1, Boolean value2) {
            addCriterion("time20 between", value1, value2, "time20");
            return (Criteria) this;
        }

        public Criteria andTime20NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time20 not between", value1, value2, "time20");
            return (Criteria) this;
        }

        public Criteria andTime21IsNull() {
            addCriterion("time21 is null");
            return (Criteria) this;
        }

        public Criteria andTime21IsNotNull() {
            addCriterion("time21 is not null");
            return (Criteria) this;
        }

        public Criteria andTime21EqualTo(Boolean value) {
            addCriterion("time21 =", value, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21NotEqualTo(Boolean value) {
            addCriterion("time21 <>", value, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21GreaterThan(Boolean value) {
            addCriterion("time21 >", value, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time21 >=", value, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21LessThan(Boolean value) {
            addCriterion("time21 <", value, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21LessThanOrEqualTo(Boolean value) {
            addCriterion("time21 <=", value, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21In(List<Boolean> values) {
            addCriterion("time21 in", values, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21NotIn(List<Boolean> values) {
            addCriterion("time21 not in", values, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21Between(Boolean value1, Boolean value2) {
            addCriterion("time21 between", value1, value2, "time21");
            return (Criteria) this;
        }

        public Criteria andTime21NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time21 not between", value1, value2, "time21");
            return (Criteria) this;
        }

        public Criteria andTime22IsNull() {
            addCriterion("time22 is null");
            return (Criteria) this;
        }

        public Criteria andTime22IsNotNull() {
            addCriterion("time22 is not null");
            return (Criteria) this;
        }

        public Criteria andTime22EqualTo(Boolean value) {
            addCriterion("time22 =", value, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22NotEqualTo(Boolean value) {
            addCriterion("time22 <>", value, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22GreaterThan(Boolean value) {
            addCriterion("time22 >", value, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time22 >=", value, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22LessThan(Boolean value) {
            addCriterion("time22 <", value, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22LessThanOrEqualTo(Boolean value) {
            addCriterion("time22 <=", value, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22In(List<Boolean> values) {
            addCriterion("time22 in", values, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22NotIn(List<Boolean> values) {
            addCriterion("time22 not in", values, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22Between(Boolean value1, Boolean value2) {
            addCriterion("time22 between", value1, value2, "time22");
            return (Criteria) this;
        }

        public Criteria andTime22NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time22 not between", value1, value2, "time22");
            return (Criteria) this;
        }

        public Criteria andTime23IsNull() {
            addCriterion("time23 is null");
            return (Criteria) this;
        }

        public Criteria andTime23IsNotNull() {
            addCriterion("time23 is not null");
            return (Criteria) this;
        }

        public Criteria andTime23EqualTo(Boolean value) {
            addCriterion("time23 =", value, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23NotEqualTo(Boolean value) {
            addCriterion("time23 <>", value, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23GreaterThan(Boolean value) {
            addCriterion("time23 >", value, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time23 >=", value, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23LessThan(Boolean value) {
            addCriterion("time23 <", value, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23LessThanOrEqualTo(Boolean value) {
            addCriterion("time23 <=", value, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23In(List<Boolean> values) {
            addCriterion("time23 in", values, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23NotIn(List<Boolean> values) {
            addCriterion("time23 not in", values, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23Between(Boolean value1, Boolean value2) {
            addCriterion("time23 between", value1, value2, "time23");
            return (Criteria) this;
        }

        public Criteria andTime23NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time23 not between", value1, value2, "time23");
            return (Criteria) this;
        }

        public Criteria andTime24IsNull() {
            addCriterion("time24 is null");
            return (Criteria) this;
        }

        public Criteria andTime24IsNotNull() {
            addCriterion("time24 is not null");
            return (Criteria) this;
        }

        public Criteria andTime24EqualTo(Boolean value) {
            addCriterion("time24 =", value, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24NotEqualTo(Boolean value) {
            addCriterion("time24 <>", value, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24GreaterThan(Boolean value) {
            addCriterion("time24 >", value, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time24 >=", value, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24LessThan(Boolean value) {
            addCriterion("time24 <", value, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24LessThanOrEqualTo(Boolean value) {
            addCriterion("time24 <=", value, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24In(List<Boolean> values) {
            addCriterion("time24 in", values, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24NotIn(List<Boolean> values) {
            addCriterion("time24 not in", values, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24Between(Boolean value1, Boolean value2) {
            addCriterion("time24 between", value1, value2, "time24");
            return (Criteria) this;
        }

        public Criteria andTime24NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time24 not between", value1, value2, "time24");
            return (Criteria) this;
        }

        public Criteria andTime25IsNull() {
            addCriterion("time25 is null");
            return (Criteria) this;
        }

        public Criteria andTime25IsNotNull() {
            addCriterion("time25 is not null");
            return (Criteria) this;
        }

        public Criteria andTime25EqualTo(Boolean value) {
            addCriterion("time25 =", value, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25NotEqualTo(Boolean value) {
            addCriterion("time25 <>", value, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25GreaterThan(Boolean value) {
            addCriterion("time25 >", value, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time25 >=", value, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25LessThan(Boolean value) {
            addCriterion("time25 <", value, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25LessThanOrEqualTo(Boolean value) {
            addCriterion("time25 <=", value, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25In(List<Boolean> values) {
            addCriterion("time25 in", values, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25NotIn(List<Boolean> values) {
            addCriterion("time25 not in", values, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25Between(Boolean value1, Boolean value2) {
            addCriterion("time25 between", value1, value2, "time25");
            return (Criteria) this;
        }

        public Criteria andTime25NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time25 not between", value1, value2, "time25");
            return (Criteria) this;
        }

        public Criteria andTime26IsNull() {
            addCriterion("time26 is null");
            return (Criteria) this;
        }

        public Criteria andTime26IsNotNull() {
            addCriterion("time26 is not null");
            return (Criteria) this;
        }

        public Criteria andTime26EqualTo(Boolean value) {
            addCriterion("time26 =", value, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26NotEqualTo(Boolean value) {
            addCriterion("time26 <>", value, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26GreaterThan(Boolean value) {
            addCriterion("time26 >", value, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time26 >=", value, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26LessThan(Boolean value) {
            addCriterion("time26 <", value, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26LessThanOrEqualTo(Boolean value) {
            addCriterion("time26 <=", value, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26In(List<Boolean> values) {
            addCriterion("time26 in", values, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26NotIn(List<Boolean> values) {
            addCriterion("time26 not in", values, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26Between(Boolean value1, Boolean value2) {
            addCriterion("time26 between", value1, value2, "time26");
            return (Criteria) this;
        }

        public Criteria andTime26NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time26 not between", value1, value2, "time26");
            return (Criteria) this;
        }

        public Criteria andTime27IsNull() {
            addCriterion("time27 is null");
            return (Criteria) this;
        }

        public Criteria andTime27IsNotNull() {
            addCriterion("time27 is not null");
            return (Criteria) this;
        }

        public Criteria andTime27EqualTo(Boolean value) {
            addCriterion("time27 =", value, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27NotEqualTo(Boolean value) {
            addCriterion("time27 <>", value, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27GreaterThan(Boolean value) {
            addCriterion("time27 >", value, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time27 >=", value, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27LessThan(Boolean value) {
            addCriterion("time27 <", value, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27LessThanOrEqualTo(Boolean value) {
            addCriterion("time27 <=", value, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27In(List<Boolean> values) {
            addCriterion("time27 in", values, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27NotIn(List<Boolean> values) {
            addCriterion("time27 not in", values, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27Between(Boolean value1, Boolean value2) {
            addCriterion("time27 between", value1, value2, "time27");
            return (Criteria) this;
        }

        public Criteria andTime27NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time27 not between", value1, value2, "time27");
            return (Criteria) this;
        }

        public Criteria andTime28IsNull() {
            addCriterion("time28 is null");
            return (Criteria) this;
        }

        public Criteria andTime28IsNotNull() {
            addCriterion("time28 is not null");
            return (Criteria) this;
        }

        public Criteria andTime28EqualTo(Boolean value) {
            addCriterion("time28 =", value, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28NotEqualTo(Boolean value) {
            addCriterion("time28 <>", value, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28GreaterThan(Boolean value) {
            addCriterion("time28 >", value, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time28 >=", value, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28LessThan(Boolean value) {
            addCriterion("time28 <", value, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28LessThanOrEqualTo(Boolean value) {
            addCriterion("time28 <=", value, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28In(List<Boolean> values) {
            addCriterion("time28 in", values, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28NotIn(List<Boolean> values) {
            addCriterion("time28 not in", values, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28Between(Boolean value1, Boolean value2) {
            addCriterion("time28 between", value1, value2, "time28");
            return (Criteria) this;
        }

        public Criteria andTime28NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time28 not between", value1, value2, "time28");
            return (Criteria) this;
        }

        public Criteria andTime29IsNull() {
            addCriterion("time29 is null");
            return (Criteria) this;
        }

        public Criteria andTime29IsNotNull() {
            addCriterion("time29 is not null");
            return (Criteria) this;
        }

        public Criteria andTime29EqualTo(Boolean value) {
            addCriterion("time29 =", value, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29NotEqualTo(Boolean value) {
            addCriterion("time29 <>", value, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29GreaterThan(Boolean value) {
            addCriterion("time29 >", value, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29GreaterThanOrEqualTo(Boolean value) {
            addCriterion("time29 >=", value, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29LessThan(Boolean value) {
            addCriterion("time29 <", value, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29LessThanOrEqualTo(Boolean value) {
            addCriterion("time29 <=", value, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29In(List<Boolean> values) {
            addCriterion("time29 in", values, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29NotIn(List<Boolean> values) {
            addCriterion("time29 not in", values, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29Between(Boolean value1, Boolean value2) {
            addCriterion("time29 between", value1, value2, "time29");
            return (Criteria) this;
        }

        public Criteria andTime29NotBetween(Boolean value1, Boolean value2) {
            addCriterion("time29 not between", value1, value2, "time29");
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