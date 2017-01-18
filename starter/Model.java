class Model {
  int turtle_x, turtle_y;
  int dest_x, dest_y;

  Model() {

  }

  public void update() {
    if(this.turtle_x < this.dest_x)
      this.turtle_x += Math.min(4, dest_x - turtle_x);
    else if(this.turtle_x > this.dest_x)
      this.turtle_x -= Math.min(4, dest_x + turtle_x);

    if(this.turtle_y < this.dest_y)
      this.turtle_y += Math.min(4, dest_y - turtle_y);
    else if(this.turtle_y > this.dest_y)
      this.turtle_y -= Math.min(4, dest_y + turtle_y);
  }

  public void setDestination(int x, int y) {
    this.dest_x = x;
    this.dest_y = y;
  }
}
