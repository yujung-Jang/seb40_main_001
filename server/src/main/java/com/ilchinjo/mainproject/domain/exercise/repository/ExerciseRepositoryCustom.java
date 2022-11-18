package com.ilchinjo.mainproject.domain.exercise.repository;

import com.ilchinjo.mainproject.domain.exercise.entity.Exercise;
import com.ilchinjo.mainproject.domain.member.entity.Member;

import java.util.List;

public interface ExerciseRepositoryCustom {

    default List<Exercise> findExercises(String address, String genderType, String category, Member member) {
        return findExercises(address, genderType, category, member);
    }

    List<Exercise> findExercises(String address, String genderType, String category, Member member, int start, int size);
}
