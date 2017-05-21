package org.hrd.kotlin.kotlin.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.hrd.kotlin.kotlin.models.User;
import org.hrd.kotlin.kotlin.models.form.user.UserInsert;
import org.hrd.kotlin.kotlin.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v01/user")
public class UserController {

	
	@Autowired UserService userService;
	
	@RequestMapping(value="find-by-user-name/{name}",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getUserByName(@PathVariable("name") String name){
		
		Map<String,Object> map=new HashMap<>();
		
		try{
			User user=userService.findByUserName(name);
			if(user!=null){
				map.put("DATA", user);
				map.put("CODE", 11111);
				map.put("MESSAGE", "GET USER BY NAME SECCUSSFULLY");
				map.put("STATUS", true);
			}else{
				map.put("DATA", null);
				map.put("CODE", 11000);
				map.put("MESSAGE", "GET USER BY NAME SECCUSSFULLY! BUT NOT FOUND");
				map.put("STATUS", true);
				
			}
		}catch(Exception e){
			map.put("DATA", null);
			map.put("CODE", 00000);
			map.put("MESSAGE", "HAVE ERROR WHILE REQUEST TO DATABASE SERVER");
			map.put("STATUS", false);
		}
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	@RequestMapping(value="/find-by-user-email",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getUserByEmail(@RequestParam("email") String email){
		
		Map<String,Object> map=new HashMap<>();
		
		try{
			User user=userService.findByUserEmail(email);
			if(user!=null){
				map.put("DATA", user);
				map.put("CODE", 11111);
				map.put("MESSAGE", "GET USER BY NAME SECCUSSFULLY");
				map.put("STATUS", true);
			}else{
				map.put("DATA", null);
				map.put("CODE", 11000);
				map.put("MESSAGE", "GET USER BY NAME SECCUSSFULLY! BUT NOT FOUND");
				map.put("STATUS", true);
				
			}
		}catch(Exception e){
			map.put("DATA", null);
			map.put("CODE", 00000);
			map.put("MESSAGE", "HAVE ERROR WHILE REQUEST TO DATABASE SERVER");
			map.put("STATUS", false);
		}
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	
	
	@RequestMapping(value="find-by-user-password/{name}",method = RequestMethod.GET)
	public ResponseEntity<Map<String, Object>> getUserByPassword(@PathVariable("password") String password){
		
		Map<String,Object> map=new HashMap<>();
		
		try{
			User user=userService.findByUserPassword(password);
			if(user!=null){
				map.put("DATA", user);
				map.put("CODE", 11111);
				map.put("MESSAGE", "GET USER BY NAME SECCUSSFULLY");
				map.put("STATUS", true);
			}else{
				map.put("DATA", null);
				map.put("CODE", 11000);
				map.put("MESSAGE", "GET USER BY NAME SECCUSSFULLY! BUT NOT FOUND");
				map.put("STATUS", true);
				
			}
		}catch(Exception e){
			map.put("DATA", null);
			map.put("CODE", 00000);
			map.put("MESSAGE", "HAVE ERROR WHILE REQUEST TO DATABASE SERVER");
			map.put("STATUS", false);
		}
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
	@RequestMapping(value="/",method = RequestMethod.POST)
	public ResponseEntity<Map<String, Object>> getUserByName(@RequestBody UserInsert u){
		
		Map<String,Object> map=new HashMap<>();
		User user=new User();
		user.setUserName(u.getUserName());
		user.setUserGender(u.getUserGender());
		user.setUserEmail(u.getUserEmail());
		user.setUserPassword(u.getUserPassword());
		user.setUserImageProfile(u.getUserImageProfile());
		user.setUserDob(u.getUserDob());
		
		try{
			if(userService.createUser(user)){
				map.put("CODE", 11111);
				map.put("MESSAGE", "CREATE USER SECCUSSFULLY");
				map.put("STATUS", true);
			}else{
				map.put("CODE", 11000);
				map.put("MESSAGE", "CREATE USER UNSUCCESSFULLY");
				map.put("STATUS", true);
				
			}
		}catch(Exception e){
			map.put("CODE", 00000);
			map.put("MESSAGE", "HAVE ERROR WHILE INSERT TO DATABASE SERVER");
			map.put("STATUS", false);
		}
		
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
}
