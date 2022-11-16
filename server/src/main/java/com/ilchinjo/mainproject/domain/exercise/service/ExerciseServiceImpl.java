package com.ilchinjo.mainproject.domain.exercise.service;

import com.ilchinjo.mainproject.domain.exercise.dto.ExerciseDetailResponseDto;
import com.ilchinjo.mainproject.domain.exercise.dto.ExercisePatchDto;
import com.ilchinjo.mainproject.domain.exercise.dto.ExercisePostDto;
import com.ilchinjo.mainproject.domain.exercise.dto.ExerciseResponseDto;
import com.ilchinjo.mainproject.domain.exercise.entity.Exercise;
import com.ilchinjo.mainproject.domain.exercise.mapper.ExerciseMapper;
import com.ilchinjo.mainproject.domain.exercise.repository.ExerciseRepository;
import com.ilchinjo.mainproject.global.exception.BusinessLogicException;
import com.ilchinjo.mainproject.global.exception.ExceptionCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ExerciseServiceImpl implements ExerciseService {

    private final ExerciseRepository exerciseRepository;
    private final ExerciseMapper exerciseMapper;

    @Override
    public ExerciseResponseDto saveExercise(ExercisePostDto postDto) {
        Exercise exercise = exerciseMapper.postDtoToEntity(postDto);

        Exercise createdExercise = Exercise.createExercise(exercise);
        exerciseRepository.save(createdExercise);

        return exerciseMapper.entityToResponseDto(createdExercise);
    }

    @Override
    public ExerciseResponseDto updateExercise(Long exerciseId, ExercisePatchDto patchDto) {
        Exercise findExercise = findVerifiedExercise(exerciseId);

        findExercise.update(patchDto);

        return exerciseMapper.entityToResponseDto(findExercise);
    }

    @Override
    public ExerciseDetailResponseDto findExercise(Long exerciseId) {
        Exercise findExercise = findVerifiedExercise(exerciseId);

        return exerciseMapper.entityToDetailResponseDto(findExercise);
    }

    @Override
    public void deleteExercise(Long exerciseId) {
        Exercise findExercise = findVerifiedExercise(exerciseId);

        exerciseRepository.delete(findExercise);
    }

    private Exercise findVerifiedExercise(Long exerciseId) {
        Exercise exercise = exerciseRepository.findById(exerciseId)
                .orElseThrow(() -> new BusinessLogicException(ExceptionCode.EXERCISE_NOT_FOUND));

        return exercise;
    }


}