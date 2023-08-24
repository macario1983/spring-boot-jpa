package com.springboot.jpa.mapper;


import com.springboot.jpa.dto.DisciplinaSerieDTO;
import com.springboot.jpa.model.DisciplinaSerie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DisciplinaSerieMapper {

    @Mapping(target = "dataAlteracao", ignore = true)
    @Mapping(target = "dataInsercao", ignore = true)
    DisciplinaSerie dtoToModel(DisciplinaSerieDTO disciplinaSerieDTO);

    DisciplinaSerieDTO modelToDTO(DisciplinaSerie disciplinaSerie);

    List<DisciplinaSerieDTO> modelsToDTOs(List<DisciplinaSerie> disciplinasSerie);

}
