//package com.example.MVC.Security;
//
//
//import com.example.MVC.entity.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//
//
//@Component
//public class UserDetailsServieImpl implements UserDetailsService {
//
////    @Autowired
////    private UserRepo userRepo;
////
////    @Override
////    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
////        return userRepo.getUserByUserName(username);
////    }
//private final UserService userService;
//
//    @Autowired
//    public UserDetailsServieImpl(@Lazy UserService userService) {
//        this.userService = userService;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userService.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//        return user;
//    }
//}
