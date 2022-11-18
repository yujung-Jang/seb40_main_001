import React from 'react';
import { ReactComponent as LeftArrow } from '../../../assets/img/icons/leftArrow.svg';

const HeaderArrow = ({ txt, arrowHandler }) => {
  return (
    <div className="flex flex-row justify-between w-[390px] h-[55px] items-center">
      <LeftArrow onClick={arrowHandler} />
      <div className="text-400">{txt}</div>
      <div className="w-[40px]"></div>
    </div>
  );
};

export default HeaderArrow;
