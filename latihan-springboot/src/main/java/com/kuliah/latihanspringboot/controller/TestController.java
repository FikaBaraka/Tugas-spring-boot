package com.kuliah.latihanspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/api")
@Slf4j
public class TestController {

    @GetMapping(value = "/login")
    public String openLoginPage(HttpServletResponse response, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman login");
        return "login";
    }

    @GetMapping(value = "/home")
    public String openHomePage(HttpServletResponse response, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman utama");
        return "home";
    }

    @GetMapping(value = "/contact")
    public String openContactPage(HttpServletResponse response, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman contact");
        return "contact";
    }

    @GetMapping(value = "/about")
    public String openAboutPage(HttpServletResponse response, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman about");
        return "about";
    }

    @GetMapping(value = "/logout")
    public String openLogoutPage(HttpServletResponse response, HttpServletRequest request) {
        log.info("Selamat anda berhasil masuk ke halaman logout");
        return "logout";
    }

}
