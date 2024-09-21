import { useState } from "react";

const NavBar = () => {
    const [menuClicked, setMenuClicked] = useState(false);

    return (
        <div className="bg-violet-50 w-full flex justify-center relative">
            <div className="p-4 w-full max-w-5xl md:max-w-6xl flex justify-between">
                <div className="flex items-center gap-4">
                    <img
                        src="../public/logo.png"
                        className="w-24 text-purple-700"
                    />
                    <p className="text-purple-900 text-4xl">esponso</p>
                </div>
                <div className="hidden md:flex items-center space-x-8 text-xl text-purple-800 font-semibold">
                    <button>Home</button>
                    <button>About</button>
                    <button>Contact</button>
                    <button className="text-red-600 text-2xl">
                        <i className="fas fa-search"></i>
                    </button>
                </div>
                <div className="md:hidden flex items-center">
                    {!menuClicked ? (
                        <button
                            className="fa-solid fa-bars text-3xl text-purple-900"
                            onClick={() => setMenuClicked(true)}
                        ></button>
                    ) : (
                        <div className="absolute w-[180px] bg-violet-800 h-[300px] right-0 top-0 rounded-bl-lg space-y-6">
                            <div className="flex justify-end p-4">
                                <button
                                    className="fa-solid fa-x w-8 h-8 rounded-full bg-gray-100/40 text-gray-300 text-xl"
                                    onClick={() => setMenuClicked(false)}
                                ></button>
                            </div>
                            <div className="flex flex-col text-gray-300 text-2xl space-y-4">
                                <button>Home</button>
                                <button>About</button>
                                <button>Contact</button>
                            </div>
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

export default NavBar;
