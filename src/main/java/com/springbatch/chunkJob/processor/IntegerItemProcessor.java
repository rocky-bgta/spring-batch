package com.springbatch.chunkJob.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class IntegerItemProcessor implements ItemProcessor<Integer, Long> {

    @Override
    public Long process(Integer item) throws Exception {
        System.out.println("Inside Item Processor");
        return Long.valueOf(item + 20);
    }

}
