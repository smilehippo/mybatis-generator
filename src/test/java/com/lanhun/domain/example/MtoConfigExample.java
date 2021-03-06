package com.lanhun.domain.example;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 
 *
 *
 * </p>
 * 
 * @author hz15101769
 * @date 2016-01-12 16:11:45
 * @version
 */
public class MtoConfigExample {

    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MtoConfigExample() {
		super();
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
	
		public Criteria join(String condition) {
		    addCriterion(condition);
		    return (Criteria) this;
		}
			
		public Criteria andKeyIsNull() {
		    addCriterion("key_ is null");
		    return (Criteria) this;
		}
	
		public Criteria andKeyIsNotNull() {
		    addCriterion("key_ is not null");
		    return (Criteria) this;
		}
	
		public Criteria andKeyEqualTo(String value) {
		    addCriterion("key_ =", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyNotEqualTo(String value) {
		    addCriterion("key_ <>", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyGreaterThan(String value) {
		    addCriterion("key_ >", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyGreaterThanOrEqualTo(String value) {
		    addCriterion("key_ >=", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyLessThan(String value) {
		    addCriterion("key_ <", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyLessThanOrEqualTo(String value) {
		    addCriterion("key_ <=", value, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyIn(List<String> values) {
		    addCriterion("key_ in", values, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyNotIn(List<String> values) {
		    addCriterion("key_ not in", values, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyBetween(String value1, String value2) {
		    addCriterion("key_ between", value1, value2, "key");
		    return (Criteria) this;
		}
	
		public Criteria andKeyNotBetween(String value1, String value2) {
		    addCriterion("key_ not between", value1, value2, "key");
		    return (Criteria) this;
		}
		
			
		public Criteria andIdIsNull() {
		    addCriterion("id is null");
		    return (Criteria) this;
		}
	
		public Criteria andIdIsNotNull() {
		    addCriterion("id is not null");
		    return (Criteria) this;
		}
	
		public Criteria andIdEqualTo(Long value) {
		    addCriterion("id =", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotEqualTo(Long value) {
		    addCriterion("id <>", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdGreaterThan(Long value) {
		    addCriterion("id >", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdGreaterThanOrEqualTo(Long value) {
		    addCriterion("id >=", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdLessThan(Long value) {
		    addCriterion("id <", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdLessThanOrEqualTo(Long value) {
		    addCriterion("id <=", value, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdIn(List<Long> values) {
		    addCriterion("id in", values, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotIn(List<Long> values) {
		    addCriterion("id not in", values, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdBetween(Long value1, Long value2) {
		    addCriterion("id between", value1, value2, "id");
		    return (Criteria) this;
		}
	
		public Criteria andIdNotBetween(Long value1, Long value2) {
		    addCriterion("id not between", value1, value2, "id");
		    return (Criteria) this;
		}
		
			
		public Criteria andTypeIsNull() {
		    addCriterion("type is null");
		    return (Criteria) this;
		}
	
		public Criteria andTypeIsNotNull() {
		    addCriterion("type is not null");
		    return (Criteria) this;
		}
	
		public Criteria andTypeEqualTo(String value) {
		    addCriterion("type =", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeNotEqualTo(String value) {
		    addCriterion("type <>", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeGreaterThan(String value) {
		    addCriterion("type >", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeGreaterThanOrEqualTo(String value) {
		    addCriterion("type >=", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeLessThan(String value) {
		    addCriterion("type <", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeLessThanOrEqualTo(String value) {
		    addCriterion("type <=", value, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeIn(List<String> values) {
		    addCriterion("type in", values, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeNotIn(List<String> values) {
		    addCriterion("type not in", values, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeBetween(String value1, String value2) {
		    addCriterion("type between", value1, value2, "type");
		    return (Criteria) this;
		}
	
		public Criteria andTypeNotBetween(String value1, String value2) {
		    addCriterion("type not between", value1, value2, "type");
		    return (Criteria) this;
		}
		
			
		public Criteria andValueIsNull() {
		    addCriterion("value is null");
		    return (Criteria) this;
		}
	
		public Criteria andValueIsNotNull() {
		    addCriterion("value is not null");
		    return (Criteria) this;
		}
	
		public Criteria andValueEqualTo(String value) {
		    addCriterion("value =", value, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueNotEqualTo(String value) {
		    addCriterion("value <>", value, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueGreaterThan(String value) {
		    addCriterion("value >", value, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueGreaterThanOrEqualTo(String value) {
		    addCriterion("value >=", value, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueLessThan(String value) {
		    addCriterion("value <", value, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueLessThanOrEqualTo(String value) {
		    addCriterion("value <=", value, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueIn(List<String> values) {
		    addCriterion("value in", values, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueNotIn(List<String> values) {
		    addCriterion("value not in", values, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueBetween(String value1, String value2) {
		    addCriterion("value between", value1, value2, "value");
		    return (Criteria) this;
		}
	
		public Criteria andValueNotBetween(String value1, String value2) {
		    addCriterion("value not between", value1, value2, "value");
		    return (Criteria) this;
		}
		
		    }

    public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
		    super();
		}
    }
    
     /**
     * @author hz15101769
	 * @date 2016-01-12 16:11:45
     * @version 
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