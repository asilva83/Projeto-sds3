import DataTable from "components/DataTable";
import Footer from "components/Footer/idex";
import NavBar from "components/NavBar";
function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Olà mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
