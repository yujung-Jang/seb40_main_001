package com.ilchinjo.mainproject.domain.member.mapper;

import com.ilchinjo.mainproject.domain.exercise.dto.ExerciseRecordDto;
import com.ilchinjo.mainproject.domain.exercise.entity.Exercise;
import com.ilchinjo.mainproject.domain.member.dto.MemberDetailResponseDto;
import com.ilchinjo.mainproject.domain.member.dto.MemberPatchDto;
import com.ilchinjo.mainproject.domain.member.dto.MemberPostDto;
import com.ilchinjo.mainproject.domain.member.dto.MemberResponseDto;
import com.ilchinjo.mainproject.domain.member.entity.Member;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MemberMapper {

    Member postDtoToEntity(MemberPostDto postDto);

    Member patchDtoToEntity(MemberPatchDto patchDto);

    MemberResponseDto entityToResponseDto(Member member);

    MemberDetailResponseDto entityToDetailResponseDto(Member member);

    List<ExerciseRecordDto> exercisesToExerciseRecordDtoList(List<Exercise> exercises);
}
