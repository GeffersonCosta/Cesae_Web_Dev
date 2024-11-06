import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TesteNgifComponent } from './teste-ngif.component';

describe('TesteNgifComponent', () => {
  let component: TesteNgifComponent;
  let fixture: ComponentFixture<TesteNgifComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TesteNgifComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TesteNgifComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
