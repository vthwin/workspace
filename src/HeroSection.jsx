const HeroSection = () => {
    return (
        <div className="flex flex-col-reverse md:flex-row justify-center items-center px-4 py-16 gap-8">
            <div className="flex flex-col items-start gap-4">
                <p className="text-3xl md:text-4xl max-w-md font-ubuntu text-purple-900 hover:font-bold text-wrap">
                    Something <span className="text-yellow-500">Catchy</span>{" "}
                    and
                    <span className="text-red-500"> Technological</span>
                </p>
                <button className="text-md md:text-lg font-bold px-10 py-2 border-4 border-purple-800 text-purple-900 font-roboto">
                    Learn More
                </button>
            </div>
            <img
                className="lg:w-[540px] md:w-[480px] sm:w-[380px] w-[340px]"
                src="https://static-task-assets.react-formula.com/963190.png"
            />
        </div>
    );
};

export default HeroSection;
