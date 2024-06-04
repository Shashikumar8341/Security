package com.ciq.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.bean.RoleBean;
import com.ciq.enitity.Role;
import com.ciq.repository.RoleRepository;
import com.ciq.service.RoleService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/rest/roles")
@CrossOrigin("*")
public class RoleController {

	@Autowired
	private RoleService roleService;

	@Autowired
	RoleRepository roleRepository;

	@PostMapping
	public ResponseEntity<Role> addRole(@RequestBody RoleBean roleBean) {
		return ResponseEntity.ok(roleService.save(roleBean));
	}

	@GetMapping("/find")
	public List<Role> findall( Role role) {
		return roleRepository.findAll();
	}
//
//	@GetMapping("/{name}")
//	public Role getMethodName(@RequestBody String rname) {
//		return  roleRepository.findByRname(rname);
//	}
	
	@GetMapping("/{rid}")
	public Role getMethodid(@PathVariable Integer rid) {
		return roleService.findById(rid);
	}

}