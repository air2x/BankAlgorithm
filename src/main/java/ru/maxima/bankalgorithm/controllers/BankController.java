package ru.maxima.bankalgorithm.controllers;

import org.springframework.web.bind.annotation.*;
import ru.maxima.bankalgorithm.models.Bank;
import ru.maxima.bankalgorithm.models.Result;

@RestController
//@RequestMapping("/bank")
public class BankController {

    @PostMapping(value = "/bank")
    public Result toDistribute(@RequestBody Bank bank) {
        Double allMoney = bank.getWallet();


        return new Result();
    }
}
