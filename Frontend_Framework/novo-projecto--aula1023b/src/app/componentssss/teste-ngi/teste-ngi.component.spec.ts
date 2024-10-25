import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TesteNgiComponent } from './teste-ngi.component';

describe('TesteNgiComponent', () => {
  let component: TesteNgiComponent;
  let fixture: ComponentFixture<TesteNgiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TesteNgiComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TesteNgiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
