import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RestaRegisterComponent } from './resta-register.component';

describe('RestaRegisterComponent', () => {
  let component: RestaRegisterComponent;
  let fixture: ComponentFixture<RestaRegisterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RestaRegisterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RestaRegisterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
