package com.dococ.notification.service;

import java.util.List;

public interface AuthenticationService {

    void validateRole(String token, List<String> roles);
}
