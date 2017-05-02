import { TestSearchApiPage } from './app.po';

describe('test-search-api App', () => {
  let page: TestSearchApiPage;

  beforeEach(() => {
    page = new TestSearchApiPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
