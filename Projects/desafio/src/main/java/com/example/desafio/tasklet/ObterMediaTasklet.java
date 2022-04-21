package com.example.desafio.tasklet;

import com.example.desafio.repository.ClienteRepository;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ObterMediaTasklet implements Tasklet {

    @Autowired
    private ClienteRepository repository;

    @Override
    public RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) throws Exception {
        System.out.println("O valor da média é: " + repository.calcularMedia());
        return RepeatStatus.FINISHED;

    }

}
