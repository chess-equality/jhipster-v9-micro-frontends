export const getLoginUrl = () => {
  // Root-relative path: used both with React Router's navigate() (which cannot
  // handle protocol-relative URLs) and plain <a href>. If you have configured
  // multiple OIDC providers, then, you can update this URL to /login.
  // It will show a Spring Security generated login page with links to configured OIDC providers.
  return '/sign-in';
};
export const REDIRECT_URL = 'redirectURL';
