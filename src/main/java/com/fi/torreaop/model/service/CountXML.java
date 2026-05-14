package com.fi.torreaop.model.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class CountXML {

    public List<String> countXmlFiles() throws IOException {

        try (Stream<Path> stream = Files.list(Paths.get("src/main/resources/"))) {
            return stream
                    .filter(file -> !Files.isDirectory(file)) // Filtrar solo archivos
                    .map(Path::getFileName)
                    .map(Path::toString)
                    .collect(Collectors.toList());
        }

    }

}

