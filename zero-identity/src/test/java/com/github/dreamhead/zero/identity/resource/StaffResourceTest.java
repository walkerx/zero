package com.walker.zero.identity.resource;

import com.walker.zero.identity.domain.entity.Staff;
import com.walker.zero.identity.service.StaffService;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.net.URISyntaxException;
import java.util.List;

import static com.google.common.net.HttpHeaders.LOCATION;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StaffResourceTest {
    private StaffResource resource;
    private StaffService service;

    @BeforeEach
    void setUp() {
        this.service = mock(StaffService.class);
        this.resource = new StaffResource(this.service);

    }

    @Test
    public void should_register() throws URISyntaxException {
        Staff staff = mock(Staff.class);
        when(this.service.register("name", "password"))
                .thenReturn(staff);
        when(staff.getId()).thenReturn(1L);

        ResponseEntity<String> entity = this.resource.register(new StaffRegistration("name", "password"));

        assertThat(entity.getStatusCodeValue()).isEqualTo(201);
        assertThat(entity.getHeaders().get(LOCATION).get(0)).isEqualTo("/users/1");
    }

    @Test
    public void should_not_register_duplicated_user() throws URISyntaxException {
        Staff staff = mock(Staff.class);
        when(this.service.register("name", "password"))
                .thenThrow(IllegalArgumentException.class);

        ResponseEntity<String> entity = this.resource.register(new StaffRegistration("name", "password"));

        assertThat(entity.getStatusCodeValue()).isEqualTo(400);
    }

    @Test
    public void should_list_all_users() {
        when(this.service.list()).thenReturn(ImmutableList.of(new Staff("name", "password")));
        List<StaffInfo> users = this.resource.list();
        assertThat(users.size()).isEqualTo(1);
        StaffInfo info = users.get(0);
        assertThat(info.getUsername()).isEqualTo("name");
        assertThat(info.getPassword()).isEqualTo("password");
    }
}