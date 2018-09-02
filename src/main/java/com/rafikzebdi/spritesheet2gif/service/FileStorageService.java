package com.rafikzebdi.spritesheet2gif.service;

import com.rafikzebdi.spritesheet2gif.configuration.FileStorageProperties;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileStorageService {

    private final Logger logger = LoggerFactory.getLogger ( "File storage service" );

    private final Path pendingFilesLocation;
    private final Path processedFilesLocation;

    @Autowired
    private FileStorageService(FileStorageProperties fileStorageProperties) throws IOException {
        this.pendingFilesLocation = Paths.get (fileStorageProperties.getUploadDir()).toAbsolutePath ().normalize ();
        this.processedFilesLocation = Paths.get(fileStorageProperties.getProcessedDir ()).toAbsolutePath ().normalize
                ();
        try {
            Files.createDirectories (this.pendingFilesLocation);
            logger.info ( "Upload directory created." );
            Files.createDirectories ( this.processedFilesLocation );
            logger.info ( "Processed files directory created." );
        } catch (IOException e) {
            throw e;
        } catch (Exception e){
            throw e;
        }
    }

    public boolean storeFile(){
        return false;
    }

    public List<Path> getAllFiles(){
        List<Path> paths = new ArrayList <> (  );

        return paths;

    }

}
