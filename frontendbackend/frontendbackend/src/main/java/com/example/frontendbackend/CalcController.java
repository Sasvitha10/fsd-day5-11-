package com.example.frontendbackend;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/calc/add/{n1}/{n2}")
    public String add(@PathVariable int n1,@PathVariable int n2){
        int c= n1+n2;
        return "Addition:" + c ;
    }
    @GetMapping("/calc/sub/{n1}/{n2}")
    public String Sub(@PathVariable int n1,@PathVariable int n2) {
        int c = n1 - n2;
        return "Subtraction:" + c;
    }
    @GetMapping("/calc/mul/{n1}/{n2}")
    public String mul(@PathVariable int n1,@PathVariable int n2) {
        int c = n1 * n2;
        return "Multiplication :" + c;
    }
    @GetMapping("/calc/div/{n1}/{n2}")
    public String sub(@PathVariable int n1,@PathVariable int n2) {
        int c = n1 / n2;
        return "Division:" + c;
    }

    @GetMapping("/calc/pow/{n1}/{n2}")
    public String power(@PathVariable double n1,
                        @PathVariable double n2) {

        return "Power: " + Math.pow(n1, n2);
    }
    @GetMapping("/calc/sqrt/{num}")
    public String sqrt(@PathVariable double num) {
        return "Square Root: " + Math.sqrt(num);
    }
    @GetMapping("/calc/log/{num}")
    public String log(@PathVariable double num) {
        return "Log10: " + Math.log10(num);
    }
    @GetMapping("/calc/sin/{number}")
    public String sin(@PathVariable double number) {
        return "Sin: " + Math.sin(Math.toRadians(number));
    }
    @GetMapping("/calc/cos/{number}")
    public String cos(@PathVariable double number) {
        return "Cos: " + Math.cos(Math.toRadians(number));
    }
    @GetMapping("/calc/tan/{number}")
    public String tan(@PathVariable double number) {
        return "Tan: " + Math.tan(Math.toRadians(number));
    }
    @GetMapping("/spiral")
    public List<Integer> spiral() {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }

}
