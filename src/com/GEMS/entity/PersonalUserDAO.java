package com.GEMS.entity;

import com.GEMS.dao.BaseHibernateDAO;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A data access object (DAO) providing persistence and search support for
 * PersonalUser entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.GEMS.entity.PersonalUser
 * @author MyEclipse Persistence Tools
 */
public class PersonalUserDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory.getLogger(PersonalUserDAO.class);
	// property constants
	public static final String ACCOUNT_NUM = "accountNum";
	public static final String REAL_NAME = "realName";
	public static final String GENDER = "gender";
	public static final String AGE = "age";
	public static final String EMAIL_ADDRESS = "emailAddress";
	public static final String GRADUATION_SCHOOL = "graduationSchool";
	public static final String MAJOR = "major";
	public static final String EDUCATION = "education";
	public static final String TRAIN_EXPERIENCE = "trainExperience";
	public static final String PRACTICE_EXPERIENCE = "practiceExperience";
	public static final String LANGUAGE_ABILITY = "languageAbility";
	public static final String SELF_EVALUATION = "selfEvaluation";
	public static final String JOB_INTENTION = "jobIntention";
	public static final String SCHOLARSHIP = "scholarship";
	public static final String HONOR_NAME = "honorName";
	public static final String CERTIFICATE = "certificate";

	public void save(PersonalUser transientInstance) {
		log.debug("saving PersonalUser instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PersonalUser persistentInstance) {
		log.debug("deleting PersonalUser instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PersonalUser findById(java.lang.String id) {
		log.debug("getting PersonalUser instance with id: " + id);
		try {
			PersonalUser instance = (PersonalUser) getSession().get("com.GEMS.entity.PersonalUser", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PersonalUser instance) {
		log.debug("finding PersonalUser instance by example");
		try {
			List results = getSession().createCriteria("com.GEMS.entity.PersonalUser").add(Example.create(instance))
					.list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PersonalUser instance with property: " + propertyName + ", value: " + value);
		try {
			String queryString = "from PersonalUser as model where model." + propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAccountNum(Object accountNum) {
		return findByProperty(ACCOUNT_NUM, accountNum);
	}

	public List findByRealName(Object realName) {
		return findByProperty(REAL_NAME, realName);
	}

	public List findByGender(Object gender) {
		return findByProperty(GENDER, gender);
	}

	public List findByAge(Object age) {
		return findByProperty(AGE, age);
	}

	public List findByEmailAddress(Object emailAddress) {
		return findByProperty(EMAIL_ADDRESS, emailAddress);
	}

	public List findByGraduationSchool(Object graduationSchool) {
		return findByProperty(GRADUATION_SCHOOL, graduationSchool);
	}

	public List findByMajor(Object major) {
		return findByProperty(MAJOR, major);
	}

	public List findByEducation(Object education) {
		return findByProperty(EDUCATION, education);
	}

	public List findByTrainExperience(Object trainExperience) {
		return findByProperty(TRAIN_EXPERIENCE, trainExperience);
	}

	public List findByPracticeExperience(Object practiceExperience) {
		return findByProperty(PRACTICE_EXPERIENCE, practiceExperience);
	}

	public List findByLanguageAbility(Object languageAbility) {
		return findByProperty(LANGUAGE_ABILITY, languageAbility);
	}

	public List findBySelfEvaluation(Object selfEvaluation) {
		return findByProperty(SELF_EVALUATION, selfEvaluation);
	}

	public List findByJobIntention(Object jobIntention) {
		return findByProperty(JOB_INTENTION, jobIntention);
	}

	public List findByScholarship(Object scholarship) {
		return findByProperty(SCHOLARSHIP, scholarship);
	}

	public List findByHonorName(Object honorName) {
		return findByProperty(HONOR_NAME, honorName);
	}

	public List findByCertificate(Object certificate) {
		return findByProperty(CERTIFICATE, certificate);
	}

	public List findAll() {
		log.debug("finding all PersonalUser instances");
		try {
			String queryString = "from PersonalUser";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PersonalUser merge(PersonalUser detachedInstance) {
		log.debug("merging PersonalUser instance");
		try {
			PersonalUser result = (PersonalUser) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PersonalUser instance) {
		log.debug("attaching dirty PersonalUser instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PersonalUser instance) {
		log.debug("attaching clean PersonalUser instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}