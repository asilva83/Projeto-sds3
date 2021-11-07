import Dashboard from "Pages/Dashboard";
import Home from "Pages/Home";
import { BrowserRouter, Route, Switch } from "react-router-dom";

const Routes = () => {
    return (
        <BrowserRouter>
             <Switch>
               <Route path="/" exact>
                <Home />
               </Route>
               <Route path="/Dashboard">
                <Dashboard/>
               </Route>
             </Switch>
        
        </BrowserRouter>
    );
}

export default Routes;