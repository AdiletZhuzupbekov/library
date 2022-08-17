package kg.megacom.library.mappers;

import kg.megacom.library.models.Operations;
import kg.megacom.library.models.dto.OperationsDto;

import java.util.List;

public interface OperationsMapper {

    Operations fromDto(OperationsDto operationsDto);
    OperationsDto toDto(Operations operations);

    List<Operations> fromDtos(List<OperationsDto> operationsDtos);
    List<OperationsDto> toDtos(List<Operations> operations);
}
