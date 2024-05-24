package com.example.docker.ldap;

import com.unboundid.ldap.sdk.*;
import java.util.ArrayList;
import java.util.List;

public class LdapService {
    public List<UserDTO> getUsers() throws LDAPException {
        LDAPConnection ldap = null;
        List<UserDTO> users = new ArrayList<>();
        try {
            ldap = new LDAPConnection("host.docker.internal", 1389, "cn=admin,dc=example,dc=com", "qwe@1234");
            SearchResult searchResult = ldap.search("dc=example,dc=com", SearchScope.SUB, "(objectClass=inetOrgPerson)");
            for (SearchResultEntry entry : searchResult.getSearchEntries()) {
                String username = entry.getAttributeValue("uid");
                String password = entry.getAttributeValue("userPassword");
                var user = new UserDTO(username, password);
                users.add(user);
            }
            return users;
        } finally {
            if (ldap != null) ldap.close();
        }
    }
}
