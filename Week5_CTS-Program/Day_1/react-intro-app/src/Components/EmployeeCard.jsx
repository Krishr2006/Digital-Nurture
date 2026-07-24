import { useEffect, useState } from "react";

function EmployeeCard() {

    const [users, setUsers] = useState([]);
    const [loading, setLoading] = useState(true);

    useEffect(() => {

        console.log("Fetching Users...");

        fetch("https://jsonplaceholder.typicode.com/users")

            .then((response) => response.json())

            .then((data) => {

                console.log("API Success");

                setUsers(data);

                setLoading(false);

            })

            .catch((error) => {

                console.log(error);

                setLoading(false);

            });

    }, []);

    return (

        <div>

            <h2>Employee Debug Dashboard</h2>

            {

                loading ?

                    <h3>Loading...</h3>

                    :

                    <ul>

                        {

                            users.map((user) => (

                                <li key={user.id}>

                                    {user.name}

                                </li>

                            ))

                        }

                    </ul>

            }

        </div>

    );

}

export default EmployeeCard;