package kg.megacom.library.mappers.impl;

import kg.megacom.library.mappers.OperationsMapper;
import kg.megacom.library.models.Operations;
import kg.megacom.library.models.dto.OperationsDto;

import java.util.List;
import java.util.stream.Collectors;

public class OperationsMapperImpl implements OperationsMapper {
    @Override
    public Operations fromDto(OperationsDto operationsDto) {
        Operations operations = new Operations();
        operations.setId(operationsDto.getId());
        operations.setBook(operationsDto.getBook());
        operations.setStatus(operationsDto.getStatus());
        operations.setReader(operationsDto.getReader());
        operations.setStartDate(operationsDto.getStartDate());
        operations.setEndDate(operationsDto.getEndDate());
        return operations;
    }

    @Override
    public OperationsDto toDto(Operations operations) {
        OperationsDto operationsDto = new OperationsDto();
        operationsDto.setId(operations.getId());
        operationsDto.setBook(operations.getBook());
        operationsDto.setStatus(operations.getStatus());
        operationsDto.setReader(operations.getReader());
        operationsDto.setStartDate(operations.getStartDate());
        operationsDto.setEndDate(operations.getEndDate());
        return operationsDto;
    }

    @Override
    public List<Operations> fromDtos(List<OperationsDto> operationsDtos) {
        return operationsDtos.stream().map((x) -> fromDto(x)).collect(Collectors.toList());
    }

    @Override
    public List<OperationsDto> toDtos(List<Operations> operations) {
        return operations.stream().map((x) ->toDto(x)).collect(Collectors.toList());
    }
}
