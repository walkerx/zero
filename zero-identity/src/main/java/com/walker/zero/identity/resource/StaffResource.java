package com.walker.zero.identity.resource;

import com.walker.zero.identity.domain.entity.Staff;
import com.walker.zero.identity.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author walker
 */
@RestController
public final class StaffResource {
    private StaffService service;

    @Autowired
    public StaffResource(StaffService service) {
        this.service = service;
    }

    @PostMapping("/users")
    public ResponseEntity<String> register(@RequestBody final StaffRegistration registration) throws URISyntaxException {
        try {
            Staff staff = this.service.register(registration.getUsername(), registration.getPassword());
            return ResponseEntity
                    .created(new URI("/users/" + staff.getId()))
                    .build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/users")
    public List<StaffInfo> list() {
        return this.service.list().stream()
                .map(user -> new StaffInfo(user.getName(), user.getPassword()))
                .collect(toList());
    }
}
