import React from 'react';
import { Route } from 'react-router';

import { ReducersMapObject, combineReducers } from '@reduxjs/toolkit';

import getStore from 'app/config/store';
import ErrorBoundaryRoutes from 'app/shared/error/error-boundary-routes';

import entitiesReducers from './reducers';
import Product from './store/product';
/* jhipster-needle-add-route-import - JHipster will add routes here */

// Inject entity reducers once at module load (not during render, which would
// dispatch mid-render), and only when there are reducers to inject — an empty
// combineReducers({}) makes Redux 5 warn on every dispatched action.
if (Object.keys(entitiesReducers).length > 0) {
  getStore().injectReducer('store', combineReducers(entitiesReducers as ReducersMapObject));
}

export default () => (
  <div>
    <ErrorBoundaryRoutes>
      {/* prettier-ignore */}
      <Route path="/product/*" element={<Product />} />
      {/* jhipster-needle-add-route-path - JHipster will add routes here */}
    </ErrorBoundaryRoutes>
  </div>
);
