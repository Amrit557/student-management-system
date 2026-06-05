import { useState } from 'react';
//? optional chaining app does not crash 

function App(){

    const [students, setStudents] = useState([]);
    //{"id":1,"name":"John Doe","course":"Computer Science"}

    const getStudents = async () => {
        const response = await fetch('http://localhost:8080/students');
        const data = await response.json();
        setStudents(data);
    };
    return (
        <div>

            <button onClick={getStudents}>
                Get Students
            </button>

            <ul>
                {students.map(student => (
                    <li key={student.id}>
                        {student.name} - {student.course}
                    </li>
                ))}
            </ul>
        </div>
    )
}

export default App; //global access