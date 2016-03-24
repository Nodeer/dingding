package com.techstar.calendermanage.jpa;
	


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.techstar.calendermanage.entity.Events;

public interface EventsDao<T, ID extends Serializable> extends JpaRepository<Events, ID> ,JpaSpecificationExecutor<Events>{
	
	/**
	 * 根据spring data jpa 规范查询记录
	 * 
	 * @param queryName
	 *            按spring data jpa 规范编写，findByName=>name、findByIdAndName=>idAndName
	 * @param values
	 *            查询参数
	 * @return
	 */
	//List<Events> findBy(final String queryName, final Object... values);
	
   Events findById(Long id);
   List<Events> findByStarttimeGreaterThanAndStarttimeLessThanAndOperationerid(Date sDate,Date eDate,String userid);
   List<Events> findByStarttimeGreaterThanAndStarttimeLessThanAndParticipantidLike(Date sDate,Date eDate,String userid);
   
   //findBy("StarttimeGreaterThanAndStarttimeLessThanAndOperationerid",sDate ,eDate,userid);
	//List<Events> ceventslist=eventsService.findBy("StarttimeGreaterThanAndStarttimeLessThanAndParticipantidLike", sDate, eDate,userid);
}
		


