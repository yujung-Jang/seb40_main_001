import React from 'react';
import CommentDeleteBtn from '../atoms/CommentDeleteBtn';
import CommentLayout from '../atoms/CommentLayout';

const ViewerSource = ({
  nickname,
  contents,
  handler,
  deleteHandler,
  id,
  mainReply,
}) => {
  return mainReply ? (
    <div className="flex flex row justify-between">
      <div className="flex flex-col m-[15px]">
        <div className="flex flex-row">
          <div className="font-bold mr-[10px] text-200">{`${nickname}`}</div>
          <button className="text-low text-[11px]" onClick={() => handler(id)}>
            답글
          </button>
        </div>
        <div className="text-200 ">{`${contents}`}</div>
      </div>
      <div className="m-[5px]">
        <CommentDeleteBtn onClick={deleteHandler} />
      </div>
    </div>
  ) : (
    <div className="flex flex row justify-between">
      <div className="flex flex-col m-[15px]">
        <div className="flex flex-row">
          <div className="font-bold mr-[10px] text-200">{`${nickname}`}</div>
        </div>
        <div className="text-200 ">{`${contents}`}</div>
      </div>
      <div className="m-[5px]">
        <CommentDeleteBtn onClick={deleteHandler} />
      </div>
    </div>
  );
};

const ViewerCLX = ({
  nickname,
  contents,
  handler,
  deleteHandler,
  id,
  mainReply,
}) => {
  return (
    <CommentLayout
      source={
        <ViewerSource
          nickname={nickname}
          contents={contents}
          handler={handler}
          deleteHandler={deleteHandler}
          id={id}
          mainReply={mainReply}
        />
      }
    />
  );
};

export default ViewerCLX;