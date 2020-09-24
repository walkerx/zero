package com.walker.zero.identity.service;

import com.walker.zero.identity.domain.entity.Staff;
import com.walker.zero.identity.repository.StaffRepository;
import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StaffServiceTest {
    private StaffRepository repository;
    private StaffService service;

    @BeforeEach
    void setUp() {
        this.repository = mock(StaffRepository.class);
        this.service = new StaffService(repository);
    }

    @Test
    public void should_register_user() {
        when(this.repository.findByName("name")).thenReturn(Optional.empty());
        Staff staff = service.register("name", "password");
        assertThat(staff.getName()).isEqualTo("name");
        assertThat(staff.getPassword()).isEqualTo("password");
    }

    @Test
    public void should_not_register_same_user() {
        when(this.repository.findByName("name")).thenReturn(Optional.of(new Staff("name", "password")));
        assertThrows(IllegalArgumentException.class, () -> {
            service.register("name", "password");
        });
    }

    @Test
    public void should_list_all_users() {
        when(this.repository.findAll()).thenReturn(ImmutableList.of(new Staff("name", "password")));

        ImmutableList<Staff> staffs = service.list();
        Staff staff = staffs.get(0);
        assertThat(staff.getName()).isEqualTo("name");
        assertThat(staff.getPassword()).isEqualTo("password");
    }
}