import React, { useState, useEffect } from 'react';
import { DownArrow } from '../../../assets/img';
import { client } from '../../../client/client';

const DropdownCity = ({ setcityNum }) => {
  const [city, setCity] = useState([]);
  const getCities = () => {
    client.get('/addresses').then(res => {
      setCity(res.data.data);
    });
  };

  useEffect(() => {
    getCities();
  }, []);

  const handleClick = (e, idx) => {
    setcityNum(idx);
  };

  return (
    <div className="dropdown dropdown-bottom">
      <label
        tabIndex={0}
        className="w-[333px] h-[60px] btn m-1 rounded-[7px] border-2 border-main bg-white text text-400 justify-between pl-[22px] pr-[13px] hover:bg-white hover:border-2 hover:border-main"
      >
        {/* {city} */}
        <DownArrow />
      </label>
      <ul
        tabIndex={0}
        className="dropdown-content menu p-2 shadow bg-white text text-400 rounded-box w-[338px]"
        // h-[200px] overflow-y-scroll 왜 안되는거지 찾아야할 것 같다..
      >
        {city.map((data, idx) => (
          <li key={idx} onClick={e => handleClick(e.target, data.addressId)}>
            <a className="active:bg-main active:text-white">{data.sigungu}</a>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default DropdownCity;