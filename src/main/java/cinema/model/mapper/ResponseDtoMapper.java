package cinema.model.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
