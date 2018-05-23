/*Why should I copyright?*/
package com.dont_leave.hrdb.controller;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wordnik.swagger.annotations.Api;

import com.dont_leave.hrdb.service.HrdbProcedureExecutorService;

@RestController(value = "Hrdb.ProcedureExecutionController")
@RequestMapping("/hrdb/procedureExecutor")
@Api(value = "ProcedureExecutionController", description = "controller class for procedure execution")
public class ProcedureExecutionController {


    @Autowired
    private HrdbProcedureExecutorService procedureService;


}


