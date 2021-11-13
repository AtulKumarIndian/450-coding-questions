int isTriangle();
{
    double dis12 = Point_calculateDistance(P1,P2);
     double dis23 = Point_calculateDistance(P2,P3);
      double dis31 = Point_calculateDistance(P3,P1);
      if(dis12 > dis23 && dis12 > dis31)
      {
          if(dis12 == (dis23 + dis31))
              return 0;
          return 1;    
      } 
       if(dis23 > dis31 && dis23 > dis12)
      {
          if(dis23 == (dis31 + dis12))
              return 0;
          return 1;    
      } 
       if(dis31 > dis12 && dis31 > dis23)
      {
          if(dis31 == (dis12 + dis23))
              return 0;
          return 1;    
      } 
}