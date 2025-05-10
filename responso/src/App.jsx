import HeroSection from "./HeroSection.jsx";
import FeatureSection from "./FeatureSection/index.jsx";
import NavBar from "./NavBar.jsx";
import Footer from "./Footer.jsx";

function App() {
    return (
        <div className="flex justify-center flex-col items-center min-h-screen">
            <NavBar />
            <div className="w-full max-w-5xl md:max-w-6xl">
                <HeroSection />
                <FeatureSection />
            </div>
            <Footer />
        </div>
    );
}

export default App;
