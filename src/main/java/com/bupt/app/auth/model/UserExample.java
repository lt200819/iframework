package com.bupt.app.auth.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNull() {
            addCriterion("companyId is null");
            return (Criteria) this;
        }

        public Criteria andCompanyidIsNotNull() {
            addCriterion("companyId is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyidEqualTo(Integer value) {
            addCriterion("companyId =", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotEqualTo(Integer value) {
            addCriterion("companyId <>", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThan(Integer value) {
            addCriterion("companyId >", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("companyId >=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThan(Integer value) {
            addCriterion("companyId <", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidLessThanOrEqualTo(Integer value) {
            addCriterion("companyId <=", value, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidIn(List<Integer> values) {
            addCriterion("companyId in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotIn(List<Integer> values) {
            addCriterion("companyId not in", values, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidBetween(Integer value1, Integer value2) {
            addCriterion("companyId between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andCompanyidNotBetween(Integer value1, Integer value2) {
            addCriterion("companyId not between", value1, value2, "companyid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentId is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentId is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentId =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentId <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentId >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentId >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentId <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentId <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentId in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentId not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentId between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentId not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andIsmanagerIsNull() {
            addCriterion("isManager is null");
            return (Criteria) this;
        }

        public Criteria andIsmanagerIsNotNull() {
            addCriterion("isManager is not null");
            return (Criteria) this;
        }

        public Criteria andIsmanagerEqualTo(Integer value) {
            addCriterion("isManager =", value, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerNotEqualTo(Integer value) {
            addCriterion("isManager <>", value, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerGreaterThan(Integer value) {
            addCriterion("isManager >", value, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("isManager >=", value, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerLessThan(Integer value) {
            addCriterion("isManager <", value, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerLessThanOrEqualTo(Integer value) {
            addCriterion("isManager <=", value, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerIn(List<Integer> values) {
            addCriterion("isManager in", values, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerNotIn(List<Integer> values) {
            addCriterion("isManager not in", values, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerBetween(Integer value1, Integer value2) {
            addCriterion("isManager between", value1, value2, "ismanager");
            return (Criteria) this;
        }

        public Criteria andIsmanagerNotBetween(Integer value1, Integer value2) {
            addCriterion("isManager not between", value1, value2, "ismanager");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNull() {
            addCriterion("hireDate is null");
            return (Criteria) this;
        }

        public Criteria andHiredateIsNotNull() {
            addCriterion("hireDate is not null");
            return (Criteria) this;
        }

        public Criteria andHiredateEqualTo(Date value) {
            addCriterion("hireDate =", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotEqualTo(Date value) {
            addCriterion("hireDate <>", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThan(Date value) {
            addCriterion("hireDate >", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateGreaterThanOrEqualTo(Date value) {
            addCriterion("hireDate >=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThan(Date value) {
            addCriterion("hireDate <", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateLessThanOrEqualTo(Date value) {
            addCriterion("hireDate <=", value, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateIn(List<Date> values) {
            addCriterion("hireDate in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotIn(List<Date> values) {
            addCriterion("hireDate not in", values, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateBetween(Date value1, Date value2) {
            addCriterion("hireDate between", value1, value2, "hiredate");
            return (Criteria) this;
        }

        public Criteria andHiredateNotBetween(Date value1, Date value2) {
            addCriterion("hireDate not between", value1, value2, "hiredate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated do_not_delete_during_merge Mon Jun 24 23:44:25 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_auth_user_info
     *
     * @mbggenerated Mon Jun 24 23:44:25 CST 2013
     */
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