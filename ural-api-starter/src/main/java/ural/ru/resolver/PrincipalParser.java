package ural.ru.resolver;

import org.springframework.web.context.request.WebRequest;

import java.util.Optional;

public interface PrincipalParser {

    Optional<Object> parsePrincipal(WebRequest webRequest);

}
