package jo.gov.ltrc.permit.authserver.repositories;

import jo.gov.ltrc.permit.authserver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDBService implements UserDetailsService{

    @Autowired
    private UserDBRepository userDBRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> userRs = userDBRepository.findByUsername(username);
        if(userRs.isPresent()){
            User user = userRs.get();
            return user;
        }

        return null;
    }
}
