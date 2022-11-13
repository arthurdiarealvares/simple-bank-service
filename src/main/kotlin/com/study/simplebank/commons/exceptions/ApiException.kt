package com.study.simplebank.commons.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

abstract class ApiException(status: HttpStatus, message: String) : ResponseStatusException(status, message)