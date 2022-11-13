package com.study.simplebank.commons.exceptions

import org.springframework.http.HttpStatus

class AccountNotFoundException(message: String) : ApiException(status = HttpStatus.BAD_REQUEST, message = message)