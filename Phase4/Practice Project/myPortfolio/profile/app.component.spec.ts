import{ TestBed, async } from'@angular/core/testing';
import{ RouterTestingModule } from'@angular/router/testing';
import{ AppComponent } from'./app.component';

describe('AppComponent', () => {
  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [
        RouterTestingModule
      ],
      declarations: [
        AppComponent
      ],
    }).compileComponents();
  }));

  it('should create the app', () => {
    constfixture=TestBed.createComponent(AppComponent);
    constapp=fixture.componentInstance;
    expect(app).toBeTruthy();
  });

  it(`should have as title 'Personal-Portfolio-Angular'`, () => {
    constfixture=TestBed.createComponent(AppComponent);
    constapp=fixture.componentInstance;
    expect(app.title).toEqual('Personal-Portfolio-Angular');
  });

  it('should render title', () => {
    constfixture=TestBed.createComponent(AppComponent);
    fixture.detectChanges();
    constcompiled=fixture.nativeElement;
    expect(compiled.querySelector('.content span').textContent).toContain('Personal-Portfolio-Angular app is running!');
  });
});


