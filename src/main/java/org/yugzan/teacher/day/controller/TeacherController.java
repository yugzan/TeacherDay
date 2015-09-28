package org.yugzan.teacher.day.controller;


import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author  yugzan
 * @date    2015年9月28日
 * @project TeacherDay
 */
@RestController
public class TeacherController {

	@RequestMapping
	@ResponseStatus(value = HttpStatus.OK)
	public Map<String, String> defaultPath(){
		return teacherDay("陳弘明");
	}
	@RequestMapping(method = RequestMethod.GET, value = "/{name}",  produces={"application/json"})
	@ResponseStatus(value = HttpStatus.OK)
	public Map<String,String> teacherDay(@PathVariable("name") String name){
		Map<String,String> map = new HashMap<String, String>();
		map.put("Teacher", name);
		map.put("Happy", "Teacher Day");
		map.put("Description", String.format("颱風天還是要祝 %s老師 教師節快樂", name));
		return map;
	}
}

