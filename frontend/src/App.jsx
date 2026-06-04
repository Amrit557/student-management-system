import { useState } from 'react';
//? optional chaining app does not crash 
function App(){

    const [student, setStudent] = useState(null);
    //{"id":1,"name":"John Doe","course":"Computer Science"}

    const getStudent = async () => {
        const response = await fetch('http://localhost:8080/students');
        const data = await response.json();
        setStudent(data);
    };
    return (
        <div>

            <button onClick={getStudent}>
                Fetch Student
            </button>

            <h1>Here will be student data</h1>
            <h1>{student?.id}</h1>
            <h1>{student?.name}</h1> 
            <h1>{student?.course}</h1>
        </div>
    )
}

export default App; //global access