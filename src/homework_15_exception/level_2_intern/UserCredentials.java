package homework_15_exception.level_2_intern;

import java.util.List;

class UserCredentials {
    private List<Role> roles;

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
    boolean hasRole(UserCredentials credentials, Role role){
        return credentials.getRoles().contains(role);
    }
}
