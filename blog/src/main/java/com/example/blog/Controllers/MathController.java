package com.example.blog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {


//        /add/3/and/4
        @GetMapping("/add/{nums1}/and/{nums2}")
        @ResponseBody
        public String add(@PathVariable int nums1, @PathVariable int nums2) {
            int operated = nums1 + nums2;
            String output = String.valueOf(operated);
            return  output;
        }

//        /subtract/3/from/10
        @GetMapping("subtract/{nums1}/from/{nums2}")
        @ResponseBody
        public String subtract(@PathVariable int nums1, @PathVariable int nums2) {
            int operated = nums2 - nums1;
            String output = String.valueOf(operated);
            return  output;
        }


//       /multiply/4/and/5
        @GetMapping("/multiply/{nums1}/and/{nums2}")
        @ResponseBody
        public String multiply(@PathVariable int nums1, @PathVariable int nums2) {
            int operated = nums1 * nums2;
            String output = String.valueOf(operated);
            return  output;
}

//       /divide/6/by/3

        @GetMapping("/divide/{nums1}/by/{nums2}")
        @ResponseBody
        public String divide(@PathVariable int nums1, @PathVariable int nums2) {
            int operated = nums1 / nums2;
            String output = String.valueOf(operated);
            return  output;
        }
}




