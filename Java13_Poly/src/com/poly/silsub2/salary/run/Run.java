package com.poly.silsub2.salary.run;

import com.poly.silsub2.salary.controller.Calculate;
import com.poly.silsub2.salary.controller.CalculateImpl;
import com.poly.silsub2.salary.model.vo.PayTable;
import com.poly.silsub2.salary.model.vo.Salary;
import com.poly.silsub2.salary.view.Output;
import com.poly.silsub2.salary.view.OutputImpl;

public class Run {
    public static void main(String[] args) {
        Salary[] pt = {
            new PayTable("소서노", 750000, 2, 3),
            new PayTable("고주몽", 800000, 1, 4),
            new PayTable("모팔모", 650000, 6, 2)
        };
        
        Calculate calc = new CalculateImpl();
        Output output = new OutputImpl();
        
        calc.calc(pt);
        output.out(pt);
    }
}

	


