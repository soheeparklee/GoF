package structural.adapter;

import structural.adapter.security.UserDetails;
import structural.adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {
    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUserName(username);
        return new AccountUserDetails(accountByUsername);
    }
}
