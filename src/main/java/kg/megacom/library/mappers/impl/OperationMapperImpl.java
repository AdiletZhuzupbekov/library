package kg.megacom.library.mappers.impl;

import kg.megacom.library.mappers.BookMapper;
import kg.megacom.library.mappers.OperationMapper;
import kg.megacom.library.mappers.ReaderMapper;
import kg.megacom.library.models.Operation;
import kg.megacom.library.models.dto.OperationDto;

import java.util.List;
import java.util.stream.Collectors;

public class OperationMapperImpl implements OperationMapper {
    BookMapper bookMapper;
    ReaderMapper readerMapper;
    @Override
    public Operation fromDto(OperationDto operationDto) {
        Operation operation = new Operation();
        operation.setId(operationDto.getId());
        operation.setBook(bookMapper.fromDto(operationDto.getBook()));
        operation.setReader(readerMapper.fromDto(operationDto.getReader()));
        operation.setStatus(operationDto.getStatus());
        operation.setStartDate(operationDto.getStartDate());
        operation.setEndDate(operationDto.getEndDate());
        return operation;
    }


    @Override
    public OperationDto toDto(Operation operation) {
        OperationDto operationDto = new OperationDto();
        operationDto.setId(operation.getId());
        operationDto.setBook(bookMapper.toDto(operation.getBook()));
        operationDto.setReader(readerMapper.toDto(operation.getReader()));
        operationDto.setStatus(operation.getStatus());
        operationDto.setStartDate(operation.getStartDate());
        operationDto.setEndDate(operation.getEndDate());
        return operationDto;
    }

    @Override
    public List<Operation> fromDtos(List<OperationDto> operationDtos) {
        return operationDtos.stream().map((x) -> fromDto(x)).collect(Collectors.toList());
    }

    @Override
    public List<OperationDto> toDtos(List<Operation> operations) {
        return operations.stream().map((x) ->toDto(x)).collect(Collectors.toList());
    }
}
