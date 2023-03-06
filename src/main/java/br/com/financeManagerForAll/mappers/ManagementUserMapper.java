package br.com.financeManagerForAll.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class ManagementUserMapper {

    public static final ManagementUserMapper INSTANCE = Mappers.getMapper(ManagementUserMapper.class);

}
