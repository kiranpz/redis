// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.example.demo;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/{name}")
    @Cacheable("azureCache")
    public String getValue(@PathVariable("name") String name) {
        return "Hello " + name;
    }
}
