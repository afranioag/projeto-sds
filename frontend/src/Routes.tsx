import Dashboard from "pages/Dashboard";
import Home from "pages/Home";
import { BrowserRouter, Route } from "react-router-dom";

const Routes = () => {
  return (
    <BrowserRouter>
      <Route path="/" exact>
        <Home />
      </Route>
      <Route path="/dashboard">
        <Dashboard />
      </Route>
    </BrowserRouter>
  );
};

export default Routes;
