package com.example.demo;

import com.example.demo.checknumber.CheckNumber;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    @GetMapping("/{x}")
    public CheckNumber Armstrong(@PathVariable int x){
        if(isArmstrong(x))
            return new CheckNumber("Armstrong Number",primeFactors(x));
        else
            return new CheckNumber("Not an Armstrong Number",primeFactors(x));
    }

    static boolean isArmstrong(int n)
    {
        int temp, digits=0, sum=0;
        temp=n;
        //calculates number of digits
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            int remainder = temp % 10;
            temp = temp/10;
            sum +=  (Math.pow(remainder, digits));
        }
        return n==sum;
    }
    public static ArrayList<Integer> primeFactors(int n)
    {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        int c = 2;
        while (n > 1) {
            if (n % c == 0) {
                factors.add(c);
                n /= c;
            }
            else
                c++;
        }
        return(factors);
    }
}
