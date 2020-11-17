package com.bachkhoa.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bachkhoa.dto.NewDTO;

@Controller
public class NewAPIOLD {

	/**
	 * Cach tao API cu
	 * @RestController = @Controller + @ResponseBody
	 * @PostMapping = @RequestMapping + RequestMethod.POST
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/newOLD", method = RequestMethod.POST)
	@ResponseBody
	public NewDTO createNew(@RequestBody NewDTO model) {

		return model;
	}
}
