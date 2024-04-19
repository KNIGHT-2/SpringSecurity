package com.patrick.springsecurity.controller.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}
