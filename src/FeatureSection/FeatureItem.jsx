const FeatureItem = (props) => {
    const { image, title, description } = props;
    return (
        <div className="flex flex-col w-[280px] gap-8 p-2">
            <img src={image} className="w-[140px]" />
            <p className="font-ubuntu text-xl md:text-2xl text-purple-800">
                {title}
            </p>
            <p className="font-roboto text-gray-500">{description}</p>
        </div>
    );
};

export default FeatureItem;
