import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TesteNgforComponent } from './teste-ngfor.component';

describe('TesteNgforComponent', () => {
  let component: TesteNgforComponent;
  let fixture: ComponentFixture<TesteNgforComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TesteNgforComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TesteNgforComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
