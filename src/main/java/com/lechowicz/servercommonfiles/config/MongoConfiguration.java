package com.lechowicz.servercommonfiles.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static java.time.OffsetDateTime.ofInstant;

@Configuration
public class MongoConfiguration {

    @Bean
    public MongoCustomConversions customConversions(){
        List<Converter<?,?>> converters = new ArrayList<>();
        converters.add(DateToZonedDateTimeConverter.INSTANCE);
        converters.add( ZonedDateTimeToDateConverter.INSTANCE);
        return new MongoCustomConversions(converters);
    }

    enum DateToZonedDateTimeConverter implements Converter<Date, OffsetDateTime> {

        INSTANCE;

        @Override
        public OffsetDateTime convert(Date source) {
            return ofInstant(source.toInstant(), ZoneId.of("UTC"));
        }
    }

    enum ZonedDateTimeToDateConverter implements Converter<OffsetDateTime, Date> {

        INSTANCE;

        @Override
        public Date convert(OffsetDateTime source) {
            return Date.from(source.toInstant());
        }
    }
}
