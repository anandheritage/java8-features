package com.example.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface convert {
    @Mapping(source = "name" , target = "naam")
    @Mapping(source = "id", target = "code")
    UserQ converting(UserP userP);

    default int custom(int a){
        return a;
    }


}
