package com.springboot.jpa.mapper;

import com.springboot.jpa.dto.SerieDTO;
import com.springboot.jpa.model.Serie;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface SerieMapper {

    @Mapping(target = "dataAlteracao", ignore = true)
    @Mapping(target = "dataInsercao", ignore = true)
    Serie dtoToModel(SerieDTO serieDTO);

    SerieDTO modelToDTO(Serie serie);

    List<SerieDTO> modelsToDTOs(List<Serie> series);

}
