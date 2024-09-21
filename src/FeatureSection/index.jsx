import FeatureItem from "./FeatureItem";

const FeatureSection = () => {
    return (
        <div className="flex flex-col items-center px-4 py-12 gap-8">
            <p className="text-purple-900 font-ubuntu text-2xl md:text-3xl">
                <span className="italic text-pretty">Proudly</span>{" "}
                Disappointing Users, since we started!
            </p>
            <div className="flex items-center justify-center gap-12 p-8 flex-wrap">
                <FeatureItem
                    image="https://static-task-assets.react-formula.com/259977.png"
                    title="Safe and Secure"
                    description="We use advanced encryption and will never sell your data, while you are looking."
                />
                <FeatureItem
                    image="https://static-task-assets.react-formula.com/384389.png"
                    title="Debugging Help"
                    description="When errors occur, we will dispatch a group of skilled coding monkeys to assist."
                />
                <FeatureItem
                    image="https://static-task-assets.react-formula.com/683765.png"
                    title="Artificially Intelligent"
                    description="We have more than a decade of experience copying from Google."
                />
                <FeatureItem
                    image="https://static-task-assets.react-formula.com/657689.png"
                    title="Advanced Analytics"
                    description="We actually don't know what this means; but it sells well."
                />
                <FeatureItem
                    image="https://static-task-assets.react-formula.com/742903.png"
                    title="Cloud Computing"
                    description="50% of the time, our servers are up 100% of the time."
                />
                <FeatureItem
                    image="https://static-task-assets.react-formula.com/545388.png"
                    title="24/7 Customer Support"
                    description="We have catchy music that we'll play when we put you on hold for hours."
                />
            </div>
        </div>
    );
};

export default FeatureSection;
