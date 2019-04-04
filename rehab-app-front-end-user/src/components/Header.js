import React from 'react'

export default ({updateCurrentLocation}) =>  {
    return (
    <div className='Header' style={headerStyle}>
        <h1>Jim's Ass Videos</h1>
        <nav className='nav'>
            <ul className='nav-list' style={navList}>
                <li className='nav-list-item' style={navListItem}><a onClick={() => updateCurrentLocation('survey')} >Survey</a></li>
                <li className='nav-list-item' style={navListItem}><a onClick={() => updateCurrentLocation('video')} >Videos</a></li>
            </ul>
        </nav>
    </div>
    )
}


const headerStyle = {
    display: 'flex',
    justifyContent: 'space-between',
    padding: '5px'
}

const navList = {
    listStyleType: 'none',
    display: 'flex',
    paddingLeft: '5px'
}

const navListItem = {
    paddingLeft: '30px'
}