package me.coookie.springboot.web.api;

import lombok.extern.slf4j.Slf4j;
import me.coookie.springboot.dao.RoleMapper;
import me.coookie.springboot.domain.Role;
import me.coookie.springboot.web.dto.PingDto;
import me.coookie.springboot.web.util.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cookie on 2017/10/5.
 */
@RestController
@RequestMapping("/api")
@EnableAutoConfiguration
@Slf4j
public class PingController {

    @Autowired
    private RoleMapper roleMapper;

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    private ResponseEntity<PingDto> ping(){
        PingDto pingDto = new PingDto();
        pingDto.setPing("ping success!!!");
        return ResponseEntity.onSuccess(pingDto);
    }

    @RequestMapping(value = "/role/{id}", method = RequestMethod.GET)
    private ResponseEntity<Role> getRoleId(@PathVariable("id") long id){
        log.info("get Role by id!!!");
        Role role = roleMapper.getRoleMapperById(id);
        return ResponseEntity.onSuccess(role);
    }
}
