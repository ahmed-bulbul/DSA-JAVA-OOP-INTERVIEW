package books.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCountry {

    List<String> countryNames = List.of("Bangladesh","India","Pakistan","South Sudan","French");

    Stream<Optional<Country>> optionalStream = countryNames
            .stream()
            .map(name->findStatisticalCapacityScore(name));

    Stream<Optional<Country>> filterOptionalStream =
            optionalStream.filter(optional -> optional.isPresent());

    List<Country> countries = filterOptionalStream
            .map(optional ->optional.get())
            .collect(Collectors.toList());

    // all in one line
    List<Country> countryList = countryNames
            .stream()
            .map(name->findStatisticalCapacityScore(name))
            .filter(optional->optional.isPresent())
            .map(optional->optional.get())
            .collect(Collectors.toList());

    // using lambda
    List<Country> countryList2 = countryNames
            .stream()
            .map(this::findStatisticalCapacityScore)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .collect(Collectors.toList());
    // more optimized
    List<Country> countries3 = countryNames
            .stream()
            .map(this::findStatisticalCapacityScore)
            .flatMap(Optional::stream)
            .collect(Collectors.toList());
    private Optional<Country> findStatisticalCapacityScore(String name) {
        return Optional.of(new Country());
    }
}
